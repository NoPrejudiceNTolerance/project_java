package groceryOrder.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import groceryOrder.controller.GoToAction;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Objects.CustomerDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;

public class Home extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private JLabel name;
	private JLabel lastname;
	private JLabel username;
	private JLabel welcomeMessage;
	private JLabel detailsTitle;
	private JButton modifyName;
	private JButton modifyLastName;
	private JPanel panelDetails;
	private JLabel infos;
	private CustomerDAO dao = FactoryDAO.getCustomerDAO();
	
	public Home(User user) {
		this.user = user;
		buildPanel();
	}

	public void buildPanel() {
		this.user = dao.getCustomer(user.getId());
		this.name = new JLabel("<html><p style='font-size: 20px; color: #388e3c;'>Name:</p><p style= 'font-size: 15px';> " + this.user.getName() + "</p></html>");
		this.lastname = new JLabel("<html><p style='font-size: 20px; color: #388e3c;'>Last Name:</p><p style= 'font-size: 15px';> " + this.user.getLastname() + "</p></html>");
		this.welcomeMessage = new JLabel("<html><p style='font-size: 22px; color: #1976d2'>Details for " + this.user.getUsername() + "</p></html>");
		this.welcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
		this.name.setHorizontalAlignment(SwingConstants.CENTER);
		this.lastname.setHorizontalAlignment(SwingConstants.CENTER);
		this.modifyName = new JButton(new GoToAction("<html><p style='font-size: 20px; color: #d32f2f;'>Modify</p></html>", new ModifyNameWindow(user, this)));
		modifyName.setBackground(Color.LIGHT_GRAY);
		this.modifyLastName = new JButton(new GoToAction("<html><p style='font-size: 20px; color: #d32f2f;'>Modify</p></html>", new ModifyLastNameWindow(user, this)));
		modifyLastName.setBackground(Color.LIGHT_GRAY);
		this.panelDetails = new JPanel(new GridLayout(2,2));
		panelDetails.add(name);
		panelDetails.add(modifyName);
		panelDetails.add(lastname);
		panelDetails.add(modifyLastName);
		this.setLayout(new BorderLayout());
		this.removeAll();
		this.add(welcomeMessage, BorderLayout.PAGE_START);	
		this.add(panelDetails, BorderLayout.CENTER);
		this.updateUI();
	}
	
	
	public Home(LayoutManager arg0) {
		super(arg0);
	}

	public Home(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public Home(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

}
