package principal;
// TODO: Auto-generated Javadoc

/**
 * Modélise la facture d'une location.
 *
 * @author PC-Louis
 * @see Location
 */
class Facture {
	
	/** The retard. */
	private short retard;
	
	/**
	 * Instantiates a new facture.
	 *
	 * @param retard the retard
	 */
	public Facture(short retard) {
		this.retard = retard;
	}
	
	/**
	 * Gets the retard.
	 * @return the retard
	 */
	public short getRetard() {
		return retard;
	}
	
	/**
	 * Sets the retard.
	 *
	 * @param retard the new retard
	 */
	public void setRetard(short retard) {
		this.retard = retard;
	}
	
	
	/**
	 * Prints the pdf.
	 */
	public void printPdf() {
		
	}
}
