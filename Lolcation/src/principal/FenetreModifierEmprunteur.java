package principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class FenetreModifierEmprunteur extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int ESPACE=20;
	
	private JPanel panelPrincipal;
	private JPanel panelSaisie;
	private JPanel panelNom;
	private JPanel panelPrenom;
	private JPanel panelBoutons;
	
	private JLabel nom;
	private JTextField saisieNom;
	private JLabel prenom;
	private JTextField saisiePrenom;
	private JLabel legende;
	private JButton bnOK;
	private JButton bnAnnuler;
	
	public FenetreModifierEmprunteur(){
		this.setTitle("Ajouter un �tudiant");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setModal(true);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.build();
	}
	
	public void build(){
		//panel pour la saisie		
		nom = new JLabel("Nom �tudiant (*) : ");
		saisieNom = new JTextField();
		saisieNom.addKeyListener(new ChampsObligatoires());
		prenom = new JLabel("Pr�nom �tudiant (*) : ");
		saisiePrenom = new JTextField();
		saisiePrenom.addKeyListener(new ChampsObligatoires());
		legende = new JLabel("(*) saisie obligatoire");
				
		panelSaisie = new JPanel();
		panelSaisie.setLayout(new GridLayout(2,2,0,10));
		panelSaisie.add(nom);
		panelSaisie.add(saisieNom);
		panelSaisie.add(prenom);
		panelSaisie.add(saisiePrenom);
	
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
		panelBoutons.add(Box.createRigidArea(new Dimension(ESPACE,1)));
		panelBoutons.add(bnAnnuler);
		
		//panel principal
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panelPrincipal.add(panelSaisie);
		panelPrincipal.add(legende);
		panelPrincipal.add(Box.createRigidArea(new Dimension(1,ESPACE)));
		panelPrincipal.add(panelBoutons);
		
		this.setContentPane(panelPrincipal);
		this.pack();
	}
	
	public void setNom(String n){
		saisieNom.setText(n);
	}
	
	public void setPrenom(String p){
		saisiePrenom.setText(p);
	}
	
	public void activeBoutonOK(boolean b){
		bnOK.setEnabled(b);
	}
	
	public class ChampsObligatoires implements KeyListener
	{
		public void keyReleased(KeyEvent arg0)
		{
			if(saisieNom.getText().equals("") || saisiePrenom.getText().equals(""))
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
			if(saisieNom.getText().equals("") || saisiePrenom.getText().equals(""))
			{
				activeBoutonOK(false);
			}
		}
		
		public void keyTyped(KeyEvent arg0)
		{
			if(saisieNom.getText().equals("") || saisiePrenom.getText().equals(""))
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
				Principale.demandeAjouterEmprunteur(saisieNom.getText(), saisiePrenom.getText());
			}
		}
	}
}