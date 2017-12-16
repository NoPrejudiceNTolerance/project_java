package principal;

public enum Plein {
	FULL(100),
	TROIS_QUART(75),
	DEMI(50),
	QUART(25),
	VIDE(0);
	
	private int pourcentage = 100;
	
	Plein(int pourcentage){
		this.pourcentage = pourcentage;
	}
	
	public int getPourcentage() {
		return pourcentage;
	}
}
