package principal;

import java.util.ArrayList;

abstract class Vehicule {
	private String marque;
	private ArrayList<Exemplaire> exemplaires;
	private Vehicules vehicules;
	
	public Vehicule(String marque) {//a completer
		this.marque = marque;
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
