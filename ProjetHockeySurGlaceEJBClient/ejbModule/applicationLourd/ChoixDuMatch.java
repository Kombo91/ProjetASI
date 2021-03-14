/**
 * 
 */
package applicationLourd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hw.Equipe;
import hw.Gardien;
import hw.Rencontre;
import hw.Utilisateur;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Color;
/**
 * @author KP
 *
 */
public class ChoixDuMatch extends JFrame {

	private JPanel contentPane;
	ConnexionAuxServlet conAuxServ = new ConnexionAuxServlet();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixDuMatch frame = new ChoixDuMatch();
					frame.setVisible(true);
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
		setBounds(100, 100, 405, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton demarrerMatch = new JButton("Demarrer Match");
		demarrerMatch.setHorizontalAlignment(SwingConstants.LEADING);
		demarrerMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				conAuxServ.demarrerMatch(50,50);
				conAuxServ.ajouterScoreDuMatch(50,50);
			}
		});
		demarrerMatch.setBounds(254, 227, 112, 23);
		contentPane.add(demarrerMatch);
		
		
		DefaultListModel<String> modelListeGardien = new DefaultListModel<>();

		JList listeGardien = new JList(modelListeGardien);
		listeGardien.setBackground(Color.WHITE);
		listeGardien.setBounds(20, 50, 150, 166);
		contentPane.add(listeGardien);
		List<Gardien> listGardien= conAuxServ.recupererToutLesGardiens();
		
		for (Gardien gard : listGardien){
			modelListeGardien.addElement(gard.getNom());
		}
		
		
		DefaultListModel<String> modelListeEquipe = new DefaultListModel<>();
		JList listeEquipe = new JList(modelListeEquipe);
		listeEquipe.setBounds(211, 50, 150, 166);
		contentPane.add(listeEquipe);

		List<Equipe> listEquipe = conAuxServ.recupererToutesLesEquipes();
		for (Equipe gard : listEquipe){
			modelListeEquipe.addElement(gard.getNomEquipe());
		}
		demarrerMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				conAuxServ.demarrerMatch(50,50);
				conAuxServ.ajouterScoreDuMatch(50,50);
				System.out.println("gardien "+listeGardien.getSelectedValue());
				System.out.println("equipe "+listeEquipe.getSelectedValue());
			}
		});
	}
	
	
}
