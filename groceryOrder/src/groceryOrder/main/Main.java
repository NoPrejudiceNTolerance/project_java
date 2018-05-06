package groceryOrder.main;

import javax.swing.SwingUtilities;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.view.CustomerWindow;


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
