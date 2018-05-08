package groceryOrder.view;

import java.awt.Component;


import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

import groceryOrder.controller.ButtonListener;
import groceryOrder.model.BO.User;

public class ButtonEditor extends DefaultCellEditor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JButton button;
	  private User user;
	  private ButtonListener bListener;
	   
	  public ButtonEditor(JCheckBox checkBox, User user, CustomerWindow customerWindow) {
	    super(checkBox);
	    bListener = new ButtonListener(customerWindow);
	    button = new JButton();
	    button.setOpaque(true);
	    this.user = user;
	    
	  }

	  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) { 
		  if(value == null) {
			  button.setEnabled(false);
		  } else {
			  button.addActionListener(bListener);
			  bListener.setUser(user);
			  bListener.setRow(row);
			  bListener.setButton(value);
			  bListener.setTable(table);
		  }
		  
	    button.setText("<html><p style = 'font-size: 20px; color: #d50000;'>Buy !</p></html>"); 
	
	    return button;
	  }
}
