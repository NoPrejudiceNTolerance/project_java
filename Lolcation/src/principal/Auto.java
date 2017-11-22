
class Auto extends Vehicule {
  private String modele;

  private boolean luxe;
  
  public Auto(String modele, boolean luxe) {
	super();
	this.modele = modele;
	this.luxe = luxe;
  }

  public String getModele() {
	return modele;
  }

  public void setModele(String modele) {
	this.modele = modele;
  }

  public boolean isLuxe() {
	return luxe;
  }

  public void setLuxe(boolean luxe) {
	this.luxe = luxe;
  }
   
}
