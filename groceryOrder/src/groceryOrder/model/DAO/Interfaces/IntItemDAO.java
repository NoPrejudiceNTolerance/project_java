package groceryOrder.model.DAO.Interfaces;

import groceryOrder.model.BO.Item;

public interface IntItemDAO {
	public Item getItem(int id);
	public void add(Item item);
	public void delete(Item item);
}
