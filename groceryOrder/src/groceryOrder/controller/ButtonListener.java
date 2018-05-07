package groceryOrder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Objects.CustomerDAO;
import groceryOrder.model.DAO.Objects.FactoryDAO;

public class ButtonListener implements ActionListener {

	private User user;
	private Copy copy;
	private CustomerDAO dao = FactoryDAO.getCustomerDAO();
    private JTable table;
    private int nbre = 0;
        
    public void setTable(JTable table){this.table = table;}
    public void setUser(User user) {this.user = user;}
    public void setCopy(Copy copy) {this.copy = copy;}
    
    public void actionPerformed(ActionEvent event) {
    	table.getValueAt(row, column)
      dao.buy(user, copy);
    }

}
