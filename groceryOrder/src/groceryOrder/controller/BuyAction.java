package groceryOrder.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Objects.CustomerDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;

public class BuyAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private Copy copy;
	private CustomerDAO dao;

	public BuyAction()
	{
		
	}
	
	public BuyAction(String name, User user, Copy copy) {
		super(name);
		this.user = user;
		this.copy = copy;
		this.dao = FactoryDAO.getCustomerDAO();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		dao.buy(user, copy);
	}	

}
