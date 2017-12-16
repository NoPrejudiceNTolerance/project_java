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
	
	private int suppEtat;
	
	private int suppEssence;
	
	private Date dateRetourReelle;
	/** La location facturée */
	private Document facture;
	
	private Paragraph pDevis;
	
	private final String chemin;
	
	/**
	 * Instantiates a new facture.
	 * @param retard the retard
	 */
	public Facture(int retard, int supplementEtat, int supplementPlein, Paragraph paragraphDevis, short numero) {
		this.retard = retard;
		this.suppEssence = supplementPlein;
		this.suppEtat = supplementEtat;
		this.pDevis = paragraphDevis;
		this.chemin = "D:\\Programs\\GitHub\\Java_project\\project_java\\PDF\\Facture\\Facture"+numero+".pdf";
		this.generateFacture();
	}

	/**
	 * Genere la facture en PDF.
	 * @return true 
	 */
	public boolean generateFacture() {
		System.out.println("Génération de la facture");
		try
		{
			this.facture = new Document();
			PdfWriter.getInstance(facture, new FileOutputStream(chemin));
			facture.open();
			
			//On ajoute le paragraph du devis histoire de rappeller les sommes etc...
			facture.add(pDevis);
			
			//Puis on ajoute les éléments relatifs au rendu des exemplaires
			Paragraph p = new Paragraph();
			p.add("\nA cela s'ajoute un montant de " + Facture.PRIX_JOUR_RETARD*this.retard + "€ suite aux " + this.retard + " jours de retard." );
			facture.add(p);
			
		} catch (DocumentException de) {
			de.printStackTrace();
			facture.close();
			return false;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			facture.close();
			return false;
		}
		
		facture.close();
		return true;
	}
	
	
	
}
