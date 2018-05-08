package groceryOrder.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import groceryOrder.model.BO.User;
import groceryOrder.model.DAO.Objects.FactoryDAO;
import groceryOrder.model.DAO.Objects.UserDAO;
import groceryOrder.view.Home;

public class ModifyNameAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDAO dao = FactoryDAO.getCustomerDAO();
	private User user;
	private JTextField input;
	private JFrame frame;
	private Home panelToRefresh;
	
	public ModifyNameAction(String arg0, User user, JTextField input, JFrame frame, Home panel) {
		super(arg0);
		this.frame = frame;
		this.panelToRefresh = panel;
		this.user = user;
		this.input = input;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		dao.modifyName(input.getText(), user);
		panelToRefresh.removeAll();
		panelToRefresh.validate();
		panelToRefresh.buildPanel();
		panelToRefresh.revalidate();
		panelToRefresh.repaint();
		frame.dispose();
	}

}
