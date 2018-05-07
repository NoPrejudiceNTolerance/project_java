package groceryOrder.controller;

import java.awt.event.ActionEvent;


import javax.swing.AbstractAction;
import javax.swing.JTextField;

import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.model.DAO.Objects.UserDAO;
import groceryOrder.view.LoginWindow;

public class ConnectAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField username, password;
	private UserDAO dao;
	private LoginWindow win;
	private AbstractAction quit;
	
	public ConnectAction(String arg0, JTextField username, JTextField password, LoginWindow win) {
		super(arg0);
		this.username = username;
		this.password = password;
		this.win = win;
		this.quit = new QuitAction(arg0,win);
		this.dao = FactoryDAO.getCustomerDAO();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean isConn = win.connected(dao.connect(password.getText(), username.getText()));
		if(isConn) {
			quit.actionPerformed(e);
		}
	}
	

}
