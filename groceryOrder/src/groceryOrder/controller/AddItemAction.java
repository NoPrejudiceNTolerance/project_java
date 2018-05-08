package groceryOrder.controller;

import java.awt.event.ActionEvent;


import javax.swing.AbstractAction;
import javax.swing.JTextField;

import groceryOrder.view.AddItemWindow;
import groceryOrder.view.ItemControler;

public class AddItemAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	private ItemControler controler;
	private JTextField name_t;
	private AddItemWindow frame;
	
	public AddItemAction(String string, JTextField name_t, ItemControler controler, AddItemWindow frame) {
		super("<html><p style='font-size: 12px; color: #b71c1c'>"+ string +"</p></html>");
		this.controler = controler;
		this.name_t = name_t;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		controler.add(name_t.getText());
		AbstractAction quit = new QuitAction("Quit add item action", frame);
		frame.getPanel().refreshFrame();
		quit.actionPerformed(arg0);
	}

}
