package principal;

import java.util.ArrayList;

/**
 * The Class Vehicule.
 */
abstract class Vehicule implements Iterable<Vehicule>{
	
	/** The marque. */
	private String marque;
	
	/** The exemplaires. */
	private ArrayList<Exemplaire> exemplaires;
	
	/** The vehicules. */
	private Vehicules vehicules;
	
	/**
	 * Instantiates a new vehicule.
	 *
	 * @param marque the marque
	 */
	public Vehicule(String marque, Vehicules vehicules) {
		this.marque = marque;
		this.vehicules = vehicules;
		this.vehicules.add(this);
	}
	
	/**
	 * Add un exemplaire au véhicule.
	 * @param exemplaire exemplaire à ajouter.
	 */
	public void add(Exemplaire exemplaire) {
		exemplaires.add(exemplaire);
		}
	/**
	 * Gets the marque.
	 *
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}	
	/**
	 * Gets the exemplaires.
	 *
	 * @return the exemplaires
	 */
	public ArrayList<Exemplaire> getExemplaires() {
		return exemplaires;
	}
	/**
	 * Gets the vehicules.
	 *
	 * @return the vehicules
	 */
	public Vehicules getVehicules() {
		return vehicules;
	}
		
}
