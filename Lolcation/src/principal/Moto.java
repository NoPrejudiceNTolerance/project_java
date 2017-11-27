package principal;

import java.util.Iterator;

class Moto extends Vehicule {
	private String cylindree;

	public Moto(String marque, String cylindree) {
		super(marque);
		this.cylindree = cylindree;
	}
	
	public String getCylindree() {
		return cylindree;
	}
	
	@Override
	public Iterator<Vehicule> iterator() {
		return super.getVehicules().iterator();
	}
	
}
