
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
  
  /**
   * Instantiates a new exemplaire.
   *
   * @param vehicule the vehicule
   * @param kilometres the kilometres
   * @param flotte the flotte
   */
  public Exemplaire(Vehicule vehicule, int kilometres, Flotte flotte) {
	this.kilometres = kilometres;
	this.flotte = flotte;
	this.vehicule = vehicule;
	this.add();
  }
  
  /**
   * Adds the.
   */
  private void add() {
	  //Ajout de l'exemplaire
	 flotte.add(this);
	 vehicule.add(this);
  }

  /**
   * Gets the numero.
   *
   * @return the numero
   */
  public short getNumero() {
	return numero;
  }

  /**
   * Sets the numero.
   *
   * @param numero the new numero
   */
  public void setNumero(short numero) {
	this.numero = numero;
  }

  /**
   * Gets the kilometres.
   *
   * @return the kilometres
   */
  public int getKilometres() {
	return kilometres;
  }

  /**
   * Sets the kilometres.
   *
   * @param kilometres the new kilometres
   */
  public void setKilometres(int kilometres) {
	this.kilometres = kilometres;
  }

  /**
   * Gets the flotte.
   *
   * @return the flotte
   */
  public Flotte getFlotte() {
	return flotte;
  }

  /**
   * Gets the vehicule.
   *
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

  
}

