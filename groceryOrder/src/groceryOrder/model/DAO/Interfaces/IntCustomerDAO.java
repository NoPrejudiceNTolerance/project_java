package groceryOrder.model.DAO.Interfaces;

import groceryOrder.model.BO.Customer;

public interface IntCustomerDAO {
	public void delete(Customer customer);
	public void add(Customer customer);
	public void update(Customer customer);
	public Customer getCustomer(int id);
}
