package principal;

import java.util.ArrayList;

/**
 * The Class Vehicule.
 */
abstract class Vehicule implements Iterable<Exemplaire>{
	
	/** The marque. */
	private String marque;
	
	/** The exemplaires. */
	private ArrayList<Exemplaire> exemplaires;
	
	/** The vehicules. */
	private Vehicules vehicules;
	
	private int prixSuppAlea;
	/**
	 * Instantiates a new vehicule.
	 *
	 * @param marque the marque
	 */
	public Vehicule(String marque, Vehicules vehicules) {
		this.marque = marque;
		this.vehicules = vehicules;
		this.vehicules.add(this);
		this.exemplaires = new ArrayList<Exemplaire>();
		this.setPrixSuppAlea((int) (Math.random() * 10));
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
	
	public abstract int prixParJour();

	@Override
	public String toString() {
		return marque + " ";
	}

	public int getPrixSuppAlea() {
		return prixSuppAlea;
	}

	public void setPrixSuppAlea(int prixSuppAlea) {
		this.prixSuppAlea = prixSuppAlea;
	}
	
		
}
