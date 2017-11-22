package principal;

class Devis {
  private short duree;

  private boolean assurance;

  private int prix;
  
  public Devis(short duree, boolean assurance, int prix) {
	super();
	this.duree = duree;
	this.assurance = assurance;
	this.prix = prix;
}

  public void printPdf() {
  }

  
  
  public short getDuree() {
	return duree;
}

	public void setDuree(short duree) {
	this.duree = duree;
}

	public boolean isAssurance() {
	return assurance;
}

	public void setAssurance(boolean assurance) {
	this.assurance = assurance;
}

	public int getPrix() {
	return prix;
}

	public void setPrix(int prix) {
	this.prix = prix;
}

  
}
