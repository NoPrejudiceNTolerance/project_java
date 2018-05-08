package groceryOrder.controller;


import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import groceryOrder.view.AddShopWindow;

public class AddShopAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ShoppingControler controler;
	private JTextField name_t;
	private AddShopWindow frame;
	
	public AddShopAction(String string, JTextField name_t, ShoppingControler controler, AddShopWindow frame) {
		super("<html><p style='font-size: 12px; color: #b71c1c'>"+ string +"</p></html>");
		this.controler = controler;
		this.name_t = name_t;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		controler.add(name_t.getText());
		frame.getPanel().refreshFrame();
		AbstractAction quit = new QuitAction("Quit add shop action", frame);
		quit.actionPerformed(arg0);
	}

}
