package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Interfaces.IntItemDAO;

public class ItemDAO implements IntItemDAO {

	private Connection conn;
	
	public ItemDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public Item getItem(int id) {
		Item item = null;
		String sql = "SELECT name FROM \"Item\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
	public void add(String name) {
		Item i = new Item(nextId(), name);
		add(i);
	}

	@Override
	public void delete(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public int nextId() {
		String sql = "SELECT max(id) FROM \"Item\"";
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
	public LinkedList<Item> getItemsFor(Shop s) {
		LinkedList<Item> items = new LinkedList<Item>();
		try {
			String sql = "SELECT id_item FROM \"Copy\" WHERE id_Shop = ?";
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pStat.setInt(1, s.getId());
			ResultSet results = pStat.executeQuery();
			Item i;
			while(results.next()) {
				i = this.getItem(results.getInt(1));
				if(!items.contains(i)) {
					items.add(i);
				}
			}
			results.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	@Override
	public List<Item> allItems() {
		List<Item> items = new LinkedList<Item>();
		String sql = "SELECT id FROM \"Item\"";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet results = pStat.executeQuery();
			while(results.next()) {
				items.add(this.getItem(results.getInt(1)));
			}
			results.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}
	

}
