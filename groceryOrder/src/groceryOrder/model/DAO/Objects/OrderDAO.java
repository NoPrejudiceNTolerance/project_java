package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Order;
import groceryOrder.model.DAO.Interfaces.IntOrderDAO;

public class OrderDAO implements IntOrderDAO {

	private Connection conn;
	
	public OrderDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void add(Order order) {
		String sql = "UPDATE \"Copy\" SET id_User = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, order.getUser().getId());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
	public LinkedList<Order> getOrders(Customer customer) {
		String sql = "SELECT id, id_Shop, id_Item FROM \"Copy\" WHERE \"Copy\".\"id_User\" = ?";
		CopyDAO daoCopy = FactoryDAO.getCopyDAO();
		LinkedList<Order> orders = new LinkedList<Order>();
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pStat.setInt(1, customer.getId());
			ResultSet results = pStat.executeQuery();
			while(results.next()) {
				orders.add(new Order(daoCopy.getCopy(results.getInt(1)), results.getInt(1), customer));
			}
			results.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orders;
	}

}
