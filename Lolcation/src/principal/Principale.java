package principal;

import java.awt.Dimension;

public class Principale {
	// la classe principale g�re les 3 fen�tres de l'application
	static private FenetreListeEmprunteur fenListe;
	static private FenetreAjouterEmprunteur fenAjout;
	//static private FenetreModifierEtu fenModif;
	
	private static Emprunteurs e;
	
	static public Emprunteurs getListeEmprunteurs() {
		return e;
	}
	
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
	static public void demandeAjouterEmprunteur(String nom, String prenom, short numero, String rue, int cp, String ville){
		new Emprunteur(nom, prenom, new Adresse(numero, rue, cp, ville), e);
		fenListe.ajouterEmprunteur();
	}
	
	static public void modifierEmprunteur(String nom, String prenom, int index){
		fenListe.modifierElement(index, nom+" "+prenom);
	}
	
	static public void supprimerEmprunteur(int id){
		e.supprimerEmprunteur(id);
		fenListe.supprimerEmprunteur();
	}
	
	public static void main(String[] args) {
		e = new Emprunteurs();
		
		fenListe = new FenetreListeEmprunteur();
		fenAjout = new FenetreAjouterEmprunteur();
		//fenModif = new FenetreModifierEtu();
		fenListe.setVisible(true);
	}
}
