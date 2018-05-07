package groceryOrder.controller;

import java.awt.event.ActionEvent;


import javax.swing.AbstractAction;
import javax.swing.JFrame;


public class GoToAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame frame = null;
	
	public GoToAction(String name, JFrame frame) {
		super(name);
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.setVisible(true);
	}

}
