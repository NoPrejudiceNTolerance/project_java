package groceryOrder.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JTextField;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.DAO.Objects.CustomerDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;

public class RegisterAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField name, lastname, username, password;
	private JFrame frame;
	private CustomerDAO dao = FactoryDAO.getCustomerDAO();
	
	public RegisterAction(String title, JFrame frame, JTextField name, JTextField lastname, JTextField username, JTextField password) {
		super("<html><p style='font-size: 12px; color: #00c853'>"+ title +"</p></html>");
		this.name = name;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int id = dao.nextId();
		Customer customer = new Customer(id, name.getText(), lastname.getText(), username.getText(), null, password.getText());
		dao.add(customer);
		frame.dispose();
	}

}
