package principal;
import java.util.List;

/**
 * Devis d'une location.
 *
 * @author PC-Louis
 * @see Location
 */
class Devis {
 
  /** The duree. */
  private int duree;

  /** The prix. */
  private int prix;
  
  private Location location;
  /**
   * Instantiates a new devis.
   *
   * @param duree La durée de location
   * @param assurance false si pas d'assurance true sinon
   */
  public Devis(Location location) {
	super();
	this.location = location;
	this.duree = this.location.getDebut().dureeTo(this.location.getFin());
	this.prix = calculPrix();
}
  /**
   * Calcul le prix du devis.
   * @return calculed price
   */
  private int calculPrix() {
	int ratio_location = 
	
	return prix;
}

/**
   * Prints the pdf.
   */
  public void printPdf() {
  }

  
  
  /**
   * Gets the duree.
   *
   * @return the duree
   */
  public short getDuree() {
	return duree;
}

	/**
	 * Sets the duree.
	 *
	 * @param duree the new duree
	 */
	public void setDuree(short duree) {
	this.duree = duree;
}

	/**
	 * Checks if is assurance.
	 *
	 * @return true, if is assurance
	 */
	public boolean isAssurance() {
	return assurance;
}

	/**
	 * Sets the assurance.
	 *
	 * @param assurance the new assurance
	 */
	public void setAssurance(boolean assurance) {
	this.assurance = assurance;
}

	/**
	 * Gets the prix.
	 *
	 * @return the prix
	 */
	public int getPrix() {
	return prix;
}

	/**
	 * Sets the prix.
	 *
	 * @param prix the new prix
	 */
	public void setPrix(int prix) {
	this.prix = prix;
}

  
}
