package groceryOrder.controller;

import java.util.List;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Order;

public class OrdersTableController {

	public OrdersTableController() {
		
	}
	
	public Object[][] getOrdersFor(Customer u){
		List<Order> orders = u.getOrders();
		int lenght = orders.size();
		Object[][] datas = new Object[lenght][3];
		int i = 0;
		for(Order o : orders) {
			datas[i] = o.toTable();
			i++;
		}
		return datas;
	}

}
