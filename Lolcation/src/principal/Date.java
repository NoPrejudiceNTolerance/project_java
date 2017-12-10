package principal;
// TODO: Auto-generated Javadoc
/**
 * Modélisation d'une date.
 * @author PC-Louis
 *
 */
class Date {
  


/** The jour. */
  private short jour;

  /** The mois. */
  private short mois;

  /** The annee. */
  private short annee;
  
  /**
   * Instantiates a new date.
   *
   * @param jour the jour
   * @param mois the mois
   * @param annee the annee
   */
  public Date(short jour, short mois, short annee) {
	super();
	this.jour = jour;
	this.mois = mois;
	this.annee = annee;
  }

  public Date(int i, int j, int k) {
	this((short)i, (short)j, (short)k);
}

/**
   * Retourne la durée total en jour de this à dateFin
   * @param dateFin date de fin
   * @return
   */
  public int dureeTo(Date dateFin) {
	  int duree = 0;
	  int diffAnnee =  dateFin.getAnnee() - this.getAnnee();
	  int diffMois = dateFin.getMois() - this.getMois();
	  int diffJours = dateFin.getJour() - this.getJour();
	  
	  duree = diffJours + diffMois*30 + diffAnnee*365;
	  return duree;
  }
  
  /**
   * Gets the jour.
   *
   * @return the jour
   */
  public short getJour() {
	return jour;
  }

  /**
   * Sets the jour.
   *
   * @param jour the new jour
   */
  public void setJour(short jour) {
	this.jour = jour;
  }

  /**
   * Gets the mois.
   *
   * @return the mois
   */
  public short getMois() {
	return mois;
  }

  /**
   * Sets the mois.
   *
   * @param mois the new mois
   */
  public void setMois(short mois) {
	this.mois = mois;
  }

  /**
   * Gets the annee.
   *
   * @return the annee
   */
  public short getAnnee() {
	return annee;
  }

  /**
   * Sets the annee.
   *
   * @param annee the new annee
   */
  public void setAnnee(short annee) {
	this.annee = annee;
  }
  
  @Override
	public String toString() {
		return jour + "/" + mois + "/" + annee;
	}

  
}
