package groceryOrder.view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import groceryOrder.controller.ShopTableController;
import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Shop;

public class ShopPanel extends JPanel {

	private JTable items;
	private ShopTableController controller = new ShopTableController();
	private final String[] TABLE_HEADS = {"Item name", "Item id", "Copy id", "Buy ?"};
	private Object[][] data;
	private JLabel name;
	private Customer customer;
	
	public ShopPanel(Shop shop, Customer customer) {
		this.setLayout(new BorderLayout());
		this.customer = customer;
		name = new JLabel("<html><span style='font-size:20px; color: #1976d2'>"+shop.getName()+"</span></html>");
		data = controller.getDataFromShop(shop, customer);
		items = new JTable(data, TABLE_HEADS);
		items.setRowHeight(50);
		items.setFont(new Font("Arial", Font.PLAIN, 18));
		items.setDefaultRenderer(JButton.class, new TableComponent());
		items.getColumn("Buy ?").setCellRenderer(new ButtonRenderer());
		items.getColumn("Buy ?").setCellEditor(new ButtonEditor(new JCheckBox(), copy, customer));
		build();
	}
	
	public void build() {
		this.add(name, BorderLayout.PAGE_START);
		this.add(new JScrollPane(items), BorderLayout.CENTER);
	}
	


}
