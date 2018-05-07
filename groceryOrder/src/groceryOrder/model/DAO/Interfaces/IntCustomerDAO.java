package groceryOrder.model.DAO.Interfaces;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.User;

public interface IntCustomerDAO {
	public void delete(Customer customer);
	public void add(Customer customer);
	public void update(Customer customer);
	public Customer getCustomer(int id);
	public boolean exist(Customer user);
	public boolean buy(User user, Copy copy);
}
