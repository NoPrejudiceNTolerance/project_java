package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Interfaces.IntUserDAO;

public abstract class UserDAO implements IntUserDAO {

	private Connection conn = null;
	
	public UserDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void delete(User user) {
		final int id = user.getId();
		String sql = "DELETE FROM User WHERE id = ?";
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
		String sql = "SELECT name, lastname, username FROM User WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY); 
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

}
