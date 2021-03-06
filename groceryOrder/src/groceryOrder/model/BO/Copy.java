package groceryOrder.model.BO;

import javax.swing.JButton;

import groceryOrder.controller.BuyAction;

public class Copy {

	private Item item;
	private Shop shop;
	private int id;
	private boolean bought = false;
	
	public Copy(int id, Item item, Shop shop) {
		this.item = item;
		this.id = id;
		this.shop = shop;
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

	public Shop getShop() {
		return shop;
	}

	@Override
	public String toString() {
		return "Copy [item=" + item.toString() + ", shop=" + shop.toString() + ", id=" + id + "]";
	}

	public Object[] toTable(User user) {
		Object[] table = {item.getName(), item.getId(), id, new JButton(new BuyAction("buy", user, this))};
		return table;
	}

	
}
