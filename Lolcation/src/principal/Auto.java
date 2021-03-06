package principal;

import java.util.Iterator;
/**
 * Modélisation d'une automobile. Fille de Véhicule.
*
* @author PC-Louis
* @see Vehicule
*/
class Auto extends Vehicule {
  
	private static final int PRIX_LOCATION = 12; 
	private static final int SUPP_LUXE = 8; 
	
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
  public Iterator<Exemplaire> iterator() {
	return super.getExemplaires().iterator();
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
  @Override
	public String toString() {
		return super.toString() + modele;
	}

@Override
public int prixParJour() {
	int prix = super.getPrixSuppAlea() + Auto.PRIX_LOCATION;
	if(this.gamme == Gamme.LUXE) {return prix + Auto.SUPP_LUXE;} else {return prix;}
}
  
}
