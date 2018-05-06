package groceryOrder.classes;

import java.util.LinkedList;

public class Admin extends User {

	private LinkedList<Shop> shops;
	
	public Admin(int id, String name, String lastname, String username) {
		super(id, name, lastname, username);
	}
	
	public LinkedList<Shop> getShops() {
		return shops;
	}

	@Override
	public String toString() {
		return "Admin [shops=" + shops + "] - " + super.toString();
	}
		
}
