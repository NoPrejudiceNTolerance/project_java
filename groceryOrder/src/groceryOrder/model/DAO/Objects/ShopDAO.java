package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Interfaces.IntShopDAO;

public class ShopDAO implements IntShopDAO {

	private Connection conn;
	
	public ShopDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void add(Shop shop) {
		String sql = "INSERT INTO \"Shop\" VALUES(?, ?)";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1,shop.getId());
			pStat.setString(2, shop.getName());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Shop shop) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Shop shop) {
		// TODO Auto-generated method stub

	}

	@Override
	public Shop getShop(int id) {
		Shop shop = null;
		String name;
		String sql = "SELECT name FROM \"Shop\" WHERE id = ?";
		CopyDAO daoCopy = FactoryDAO.getCopyDAO();
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				name = result.getString(1);
				shop = new Shop(null, name, id);
				shop.setStock(daoCopy.getCopiesFor(shop));
			} else {
				return null;
			}
			result.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return shop;
	}

	@Override
	public LinkedList<Shop> AllOfShops() {
		LinkedList<Shop> shops = new LinkedList<Shop>();
		String sql = "SELECT id FROM \"Shop\"";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet results = pStat.executeQuery();
			while(results.next()) {
				shops.add(this.getShop(results.getInt(1)));
			}
			results.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return shops;
	}

}
