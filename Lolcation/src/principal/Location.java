package principal;


import java.util.Iterator;
import java.util.List;

/**
 * The Class Location.
 */
class Location implements Iterable<Exemplaire>{
	
	/** Variable static dont le but est de determiner le numero de la location. */
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
	
	/** Le statue de la location (énumération) */
	private Statue statue;
	
	/** supplément lié à l'état de dégradation du véhicule. */
	private int supplementEtat;
	
	/** supplément lié a la consommation d'essence. */
	private int supplementPlein;
	
	private int retard;
	
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
		this.supplementEtat = 0;
		this.supplementPlein = 0;
		this.retard = 0;
		this.devis = new Devis(this);
		this.devis.generateDevis();
		this.statue = Statue.EN_COURS;
	}
	
	/**
	 * Rendre les véhicules loués.
	 * @param dateRendu date de rendu
	 */
	public void rendre(Date dateRendu, List<Plein> listeDesReservoirs, List<Etat> listeDesEtats) {
		if(this.statue == Statue.EN_COURS) {
			this.retard = fin.dureeTo(dateRendu);
			this.rendu = dateRendu;
			renduExemplaires(listeDesReservoirs, listeDesEtats);
			this.facture = new Facture(retard, supplementEtat, supplementPlein, this.devis.getpDevis(), this.numero);
			
			this.statue = Statue.RENDU;
		}
	}
	
	/**
	 * Fonction privée permettant de calculer les supplements.
	 * @param listeDesReservoirs
	 * @param listeDesEtats
	 */
	private void renduExemplaires(List<Plein> listeDesReservoirs, List<Etat> listeDesEtats) {
		Iterator<Plein> i_P = listeDesReservoirs.iterator();
		Iterator<Etat> i_E = listeDesEtats.iterator();
		Plein niveau_plein = exemplaires.get(0).getNiveauPlein();
		Etat new_etat = exemplaires.get(0).getEtatExemplaire();
		
		for(Exemplaire e:this) {
			
			if(i_P.hasNext()) {niveau_plein = i_P.next();} else {niveau_plein = e.getNiveauPlein();}
			this.supplementPlein += (e.getNiveauPlein().getPourcentage() - niveau_plein.getPourcentage())*2/10;
			e.setNiveauPlein(niveau_plein);
			
			if(i_E.hasNext()) {new_etat = i_E.next();} else {new_etat = e.getEtatExemplaire();}
			this.supplementEtat  += (e.getEtatExemplaire().getValeurEtat() - new_etat.getValeurEtat())*5;
			e.setEtatExemplaire(new_etat);
		}
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
	 * @return the rendu
	 */
	public Date getRendu() {
		return rendu;
	}
	/**
	 * Gets the emprunteur.
	 * @return the emprunteur
	 */
	public Emprunteur getEmprunteur() {
		return emprunteur;
	}
	
	/**
	 * Sets the emprunteur.
	 * @param emprunteur the new emprunteur
	 */
	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = emprunteur;
	}

	/**
	 * Gets the exemplaire.
	 * @return the exemplaire
	 */
	public List<Exemplaire> getExemplaire() {
		return exemplaires;
	}
	
	/**
	 * Gets the devis.
	 * @return the devis
	 */
	public Devis getDevis() {
		return devis;
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
	 * Gets the locations.
	 *
	 * @return the locations
	 */
	public Locations getLocations() {
		return locations;
	}
	
	@Override
	public Iterator<Exemplaire> iterator() {
		return exemplaires.iterator();
	}

	/**
	 * gets si il y a une assurance
	 * @return assurance
	 */
	public boolean getAssurance() {
		return assurance;
	}
	
	public Statue getStatue() {
		return statue;
	}

	public void setStatue(Statue statue) {
		this.statue = statue;
	}

	public enum Statue { 
		  
	  	/** quand la location est en cours */
	  	EN_COURS,
		  
	  	/** quand la location est rendu */
	  	RENDU;
	}

}
