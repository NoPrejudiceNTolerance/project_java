package groceryOrder.model.DAO.Objects;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Order;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Interfaces.IntCustomerDAO;

public class CustomerDAO extends UserDAO implements IntCustomerDAO {

	public CustomerDAO(Connection conn) {
		super(conn);
	}

	@Override
	public void delete(Customer customer) {
		final int id = customer.getId();
		String sql = "DELETE FROM \"Customer\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, id);
			pStat.executeUpdate();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		super.delete(customer);
	}

	@Override
	public void add(Customer customer) {
		super.add(customer);
		String sql = "INSERT INTO \"Customer\" VALUES (?)";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, customer.getId());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Customer customer) {
		super.update(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer = null;
		String name, lastname, username;
		OrderDAO daoOrder = FactoryDAO.getOrderDAO();
		String sql_user = "SELECT name, lastname, username FROM \"User\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql_user, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); 
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				name = result.getString(1);
				lastname = result.getString(2);
				username = result.getString(3);
			} else {
				return null;
			}
			result.close();
			pStat.close();
			customer = new Customer(id, name, lastname, username, null, null);
			LinkedList<Order> orders = daoOrder.getOrders(customer);
			customer.setOrders(orders);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return customer;
	}

	@Override
	public boolean exist(Customer user) {
		return super.exist(user);
	}

	@Override
	public boolean buy(User user, Copy copy) {
		String sql = "UPDATE \"Copy\" SET \"id_User\" = ? WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, user.getId());
			pStat.setInt(2, copy.getId());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}




}
