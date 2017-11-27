package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Vehicules implements Iterable<Vehicule>{
	private List<Vehicule> vehicules;
	
	public Vehicules() {
		vehicules = new ArrayList<Vehicule>();
	}
	
	public List<Vehicule> getVehicules() {
		return vehicules;
	}
	
	public void insererVehicule(Vehicule vehicule) {
		vehicules.add(vehicule);
		
	}
	
	public void supprimerVehicule() {
		
	}

	@Override
	public Iterator<Vehicule> iterator() {
		return vehicules.iterator();
	}

	public void add(Vehicule vehicule) {
		vehicules.add(vehicule);
		
	}
}
