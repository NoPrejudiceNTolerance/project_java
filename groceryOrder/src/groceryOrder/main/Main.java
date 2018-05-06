package groceryOrder.main;

import javax.swing.SwingUtilities;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Objects.CopyDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.model.DAO.Objects.ItemDAO;
import groceryOrder.model.DAO.Objects.ShopDAO;
import groceryOrder.view.CustomerWindow;


public class Main {

	public static void main(String[] args) {
		
		Customer user = new Customer(1, "Kelly", "Bernel", "kshopping", null);
		CopyDAO daoCopy = FactoryDAO.getCopyDAO();
		ItemDAO daoItem = FactoryDAO.getItemDAO();
		ShopDAO daoShop = FactoryDAO.getShopDAO();
		Shop shop = new Shop(null, "Auchan", 1);
		Item item = new Item(1, "Tomato");
		Copy copy = new Copy(1, item, shop);

		daoItem.add(item);
		daoShop.add(shop);
		daoCopy.add(copy);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				CustomerWindow login = new CustomerWindow(user);
				login.setVisible(true);
			}
		});
		


	}

}
