package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Flotte implements Iterable<Exemplaire>{
	private List<Exemplaire> exemplaires;
	
	public Flotte() {
		this.exemplaires = new ArrayList<Exemplaire>();
	}

	public List<Exemplaire> getExemplaires() {
		return exemplaires;
	}
	
	
	public void insererExemplaire() {
		
	}
	
	public void supprimerExemplaire() {
		
	}

	@Override
	public Iterator<Exemplaire> iterator() {
		return exemplaires.iterator();
	}

	public void add(Exemplaire exemplaire) {
		exemplaires.add(exemplaire);
	}
}
