package groceryOrder.model.BO;

import java.util.LinkedList;

public class Admin extends User {

	private LinkedList<Shop> shops;
	
	public Admin(int id, String name, String lastname, String username, String password) {
		super(id, name, lastname, username, password);
	}
	
	public LinkedList<Shop> getShops() {
		return shops;
	}

	@Override
	public String toString() {
		return "Admin [shops=" + shops + "] - " + super.toString();
	}
		
}
