package principal;

import java.awt.Dimension;

public class Principale {
	// la classe principale g�re les 3 fen�tres de l'application
	static private FenetreListeEmprunteur fenListe;
	static private FenetreAjouterEmprunteur fenAjout;
	//static private FenetreModifierEtu fenModif;
	
	static public void ouvrirFenetreAjout(){
		fenAjout.activeBoutonOK(false);
		fenAjout.setNom("");
		fenAjout.setPrenom("");
		fenAjout.setVisible(true);
	}
	
/*	static public void ouvrirFenetreModifier(String element, int index){
		fenModif.activeBoutonOK(true);
		fenModif.setIndex(index);
		fenModif.setVisible(true);
	}
*/	
	static public void demandeAjouterEmprunteur(String nom, String prenom){
		fenListe.ajouterElement(nom+" "+prenom);
	}
	
	static public void modifierEtudiant(String nom, String prenom, int index){
		fenListe.modifierElement(index, nom+" "+prenom);
	}
	
	public static void main(String[] args) {
		fenListe = new FenetreListeEmprunteur();
		fenAjout = new FenetreAjouterEmprunteur();
		//fenModif = new FenetreModifierEtu();
		fenListe.setVisible(true);
	}
}
