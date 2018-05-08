package groceryOrder.model.DAO.Interfaces;

import java.util.LinkedList;
import java.util.List;

import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;

public interface IntItemDAO {
	public Item getItem(int id);
	public void add(Item item);
	public void add(String name);
	public int nextId();
	public void delete(Item item);
	public LinkedList<Item> getItemsFor(Shop s);
	public List<Item> allItems();
}
