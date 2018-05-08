package groceryOrder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Objects.CopyDAO;
import groceryOrder.model.DAO.Objects.CustomerDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.view.CustomerWindow;

public class ButtonListener implements ActionListener {

	private User user;
	private int row;
	private JButton button;
	private CustomerDAO dao = FactoryDAO.getCustomerDAO();
	private CopyDAO daoCopy = FactoryDAO.getCopyDAO();
    private JTable table;
	private CustomerWindow win;
        
    public ButtonListener(CustomerWindow customerWindow) {
		this.win = customerWindow;
	}
	public void setTable(JTable table){this.table = table;}
    public void setUser(User user) {this.user = user;}
    public void setRow(int row) {this.row = row;}
    public void setButton(Object value) {if(value instanceof JButton) {this.button = (JButton)value;}}
    
    public void actionPerformed(ActionEvent event) {
    	int id = (int) table.getValueAt(row, 2);
    	Copy copy = daoCopy.getCopy(id);
    	if(dao.buy(user, copy)) {
    		button.setEnabled(false);
    		win.refreshFrame();
    	}   	
    }

}
