package principal;

public class Principale {
	// la classe principale g�re les 3 fen�tres de l'application
	static private FenetreListeEmprunteur fenListe;
	static private FenetreAjouterEmprunteur fenAjout;
	static private FenetreModifierEmprunteur fenModif;
	
	private static Emprunteurs e;
	
	static public Emprunteurs getListeEmprunteurs() {
		return e;
	}
	
	static public void ouvrirFenetreAjout(){
		fenAjout.activeBoutonOK(false);
		fenAjout.viderZonesSaisie();
		fenAjout.setVisible(true);
	}
	
	static public void ouvrirFenetreModifier(int id){
		fenModif.setId(id);
		fenModif.setTitle("Emprunteur " + id);
		fenModif.activeBoutonOK(true);
		fenModif.remplirZonesSaisie();
		fenModif.setVisible(true);
	}
	
	static public void demandeAjouterEmprunteur(String nom, String prenom, short numero, String rue, int cp, String ville){
		new Emprunteur(nom, prenom, new Adresse(numero, rue, cp, ville), e);
		fenListe.ajouterEmprunteur();
	}
	
	//a suppr
	static public void modifierEmprunteur(String nom, String prenom, int index){
		fenListe.modifierElement(index, nom+" "+prenom);
	}
	
	public static void main(String[] args) {
		e = new Emprunteurs();
		
		fenListe = new FenetreListeEmprunteur();
		fenAjout = new FenetreAjouterEmprunteur();
		fenModif = new FenetreModifierEmprunteur();
		fenListe.setVisible(true);
	}
}
