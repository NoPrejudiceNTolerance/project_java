package groceryOrder.model.DAO.Interfaces;

import java.util.LinkedList;

import groceryOrder.model.BO.Shop;

public interface IntShopDAO {
	public void add(Shop shop);
	public void add(String name);
	public int nextID();
	public void delete(int id);
	public Shop getShop(int id);
	public LinkedList<Shop> AllOfShops();

}
