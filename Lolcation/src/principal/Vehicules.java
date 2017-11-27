package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// TODO: Auto-generated Javadoc

/**
 * The Class Vehicules.
 *
 * @author PC-Louis
 * Liste de tout les véhicules disponibles à la location.
 * 
 * implemente Iterable
 */
class Vehicules implements Iterable<Vehicule>{
	
	/** The vehicules. */
	private List<Vehicule> vehicules;
	
	/**
	 * Instantiates a new vehicules.
	 */
	public Vehicules() {
		vehicules = new ArrayList<Vehicule>();
	}
	
	/**
	 * Gets the vehicules.
	 *
	 * @return the vehicules
	 */
	public List<Vehicule> getVehicules() {
		return vehicules;
	}
	
	/**
	 * Supprimer vehicule.
	 */
	public void supprimerVehicule() {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Vehicule> iterator() {
		return vehicules.iterator();
	}
	
/**
 * Adds the.
 *
 * @param vehicule Vehicule à ajouter à la liste.
 */
	public void add(Vehicule vehicule) {
		vehicules.add(vehicule);
		
	}
}
