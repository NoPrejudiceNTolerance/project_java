package principal;

class Moto extends Vehicule {
	private String cylindree;

	public Moto(String marque, String cylindree) {
		super(marque);
		this.cylindree = cylindree;
	}
	
	public String getCylindree() {
		return cylindree;
	}
	public void setCylindree(String cylindree) {
		this.cylindree = cylindree;
	}
	
	
	
}
