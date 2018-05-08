package groceryOrder.view;

import java.awt.FlowLayout;
import java.awt.Panel;
import java.util.List;

import javax.swing.JButton;

import groceryOrder.controler.addCopyAction;
import groceryOrder.controller.ItemControler;
import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.BO.User;

public class ShopAdminPanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User admin;
	private ItemControler controler = new ItemControler();
	private Shop s;
	
	public ShopAdminPanel(User admin, Shop s) {
		this.admin = admin;
		this.s = s;
		this.setLayout(new FlowLayout());
		buildPanel();
	}

	private void buildPanel() {
		List<Item> items = controler.getAllItems();
		JButton b;
		for(Item i : items) {
			b = new JButton(new addCopyAction(i, s, controler));
			this.add(b);
		}
		
	}

}
