
package principal;

class Exemplaire {
  private short numero;

  private int kilometres;

  private Flotte flotte;

  private Vehicule vehicule;

  public Exemplaire(int kilometres, Flotte flotte, Vehicule vehicule) {
	super();
	this.kilometres = kilometres;
	this.flotte = flotte;
	this.vehicule = vehicule;
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

public void setFlotte(Flotte flotte) {
	this.flotte = flotte;
}

public Vehicule getVehicule() {
	return vehicule;
}

public void setVehicule(Vehicule vehicule) {
	this.vehicule = vehicule;
}
  
  

}
