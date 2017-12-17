package principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class FenetreListeEmprunteur extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int ESPACE_ENTRE_BOUTONS=25;
	
	private JPanel panelPrincipal;
	private JPanel panelListe;
	private JPanel panelBoutons;
	
	private EmprunteursModel empModel;
	private JTable table;
	private ListSelectionModel tableListModel;
	
	private JButton bnAjouter;
	private JButton bnModifier;
	private JButton bnSupprimer;
	private JButton bnFermer;
	
	public FenetreListeEmprunteur(){
		this.setTitle("Liste des emprunteurs");
		this.setResizable(true);
		this.setMinimumSize(new Dimension(600, 600));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.build();
	}
	
	public void build(){
		//panel de gauche
		empModel = new EmprunteursModel();
		table = new JTable(empModel);
		table.setAutoCreateRowSorter(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableListModel = table.getSelectionModel();
		tableListModel.addListSelectionListener(new TableListen());
		
		//listeEmprunteurs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//listeEmprunteurs.addListSelectionListener(new ListListen());
		panelListe = new JPanel();
		panelListe.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
		panelListe.setLayout(new GridLayout(1,1));
		panelListe.add(new JScrollPane(table));
		
		//panel de droite
		bnAjouter = new JButton("Ajouter...");
		bnAjouter.setMaximumSize(new Dimension(100, 40));
		bnAjouter.addActionListener(new SorsSorsSors());
		bnModifier = new JButton("Modifier...");
		bnModifier.setMaximumSize(new Dimension(100, 40));
		bnModifier.setEnabled(false);
		bnModifier.addActionListener(new SorsSorsSors());
		bnSupprimer = new JButton("Supprimer");
		bnSupprimer.setMaximumSize(new Dimension(100, 40));
		bnSupprimer.setEnabled(false);
		bnSupprimer.addActionListener(new SorsSorsSors());
		bnFermer = new JButton("Fermer");
		bnFermer.setMaximumSize(new Dimension(100, 40));
		bnFermer.addActionListener(new SorsSorsSors());
		
		panelBoutons = new JPanel();
		panelBoutons.setLayout(new BoxLayout(panelBoutons, BoxLayout.Y_AXIS));
		panelBoutons.add(Box.createRigidArea(new Dimension(1,ESPACE_ENTRE_BOUTONS)));
		panelBoutons.add(bnAjouter);
		panelBoutons.add(Box.createRigidArea(new Dimension(1,ESPACE_ENTRE_BOUTONS)));
		panelBoutons.add(bnModifier);
		panelBoutons.add(Box.createRigidArea(new Dimension(1,ESPACE_ENTRE_BOUTONS)));
		panelBoutons.add(bnSupprimer);
		panelBoutons.add(Box.createVerticalGlue());
		panelBoutons.add(bnFermer);
		
		//panel principal
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panelPrincipal.add(panelListe, BorderLayout.CENTER);
		panelPrincipal.add(panelBoutons, BorderLayout.EAST);
		
		this.setContentPane(panelPrincipal);
		this.pack();
	}
	
	public void ajouterEmprunteur() {
		empModel.ajoutEmprunteur();
	}
	
	public void modifierElement(int index, String element)
	{
		
	}
	
	public class SorsSorsSors implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == bnFermer)
			{
				System.exit(0);
			}
			if(e.getSource() == bnSupprimer && !tableListModel.isSelectionEmpty())
			{
				int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer cet emprunteur ?", "Suppression", JOptionPane.YES_NO_OPTION);
				if(reponse == JOptionPane.YES_OPTION)
				{
					empModel.supprEmprunteur(table.convertRowIndexToModel(table.getSelectedRow()));
				}
			}
			if(e.getSource() == bnAjouter)
			{
				Principale.ouvrirFenetreAjout();
			}
			if(e.getSource() == bnModifier)
			{
				//envoie l'ID de l'utilisateur a modifier (complexe car depend du tri du tableau)
				Principale.ouvrirFenetreModifier((int)(Integer.parseInt((String)empModel.getValueAt(table.convertRowIndexToModel(table.getSelectedRow()), 0))));
			}
		}
	}
	
	public class TableListen implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent arg0)
		{
			if(tableListModel.isSelectionEmpty())
			{
				bnModifier.setEnabled(false);
				bnSupprimer.setEnabled(false);
			}
			else
			{
				bnModifier.setEnabled(true);
				bnSupprimer.setEnabled(true);
			}
		}
	}
}
