package groceryOrder.classes;

import java.util.LinkedList;

public class Customer extends User {

	private LinkedList<Order> orders;
	
	public Customer(int id, String name, String lastname, String username, LinkedList<Order> orders) {
		super(id, name, lastname, username);
		this.orders = orders;
	}

	
	public boolean add(Order order) {
		return orders.add(order);
	}
	
	public boolean remove(Order order) {
		return orders.remove(order);
	}
	
	public LinkedList<Order> getOrders() {
		return orders;
	}


	@Override
	public String toString() {
		return "Customer [orders=" + orders + "] - " + super.toString();
	}
}
