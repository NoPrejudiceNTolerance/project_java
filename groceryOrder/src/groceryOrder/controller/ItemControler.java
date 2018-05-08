package groceryOrder.controller;

import java.util.List;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Objects.CopyDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.model.DAO.Objects.ItemDAO;

public class ItemControler {
	
	private ItemDAO dao = FactoryDAO.getItemDAO();
	private CopyDAO daoCopy = FactoryDAO.getCopyDAO();
	
	public ItemControler() {
		
	}
	
	public void add(String name) {
		dao.add(name);
	}

	public List<Item> getItemsFor(Shop s) {
		return dao.getItemsFor(s);
	}
	
	public List<Item> getAllItems(){
		return dao.allItems();
	}

	public void addCopy(Item i, Shop s) {
		Copy copy = new Copy(daoCopy.nextId(), i, s);
		daoCopy.add(copy);
	}
}
