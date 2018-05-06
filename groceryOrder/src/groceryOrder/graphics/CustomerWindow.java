package groceryOrder.graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import groceryOrder.classes.Customer;
import groceryOrder.classes.User;

public class CustomerWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Customer customer;
	private JTabbedPane pages;
	
	public CustomerWindow(Customer customer) {
		super();
		this.customer = customer;
		build();
	}
	
	private void build() {
		this.setTitle(customer.getUsername());
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pages = new JTabbedPane(JTabbedPane.LEFT);
		
		this.setContentPane(buildContentPane());
		
	}
	
	private JPanel buildContentPane() {
		JPanel contentPane = new JPanel();
		this.pages.add("Profile", new Profile(this.customer));
		this.pages.add("Orders", new Orders(customer));
		this.pages.add("Shop", new Shopping());
		contentPane.add(this.pages);
		return contentPane;
	}
}
