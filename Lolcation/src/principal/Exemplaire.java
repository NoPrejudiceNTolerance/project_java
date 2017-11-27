
package principal;



class Exemplaire {
  private short numero;
  private int kilometres;
  private Flotte flotte;
  private Vehicule vehicule;
  
  public Exemplaire(Vehicule vehicule, int kilometres, Flotte flotte) {
	this.kilometres = kilometres;
	this.flotte = flotte;
	this.vehicule = vehicule;
	this.add();
  }
  private void add() {
	  //Ajout de l'exemplaire
	 flotte.add(this);
	 vehicule.add(this);
  }

  public short getNumero() {
	return numero;
  }

  public void setNumero(short numero) {
	this.numero = numero;
  }

  public int getKilometres() {
	return kilometres;
  }

  public void setKilometres(int kilometres) {
	this.kilometres = kilometres;
  }

  public Flotte getFlotte() {
	return flotte;
  }

  public Vehicule getVehicule() {
	return vehicule;
  }

}

