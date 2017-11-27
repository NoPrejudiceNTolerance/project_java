package principal;

import java.util.ArrayList;


// TODO: Auto-generated Javadoc
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
	public Vehicule(String marque) {
		this.marque = marque;
	}
	
	/**
	 * Adds the.
	 *
	 * @param exemplaire the exemplaire
	 */
	public void add(Exemplaire exemplaire) {
		if(exemplaires.size() == 0) { 
			// Ajout du nouveau vehicule à la liste des vehicules et insertion d'un premier exemplaire
			vehicules.add(this);
			exemplaires.add(exemplaire);	
		} else {
			// inserer un exemplaire dans le véhicule existant
			exemplaires.add(exemplaire);
		}
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
	 * Sets the marque.
	 *
	 * @param marque the new marque
	 */
	public void setMarque(String marque) {
		this.marque = marque;
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
	 * Sets the exemplaires.
	 *
	 * @param exemplaires the new exemplaires
	 */
	public void setExemplaires(ArrayList<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}
	
	/**
	 * Gets the vehicules.
	 *
	 * @return the vehicules
	 */
	public Vehicules getVehicules() {
		return vehicules;
	}
	
	/**
	 * Sets the vehicules.
	 *
	 * @param vehicules the new vehicules
	 */
	public void setVehicules(Vehicules vehicules) {
		this.vehicules = vehicules;
	}
	
	
	
}
