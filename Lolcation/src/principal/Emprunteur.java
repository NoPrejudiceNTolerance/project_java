package principal;
// TODO: Auto-generated Javadoc

/**
 * Modélise les adhérents, ceux qui peuvent louer un véhicule.
 *
 * @author PC-Louis
 * @see Emprunteurs
 */
class Emprunteur {
  
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
	this.id = 0; // GENERER ALEATOIREMENT
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.emprunteurs = emprunteurs;
  }
 
  /**
   * Louer.
   */
  public void louer() {
  }

  /**
   * Ramener.
   */
  public void  ramener() {
  }

  /**
   * Modifier adresse.
   */
  public void modifierAdresse() {
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
 * Sets the id.
 *
 * @param id the new id
 */
public void setId(int id) {
	this.id = id;
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
  
}
