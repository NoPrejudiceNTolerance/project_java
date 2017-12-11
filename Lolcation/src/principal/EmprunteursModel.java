package principal;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EmprunteursModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String[] entetes = { "ID", "Prénom", "Nom", "Adresse" };

	//private NoteService noteService;

	private List<Emprunteur> emprunteurs;
	
	public EmprunteursModel() {
		super();
		emprunteurs = Principale.getListeEmprunteurs().getEmprunteurs();
		//noteService = NoteService.getInstance();
		//notes = noteService.findLastNotes();
		
	}

	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}

	@Override
	public int getRowCount() {
		return emprunteurs.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			// Nom
			return Principale.getListeEmprunteurs().getEmprunteurs().get(rowIndex).getId();

		case 1:
			// Prenom
			return Principale.getListeEmprunteurs().getEmprunteurs().get(rowIndex).getPrenom();

		case 2:
			// Annee
			return Principale.getListeEmprunteurs().getEmprunteurs().get(rowIndex).getNom();

		case 3:
			// Sexe
			return Principale.getListeEmprunteurs().getEmprunteurs().get(rowIndex).getAdresse();


		default:
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {

		case 0:
			return String.class;
		case 1:
			return String.class;

		case 3:
			return String.class;

		case 2:
			return String.class;

		default:
			return Object.class;
		}
	}
	
	public void supprEmprunteur(int rowIndex) {
        Principale.getListeEmprunteurs().supprimerEmprunteur(emprunteur);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}