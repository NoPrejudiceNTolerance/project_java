package groceryOrder.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginWindow() {
		super();
		build();	
	}

	private void build() {
		this.setTitle("Authentification");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem contactUs = new JMenuItem("Contact us");
		menu.add(contactUs);
		menuBar.add(menu);
		JLabel labelUsername = new JLabel("Username: ");
		JLabel labelPassword = new JLabel("Password: ");
		JTextField usernameTextField = new JTextField();
		usernameTextField.setHorizontalAlignment(JTextField.CENTER);
		usernameTextField.setColumns(15);
		
		JPasswordField passwordTextField = new JPasswordField();
		passwordTextField.setHorizontalAlignment(JPasswordField.CENTER);
		passwordTextField.setColumns(15);
		JButton connection = new JButton("Connect");
		JButton register = new JButton("Register");
		this.setJMenuBar(menuBar);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.ipady = 10;
		panel.add(labelUsername, c);
		c.gridy = 1;
		panel.add(usernameTextField, c);
		c.gridy = 2;
		panel.add(labelPassword, c);
		c.gridy = 3;
		panel.add(passwordTextField, c);
		c.gridy = 4;
		panel.add(connection, c);
		c.gridy = 5;
		panel.add(register, c);
		
		return panel;
	}
}
