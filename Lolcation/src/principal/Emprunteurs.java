package principal;
/**
 * Liste de tout les emprunteurs.
 * @see Emprunteur
 * @author PC-Louis
 */
import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Emprunteurs.
 */
class Emprunteurs {
  
  /** The emprunteurs. */
  private List<Emprunteur> emprunteurs;

  /**
   * Instantiates a new emprunteurs.
   */
  public Emprunteurs() {
	this.emprunteurs = new ArrayList<Emprunteur>();
  }

  
  /**
   * Inserer emprunteur.
   */
  public void  insererEmprunteur() {
	  
  }

  /**
   * Supprimer emprunteur.
   */
  public void  supprimerEmprunteur() {
	  
  }


  /**
   * Gets the emprunteurs.
   *
   * @return the emprunteurs
   */
  public List<Emprunteur> getEmprunteurs() {
	return emprunteurs;
  }


  /**
   * Sets the emprunteurs.
   *
   * @param emprunteurs the new emprunteurs
   */
  public void setEmprunteurs(List<Emprunteur> emprunteurs) {
	this.emprunteurs = emprunteurs;
  }

}
