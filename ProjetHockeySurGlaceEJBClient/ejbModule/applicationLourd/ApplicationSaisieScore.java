/** 
 * 
 */
package applicationLourd;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hw.ScoreDeMatch;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;

/**
 * @author KP
 *
 */
public class ApplicationSaisieScore extends JFrame implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2121859626114537132L;
	private JPanel contentPane;
	private JPanel terrain1;
	private JPanel terrain2;
	private JPanel terrain3;
	private JPanel terrain4;
	private JPanel terrain5;
	private JPanel terrain6;

	private JPanel cageA;
	private JPanel cageB;
	private JPanel cageC;
	private JPanel cageD;
	private JPanel cageE;
	private JPanel cageF;
	private JPanel cageG;
	private JPanel cageH;
	private JPanel cageI;

	private String zoneterrain = "";
	private String zoneCage = "";
	private String tire = "";
	private JButton PasBut;
	private JButton But;
	private JButton finDeMatch;
	private JTextField txtZoneDeTire;

	private int idGardien;
	private int idRencontre;
	private JTextField txtZoneDeGardien;
	JLabel nbrButArrete;
	JLabel nbrButEncaisse;

	public int getIdGardien() {
		return idGardien;
	}

	public void setIdGardien(int idGardien) {
		this.idGardien = idGardien;
	}

	public int getIdRencontre() {
		return idRencontre;
	}

	public void setIdRencontre(int idRencontre) {
		this.idRencontre = idRencontre;
	}

	ConnexionAuxServlet conAuxServ = new ConnexionAuxServlet();
	private JLabel zoneDeTire;
	private JLabel zoneDeCage;
	private JTextField txtScooreDeMatch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					if (VariableStatique.isApplicationSaisieScoreIsOpen()) {
						ApplicationSaisieScore frame = new ApplicationSaisieScore();
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
	public ApplicationSaisieScore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 646, 413);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/////// JPanel terain
		terrain1 = new JPanel();
		terrain1.setBackground(Color.PINK);
		terrain1.setBounds(32, 45, 60, 60);
		terrain1.addMouseListener(this);
		JLabel texteterrain1 = new JLabel("1");
		texteterrain1.setVerticalAlignment(SwingConstants.BOTTOM);
		texteterrain1.setFont(new Font("Times New Roman", 1, 20));
		terrain1.add(texteterrain1);
		contentPane.add(terrain1);

		terrain2 = new JPanel();
		terrain2.setBackground(Color.PINK);
		terrain2.setBounds(102, 45, 60, 60);
		terrain2.addMouseListener(this);
		JLabel texteterrain2 = new JLabel("2");
		texteterrain2.setFont(new Font("Times New Roman", 1, 20));
		terrain2.add(texteterrain2);
		contentPane.add(terrain2);

		terrain3 = new JPanel();
		terrain3.setBackground(Color.PINK);
		terrain3.setBounds(32, 116, 60, 60);
		terrain3.addMouseListener(this);
		JLabel texteterrain3 = new JLabel("3");
		texteterrain3.setFont(new Font("Times New Roman", 1, 20));
		terrain3.add(texteterrain3);
		contentPane.add(terrain3);

		terrain4 = new JPanel();
		terrain4.setBackground(Color.PINK);
		terrain4.setBounds(102, 116, 60, 60);
		terrain4.addMouseListener(this);
		JLabel texteterrain4 = new JLabel("4");
		texteterrain4.setFont(new Font("Times New Roman", 1, 20));
		terrain4.add(texteterrain4);
		contentPane.add(terrain4);

		terrain5 = new JPanel();
		terrain5.setBackground(Color.PINK);
		terrain5.setBounds(32, 187, 60, 60);
		terrain5.addMouseListener(this);
		JLabel texteterrain5 = new JLabel("5");
		texteterrain5.setFont(new Font("Times New Roman", 1, 20));
		terrain5.add(texteterrain5);
		contentPane.add(terrain5);

		terrain6 = new JPanel();
		terrain6.setBackground(Color.PINK);
		terrain6.setBounds(102, 187, 60, 60);
		terrain6.addMouseListener(this);
		JLabel texteterrain6 = new JLabel("6");
		texteterrain6.setFont(new Font("Times New Roman", 1, 20));
		terrain6.add(texteterrain6);
		contentPane.add(terrain6);

		///// JPanel

		cageA = new JPanel();
		cageA.setBackground(Color.PINK);
		cageA.setBounds(220, 45, 60, 60);
		cageA.addMouseListener(this);
		JLabel texteCageA = new JLabel("A");
		texteCageA.setFont(new Font("Times New Roman", 1, 20));
		cageA.add(texteCageA);
		contentPane.add(cageA);

		cageB = new JPanel();
		cageB.setBackground(Color.PINK);
		cageB.setBounds(290, 45, 60, 60);
		cageB.addMouseListener(this);
		JLabel texteCageB = new JLabel("B");
		texteCageB.setFont(new Font("Times New Roman", 1, 20));
		cageB.add(texteCageB);
		contentPane.add(cageB);

		cageC = new JPanel();
		cageC.setBackground(Color.PINK);
		cageC.setBounds(360, 45, 60, 60);
		cageC.addMouseListener(this);
		JLabel texteCageC = new JLabel("C");
		texteCageC.setFont(new Font("Times New Roman", 1, 20));
		cageC.add(texteCageC);
		contentPane.add(cageC);

		cageD = new JPanel();
		cageD.setBackground(Color.PINK);
		cageD.setBounds(220, 116, 60, 60);
		cageD.addMouseListener(this);
		JLabel texteCageD = new JLabel("D");
		texteCageD.setFont(new Font("Times New Roman", 1, 20));
		cageD.add(texteCageD);
		contentPane.add(cageD);

		cageE = new JPanel();
		cageE.setBackground(Color.PINK);
		cageE.setBounds(290, 116, 60, 60);
		cageE.addMouseListener(this);
		JLabel texteCageE = new JLabel("E");
		texteCageE.setFont(new Font("Times New Roman", 1, 20));
		cageE.add(texteCageE);
		contentPane.add(cageE);

		cageF = new JPanel();
		cageF.setBackground(Color.PINK);
		cageF.setBounds(360, 116, 60, 60);
		cageF.addMouseListener(this);
		JLabel texteCageF = new JLabel("F");
		texteCageF.setFont(new Font("Times New Roman", 1, 20));
		cageF.add(texteCageF);
		contentPane.add(cageF);

		cageG = new JPanel();
		cageG.setBackground(Color.PINK);
		cageG.setBounds(220, 187, 60, 60);
		cageG.addMouseListener(this);
		JLabel texteCageG = new JLabel("G");
		texteCageG.setFont(new Font("Times New Roman", 1, 20));
		cageG.add(texteCageG);
		contentPane.add(cageG);

		cageH = new JPanel();
		cageH.setBackground(Color.PINK);
		cageH.setBounds(290, 187, 60, 60);
		cageH.addMouseListener(this);
		JLabel textecageH = new JLabel("H");
		textecageH.setFont(new Font("Times New Roman", 1, 20));
		cageH.add(textecageH);
		contentPane.add(cageH);

		cageI = new JPanel();
		cageI.setBackground(Color.PINK);
		cageI.setBounds(360, 187, 60, 60);
		cageI.addMouseListener(this);
		JLabel texteCageI = new JLabel("I");
		texteCageI.setFont(new Font("Times New Roman", 1, 20));
		cageI.add(texteCageI);
		contentPane.add(cageI);

		But = new JButton("But");
		But.setFont(new Font("Times New Roman", Font.BOLD, 12));
		But.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (zoneterrain == "") {
					zoneDeTire.setText("Veuillez sélectionner une zone terrain");
				}
				if (zoneCage == "") {
					zoneDeCage.setText("Veuillez sélectionner une zone cage");
				}

				if (zoneterrain != "" && zoneCage != "") {
					tire = zoneterrain + zoneCage + "But";
					zoneCage = "";
					zoneterrain = "";
					changeCouleurDesCases();
					ScoreDeMatch sdm = conAuxServ.modifierScooreDeMatch(VariableStatique.getIdGardien(),
							VariableStatique.getIdRencontre(), tire);
					nbrButEncaisse.setText(String.valueOf(sdm.getNombreDeButEncaisse()));
				}
			}
		});
		But.setBackground(Color.RED);
		But.setBounds(465, 223, 130, 40);
		contentPane.add(But);

		
		
		PasBut = new JButton("Pas but");
		PasBut.setFont(new Font("Times New Roman", Font.BOLD, 12));
		PasBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (zoneterrain == "") {
					zoneDeTire.setText("Veuillez sélectionner une zone terrain");
				}
				if (zoneCage == "") {
					zoneDeCage.setText("Veuillez sélectionner une zone cage");
				}
				if (zoneterrain != "" && zoneCage != "") {
					tire = zoneterrain + zoneCage + "pasBut";
					zoneCage = "";
					zoneterrain = "";
					changeCouleurDesCases();
					ScoreDeMatch sdm = conAuxServ.modifierScooreDeMatch(VariableStatique.getIdGardien(),
							VariableStatique.getIdRencontre(), tire);
					nbrButArrete.setText(String.valueOf(sdm.getNombreDeButArrete()));
				}
			}
		});
		PasBut.setBackground(Color.GREEN);
		PasBut.setBounds(465, 172, 130, 40);
		contentPane.add(PasBut);

		finDeMatch = new JButton("Fin de match");
		finDeMatch.setBackground(Color.CYAN);
		finDeMatch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		finDeMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChoixDuMatch().setVisible(true);
			}
		});
		finDeMatch.setBounds(480, 312, 115, 40);
		contentPane.add(finDeMatch);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setEnabled(false);
		editorPane.setEditable(false);
		editorPane.setBackground(Color.YELLOW);
		editorPane.setBounds(20, 32, 155, 231);
		contentPane.add(editorPane);

		txtZoneDeTire = new JTextField();
		txtZoneDeTire.setEditable(false);
		txtZoneDeTire.setBackground(Color.YELLOW);
		txtZoneDeTire.setHorizontalAlignment(SwingConstants.CENTER);
		txtZoneDeTire.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtZoneDeTire.setText("Zone de tire");
		txtZoneDeTire.setBounds(49, 11, 86, 20);
		contentPane.add(txtZoneDeTire);
		txtZoneDeTire.setColumns(10);

		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setEnabled(false);
		editorPane_1.setEditable(false);
		editorPane_1.setBackground(Color.LIGHT_GRAY);
		editorPane_1.setBounds(209, 32, 224, 231);
		contentPane.add(editorPane_1);

		JButton changementGardien = new JButton("Changement du gardien");
		changementGardien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new ChangerGardien().setVisible(true);
			}
		});
		changementGardien.setFont(new Font("Times New Roman", Font.BOLD, 12));
		changementGardien.setBackground(Color.CYAN);
		changementGardien.setBounds(220, 312, 180, 40);
		contentPane.add(changementGardien);

		JButton deconnexion = new JButton("D\u00E9connexion");
		deconnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conAuxServ.deconnecte(VariableStatique.getIdUtilisteur());
				dispose();
				new Connexion().setVisible(true);
			}
		});
		deconnexion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		deconnexion.setBackground(Color.CYAN);
		deconnexion.setBounds(47, 312, 115, 40);
		contentPane.add(deconnexion);

		txtZoneDeGardien = new JTextField();
		txtZoneDeGardien.setText("Zone de gardien");
		txtZoneDeGardien.setHorizontalAlignment(SwingConstants.CENTER);
		txtZoneDeGardien.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtZoneDeGardien.setEditable(false);
		txtZoneDeGardien.setColumns(10);
		txtZoneDeGardien.setBackground(Color.LIGHT_GRAY);
		txtZoneDeGardien.setBounds(264, 11, 106, 20);
		contentPane.add(txtZoneDeGardien);

		zoneDeTire = new JLabel("");
		zoneDeTire.setForeground(Color.RED);
		zoneDeTire.setBounds(10, 275, 224, 14);
		contentPane.add(zoneDeTire);

		zoneDeCage = new JLabel("");
		zoneDeCage.setForeground(Color.RED);
		zoneDeCage.setBounds(244, 274, 189, 14);
		contentPane.add(zoneDeCage);

		JLabel lblNewLabel_1 = new JLabel("But arret\u00E9");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(465, 116, 60, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("But encaiss\u00E9");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(530, 116, 80, 14);
		contentPane.add(lblNewLabel_2);

		JPanel butArrete = new JPanel();
		butArrete.setBackground(Color.GREEN);
		butArrete.setBounds(465, 45, 60, 60);
		contentPane.add(butArrete);

		nbrButArrete = new JLabel("0");
		nbrButArrete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		butArrete.add(nbrButArrete);

		JPanel butEncaisse = new JPanel();
		butEncaisse.setBackground(Color.RED);
		butEncaisse.setBounds(535, 45, 60, 60);
		contentPane.add(butEncaisse);

		nbrButEncaisse = new JLabel("0");
		nbrButEncaisse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		butEncaisse.add(nbrButEncaisse);
		
		txtScooreDeMatch = new JTextField();
		txtScooreDeMatch.setText("Scoore de match");
		txtScooreDeMatch.setHorizontalAlignment(SwingConstants.CENTER);
		txtScooreDeMatch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtScooreDeMatch.setEditable(false);
		txtScooreDeMatch.setColumns(10);
		txtScooreDeMatch.setBackground(Color.GRAY);
		txtScooreDeMatch.setBounds(478, 11, 106, 20);
		contentPane.add(txtScooreDeMatch);
		
		JEditorPane editorPane_1_1 = new JEditorPane();
		editorPane_1_1.setEnabled(false);
		editorPane_1_1.setEditable(false);
		editorPane_1_1.setBackground(Color.GRAY);
		editorPane_1_1.setBounds(455, 32, 150, 109);
		contentPane.add(editorPane_1_1);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				conAuxServ.deconnecte(VariableStatique.getIdUtilisteur());
				dispose();
			}
		});

	}

	public void changeCouleurDesCases() {
		terrain1.setBackground(Color.PINK);
		terrain2.setBackground(Color.PINK);
		terrain3.setBackground(Color.PINK);
		terrain4.setBackground(Color.PINK);
		terrain5.setBackground(Color.PINK);
		terrain6.setBackground(Color.PINK);
		cageA.setBackground(Color.PINK);
		cageB.setBackground(Color.PINK);
		cageC.setBackground(Color.PINK);
		cageD.setBackground(Color.PINK);
		cageE.setBackground(Color.PINK);
		cageF.setBackground(Color.PINK);
		cageG.setBackground(Color.PINK);
		cageH.setBackground(Color.PINK);
		cageI.setBackground(Color.PINK);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		//// terain 1
		if (e.getSource() == terrain1) {
			zoneterrain = "terrain1";
			remettreAZeroLesCouleursTerrain(zoneterrain);
		}
		if (e.getSource() == terrain2) {
			zoneterrain = "terrain2";
			remettreAZeroLesCouleursTerrain(zoneterrain);
		}
		if (e.getSource() == terrain3) {
			zoneterrain = "terrain3";
			remettreAZeroLesCouleursTerrain(zoneterrain);
		}
		if (e.getSource() == terrain4) {
			zoneterrain = "terrain4";
			remettreAZeroLesCouleursTerrain(zoneterrain);
		}
		if (e.getSource() == terrain5) {
			zoneterrain = "terrain5";
			remettreAZeroLesCouleursTerrain(zoneterrain);
		}
		if (e.getSource() == terrain6) {
			zoneterrain = "terrain6";
			remettreAZeroLesCouleursTerrain(zoneterrain);
		}

		//// cage
		if (e.getSource() == cageA) {
			zoneCage = "CageA";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageB) {
			zoneCage = "CageB";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageC) {
			zoneCage = "CageC";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageD) {
			zoneCage = "CageD";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageE) {
			zoneCage = "CageE";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageF) {
			zoneCage = "CageF";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageG) {
			zoneCage = "CageG";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageH) {
			zoneCage = "CageH";
			remettreAZeroLesCouleursCage(zoneCage);
		}
		if (e.getSource() == cageI) {
			zoneCage = "CageI";
			remettreAZeroLesCouleursCage(zoneCage);
		}

	}

	public void remettreAZeroLesCouleursTerrain(String zone) {
		if (zone == "terrain1") {
			terrain1.setBackground(Color.blue);
			zoneDeTire.setText("");
		} else {
			terrain1.setBackground(Color.PINK);
		}
		if (zone == "terrain2") {
			terrain2.setBackground(Color.blue);
			zoneDeTire.setText("");
		} else {
			terrain2.setBackground(Color.PINK);
		}
		if (zone == "terrain3") {
			terrain3.setBackground(Color.blue);
			zoneDeTire.setText("");
		} else {
			terrain3.setBackground(Color.PINK);
		}
		if (zone == "terrain4") {
			terrain4.setBackground(Color.blue);
			zoneDeTire.setText("");
		} else {
			terrain4.setBackground(Color.PINK);
		}
		if (zone == "terrain5") {
			terrain5.setBackground(Color.blue);
			zoneDeTire.setText("");
		} else {
			terrain5.setBackground(Color.PINK);
		}
		if (zone == "terrain6") {
			terrain6.setBackground(Color.blue);
			zoneDeTire.setText("");
		} else {
			terrain6.setBackground(Color.PINK);
		}

	}

	public void remettreAZeroLesCouleursCage(String zone) {
		if (zone == "CageA") {
			cageA.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageA.setBackground(Color.PINK);
		}
		if (zone == "CageB") {
			cageB.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageB.setBackground(Color.PINK);
		}
		if (zone == "CageC") {
			cageC.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageC.setBackground(Color.PINK);
		}
		if (zone == "CageD") {
			cageD.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageD.setBackground(Color.PINK);
		}
		if (zone == "CageE") {
			cageE.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageE.setBackground(Color.PINK);
		}
		if (zone == "CageF") {
			cageF.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageF.setBackground(Color.PINK);
		}
		if (zone == "CageG") {
			cageG.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageG.setBackground(Color.PINK);
		}
		if (zone == "CageH") {
			cageH.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageH.setBackground(Color.PINK);
		}
		if (zone == "CageI") {
			cageI.setBackground(Color.blue);
			zoneDeCage.setText("");
		} else {
			cageI.setBackground(Color.PINK);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
