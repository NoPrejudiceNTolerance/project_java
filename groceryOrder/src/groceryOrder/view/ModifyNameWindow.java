package groceryOrder.view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import groceryOrder.controller.ModifyNameAction;
import groceryOrder.model.BO.User;

public class ModifyNameWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private Home winParent;
	
	public ModifyNameWindow(User user, Home refreshWin) throws HeadlessException {
		super();
		this.user = user;
		this.winParent = refreshWin;
		build();
	}

	public void build() {
		this.setTitle("Modify Name");
		this.setSize(400, 150);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(buildContentPane());
	}
	
	public JPanel buildContentPane() {
		JPanel myPanel = new JPanel(new BorderLayout());
		JLabel title = new JLabel("<html><p style='font-size: 20px; color: #008ba3'>Modify name</p></html>");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel name = new JLabel("<html><p style='font-size: 12px'>New Name: </p></html>");
		JTextField name_t = new JTextField();
		name_t.setColumns(25);
		JButton modify = new JButton(new ModifyNameAction("<html><p style='font-size: 15px'>Modify</p></html>", user, name_t, this, winParent));
		myPanel.add(title, BorderLayout.PAGE_START);
		myPanel.add(name, BorderLayout.WEST);
		myPanel.add(name_t, BorderLayout.EAST);
		myPanel.add(modify, BorderLayout.PAGE_END);
		return myPanel;
	}

}
