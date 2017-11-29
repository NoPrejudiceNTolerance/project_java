package principal;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		Emprunteurs emprunteurs = new Emprunteurs();
		
		Emprunteur emp1 = new Emprunteur("Malinet", "Antoine", new Adresse((short)12, "rue des fleurs", (short)94000, "Villejuif"), emprunteurs);
		Emprunteur emp2 = new Emprunteur("Singer", "Louis", new Adresse((short)3, "clos des saules", (short)54420, "Saulxures"), emprunteurs);
		new Emprunteur("Singer", "Louis", new Adresse((short)3, "clos des saules", (short)54420, "Saulxures"), emprunteurs);
		Iterator<Emprunteur> i = emprunteurs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
