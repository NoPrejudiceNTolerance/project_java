package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import groceryOrder.model.BO.Item;
import groceryOrder.model.DAO.Interfaces.IntItemDAO;

public class ItemDAO implements IntItemDAO {

	private Connection conn;
	
	public ItemDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public Item getItem(int id) {
		Item item = null;
		String sql = "SELECT name FROM Item WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY);
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				item = new Item(id, result.getString(1));
			}
			result.close();
			pStat.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return item;
	}

	@Override
	public void add(Item item) {
		String sql = "INSERT INTO \"Item\" VALUES(?, ?)";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1,item.getId());
			pStat.setString(2, item.getName());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Item item) {
		// TODO Auto-generated method stub

	}

}
