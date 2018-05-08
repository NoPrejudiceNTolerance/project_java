package groceryOrder.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import groceryOrder.view.RemoveShopWindow;

public class RemoveShopAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField id_t;
	private ShoppingControler controler;
	private RemoveShopWindow frame;
	
	public RemoveShopAction(String string, JTextField id_t, ShoppingControler controler, RemoveShopWindow frame) {
		super("<html><p style='font-size: 12px; color: #b71c1c'>"+ string +"</p></html>");
		this.controler = controler;
		this.id_t = id_t;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controler.remove(Integer.parseInt(id_t.getText()));
		frame.getPanel().refreshFrame();
		AbstractAction quit = new QuitAction("Quit REMOVE shop action", frame);
		quit.actionPerformed(e);

	}

}
