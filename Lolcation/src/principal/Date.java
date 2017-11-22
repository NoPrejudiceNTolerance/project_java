package principal;

class Date {
  private short jour;

  private short mois;

  private short annee;
  
  public Date(short jour, short mois, short annee) {
	super();
	this.jour = jour;
	this.mois = mois;
	this.annee = annee;
  }

  public short getJour() {
	return jour;
  }

  public void setJour(short jour) {
	this.jour = jour;
  }

  public short getMois() {
	return mois;
  }

  public void setMois(short mois) {
	this.mois = mois;
  }

  public short getAnnee() {
	return annee;
  }

  public void setAnnee(short annee) {
	this.annee = annee;
  }

  
}
