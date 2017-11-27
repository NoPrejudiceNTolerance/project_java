package principal;
// TODO: Auto-generated Javadoc

/**
 * Devis d'une location.
 *
 * @author PC-Louis
 * @see Location
 */
class Devis {
  
  /** The duree. */
  private short duree;

  /** The assurance. */
  private boolean assurance;

  /** The prix. */
  private int prix;
  
  /**
   * Instantiates a new devis.
   *
   * @param duree the duree
   * @param assurance the assurance
   * @param prix the prix
   */
  public Devis(short duree, boolean assurance, int prix) {
	super();
	this.duree = duree;
	this.assurance = assurance;
	this.prix = prix;
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
