package groceryOrder.model.DAO.Objects;

import java.sql.Connection;

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Shop> AllOfShops() {
		// TODO Auto-generated method stub
		return null;
	}

}
