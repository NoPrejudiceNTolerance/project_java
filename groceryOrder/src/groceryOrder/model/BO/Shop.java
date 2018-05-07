package groceryOrder.model.BO;

import java.util.LinkedList;

public class Shop {

	private LinkedList<Copy> stock;
	private String name;
	private int id;
	
	public Shop(LinkedList<Copy> stock, String name, int id) {
		this.stock = stock;
		this.name = name;
		this.id = id;
	}
	public LinkedList<Copy> getStock() {
		return stock;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public boolean add(Copy copy) {
		return this.stock.add(copy);
	}
	public boolean remove(Copy copy) {
		return this.stock.remove(copy);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", id=" + id + "]";
	}
	public void setStock(LinkedList<Copy> stock) {
		this.stock = stock;
	}
}
