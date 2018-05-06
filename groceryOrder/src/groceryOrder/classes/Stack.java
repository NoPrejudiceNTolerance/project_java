package groceryOrder.classes;

public class Stack {

	private int id;
	private Item item;
	private int quantity;
	
	public Stack(int id, Item item, int quantity) {
		this.id = id;
		this.item = item;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public Item getItem() {
		return item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void add(int quantityToAdd)
	{
		this.quantity += quantityToAdd;
	}
	public void remove(int quantityToRemove)
	{
		this.quantity -= quantityToRemove;
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
		Stack other = (Stack) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stack [id=" + id + ", item=" + item + ", quantity=" + quantity + "]";
	}

}
