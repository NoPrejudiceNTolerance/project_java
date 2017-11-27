package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Liste de tout les exemplaires tout véhicules confondus disponible à la location.
 *
 * @author PC-Louis
 * @see Exemplaire
 */
class Flotte implements Iterable<Exemplaire>{
	
	/** The exemplaires. */
	private List<Exemplaire> exemplaires;
	
	/**
	 * Instantiates a new flotte.
	 */
	public Flotte() {
		this.exemplaires = new ArrayList<Exemplaire>();
	}

	/**
	 * Gets the exemplaires.
	 *
	 * @return the exemplaires
	 */
	public List<Exemplaire> getExemplaires() {
		return exemplaires;
	}
	
	
	/**
	 * Inserer exemplaire.
	 */
	public void insererExemplaire() {
		
	}
	
	/**
	 * Supprimer exemplaire.
	 */
	public void supprimerExemplaire() {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Exemplaire> iterator() {
		return exemplaires.iterator();
	}
	/**
	 * Ajout d'un exemplaire.
	 * @param exemplaire Exemplaire à ajouter
	 */

	public void add(Exemplaire exemplaire) {
		exemplaires.add(exemplaire);
	}
}
