package groceryOrder.controller;

import java.util.List;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Objects.CopyDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;

public class ShopTableController {
	
	private CopyDAO dao;
	
	public ShopTableController() {
		dao = FactoryDAO.getCopyDAO();
	}
	
	public Object[][] getDataFromShop(Shop shop, Customer customer){
		List<Copy> copies = dao.getCopiesFor(shop);
		int lenght = copies.size();
		Object[][] datas = new Object[lenght][4];
		int i = 0;
		for(Copy c : copies){
			datas[i] = c.toTable(customer);
			i++;
		}
		return datas;
	}



}
