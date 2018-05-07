package groceryOrder.view;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

public class ShopTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private Object[][] data;
	private String[] title;
	
	public ShopTableModel(Object[][] data, String[] title) {
		this.data = data;
		this.title = title;
	}

	@Override
	public int getColumnCount() {
		return this.title.length;
	}

	@Override
	public int getRowCount() {
		return this.data.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return this.data[arg0][arg1];
	}
	
	public String getColumnName(int col) {
		return this.title[col];
	}
	
	public boolean isCellEditable(int row, int col) {
		if(getValueAt(0, col) instanceof JButton)
		    return false;
		return true;
	}

}
