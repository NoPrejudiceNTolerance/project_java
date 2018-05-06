package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.util.LinkedList;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Interfaces.IntCopyDAO;

public class CopyDAO implements IntCopyDAO {

	private Connection conn = null;
	
	public CopyDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void add(Copy copy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Copy copy) {
		// TODO Auto-generated method stub

	}

	@Override
	public Copy getCopy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Copy> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Copy> getCopiesFor(Shop shop) {
		// TODO Auto-generated method stub
		return null;
	}

}
