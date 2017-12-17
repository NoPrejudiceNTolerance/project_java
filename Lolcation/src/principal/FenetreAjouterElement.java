
package principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public abstract class FenetreAjouterElement extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int ESPACE=20;
	
	private JPanel panelPrincipal;
	private JPanel panelSaisie;
	private JPanel panelBoutons;
	
	private List listeChampsTexte;
	
	private JButton bnOK;
	private JButton bnAnnuler;
	
	public FenetreAjouterElement(String titre){
		this.setTitle(titre);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setModal(true);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.build();
	}
	
	public void build(){
		listeChampsTexte = new ArrayList<JTextField>();
		
		//panel pour la saisie
		panelSaisie = new JPanel();
		panelSaisie.setLayout(new GridLayout(2,2,0,10));
		panelSaisie.setBorder(BorderFactory.createEmptyBorder(20,10,100,10));
	
		//panel des boutons
		bnOK = new JButton("OK");
		bnOK.setPreferredSize(new Dimension(80, 30));
		bnOK.setEnabled(false);
		bnOK.addActionListener(new Boutons());
		bnAnnuler = new JButton("Annuler");
		bnAnnuler.setPreferredSize(new Dimension(80, 30));
		bnAnnuler.addActionListener(new Boutons());
		
		panelBoutons = new JPanel();
		panelBoutons.setLayout(new BoxLayout(panelBoutons, BoxLayout.X_AXIS));
		panelBoutons.add(Box.createHorizontalGlue());
		panelBoutons.add(bnOK);
		panelBoutons.add(Box.createRigidArea(new Dimension(1, ESPACE)));
		panelBoutons.add(bnAnnuler);
		panelBoutons.add(Box.createHorizontalGlue());
		
		//panel principal
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panelPrincipal.add(panelSaisie, BorderLayout.WEST);
		panelPrincipal.add(Box.createRigidArea(new Dimension(1,ESPACE)));
		panelPrincipal.add(panelBoutons, BorderLayout.SOUTH);
	}
	
	public void activeBoutonOK(boolean b){
		bnOK.setEnabled(b);
	}
	
	public boolean champsTexteVide() {
		for(int i = 0 ; i < listeChampsTexte.size() ; i++) {
			if(((JTextField)listeChampsTexte.get(i)).getText().equals("")) return true;
		}
		return false;
	}
	
	public class ChampsObligatoires implements KeyListener
	{
		public void keyReleased(KeyEvent arg0)
		{
			if(champsTexteVide())
			{
				activeBoutonOK(false);
			}
			else
			{
				activeBoutonOK(true);
			}
		}
		
		public void keyPressed(KeyEvent arg0)
		{
			if(champsTexteVide())
			{
				activeBoutonOK(false);
			}
		}
		
		public void keyTyped(KeyEvent arg0)
		{
			if(champsTexteVide())
			{
				activeBoutonOK(false);
			}
		}
	}
	
	public class Boutons implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == bnAnnuler)
			{
				dispose();
			}
			if(e.getSource() == bnOK)
			{
				dispose();
				Principale.demandeAjouterEmprunteur(saisieNom.getText(), saisiePrenom.getText(), (short)Short.parseShort(saisieNumero.getText()), saisieRue.getText(), (int)Integer.parseInt(saisieCp.getText()), saisieVille.getText());
			}
		}
	}
}
