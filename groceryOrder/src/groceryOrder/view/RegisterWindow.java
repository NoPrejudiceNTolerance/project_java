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

import groceryOrder.controller.QuitAction;
import groceryOrder.controller.RegisterAction;

public class RegisterWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegisterWindow() throws HeadlessException {
		super();
		build();
	}
	
	public void build() {
		this.setTitle("New Customer");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(buildContentPane());
	}

	private JPanel buildContentPane() {
		JPanel myPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel title = new JLabel("<html><p style='font-size: 20px; color: #008ba3'>Register</p></html>");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel name = new JLabel("<html><p style='font-size: 12px'>Name: </p></html>");
		JLabel lastname = new JLabel("<html><p style='font-size: 12px'>Last name: </p></html>");
		JLabel username = new JLabel("<html><p style='font-size: 12px'>Username: </p></html>");
		JLabel password = new JLabel("<html><p style='font-size: 12px'>Password: </p></html>");
		JTextField name_t = new JTextField();
		name_t.setColumns(25);
		JTextField lastname_t = new JTextField();
		lastname_t.setColumns(25);
		JTextField username_t = new JTextField();
		username_t.setColumns(25);
		JTextField password_t = new JTextField();
		password_t.setColumns(25);
		JButton quit = new JButton(new QuitAction("Close", this));
		JButton submit = new JButton(new RegisterAction("Submit", this, name_t, lastname_t, username_t, password_t));
		
		
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
		c.gridx = 0;
		c.gridy = 2;
		myPanel.add(lastname, c);
		c.gridx = 1;
		myPanel.add(lastname_t, c);
		c.gridx = 0;
		c.gridy = 3;
		myPanel.add(username, c);
		c.gridx = 1;
		myPanel.add(username_t, c);
		c.gridx = 0;
		c.gridy = 4;
		myPanel.add(password, c);
		c.gridx = 1;
		myPanel.add(password_t, c);
		c.gridx = 1;
		c.gridy = 5;
		myPanel.add(submit, c);
		c.gridy = 6;
		myPanel.add(quit, c);
		return myPanel;
	}

}
