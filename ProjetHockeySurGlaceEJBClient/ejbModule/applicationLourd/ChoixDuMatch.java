/**
 * 
 */
package applicationLourd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import hw.Equipe;
import hw.Gardien;
import hw.Rencontre;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * @author KP
 *
 */
public class ChoixDuMatch extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6640300638482710941L;
	private JPanel contentPane;
	JLabel pasDeGardien;
	JLabel pasDequipe;
	ConnexionAuxServlet conAuxServ = new ConnexionAuxServlet();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					if (VariableStatique.isChoixDuMatchIsOpen()) {
						ChoixDuMatch frame = new ChoixDuMatch();
						frame.setVisible(true);
					} else {
						new PasDAcces().setVisible(true);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChoixDuMatch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		setBounds(100, 100, 484, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		List<Gardien> listGardien = conAuxServ.recupererToutLesGardiens(VariableStatique.getIdMonEquipe());
		VariableStatique.setListeTousLesGardiens(listGardien);
		List<Gardien> listGardientEntrant = new ArrayList<Gardien>();
		Set<Gardien> listGradiensSurTerrain = new HashSet<Gardien>();

		JButton demarrerMatch = new JButton("Demarrer Match");
		demarrerMatch.setHorizontalAlignment(SwingConstants.LEADING);
		demarrerMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (VariableStatique.getIdGardien() == 0) {
					pasDeGardien.setText("Veuillez sélectionner un gardien");
				}
				if (VariableStatique.getIdEquipeAdvers() == 0) {
					pasDequipe.setText("Veuillez sélectionner une equipe advers");
				}
				if (VariableStatique.getIdEquipeAdvers() != 0 && VariableStatique.getIdGardien() != 0) {

					Rencontre getIdRencontre = conAuxServ.ajouterRencontre(VariableStatique.getIdMonEquipe(),
							VariableStatique.getIdEquipeAdvers());
					VariableStatique.setIdRencontre(getIdRencontre.getIdRencontre());

					conAuxServ.ajouterScoreDuMatch(VariableStatique.getIdGardien(), VariableStatique.getIdRencontre());

					for (Gardien gd : listGardien) {
						if (VariableStatique.getIdGardien() != gd.getIdGardien()) {
							listGardientEntrant.add(gd);
						} else {
							listGradiensSurTerrain.add(gd);
						}
					}
					VariableStatique.setListedesGradiensSurTerrain(listGradiensSurTerrain);
					VariableStatique.setListeGardientEntrant(listGardientEntrant);

					dispose();
					new ApplicationSaisieScore().setVisible(true);
				}
			}
		});
		demarrerMatch.setBounds(323, 227, 127, 23);
		contentPane.add(demarrerMatch);
		DefaultListModel<Gardien> modelListeGardien = new DefaultListModel<Gardien>();
		

		JList listeGardienJlist = new JList(modelListeGardien);
		JScrollPane scrollPaneGardien = new JScrollPane(listeGardienJlist);
		scrollPaneGardien.setBounds(20, 50, 200, 144);
		contentPane.add(scrollPaneGardien);

		for (Gardien gard : listGardien) {
			modelListeGardien.addElement(new Gardien(gard.getIdGardien(),gard.getPrenom(), gard.getNom()));
		}
		listeGardienJlist.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) {
					Gardien pojo = (Gardien) ((JList) e.getSource()).getSelectedValue();
					VariableStatique.setIdGardien(pojo.getIdGardien());
					pasDeGardien.setText("");
				}
			}
		});

		DefaultListModel<Equipe> modelListeEquipe = new DefaultListModel<Equipe>();
		JList listeEquipeJlist = new JList(modelListeEquipe);
		JScrollPane scrollPaneEquipe = new JScrollPane(listeEquipeJlist);
		scrollPaneEquipe.setBackground(Color.WHITE);
		scrollPaneEquipe.setBounds(250, 50, 200, 144);
		contentPane.add(scrollPaneEquipe);
		List<Equipe> listEquipe = conAuxServ.recupererToutesLesEquipes(VariableStatique.getIdMonEquipe());

		for (Equipe eq : listEquipe) {
			modelListeEquipe.addElement(new Equipe(eq.getIdEquipe(), eq.getNomEquipe()));
		}
		listeEquipeJlist.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) {
					Equipe pojo = (Equipe) ((JList) e.getSource()).getSelectedValue();
					VariableStatique.setIdEquipeAdvers(pojo.getIdEquipe());
					pasDequipe.setText("");
				}
			}
		});

		JButton deconnexion = new JButton("D\u00E9connexion");
		deconnexion.setHorizontalAlignment(SwingConstants.RIGHT);
		deconnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conAuxServ.deconnecte(VariableStatique.getIdUtilisteur());
				dispose();
				new Connexion().setVisible(true);
			}
		});
		deconnexion.setBounds(30, 227, 110, 23);
		contentPane.add(deconnexion);

		JLabel lblNewLabel = new JLabel("Liste des gardiens");
		lblNewLabel.setBounds(76, 23, 110, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Liste equipes advers");
		lblNewLabel_1.setBounds(290, 25, 127, 14);
		contentPane.add(lblNewLabel_1);

		pasDeGardien = new JLabel("");
		pasDeGardien.setForeground(new Color(255, 0, 0));
		pasDeGardien.setBounds(20, 202, 200, 14);
		contentPane.add(pasDeGardien);

		pasDequipe = new JLabel("");
		pasDequipe.setForeground(Color.RED);
		pasDequipe.setBounds(250, 205, 200, 14);
		contentPane.add(pasDequipe);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				conAuxServ.deconnecte(VariableStatique.getIdUtilisteur());
				dispose();
			}
		});

	}
}
