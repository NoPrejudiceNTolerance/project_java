package groceryOrder.view;

import java.awt.GridBagConstraints;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.BO.Order;

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
		this.title = new JLabel("<html><span style='font-size:20px'>"+ " My Orders " +"</span></html>");
		Object[][] data = {{1, 5, "COMPLETED"}};
		int i = 0;
		/*for(Order or : this.user.getOrders()) {
			data[i] = or.toTable();
			i++;
		}*/
		this.table = new JTable(data, TABLE_HEADS);
		buildPanel();
	}

	private void buildPanel() {
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.CENTER;
		this.removeAll();
		c.gridx = 0;
		c.gridy = 0;
		this.add(title, c);
		c.gridy = 1;
		this.add(new JScrollPane(table), c);
		this.updateUI();
	}
	
	public Orders(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
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
