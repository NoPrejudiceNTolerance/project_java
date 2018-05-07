package groceryOrder.view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.User;

public class CustomerWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User customer;
	private JTabbedPane pages;
	
	
	public CustomerWindow(User user) {
		super();
		this.customer = user;
		build();
	}
	
	private void build() {
		this.setTitle("Grocery Market - " + customer.getUsername());
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pages = new JTabbedPane(JTabbedPane.LEFT);
		this.pages.setPreferredSize(new Dimension(900, 600));
		this.setContentPane(buildContentPane());
		
	}
	
	private JPanel buildContentPane() {
		JPanel contentPane = new JPanel();
		this.pages.addTab("<html><p style='font-size: 12px; color: #d32f2f'>Home</p></html>", new ImageIcon("D:\\Programs\\GitHub\\Java_project\\project_java\\groceryOrder\\src\\user.png"), new Home(this.customer));
		this.pages.addTab("<html><p style='font-size: 12px; color: #d32f2f'>Orders</p></html>",  new ImageIcon("D:\\Programs\\GitHub\\Java_project\\project_java\\groceryOrder\\src\\order.png") , new Orders((Customer)customer));
		this.pages.addTab("<html><p style='font-size: 12px; color: #d32f2f'>Purchase</p></html>", new ImageIcon("D:\\Programs\\GitHub\\Java_project\\project_java\\groceryOrder\\src\\store.png"),new Shopping());
		contentPane.add(this.pages);
		return contentPane;
	}
}
