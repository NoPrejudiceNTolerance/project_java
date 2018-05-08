package groceryOrder.controller;

import java.util.LinkedList;
import java.util.List;

import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.model.DAO.Objects.ShopDAO;

public class ShoppingControler {

	private ShopDAO dao;
	
	public ShoppingControler() {
		dao = FactoryDAO.getShopDAO();
	}
	
	public LinkedList<Shop> allShops(){
		return dao.AllOfShops();
	}

	public void add(String name) {
		dao.add(name);
	}

	public void remove(int parseInt) {
		dao.delete(parseInt);
		
	}

	public String[] shopsToList() {
		List<Shop> list = allShops();
		String[] stringTab = new String[list.size()];
		int i = 0;
		for(Shop s : list) {
			stringTab[i] = "ID = " + s.getId() + " " + s.getName();
			i++;
		}
		return stringTab;
	}
}
