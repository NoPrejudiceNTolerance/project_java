package groceryOrder.view;

import java.awt.Dimension;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import groceryOrder.controller.ShoppingControler;
import groceryOrder.model.BO.Shop;
import groceryOrder.model.BO.User;

public class AdminWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User admin;
	private JTabbedPane onglets;
	private ShoppingControler controler = new ShoppingControler();
	
	public AdminWindow(User user) {
		super();
		this.admin = user;
		build();
	}
	
	private void build() {
		this.setTitle("Grocery Market - " + admin.getUsername());
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(buildContentPane());
	}
	
	public JPanel buildContentPane() {
		JPanel contentPane = new JPanel();
		this.onglets = new JTabbedPane(JTabbedPane.LEFT);
		this.onglets.setPreferredSize(new Dimension(900, 600));
		List<Shop> shops = controler.allShops();
		onglets.addTab("<html><p style='font-size: 12px; color: #d32f2f'>Control Panel</p></html>", new ImageIcon("D:\\Programs\\GitHub\\Java_project\\project_java\\groceryOrder\\src\\user.png"), new CommandPanel(admin, this));
		for(Shop s : shops) {
			onglets.addTab("<html><p style='font-size: 12px; color: #d32f2f'>"+ s.getName() +"</p></html>", new ImageIcon("D:\\Programs\\GitHub\\Java_project\\project_java\\groceryOrder\\src\\store.png"), new ShopAdminPanel(admin, s));
		}
		contentPane.add(onglets);
		return contentPane;
	}


	
	

}
