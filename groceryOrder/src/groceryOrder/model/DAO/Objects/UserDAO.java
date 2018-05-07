package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Interfaces.IntUserDAO;

public abstract class UserDAO implements IntUserDAO {

	protected Connection conn = null;
	
	public UserDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void delete(User user) {
		final int id = user.getId();
		String sql = "DELETE FROM \"User\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, id);
			pStat.executeUpdate();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void update(User user) {
		final int id = user.getId();
		String sql = "SELECT name, lastname, username FROM \"User\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); 
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			result.first();
			result.updateString("name", user.getName());
			result.updateString("lastname", user.getLastname());
			result.updateRow();
			result.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void add(User user) {
		String sql = "INSERT INTO \"User\" VALUES(?, ?, ?, ?, ?)";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, user.getId());
			pStat.setString(2, user.getName());
			pStat.setString(4, user.getLastname());
			pStat.setString(3, user.getUsername());
			pStat.setString(5, user.getPassword());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean exist(int id) {
		String sql = "SELECT id FROM \"User\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			return result.first();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean exist(User user) {
		return exist(user.getId());
	}
	
	@Override
	public int nextId() {
		String sql = "SELECT max(id) FROM \"User\"";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				return result.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public boolean isAdmin(int id)
	{
		String sql = "SELECT id FROM \"Admin\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public User connect(String password, String username) {
		User user = null;
		CustomerDAO daoCustomer = null;
		AdminDAO daoAdmin = null;
		int id = 0;
		String sql_id = "SELECT id FROM \"User\" WHERE username = ? AND password = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql_id, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pStat.setString(1, username);
			pStat.setString(2, password);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				id = result.getInt(1);
				if(this.isAdmin(id)) {
					daoAdmin = FactoryDAO.getAdminDAO();
					user = daoAdmin.getAdmin(id);
				} else {
					daoCustomer = FactoryDAO.getCustomerDAO();
					user = daoCustomer.getCustomer(id);
				}
			}
			else
			{
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
