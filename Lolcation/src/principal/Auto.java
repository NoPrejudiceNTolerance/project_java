package principal;

import java.util.Iterator;

class Auto extends Vehicule {
  private String modele;
  private Gamme gamme;  
  
  public Auto(String marque, String modele, boolean isLuxe) {
	super(marque);
	this.modele = modele;
	if(isLuxe) {gamme = Gamme.LUXE;} else {gamme = Gamme.STANDARD;}
  }

  public Gamme getGamme() {
	return gamme;
  	}

  public String getModele() {
	return modele;
	}

  	@Override
  public Iterator<Vehicule> iterator() {
	return super.getVehicules().iterator();
	}

  public enum Gamme { 
	  STANDARD,
	  LUXE;
}
}
