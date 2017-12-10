package principal;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Modélise la facture d'une location.
 *
 * @author PC-Louis
 * @see Location
 */
class Facture {
	
	private static final int PRIX_JOUR_RETARD = 21;
	
	/** The retard. */
	private int retard;
	
	private Date dateRetourDevis;
	private Date dateRetourReelle;
	/** La location facturée */
	private Document devis;
	
	private final String chemin;
	
	/**
	 * Instantiates a new facture.
	 * @param retard the retard
	 */
	public Facture(Date dateRetourDevis, Date dateRetourReelle, Document devis, int numeroLocation) {
		this.dateRetourDevis = dateRetourDevis;
		this.dateRetourReelle = dateRetourReelle;
		this.devis = devis;
		this.chemin = "D:\\Programs\\GitHub\\Java_project\\project_java\\PDF\\Factures\\Facture"+numeroLocation+".pdf";
		this.retard = dateRetourDevis.dureeTo(dateRetourReelle);
		this.generateFacture();
	}
	
	public boolean generateFacture() {
		System.out.println("Génération de la facture");
		try
		{
			
			PdfWriter.getInstance(devis, new FileOutputStream(chemin));
			devis.open();
			Paragraph p = new Paragraph();
			p.add("\nA cela s'ajoute un montant de " + Facture.PRIX_JOUR_RETARD*this.retard + "€ suite aux " + this.retard + " jours de retard." );
			devis.add(p);
			
		} catch (DocumentException de) {
			de.printStackTrace();
			return false;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return false;
		}
		
		devis.close();
		return true;
	}
	
	
	
}
