
package principal;
/**
 * The Class Exemplaire.
 */
class Exemplaire {
  
  /** The numero. */
  private short numero;
  
  /** The kilometres. */
  private int kilometres;
  
  /** The flotte. */
  private Flotte flotte;
  
  /** The vehicule. */
  private Vehicule vehicule;
  
  /** Etat de l'exemplaire. */
  private Etat etatExemplaire;
  
  /** Niveau de plein. */
  private Plein niveauPlein;
  
  /**
   * Instantiates a new exemplaire.
   * @param vehicule the vehicule
   * @param kilometres the kilometres
   * @param flotte the flotte
   */
  public Exemplaire(Vehicule vehicule, int kilometres, Flotte flotte) {
	this.kilometres = kilometres;
	this.flotte = flotte;
	this.vehicule = vehicule;
	this.etatExemplaire = Etat.EXCELLENT;
	this.setNiveauPlein(Plein.FULL);
	this.add();
  }
  
  /**
   * Ajout de l'exemplaire dans deux conteneurs : d'abord dans la liste des exemplaires du véhicule puis dans la flotte.
   */
  private void add() {
	 flotte.add(this);
	 vehicule.add(this);
  }

  /**
   * Gets the numero.
   * @return the numero
   */
  public short getNumero() {
	return numero;
  }

  /**
   * Sets the numero.
   * @param numero the new numero
   */
  public void setNumero(short numero) {
	this.numero = numero;
  }

  /**
   * Gets the kilometres.
   * @return the kilometres
   */
  public int getKilometres() {
	return kilometres;
  }

  /**
   * Sets the kilometres.
   * @param kilometres the new kilometres
   */
  public void setKilometres(int kilometres) {
	this.kilometres = kilometres;
  }

  /**
   * Gets the flotte.
   * @return the flotte
   */
  public Flotte getFlotte() {
	return flotte;
  }

  /**
   * Gets the vehicule.
   * @return the vehicule
   */
  public Vehicule getVehicule() {
	return vehicule;
  }

@Override
public String toString() {
	return "Exemplaire [numero=" + numero + ", kilometres=" + kilometres + ", flotte=" + flotte + ", vehicule="
			+ vehicule + "]";
}

public Etat getEtatExemplaire() {
	return etatExemplaire;
}

public void setEtatExemplaire(Etat etatExemplaire) {
	this.etatExemplaire = etatExemplaire;
}

public Plein getNiveauPlein() {
	return niveauPlein;
}

public void setNiveauPlein(Plein niveauPlein) {
	this.niveauPlein = niveauPlein;
}


}

