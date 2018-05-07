package groceryOrder.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import groceryOrder.model.BO.Customer;

public class Orders extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Customer user;
	private JLabel title;
	private JTable table;
	private final String[] TABLE_HEADS = {"Order ID", "Item", "State"};
	
	public Orders(Customer user) {
		this.user = user;
		this.setLayout(new BorderLayout());
		this.title = new JLabel("<html><span style='font-size:20px; color: #1976d2'>"+ " My Orders " +"</span></html>");
		Object[][] data = {{1, "Tomato", null}};
		
		int i = 0;
		/*for(Order or : this.user.getOrders()) {
			data[i] = or.toTable();
			i++;
		}*/
		this.table = new JTable(data, TABLE_HEADS);
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		buildPanel();
	}

	private void buildPanel() {
		this.removeAll();
		this.add(title, BorderLayout.PAGE_START);
		this.add(new JScrollPane(table), BorderLayout.CENTER);
		this.updateUI();
	}
	
	public Orders(LayoutManager arg0) {
		super(arg0);
	}

	public Orders(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Orders(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
