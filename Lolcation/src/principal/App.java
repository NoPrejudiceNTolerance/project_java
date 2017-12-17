package principal;

import java.util.ArrayList;
import java.util.List;

public class App {

	/** The locations. */
	private static Locations locations;
	
	public static Locations getLocations() {
		return locations;
	}

	public static void setLocations(Locations locations) {
		App.locations = locations;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("DEBUT DU TEST");
		App.locations = new Locations();
		
		Emprunteurs emprunteurs = new Emprunteurs();
		
		new Emprunteur("Malinet", "Antoine", new Adresse((short)12, "rue des fleurs", (short)94000, "Villejuif"), emprunteurs);
		Emprunteur e = new Emprunteur("Singer", "Louis", new Adresse((short)3, "clos des saules", (short)54420, "Saulxures"), emprunteurs);

		// Création de la flotte et de la base des véhicules
		Flotte flotte = new Flotte();
		Vehicules vehicules = new Vehicules();
		
		// Création des véhicules
		Vehicule maMoto = new Moto("BMW", "Speedy", vehicules);
		Vehicule maVoiture = new Auto("Renault", "Twingo", false, vehicules);
		Vehicule maVoiture2 = new Auto("Peugeot", "308", false, vehicules);
		
		// Création des exemplaires
		new Exemplaire(maVoiture, 5000, flotte);
		new Exemplaire(maVoiture2, 5000, flotte);
		new Exemplaire(maMoto, 12000, flotte);
		
		// Création d'une location de test
		Location myLoc = new Location(new Date(22,06,2017), new Date(04,12,2017), e ,flotte.getExemplaires(), true, locations);
		myLoc.rendre(new Date(7,12,2017));
		
	}

}
