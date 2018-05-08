package groceryOrder.controller;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Objects.CustomerDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.model.DAO.Objects.UserDAO;

public class UserController {

	private UserDAO dao = FactoryDAO.getAdminDAO();
	private CustomerDAO daoCust = FactoryDAO.getCustomerDAO();
	
	public UserController() {
	
	}
	
	public boolean isAdmin(User user)
	{
		int id = user.getId();
		return dao.isAdmin(id);
	}
	
	public Customer getUser(int id) {
		return daoCust.getCustomer(id);
	}

}
