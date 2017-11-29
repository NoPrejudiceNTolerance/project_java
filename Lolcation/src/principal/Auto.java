package principal;

import java.util.Iterator;
/**
 * Modélisation d'une automobile. Fille de Véhicule.
*
* @author PC-Louis
* @see Vehicule
*/
class Auto extends Vehicule {
  
  /** The modele. */
  private String modele;
  
  /** The gamme. */
  private Gamme gamme;  
  
  /**
   * Instantiates a new auto.
   *
   * @param marque La marque de la voiture
   * @param modele the modele
   * @param isLuxe true si c'est une auto de luxe false sinon
   */
  public Auto(String marque, String modele, boolean isLuxe, Vehicules vehicules) {
	super(marque, vehicules);
	this.modele = modele;
	if(isLuxe) {gamme = Gamme.LUXE;} else {gamme = Gamme.STANDARD;}
  }

  /**
   * Gets the gamme.
   *
   * @return the gamme
   */
  public Gamme getGamme() {
	return gamme;
  	}

  /**
   * Gets the modele.
   *
   * @return the modele
   */
  public String getModele() {
	return modele;
	}

  	/* (non-Javadoc)
	   * @see java.lang.Iterable#iterator()
	   */
	  @Override
  public Iterator<Vehicule> iterator() {
	return super.getVehicules().iterator();
	}
/**
 * Enumération dans le but de simplifier la gestion des autos de luxe et les autos standards.
 * @author PC-Louis
 *
 */
  public enum Gamme { 
	  
  	/** The standard. */
  	STANDARD,
	  
  	/** The luxe. */
  	LUXE;
}
}
