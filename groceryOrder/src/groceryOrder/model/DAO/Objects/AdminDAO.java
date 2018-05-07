package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import groceryOrder.model.BO.Admin;
import groceryOrder.model.DAO.Interfaces.IntAdminDAO;

public class AdminDAO extends UserDAO implements IntAdminDAO {

	public AdminDAO(Connection conn) {
		super(conn);
	}

	@Override
	public void delete(Admin admin) {
		final int id = admin.getId();
		String sql = "DELETE FROM \"Admin\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, id);
			pStat.executeUpdate();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		super.delete(admin);

	}

	@Override
	public void add(Admin admin) {
		super.add(admin);
		String sql = "INSERT INTO \"Admin\" VALUES (?)";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1, admin.getId());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Admin admin) {
		super.update(admin);
	}

	@Override
	public Admin getAdmin(int id) {
		Admin admin = null;
		String sql = "SELECT name, lastname, username FROM \"User\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				admin = new Admin(id, result.getString(1), result.getString(2), result.getString(3), null);
			}
			result.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admin;
	}

	
	

}
