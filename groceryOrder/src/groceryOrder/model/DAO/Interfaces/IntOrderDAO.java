package groceryOrder.model.DAO.Interfaces;

import java.util.LinkedList;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Order;

public interface IntOrderDAO {
	public void add(Order order);
	public void delete(Order order);
	public void update(Order order);
	public LinkedList<Order> getOrders(Customer customer);
}
