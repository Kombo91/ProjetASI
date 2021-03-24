/**
 * 
 */
package applicationLourd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import hw.Equipe;
import hw.Gardien;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author KP
 *
 */
public class ChangerGardien extends JFrame {

	private JPanel contentPane;
	ConnexionAuxServlet conAuxServ = new ConnexionAuxServlet();
	List<Gardien> cloned_list = new ArrayList<Gardien>();
	List<Gardien> cloned_list2 = new ArrayList<Gardien>();
	private int idnewGard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangerGardien frame = new ChangerGardien();
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
	public ChangerGardien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VariableStatique.setIdGardien(idnewGard);
				List<Gardien> gardienEntrant = new ArrayList<Gardien>();
				List<Gardien> gardienSurTerrain = new ArrayList<Gardien>(VariableStatique.getListedesGradiensSurTerrain());
				System.out.println("gardien sur le terrain "+VariableStatique.getListedesGradiensSurTerrain());
				boolean exist = false;
				for(Gardien gar : VariableStatique.getListedesGradiensSurTerrain()) {
					if(gar.getIdGardien() == VariableStatique.getIdGardienEntrant()) {
						exist= true;
					}
				}
				if(exist == false) {
					System.out.println("id gardien "+VariableStatique.getIdGardienEntrant());

					for (Gardien garde : VariableStatique.getListeTousLesGardiens()) {
						System.out.println("gardien "+garde.getIdGardien());

						if(garde.getIdGardien() == VariableStatique.getIdGardienEntrant()) {
							gardienSurTerrain.add(garde);
							
							conAuxServ.ajouterScoreDuMatch(VariableStatique.getIdGardienEntrant(),
									VariableStatique.getIdRencontre());
						}										
					}
				}
				
				for (Gardien garde : VariableStatique.getListeTousLesGardiens()) {
					
					if (garde.getIdGardien() != VariableStatique.getIdGardienEntrant()) {
						gardienEntrant.add(garde);
					}

				}
				
				VariableStatique.setIdGardien(VariableStatique.getIdGardienEntrant());
				VariableStatique.setListeGardientEntrant(gardienEntrant);
				VariableStatique.setListedesGradiensSurTerrain(gardienSurTerrain);
			
				dispose();
			}

		});
		btnValider.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnValider.setBounds(265, 115, 106, 38);
		contentPane.add(btnValider);

		JLabel lblNewLabel = new JLabel("Veillez choisir le nouveau gardien");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel.setBounds(112, 11, 238, 30);
		contentPane.add(lblNewLabel);
		DefaultListModel<Gardien> modelListeGardien = new DefaultListModel<Gardien>();
		JList listGardiensEntrants = new JList(modelListeGardien);
		listGardiensEntrants.setBounds(43, 52, 186, 152);
		contentPane.add(listGardiensEntrants);

		List<Gardien> listGardien = VariableStatique.getListeGardientEntrant();

		
		for (Gardien gard : listGardien) {
			modelListeGardien.addElement(new Gardien(gard.getIdGardien(), gard.getNom()));
		}
		listGardiensEntrants.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) {
					Gardien pojo = (Gardien) ((JList) e.getSource()).getSelectedValue();
					VariableStatique.setIdGardienEntrant(pojo.getIdGardien());
					
					System.out.println("pojo.getIdGardien() " + pojo.getIdGardien());
				}
			}
		});

	}

	public int getIdnewGard() {
		return idnewGard;
	}

	public void setIdnewGard(int idnewGard) {
		this.idnewGard = idnewGard;
	}
}
