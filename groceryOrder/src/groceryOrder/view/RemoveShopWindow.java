package groceryOrder.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import groceryOrder.controller.QuitAction;
import groceryOrder.controller.RemoveShopAction;
import groceryOrder.controller.ShoppingControler;

public class RemoveShopWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	private ShoppingControler controler = new ShoppingControler();
	private CommandPanel panel;
	
	public RemoveShopWindow(CommandPanel panel) throws HeadlessException {
		super();
		this.panel = panel;
		build();
	}
	
	public CommandPanel getPanel() {return this.panel;}
	
	public void build() {
		this.setTitle("Add shop");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		this.setContentPane(buildContentPane());
	}

	private JPanel buildContentPane() {
		JPanel myPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JLabel title = new JLabel("<html><p style='font-size: 20px; color: #008ba3'>Remove shop</p></html>");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel id = new JLabel("<html><p style='font-size: 12px'>id: </p></html>");
		JTextField id_t = new JTextField();
		//Combo box
		String[] listIdNameShop = controler.shopsToList();
		JComboBox<String> comboBox = new JComboBox<String>(listIdNameShop);
		id_t.setColumns(25);
		JButton quit = new JButton(new QuitAction("Close", this));
		JButton submit = new JButton(new RemoveShopAction("Submit", id_t, controler, this));
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipadx = 5;
		c.ipady = 12;
		c.gridx = 1;
		c.gridy = 0;
		myPanel.add(title, c);
		c.ipady = 5;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 1;
		myPanel.add(comboBox, c);
		c.gridy = 2;
		c.gridx = 0;
		myPanel.add(id, c);
		c.gridx = 1;
		myPanel.add(id_t, c);
		c.gridy = 3;
		myPanel.add(submit, c);
		c.gridy = 4;
		myPanel.add(quit, c);
		return myPanel;
	}
}
