package principal;

import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class Moto.
 */
class Moto extends Vehicule {
	
	/** The cylindree. */
	private String cylindree;

	/**
	 * Instantiates a new moto.
	 *
	 * @param marque the marque
	 * @param cylindree the cylindree
	 */
	public Moto(String marque, String cylindree) {
		super(marque);
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
	public Iterator<Vehicule> iterator() {
		return super.getVehicules().iterator();
	}
	
}
