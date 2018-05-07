package groceryOrder.controller;

import java.awt.event.ActionEvent;


import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class QuitAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame window;
	
	public QuitAction(String title, JFrame window) {
		super("<html><p style='font-size: 12px; color: #b71c1c'>"+ title +"</p></html>");
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.window.dispose();
	}

}
