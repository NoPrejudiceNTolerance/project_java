package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Interfaces.IntCopyDAO;

public class CopyDAO implements IntCopyDAO {

	private Connection conn = null;
	
	public CopyDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void add(Copy copy) {
		String sql = "INSERT INTO \"Copy\" VALUES(?, ?, NULL, ?)";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.setInt(1,copy.getId());
			pStat.setInt(2, copy.getItem().getId());
			pStat.setInt(3, copy.getShop().getId());
			pStat.execute();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Copy copy) {
		// TODO Auto-generated method stub

	}

	@Override
	public Copy getCopy(int id) {
		Copy copy = null;
		ItemDAO daoItem = FactoryDAO.getItemDAO();
		ShopDAO daoShop = FactoryDAO.getShopDAO();
		
		String sql = "SELECT id_item, id_Shop FROM \"Copy\" WHERE id = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY);
			pStat.setInt(1, id);
			ResultSet result = pStat.executeQuery();
			if(result.first()) {
				copy = new Copy(id, daoItem.getItem(result.getInt(1)), daoShop.getShop(result.getInt(2)));
			} else {
				return null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return copy;
	}

	@Override
	public LinkedList<Copy> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Copy> getCopiesFor(Shop shop) {
		LinkedList<Copy> copies = new LinkedList<Copy>();
		ItemDAO daoItem = FactoryDAO.getItemDAO();
		Item i = null;
		String sql = "SELECT id_item, id FROM \"Copy\" WHERE id_Shop = ?";
		try {
			PreparedStatement pStat = conn.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY);
			pStat.setInt(1, shop.getId());
			ResultSet results = pStat.executeQuery();
			while(results.next()) {
				i = daoItem.getItem(results.getInt(1));
				copies.add(new Copy(results.getInt(2), i, shop));
			}
			results.close();
			pStat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return copies;
	}

}
