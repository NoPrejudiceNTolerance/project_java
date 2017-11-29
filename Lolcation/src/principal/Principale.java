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
	static public void demandeAjouterEmprunteur(String nom, String prenom){
		new Emprunteur(nom, prenom, new Adresse((short)3, "censuree", (short)75001, "Saulxure"), e);
		fenListe.actualiserListe(e);
	}
	
	static public void modifierEmprunteur(String nom, String prenom, int index){
		fenListe.modifierElement(index, nom+" "+prenom);
	}
	
	static public void supprimerEmprunteur(int id){
		//e.getEmprunteurs().remove(index);
	}
	
	public static void main(String[] args) {
		e = new Emprunteurs();
		
		fenListe = new FenetreListeEmprunteur();
		fenAjout = new FenetreAjouterEmprunteur();
		//fenModif = new FenetreModifierEtu();
		fenListe.setVisible(true);
	}
}
