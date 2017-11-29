package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Class Location.
 */
class Location implements Iterable<Exemplaire>{
	private static short current_numero = 0;
	
	/** The numero. */
	private short numero;
	
	/** The debut. */
	private Date debut;
	
	/** The fin. */
	private Date fin;
	
	/** The rendu. */
	private Date rendu;
	
	/** The emprunteur. */
	private Emprunteur emprunteur;
	
	/** The exemplaires. */
	private List<Exemplaire> exemplaires;
	
	/** The devis. */
	private Devis devis;
	
	/** The facture. */
	private Facture facture;
	
	/** The locations. */
	private Locations locations;
	
	/** true si Assurance souscrite, false sinon */
	private boolean assurance;
	
	/**
	 * Instantiates a new location.
	 *
	 * @param debut the debut
	 * @param fin the fin
	 * @param emprunteur the emprunteur
	 * @param exemplaires the exemplaires
	 * @param locations the locations
	 */
	public Location(Date debut, Date fin, Emprunteur emprunteur, List<Exemplaire> exemplaires, boolean assurance, Locations locations) {
		Location.current_numero =+ 1;
		this.numero = Location.current_numero;
		this.debut = debut;
		this.fin = fin;
		this.emprunteur = emprunteur;
		this.exemplaires = exemplaires;
		this.locations = locations;
		this.locations.add(this);
		this.assurance = assurance;
		this.devis = new Devis();
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
	 * Gets the debut.
	 *
	 * @return the debut
	 */
	public Date getDebut() {
		return debut;
	}
	
	/**
	 * Sets the debut.
	 *
	 * @param debut the new debut
	 */
	public void setDebut(Date debut) {
		this.debut = debut;
	}

	/**
	 * Gets the fin.
	 *
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}
	
	/**
	 * Sets the fin.
	 *
	 * @param fin the new fin
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * Gets the rendu.
	 *
	 * @return the rendu
	 */
	public Date getRendu() {
		return rendu;
	}
	
	/**
	 * Sets the rendu.
	 *
	 * @param rendu the new rendu
	 */
	public void setRendu(Date rendu) {
		this.rendu = rendu;
	}

	/**
	 * Gets the emprunteur.
	 *
	 * @return the emprunteur
	 */
	public Emprunteur getEmprunteur() {
		return emprunteur;
	}
	
	/**
	 * Sets the emprunteur.
	 *
	 * @param emprunteur the new emprunteur
	 */
	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = emprunteur;
	}

	/**
	 * Gets the exemplaire.
	 *
	 * @return the exemplaire
	 */
	public List<Exemplaire> getExemplaire() {
		return exemplaires;
	}
	
	/**
	 * Sets the exemplaire.
	 *
	 * @param exemplaires the new exemplaire
	 */
	//a modifier probablement
	public void setExemplaire(ArrayList<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}

	/**
	 * Gets the devis.
	 *
	 * @return the devis
	 */
	public Devis getDevis() {
		return devis;
	}
	
	/**
	 * Sets the devis.
	 *
	 * @param devis the new devis
	 */
	public void setDevis(Devis devis) {
		this.devis = devis;
	}

	/**
	 * Gets the facture.
	 *
	 * @return the facture
	 */
	public Facture getFacture() {
		return facture;
	}
	
	/**
	 * Sets the facture.
	 *
	 * @param facture the new facture
	 */
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	/**
	 * Gets the locations.
	 *
	 * @return the locations
	 */
	public Locations getLocations() {
		return locations;
	}
	
	/**
	 * Ajouter exemplaire.
	 *
	 * @param exemplaire the exemplaire
	 */
	public void ajouterExemplaire(Exemplaire exemplaire) {
		this.exemplaires.add(exemplaire);
	}
	
	/**
	 * Supprimer exemplaire.
	 *
	 * @param exemplaire the exemplaire
	 */
	public void supprimerExemplaire(Exemplaire exemplaire) {
		this.exemplaires.remove(exemplaire);
	}
	
	/**
	 * Devis.
	 */
	public void devis() {
		
	}
	
	/**
	 * Facture.
	 */
	public void facture() {
		
	}


	@Override
	public Iterator<Exemplaire> iterator() {
		return exemplaires.iterator();
	}
	
}
