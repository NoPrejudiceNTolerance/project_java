package groceryOrder.model.DAO.Interfaces;

import java.util.LinkedList;

import groceryOrder.model.BO.Shop;

public interface IntShopDAO {
	public void add(Shop shop);
	public void delete(Shop shop);
	public void update(Shop shop);
	public Shop getShop(int id);
	public LinkedList<Shop> AllOfShops();

}
