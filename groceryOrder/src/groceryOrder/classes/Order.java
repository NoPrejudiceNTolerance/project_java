package groceryOrder.classes;

public class Order {

	private Item item;
	private int id;
	private State state;
	
	public Order(Item item, int id) {
		super();
		this.item = item;
		this.id = id;
		this.state = State.IN_PROGRESS;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Item getItem() {
		return item;
	}

	public int getId() {
		return id;
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
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [item=" + item + ", id=" + id + ", state=" + state + "]";
	}

	public Object[] toTable() {
		Object[] tab = {this.getId(),this.item.getName(), this.state};
		return tab;
	}

}
