package principal;
// TODO: Auto-generated Javadoc

/**
 * Modélise les adhérents, ceux qui peuvent louer un véhicule.
 *
 * @author PC-Louis
 * @see Emprunteurs
 */
class Emprunteur {
	/** Static var to derterminate id */
  private static int current_id = 0;
	
  /** The id. */
  private int id;
  
  /** The nom. */
  private String nom;

  /** The prenom. */
  private String prenom;

  /** The adresse. */
  private Adresse adresse;

  /** The emprunteurs. */
  private Emprunteurs emprunteurs;
  
  /**
   * Instantiates a new emprunteur.
   *
   * @param nom the nom
   * @param prenom the prenom
   * @param adresse the adresse
   * @param emprunteurs the emprunteurs
   */
  public Emprunteur(String nom, String prenom, Adresse adresse, Emprunteurs emprunteurs) {
	  Emprunteur.current_id += 1;
	  this.id = current_id; 
	  this.nom = nom;
	  this.prenom = prenom;
	  this.adresse = adresse;
	  this.emprunteurs = emprunteurs;
	  this.emprunteurs.addEmprunteur(this);
  }
 
  /**
   * Louer un véhicule.
   * @see Location
   */
  public void louer() {
  }

  /**
   * Ramener un véhicule loué.
   * @see Location
   */
  public void  ramener() {
  }
  /**
   * Modifier.
   */
  public void  modifier() {
  }

/**
 * Gets the id.
 *
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * Gets the nom.
 *
 * @return the nom
 */
public String getNom() {
	return nom;
}
/**
 * Sets the nom.
 *
 * @param nom the new nom
 */
public void setNom(String nom) {
	this.nom = nom;
}
/**
 * Gets the prenom.
 *
 * @return the prenom
 */
public String getPrenom() {
	return prenom;
}

/**
 * Sets the prenom.
 *
 * @param prenom the new prenom
 */
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

/**
 * Gets the adresse.
 *
 * @return the adresse
 */
public Adresse getAdresse() {
	return adresse;
}

/**
 * Sets the adresse.
 *
 * @param adresse the new adresse
 */
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}

/**
 * Gets the emprunteurs.
 *
 * @return the emprunteurs
 */
public Emprunteurs getEmprunteurs() {
	return emprunteurs;
}

@Override
public String toString() {
	return "Emprunteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", emprunteurs="
			+ emprunteurs + "]";
}
  

}
