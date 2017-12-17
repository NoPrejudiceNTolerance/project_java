package principal;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FenetreAjouterLocation extends FenetreAjouterElement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelSaisie;
	private JPanel panelSaisie2;
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
	
	public FenetreAjouterLocation(){
		super("Ajouter un emprunteur");
		super.build();
	}
	
	public void buildFen(){
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
		
		listeChampsTexte.add(saisieNom);
		listeChampsTexte.add(saisiePrenom);
		listeChampsTexte.add(saisieNumero);
		listeChampsTexte.add(saisieRue);
		listeChampsTexte.add(saisieCp);
		listeChampsTexte.add(saisieVille);
		
		panelSaisie = new JPanel();
		panelSaisie.setLayout(new GridLayout(2,2,0,10));
		panelSaisie.setBorder(BorderFactory.createEmptyBorder(20,10,100,10));
		panelSaisie.add(nom);
		panelSaisie.add(saisieNom);
		panelSaisie.add(prenom);
		panelSaisie.add(saisiePrenom);
		
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
		
		panelSaisieP.add(panelSaisie, BorderLayout.WEST);
		panelSaisieP.add(panelSaisie2, BorderLayout.EAST);
	}
	
	public void viderZonesSaisie() {
		saisieNom.setText("");
		saisiePrenom.setText("");
		saisieNumero.setText("");
		saisieRue.setText("");
		saisieCp.setText("");
		saisieVille.setText("");
	}
	
	public void boutonOk() {
		//a modifier
		//Principale.demandeAjouterLocation(saisieNom.getText(), saisiePrenom.getText(), (short)Short.parseShort(saisieNumero.getText()), saisieRue.getText(), (int)Integer.parseInt(saisieCp.getText()), saisieVille.getText());
	}
}
