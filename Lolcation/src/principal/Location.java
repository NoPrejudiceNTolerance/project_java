package principal;

import java.util.ArrayList;

class Location {
	private short numero;
	private Date debut;
	private Date fin;
	private Date rendu;
	private Emprunteur emprunteur;
	private ArrayList<Exemplaire> exemplaires;
	private Devis devis;
	private Facture facture;
	private Locations locations;
	
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}

	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Date getRendu() {
		return rendu;
	}
	public void setRendu(Date rendu) {
		this.rendu = rendu;
	}

	public Emprunteur getEmprunteur() {
		return emprunteur;
	}
	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = emprunteur;
	}

	public ArrayList<Exemplaire> getExemplaire() {
		return exemplaires;
	}
	//a modifier probablement
	public void setExemplaire(ArrayList<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}

	public Devis getDevis() {
		return devis;
	}
	public void setDevis(Devis devis) {
		this.devis = devis;
	}

	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	public Locations getLocations() {
		return locations;
	}
	
	public Location(Date debut, Date fin, Emprunteur emprunteur, ArrayList<Exemplaire> exemplaires, Locations locations) {
		this.debut = debut;
		this.fin = fin;
		this.emprunteur = emprunteur;
		this.exemplaires = exemplaires;
		this.locations = locations;
	}
	
	
	public void ajouterExemplaire(Exemplaire exemplaire) {
		this.exemplaires.add(exemplaire);
	}
	
	public void supprimerExemplaire(Exemplaire exemplaire) {
		this.exemplaires.remove(exemplaire);
	}
	
	public void devis() {
		
	}
	
	public void facture() {
		
	}
	
}
