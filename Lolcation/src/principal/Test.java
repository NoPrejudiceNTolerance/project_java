package principal;

import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Test.
 */
public class Test {

	/** The locations. */
	private static Locations locations;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Test.locations = new Locations();
		
		DevisPdf d = new DevisPdf();
		Emprunteurs emprunteurs = new Emprunteurs();
		
		new Emprunteur("Malinet", "Antoine", new Adresse((short)12, "rue des fleurs", (short)94000, "Villejuif"), emprunteurs);
		Emprunteur e = new Emprunteur("Singer", "Louis", new Adresse((short)3, "clos des saules", (short)54420, "Saulxures"), emprunteurs);
		
		Iterator<Emprunteur> i = emprunteurs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// Cr�ation de la flotte et de la base des v�hicules
		Flotte flotte = new Flotte();
		Vehicules vehicules = new Vehicules();
		// Cr�ation des v�hicules
		Vehicule maMoto = new Moto("BMW", "Speedy", vehicules);
		Vehicule maVoiture = new Auto("Renault", "Twingo", false, vehicules);
		Vehicule maVoiture2 = new Auto("Peugeot", "308", false, vehicules);
		// Cr�ation des exemplaires
		new Exemplaire(maVoiture, 5000, flotte);
		new Exemplaire(maVoiture2, 5000, flotte);
		new Exemplaire(maMoto, 12000, flotte);
		// Cr�ation d'une location de test
		Location myLoc = new Location(new Date(22,06,2017), new Date(04,12,2017), e ,flotte.getExemplaires(), true, locations);
		myLoc.rendre(new Date(7,12,2017));
		
	}
	
	

}
