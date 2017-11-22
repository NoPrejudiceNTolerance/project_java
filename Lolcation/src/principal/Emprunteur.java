package principal;

class Emprunteur {
  
  private int id;
  
  private String nom;

  private String prenom;

  private Adresse adresse;

  private Emprunteurs emprunteurs;
  
  public Emprunteur(String nom, String prenom, Adresse adresse, Emprunteurs emprunteurs) {
	this.id = 0; // GENERER ALEATOIREMENT
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.emprunteurs = emprunteurs;
  }
 
  public void louer() {
  }

  public void  ramener() {
  }

  public void modifierAdresse() {
  }

  public void  modifier() {
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public Adresse getAdresse() {
	return adresse;
}

public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}

public Emprunteurs getEmprunteurs() {
	return emprunteurs;
}
  
}
