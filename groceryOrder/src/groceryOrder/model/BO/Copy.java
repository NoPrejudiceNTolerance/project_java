package groceryOrder.model.BO;

public class Copy {

	private Item item;
	private Customer buyer = null;
	private int id;
	
	public Copy(int id, Item item) {
		this.item = item;
		this.id = id;
	}

	public Customer getBuyer() {
		return buyer;
	}

	public void setBuyer(Customer buyer) {
		this.buyer = buyer;
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
		Copy other = (Copy) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
