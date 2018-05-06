package groceryOrder.model.DAO.Objects;

import java.sql.Connection;

import groceryOrder.model.BO.Order;
import groceryOrder.model.DAO.Interfaces.IntOrderDAO;

public class OrderDAO implements IntOrderDAO {

	private Connection conn;
	
	public OrderDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void add(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getOrder(int id) {
		// TODO Auto-generated method stub

	}

}
