package principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
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
	
	private JList<String> listeEmprunteurs;
	
	private EmprunteursModel empModel;
	private JTable table;
	
	private DefaultListModel<String> modele; 
	private JButton bnAjouter;
	private JButton bnModifier;
	private JButton bnSupprimer;
	private JButton bnFermer;
	
	private JMenuItem item1, item2, item3;
	private JPopupMenu menu;
	
	public FenetreListeEmprunteur(){
		this.setTitle("Liste des emprunteurs");
		this.setResizable(true);
		this.setMinimumSize(new Dimension(400, 400));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.build();
	}
	
	public void build(){
		//panel de gauche
		table = new JTable(empModel);
		table.setAutoCreateRowSorter(true);
		
		modele = new DefaultListModel<String>();
		listeEmprunteurs = new JList<String>(modele);
		listeEmprunteurs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listeEmprunteurs.addListSelectionListener(new ListListen());
		panelListe = new JPanel();
		panelListe.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
		panelListe.setLayout(new GridLayout(1,1));
		//panelListe.add(listeEmprunteurs);
		panelListe.add(table);
		
		//panel de droite
		bnAjouter = new JButton("Ajouter...");
		bnAjouter.setMaximumSize(new Dimension(100, 40));
		bnAjouter.addActionListener(new SorsSorsSors());
		bnModifier = new JButton("Modifier...");
		bnModifier.setMaximumSize(new Dimension(100, 40));
		bnModifier.setEnabled(false);
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
	
	public void actualiserListe(Emprunteurs e)
	{
		Emprunteur dernierEmp = e.getEmprunteurs().get(e.getEmprunteurs().size()-1);
		modele.addElement(dernierEmp.getNom() + " " + dernierEmp.getPrenom());
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
			if(e.getSource() == bnSupprimer)
			{
				int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer cet emprunteur ?", "Suppression", JOptionPane.YES_NO_OPTION);
				if(reponse == JOptionPane.YES_OPTION)
				{
					//Principale.supprimerEmprunteur(id);//à faire
					modele.remove(listeEmprunteurs.getSelectedIndex());
				}
			}
			if(e.getSource() == bnAjouter)
			{
				Principale.ouvrirFenetreAjout();
			}
		}
	}
	
	public class ListListen implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent arg0)
		{
			if(listeEmprunteurs.getSelectedIndex() == -1)
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
