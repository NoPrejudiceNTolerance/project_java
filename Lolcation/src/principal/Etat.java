package principal;

public enum Etat {
	EXCELLENT(8),
	TRES_BON(7),
	BON(6),
	MOYEN(5),
	ENDOMMAGE_LEGEREMENT(4),
	ENDOMMAGE(3),
	TRES_ENDOMMAGE(2),
	EPAVE(1);
	
	private int valeurEtat = 8;
	
	Etat(int valeurEtat){
		this.valeurEtat = valeurEtat;
	}
	
	public int getValeurEtat() {
		return valeurEtat;
	}
}
