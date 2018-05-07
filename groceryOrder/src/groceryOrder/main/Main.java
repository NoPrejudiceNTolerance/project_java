package groceryOrder.main;

import javax.swing.SwingUtilities;

import groceryOrder.model.BO.Admin;
import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.DAO.Objects.AdminDAO;
import groceryOrder.model.DAO.Objects.CopyDAO;
import groceryOrder.model.DAO.Objects.CustomerDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.model.DAO.Objects.ItemDAO;
import groceryOrder.model.DAO.Objects.ShopDAO;
import groceryOrder.view.LoginWindow;


public class Main {

	public static void main(String[] args) {
		
		Customer user = new Customer(1, "Kelly", "Bernel", "kshopping", null, "juin");
		CopyDAO daoCopy = FactoryDAO.getCopyDAO();
		ItemDAO daoItem = FactoryDAO.getItemDAO();
		ShopDAO daoShop = FactoryDAO.getShopDAO();
		AdminDAO daoAdmin = FactoryDAO.getAdminDAO();
		CustomerDAO daoCustomer = FactoryDAO.getCustomerDAO();
		
		Shop shop = new Shop(null, "Auchan", 1);
		Item item = new Item(1, "Tomato");
	
		Customer cust = daoCustomer.getCustomer(1);
		System.out.println(cust);
		
		Admin admin = new Admin(1, "Louis", "Singer", "AdminPro", "france");
		System.out.println(admin);
		Admin admin2 = daoAdmin.getAdmin(1);
		System.out.println(admin2);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginWindow window = new LoginWindow();
				window.setVisible(true);
		
				}
		});
		


	}

}
