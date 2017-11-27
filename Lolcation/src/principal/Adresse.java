package principal;
// TODO: Auto-generated Javadoc
/**
 * Modélisation d'une adresse.
 * @author PC-Louis
 * 
 */
class Adresse {
	
	/** The numero. */
	private short numero;
  
	/** The rue. */
	private String rue;

	/** The cp. */
	private short cp;

	/** The ville. */
	private String ville;

	/**
	 * Instantiates a new adresse.
	 *
	 * @param numero the numero
	 * @param rue the rue
	 * @param cp the cp
	 * @param ville the ville
	 */
	public Adresse(short numero, String rue, short cp, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}
	
	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public short getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(short numero) {
		this.numero = numero;
	}

	/**
	 * Gets the rue.
	 *
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Sets the rue.
	 *
	 * @param rue the new rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Gets the cp.
	 *
	 * @return the cp
	 */
	public short getCp() {
		return cp;
	}

	/**
	 * Sets the cp.
	 *
	 * @param cp the new cp
	 */
	public void setCp(short cp) {
		this.cp = cp;
	}

	/**
	 * Gets the ville.
	 *
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Sets the ville.
	 *
	 * @param ville the new ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	

	
}

