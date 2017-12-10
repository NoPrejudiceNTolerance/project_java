package principal;

import java.io.FileOutputStream;

import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class DevisPdf {
	public static final String chemin = "D:\\Programs\\GitHub\\Java_project\\project_java\\PDF\\Devis\\pdfTest.pdf";
	
	public void generateDervis() throws DocumentException, IOException
	{
		Document document = new Document();
		
		try
		{
			PdfWriter.getInstance(document, new FileOutputStream(chemin));
			document.open();
			
			// Ecriture sur le Pdf
			
			Paragraph p = new Paragraph();
			p.add("Devis LolCation : emprunt de\n NOM PRENOM du DATE DEBUT au DATE FIN");
			document.add(p);
			
		} catch (DocumentException de) {
			de.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		document.close();
	}
}
