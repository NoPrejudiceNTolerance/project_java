package principal;

import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class Moto.
 */
class Moto extends Vehicule {
	
	private static final int PRIX_LOCATION = 11; 
	
	/** The cylindree. */
	private String cylindree;

	/**
	 * Instantiates a new moto.
	 *
	 * @param marque the marque
	 * @param cylindree the cylindree
	 */
	public Moto(String marque, String cylindree, Vehicules vehicules) {
		super(marque, vehicules);
		this.cylindree = cylindree;
	}
	
	/**
	 * Gets the cylindree.
	 *
	 * @return the cylindree
	 */
	public String getCylindree() {
		return cylindree;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Exemplaire> iterator() {
		return super.getExemplaires().iterator();
	}

	@Override
	public String toString() {
		return super.toString() + cylindree;
	}

	@Override
	public int prixParJour() {
		return super.getPrixSuppAlea() + Moto.PRIX_LOCATION;
	}
	
	
}
