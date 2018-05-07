package groceryOrder.view;

import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

import groceryOrder.controller.ButtonListener;
import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.User;

public class ButtonEditor extends DefaultCellEditor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JButton button;
	  private User user;
	  private ButtonListener bListener = new ButtonListener();
	   
	  //Constructeur avec une CheckBox
	  public ButtonEditor(JCheckBox checkBox, User user) {
	    super(checkBox);
	    button = new JButton();
	    button.setOpaque(true);
	    this.user = user;
	    button.addActionListener(bListener);
	  }

	  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) { 
	    bListener.setUser(user);
	    bListener.setTable(table);
	      
	    button.setText( (value == null) ? "" : ((JButton)value).getText() );
	    //On renvoie le bouton
	    return button;
	  }
}
