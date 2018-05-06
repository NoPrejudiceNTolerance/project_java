package groceryOrder.model.DAO.Interfaces;

import groceryOrder.model.BO.Order;

public interface IntOrderDAO {
	public void add(Order order);
	public void delete(Order order);
	public void update(Order order);
	public void getOrder(int id);
}
