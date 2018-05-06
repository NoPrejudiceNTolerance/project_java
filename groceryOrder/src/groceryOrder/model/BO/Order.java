package groceryOrder.model.BO;

public class Order {

	private Copy copy;
	private int id;
	private State state;
	
	public Order(Copy copy , int id) {
		super();
		this.copy = copy;
		this.id = id;
		this.state = State.IN_PROGRESS;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Copy getItem() {
		return copy;
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
		return "Order [item=" + copy + ", id=" + id + ", state=" + state + "]";
	}

	public Object[] toTable() {
		Object[] tab = {this.getId(),this.copy.getItem().getName(), this.state};
		return tab;
	}

}
