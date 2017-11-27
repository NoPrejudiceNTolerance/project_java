package principal;

import java.util.ArrayList;


abstract class Vehicule implements Iterable<Vehicule>{
	private String marque;
	private ArrayList<Exemplaire> exemplaires;
	private Vehicules vehicules;
	
	public Vehicule(String marque) {
		this.marque = marque;
	}
	public void add(Exemplaire exemplaire) {
		if(exemplaires.size() == 0) { 
			// Ajout du nouveau vehicule à la liste des vehicules et insertion d'un premier exemplaire
			vehicules.add(this);
			exemplaires.add(exemplaire);	
		} else {
			// inserer un exemplaire dans le véhicule existant
			exemplaires.add(exemplaire);
		}
	}

	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public ArrayList<Exemplaire> getExemplaires() {
		return exemplaires;
	}
	public void setExemplaires(ArrayList<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}
	
	public Vehicules getVehicules() {
		return vehicules;
	}
	public void setVehicules(Vehicules vehicules) {
		this.vehicules = vehicules;
	}
	
	
	
}
