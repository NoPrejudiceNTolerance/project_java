package groceryOrder.controller;

import java.util.LinkedList;

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

}
