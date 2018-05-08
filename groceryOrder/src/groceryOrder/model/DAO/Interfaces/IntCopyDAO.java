package groceryOrder.model.DAO.Interfaces;

import java.util.LinkedList;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Shop;

public interface IntCopyDAO {
	public void add(Copy copy);
	public void delete(Copy copy);
	public Copy getCopy(int id);
	public LinkedList<Copy> getAll();
	public LinkedList<Copy> getCopiesFor(Shop shop);
	public int nextId();
}
