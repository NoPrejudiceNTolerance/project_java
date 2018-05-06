package groceryOrder.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import groceryOrder.model.BO.User;

public class Profile extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private JLabel name;
	private JLabel lastname;
	private JLabel username;
	private JButton modifyName;
	private JButton modifyLastName;
	
	public Profile(User user) {
		this.user = user;
		//configuration components
		this.name = new JLabel("<html><p style='font-size: 20px'>Name: " + this.user.getName() + "</p></html>");
		this.lastname = new JLabel("<html><p style='font-size: 20px'>Last Name: " + this.user.getLastname() + "</p></html>");
		this.username = new JLabel("<html><p style='font-size: 20px'>Username:  " + this.user.getUsername() + "</p></html>");
		this.modifyName = new JButton("Modify Name");
		this.modifyLastName = new JButton("Modify LastName");
		this.setPreferredSize(new Dimension(820, 550));
		this.setLayout(new GridBagLayout());
		//
		buildPanel();
	}

	private void buildPanel() {
		GridBagConstraints c = new GridBagConstraints();
		this.removeAll();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.LINE_START;
		this.add(name, c);
		c.gridy = 1;
		this.add(modifyName, c);
		c.gridy = 2;
		this.add(lastname, c);
		c.gridy = 3;
		this.add(modifyLastName, c);
		c.gridy = 4;
		this.add(username, c);
		this.updateUI();
	}
	
	
	public Profile(LayoutManager arg0) {
		super(arg0);
	}

	public Profile(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public Profile(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

}
