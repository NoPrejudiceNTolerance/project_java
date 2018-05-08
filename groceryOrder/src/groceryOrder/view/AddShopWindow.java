package groceryOrder.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import groceryOrder.controller.AddShopAction;
import groceryOrder.controller.QuitAction;
import groceryOrder.controller.ShoppingControler;

public class AddShopWindow extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ShoppingControler controler = new ShoppingControler();
	private CommandPanel panel;
	
	public AddShopWindow(CommandPanel frame) throws HeadlessException {
		super();
		this.panel = frame;
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
		JLabel title = new JLabel("<html><p style='font-size: 20px; color: #008ba3'>Add new shop</p></html>");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel name = new JLabel("<html><p style='font-size: 12px'>Name: </p></html>");
		JTextField name_t = new JTextField();
		name_t.setColumns(25);
		JButton quit = new JButton(new QuitAction("Close", this));
		JButton submit = new JButton(new AddShopAction("Submit", name_t, controler, this));
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipadx = 5;
		c.ipady = 12;
		c.gridx = 1;
		c.gridy = 0;
		myPanel.add(title, c);
		c.ipady = 5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		myPanel.add(name, c);
		c.gridx = 1;
		myPanel.add(name_t, c);
		c.gridx = 1;
		c.gridy = 2;
		myPanel.add(submit, c);
		c.gridy = 3;
		myPanel.add(quit, c);
		return myPanel;
	}
}
