package groceryOrder.classes;

import java.util.LinkedList;

public class Shop {

	private LinkedList<Stack> stacks;
	private String name;
	private int id;
	
	public Shop(LinkedList<Stack> stacks, String name, int id) {
		this.stacks = stacks;
		this.name = name;
		this.id = id;
	}
	public LinkedList<Stack> getStacks() {
		return stacks;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public boolean add(Stack stack) {
		return stacks.add(stack);
	}
	public boolean remove(Stack stack) {
		return stacks.remove(stack);
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
		return "Shop [stacks=" + stacks + ", name=" + name + ", id=" + id + "]";
	}
}
