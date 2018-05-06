package groceryOrder.main;

import java.util.LinkedList;

import javax.swing.SwingUtilities;

import groceryOrder.classes.Customer;
import groceryOrder.classes.User;
import groceryOrder.graphics.CustomerWindow;
import groceryOrder.graphics.LoginWindow;

public class Main {

	public static void main(String[] args) {
		
		Customer user = new Customer(1, "Kelly", "Bernel", "kshopping", null);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				CustomerWindow login = new CustomerWindow(user);
				login.setVisible(true);
			}
		});

	}

}
