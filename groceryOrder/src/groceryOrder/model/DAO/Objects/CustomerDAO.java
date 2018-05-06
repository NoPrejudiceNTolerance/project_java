package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Interfaces.IntCustomerDAO;

public class CustomerDAO extends UserDAO implements IntCustomerDAO {

	public CustomerDAO(Connection conn) {
		super(conn);
	}

	@Override
	public void delete(Customer customer) {
		super.delete((User)customer);

	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Customer customer) {
		super.update(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer = null;
		String name, lastname, username;
		String sql_user = "SELECT name, lastname, username FROM User WHERE id = ?";
		String sql_orders = "SELECT ";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql_user, ResultSet.TYPE_FORWARD_ONLY); 
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
			customer = new Customer(id, name, lastname, username, null);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return customer;
	}

}
