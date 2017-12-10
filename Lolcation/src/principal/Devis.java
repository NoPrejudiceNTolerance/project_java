package principal;

import java.io.FileOutputStream;

import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Devis d'une location.
 *
 * @author PC-Louis
 * @see Location
 */
class Devis {
 
  private final String chemin;
	
  /** The duree. */
  private int duree;

  /** The prix. */
  private int prix;
  
  /** La location à laquelle le devis fait référence */
  private Location location;

  /** Le prix des exemplaires loués */
  private int prixLocationParJour;
  
  /** Le document (sert a la génération du PDF) du devis */
  private Document documentDevis;
  /**
   * Instantiates a new devis.
   *
   * @param duree La durée de location
   * @param assurance false si pas d'assurance true sinon
   */
  public Devis(Location location) {
	this.location = location;
	this.duree = this.location.getDebut().dureeTo(this.location.getFin());
	this.chemin = "D:\\Programs\\GitHub\\Java_project\\project_java\\PDF\\Devis\\Devis"+location.getNumero()+".pdf";
	this.prixLocationParJour = 0;
	for(Exemplaire e:location.getExemplaire()) {
		this.prixLocationParJour += e.getVehicule().prixParJour();
	}
	this.prix = calculPrix();
	this.documentDevis = new Document();
	this.generateDevis();
  }
  /**
   * Calcul le prix du devis.
   * @return calculed price
   */
  private int calculPrix() {
	// On fait payer l'assurance (1€ / jour)
	if(location.getAssurance()) {
		prixLocationParJour += 1;
	}
	return prixLocationParJour * duree;
  }
  public int getDuree() {
	return duree;
}
	/**
	 * Gets the prix.
	 * @return the prix
	 */
	public int getPrix() {
	return prix;
}
	/**
	 * Sets the prix.
	 * @param prix the new prix
	 */
	public void setPrix(int prix) {
	this.prix = prix;
	}
	/**
	 * Genere le Devis en Pdf
	 * @return true si le Pdf est bien généré, false sinon
	 */
	public boolean generateDevis() {
		System.out.println("Génération du devis");
		try
		{
			
			PdfWriter.getInstance(documentDevis, new FileOutputStream(chemin));
			documentDevis.open();
			
			// Ecriture 
			Paragraph p = new Paragraph();
			p.add("LolCation Devis" + location.getNumero() + "\n Location de " + location.getExemplaire().size() +" véhicule(s) au nom de "+ location.getEmprunteur().getNom() +" "+ location.getEmprunteur().getPrenom());
			p.add("\nDebut de la location : " + location.getDebut().toString());
			p.add("\nFin de la location  : " + location.getFin().toString());
			p.add("\n\nDurée de location : " + duree + " jours.");
			
			PdfPTable tableau = new PdfPTable(3);
			tableau.addCell("Véhicule");
			tableau.addCell("Prix au jour");
			tableau.addCell("Prix pour la location");
			for(Exemplaire e:location.getExemplaire()) {
				tableau.addCell(e.getVehicule().toString());
				tableau.addCell(Integer.toString(e.getVehicule().prixParJour())+"€");
				tableau.addCell(Integer.toString(e.getVehicule().prixParJour() * duree)+"€");
			}
			tableau.addCell("Assurance");
			if(location.getAssurance()) {
				tableau.addCell("1€");
				tableau.addCell(duree+"€");
			} else {
				tableau.addCell("0€");
				tableau.addCell("0€");
			}
			
			tableau.addCell("TOTAL");
			tableau.addCell(Integer.toString(prixLocationParJour)+"€");
			tableau.addCell(Integer.toString(prix)+"€");
			
			
			
			p.add(tableau);
			documentDevis.add(p);
			
		} catch (DocumentException de) {
			de.printStackTrace();
			return false;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return false;
		}
		
		documentDevis.close();
		return true;
	}
	public int getPrixLocationParJour() {
		return prixLocationParJour;
	}
	public void setPrixLocationParJour(int prixLocationParJour) {
		this.prixLocationParJour = prixLocationParJour;
	}
	public Document getDocumentDevis() {
		return this.documentDevis;
	}
}

 
