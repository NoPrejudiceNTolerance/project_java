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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FenetreAjouterEmprunteur extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int ESPACE=20;
	
	private JPanel panelPrincipal;
	private JPanel panelSaisie;
	private JPanel panelSaisie2;
	private JPanel panelBoutons;
	
	private JLabel prenom;
	private JTextField saisiePrenom;
	private JLabel nom;
	private JTextField saisieNom;
	
	private JLabel numero;
	private JTextField saisieNumero;
	private JLabel rue;
	private JTextField saisieRue;
	private JLabel cp;
	private JTextField saisieCp;
	private JLabel ville;
	private JTextField saisieVille;
	
	private JButton bnOK;
	private JButton bnAnnuler;
	
	public FenetreAjouterEmprunteur(){
		this.setTitle("Ajouter un emprunteur");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setModal(true);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.build();
	}
	
	public void build(){
		//panel pour la saisie
		nom = new JLabel("Nom (*) : ");
		saisieNom = new JTextField();
		saisieNom.addKeyListener(new ChampsObligatoires());
		prenom = new JLabel("Prenom (*) : ");
		saisiePrenom = new JTextField();
		saisiePrenom.addKeyListener(new ChampsObligatoires());
		
		numero = new JLabel("Numéro (*) : ");
		saisieNumero = new JTextField();
		saisieNumero.addKeyListener(new ChampsObligatoires());
		rue = new JLabel("Rue (*) : ");
		saisieRue = new JTextField();
		saisieRue.addKeyListener(new ChampsObligatoires());
		cp = new JLabel("CP (*) : ");
		saisieCp = new JTextField();
		saisieCp.addKeyListener(new ChampsObligatoires());
		ville = new JLabel("Ville (*) : ");
		saisieVille = new JTextField();
		saisieVille.addKeyListener(new ChampsObligatoires());
				
		panelSaisie = new JPanel();
		panelSaisie.setLayout(new GridLayout(2,2,0,10));
		panelSaisie.add(nom);
		panelSaisie.add(saisieNom);
		panelSaisie.add(prenom);
		panelSaisie.add(saisiePrenom);
		panelSaisie.setBorder(BorderFactory.createEmptyBorder(20,10,100,10));
		
		panelSaisie2 = new JPanel();
		panelSaisie2.setLayout(new GridLayout(4,2,0,10));
		panelSaisie2.add(numero);
		panelSaisie2.add(saisieNumero);
		panelSaisie2.add(rue);
		panelSaisie2.add(saisieRue);
		panelSaisie2.add(cp);
		panelSaisie2.add(saisieCp);
		panelSaisie2.add(ville);
		panelSaisie2.add(saisieVille);
		panelSaisie2.setBorder(BorderFactory.createEmptyBorder(10,20,20,10));
	
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
		panelPrincipal.add(panelSaisie2, BorderLayout.EAST);
		panelPrincipal.add(Box.createRigidArea(new Dimension(1,ESPACE)));
		panelPrincipal.add(panelBoutons, BorderLayout.SOUTH);
		
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
			if(saisieNom.getText().equals("") ||
					saisiePrenom.getText().equals("") ||
					saisieNumero.getText().equals("") ||
					saisieRue.getText().equals("") ||
					saisieCp.getText().equals("") ||
					saisieVille.getText().equals(""))
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
				Principale.demandeAjouterEmprunteur(saisieNom.getText(), saisiePrenom.getText(), (short)Short.parseShort(saisieNumero.getText()), saisieRue.getText(), (int)Integer.parseInt(saisieCp.getText()), saisieVille.getText());
			}
		}
	}
}
