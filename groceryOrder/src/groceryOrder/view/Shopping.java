package groceryOrder.view;

import java.awt.BorderLayout;
import java.util.LinkedList;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import groceryOrder.controller.ShoppingControler;
import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Shop;

public class Shopping extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTabbedPane shops;
	private LinkedList<Shop> allShops = new LinkedList<Shop>();
	private ShoppingControler controler;
	private CustomerWindow customerWindow;
	
	public Shopping(Customer customer, CustomerWindow customerWindow) {
		super();
		this.customerWindow = customerWindow;
		controler = new ShoppingControler();
		allShops = controler.allShops();
		shops = new JTabbedPane();
		for(Shop s : allShops) {
			shops.add(s.getName(), new ShopPanel(s, customer, customerWindow));
		}
		this.setLayout(new BorderLayout());
		buildPane();
	}
	
	public void buildPane() {
		this.add(shops, BorderLayout.PAGE_START);
	}



}
