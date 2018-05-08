package groceryOrder.controler;



import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import groceryOrder.controller.ItemControler;
import groceryOrder.model.BO.Item;
import groceryOrder.model.BO.Shop;

public class addCopyAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Item i;
	private Shop s;
	private ItemControler controler;
	
	public addCopyAction(Item i, Shop s, ItemControler controler) {
		super("<html><p style='font-size: 12px; color: #b71c1c'>"+ "Add " + i.getName() +"</p></html>");
		this.i = i;
		this.s = s;
		this.controler = controler;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		controler.addCopy(i, s);
	}


}
