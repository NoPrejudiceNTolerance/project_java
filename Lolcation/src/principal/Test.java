package principal;

import java.util.Iterator;

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
		
		
		Emprunteurs emprunteurs = new Emprunteurs();
		
		new Emprunteur("Malinet", "Antoine", new Adresse((short)12, "rue des fleurs", (short)94000, "Villejuif"), emprunteurs);
		new Emprunteur("Singer", "Louis", new Adresse((short)3, "clos des saules", (short)54420, "Saulxures"), emprunteurs);
		
		Iterator<Emprunteur> i = emprunteurs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Flotte flotte = new Flotte();
		Vehicules vehicules = new Vehicules();
		Vehicule maMoto = new Moto("BMW", "Speedy", vehicules);
		Vehicule maVoiture = new Auto("Renault", "Twingo", false, vehicules);
		new Exemplaire(maVoiture, 5000, flotte);
		Vehicule v;
		Iterator<Vehicule> i_v = vehicules.iterator();
		
		while(i_v.hasNext()) {
			v = i_v.next();
			System.out.println(v);
			Iterator<Exemplaire> itExemplaire = v.iterator();
			while(itExemplaire.hasNext()) {
				System.out.println(itExemplaire.next());
			}
		}
	}

	/**
	 * Gets the locations.
	 *
	 * @return the locations
	 */
	public static Locations getLocations() {
		return locations;
	}


}
