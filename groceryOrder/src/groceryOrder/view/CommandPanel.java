package groceryOrder.view;

import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;

import groceryOrder.controller.GoToAction;
import groceryOrder.model.BO.User;

public class CommandPanel extends Panel {

	/**
	 * 
	 */
	private JButton addShop, removeShop, addItem;
	private User admin;
	private AdminWindow frame;
	private static final long serialVersionUID = 1L;

	public CommandPanel(User user, AdminWindow frame) {
		this.admin = user;
		this.frame = frame;
		this.setLayout(new FlowLayout());
		addShop = new JButton(new GoToAction("<html><p style='font-size: 12px; color: #d32f2f'>Add new shop</p></html>", new AddShopWindow(this)));
		removeShop = new JButton(new GoToAction("<html><p style='font-size: 12px; color: #d32f2f'>Delete shop</p></html>", new RemoveShopWindow(this)));
		addItem = new JButton(new GoToAction("<html><p style='font-size: 12px; color: #d32f2f'>Add item</p></html>", new AddItemWindow(this)));
		buildPanel();
	}
	
	public void refreshFrame() {
		frame.invalidate();
		frame.setContentPane(frame.buildContentPane());
		frame.validate();
		frame.repaint();
	}
	
	public void buildPanel() {
		this.add(addShop);
		this.add(removeShop);
		this.add(addItem);
	}
}
