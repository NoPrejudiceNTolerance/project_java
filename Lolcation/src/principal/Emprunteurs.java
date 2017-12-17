package principal;
/**
 * Liste de tout les emprunteurs.

 * @see Emprunteur
 * @author Louis, Antoine
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Class Emprunteurs.
 */
class Emprunteurs implements Iterable<Emprunteur> {
  
  /** Liste des emprunteurs */
  private List<Emprunteur> emprunteurs;

  /**
   * Instantiates a new emprunteurs
   */
  public Emprunteurs() {
	this.emprunteurs = new ArrayList<Emprunteur>();
  }

  /**
   * Inserer emprunteur

   * @param emprunteur l'emprunteur � ajouter � la liste
   * @return true si ok false sinon
   */
  public boolean addEmprunteur(Emprunteur emprunteur) {
	  return emprunteurs.add(emprunteur);
  }
  /**
   * Supprimer emprunteur
	 @param emprunteur Emprunteur � supprimer de la liste
	 @return true si ok false sinon
   */
  public boolean  supprimerEmprunteur(Emprunteur emprunteur) {
	  return emprunteurs.remove(emprunteur);
  }
  
  //suppr peut-etre
  public boolean  supprimerEmprunteur(int id) {
	  for(Emprunteur e : this) {
		  if(e.getId() == id) {
			  return this.supprimerEmprunteur(e);
		  }
	  }
	  return false;
  }
  
  /**
   * Gets the emprunteur with the ID : id
   * 
   * @return
   */
  public Emprunteur getEmprunteur(int id) {
	  for(Emprunteur e : this) {
		  if(e.getId() == id) {
			  return e;
		  }
	  }
	  return null;
  }

  /**
   * Gets the emprunteurs.
   *
   * @return the emprunteurs
   */
  public List<Emprunteur> getEmprunteurs() {
	return emprunteurs;
  }

	@Override
	public Iterator<Emprunteur> iterator() {
		return emprunteurs.iterator();
	}

}
