/** 
 * 
 */
package applicationLourd;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hw.Equipe;
import hw.GestionRencontreRemote;
import hw.ScoreDeMatch;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author KP
 *
 */
public class ApplicationSaisieScore extends JFrame implements MouseListener {

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
	private String tire ="";
	private JButton PasBut;
	private JButton But;
	private JButton finDeMatch;
	private JTextField txtZoneDeTire;
	
	private int idGardien;
	private int idRencontre;
	
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationSaisieScore frame = new ApplicationSaisieScore();
					//if(VariableStatique.isInOpen()) {
						frame.setVisible(true);
						/*}
					else {
						System.out.println("nononononon");
					}*/
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
		setBounds(100, 100, 507, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/////// JPanel terain
		terrain1 = new JPanel();
		terrain1.setBackground(Color.PINK);
		terrain1.setBounds(10, 45, 50, 50);
		terrain1.addMouseListener(this);
		JLabel texteterrain1 = new JLabel("1");
		texteterrain1.setFont(new Font("Verdana",1,20));
	    terrain1.add(texteterrain1);
		contentPane.add(terrain1);
		
		terrain2 = new JPanel();
		terrain2.setBackground(Color.PINK);
		terrain2.setBounds(70, 45, 50, 50);
		terrain2.addMouseListener(this);
		JLabel texteterrain2 = new JLabel("2");
		texteterrain2.setFont(new Font("Verdana",1,20));
	    terrain2.add(texteterrain2);
		contentPane.add(terrain2);
		
		terrain3 = new JPanel();
		terrain3.setBackground(Color.PINK);
		terrain3.setBounds(10, 106, 50, 50);
		terrain3.addMouseListener(this);
		JLabel texteterrain3 = new JLabel("3");
		texteterrain3.setFont(new Font("Verdana",1,20));
	    terrain3.add(texteterrain3);
		contentPane.add(terrain3);
		
		terrain4 = new JPanel();
		terrain4.setBackground(Color.PINK);
		terrain4.setBounds(70, 106, 50, 50);
		terrain4.addMouseListener(this);
		JLabel texteterrain4 = new JLabel("4");
		texteterrain4.setFont(new Font("Verdana",1,20));
	    terrain4.add(texteterrain4);
		contentPane.add(terrain4);
		
		terrain5 = new JPanel();
		terrain5.setBackground(Color.PINK);
		terrain5.setBounds(10, 167, 50, 50);
		terrain5.addMouseListener(this);
		JLabel texteterrain5 = new JLabel("5");
		texteterrain5.setFont(new Font("Verdana",1,20));
	    terrain5.add(texteterrain5);
	    contentPane.add(terrain5);
		
	    terrain6 = new JPanel();
	    terrain6.setBackground(Color.PINK);
	    terrain6.setBounds(70, 167, 50, 50);
		terrain6.addMouseListener(this);
		JLabel texteterrain6 = new JLabel("6");
		texteterrain6.setFont(new Font("Verdana",1,20));
	    terrain6.add(texteterrain6);
		contentPane.add(terrain6);
		
		///// JPanel
		
		cageA = new JPanel();
		cageA.setBackground(Color.PINK);
		cageA.setBounds(170, 45, 50, 50);
		cageA.addMouseListener(this);
		JLabel texteCageA = new JLabel("A");
		texteCageA.setFont(new Font("Verdana",1,20));
		cageA.add(texteCageA);
		contentPane.add(cageA);
		
		cageB = new JPanel();
		cageB.setBackground(Color.PINK);
		cageB.setBounds(230, 45, 50, 50);
		cageB.addMouseListener(this);
		JLabel texteCageB= new JLabel("B");
		texteCageB.setFont(new Font("Verdana",1,20));
		cageB.add(texteCageB);
		contentPane.add(cageB);
		
		cageC = new JPanel();
		cageC.setBackground(Color.PINK);
		cageC.setBounds(290, 45, 50, 50);
		cageC.addMouseListener(this);
		JLabel texteCageC = new JLabel("C");
		texteCageC.setFont(new Font("Verdana",1,20));
		cageC.add(texteCageC);
		contentPane.add(cageC);
		
		cageD = new JPanel();
		cageD.setBackground(Color.PINK);
		cageD.setBounds(170, 106, 50, 50);
		cageD.addMouseListener(this);
		JLabel texteCageD = new JLabel("D");
		texteCageD.setFont(new Font("Verdana",1,20));
		cageD.add(texteCageD);
		contentPane.add(cageD);
		
		cageE = new JPanel();
		cageE.setBackground(Color.PINK);
		cageE.setBounds(230, 106, 50, 50);
		cageE.addMouseListener(this);
		JLabel texteCageE = new JLabel("E");
		texteCageE.setFont(new Font("Verdana",1,20));
		cageE.add(texteCageE);
		contentPane.add(cageE);
		
		cageF = new JPanel();
		cageF.setBackground(Color.PINK);
		cageF.setBounds(290, 106, 50, 50);
		cageF.addMouseListener(this);
		JLabel texteCageF = new JLabel("F");
		texteCageF.setFont(new Font("Verdana",1,20));
		cageF.add(texteCageF);
		contentPane.add(cageF);
		
		cageG = new JPanel();
		cageG.setBackground(Color.PINK);
		cageG.setBounds(170, 167, 50, 50);
		cageG.addMouseListener(this);
		JLabel texteCageG = new JLabel("G");
		texteCageG.setFont(new Font("Verdana",1,20));
		cageG.add(texteCageG);
		contentPane.add(cageG);
		
		cageH = new JPanel();
		cageH.setBackground(Color.PINK);
		cageH.setBounds(230, 167, 50, 50);
		cageH.addMouseListener(this);
		JLabel textecageH = new JLabel("H");
		textecageH.setFont(new Font("Verdana",1,20));
		cageH.add(textecageH);
		contentPane.add(cageH);		
		
		cageI = new JPanel();
		cageI.setBackground(Color.PINK);
		cageI.setBounds(290, 167, 50, 50);
		cageI.addMouseListener(this);
		JLabel texteCageI = new JLabel("I");
		texteCageI.setFont(new Font("Verdana",1,20));
		cageI.add(texteCageI);
		contentPane.add(cageI);
		
		
		
		But = new JButton("But");
		But.setFont(new Font("Times New Roman", Font.BOLD, 12));
		But.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				
				
				if(zoneterrain == "") {
					System.out.println("Sélectionnez une zone terrain");
				}
				if(zoneCage == "") {
					System.out.println("Sélectionnez une zone cage");
				}
				
				if(zoneterrain != "" && zoneCage != "") {
					System.out.println("But");
					tire=zoneterrain+zoneCage+"But";
					System.out.println("tire "+tire);
					executerServlet();
				}
				
				 
			}
		});
		But.setBackground(Color.RED);
		But.setBounds(391, 81, 80, 40);
		contentPane.add(But);
		
		PasBut = new JButton("Pas but");
		PasBut.setFont(new Font("Times New Roman", Font.BOLD, 12));
		PasBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(zoneterrain == "") {
					System.out.println("Sélectionnez une zone terrain");
				}
				if(zoneCage == "") {
					System.out.println("Sélectionnez une zone cage");
				}
				
				if(zoneterrain != "" && zoneCage != "") {
					System.out.println("Pas but");
					tire=zoneterrain+zoneCage+"pasBut";
					zoneCage = "";
					zoneterrain = "";
					executerServlet();
				}
				
			}
		});
		PasBut.setBackground(Color.GREEN);
		PasBut.setBounds(391, 132, 80, 40);
		contentPane.add(PasBut);
		
		finDeMatch = new JButton("Fin de match");
		finDeMatch.setBackground(Color.BLUE);
		finDeMatch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		finDeMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		finDeMatch.setBounds(366, 267, 115, 40);
		contentPane.add(finDeMatch);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.YELLOW);
		editorPane.setBounds(0, 32, 132, 201);
		contentPane.add(editorPane);
		
		txtZoneDeTire = new JTextField();
		txtZoneDeTire.setEditable(false);
		txtZoneDeTire.setBackground(Color.YELLOW);
		txtZoneDeTire.setHorizontalAlignment(SwingConstants.CENTER);
		txtZoneDeTire.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtZoneDeTire.setText("Zone de tire");
		txtZoneDeTire.setBounds(22, 11, 86, 20);
		contentPane.add(txtZoneDeTire);
		txtZoneDeTire.setColumns(10);
		
	}
	private void executerServlet()
	{
		String nomEquipe="real madrid";
		idGardien = 509;
		idRencontre = 50 ;
		
		try
		{

			URL url=new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/ScoreDeMatch");
			System.out.println(" 111111");
			URLConnection connexion=url.openConnection();
			System.out.println(" 111111");

			connexion.setDoOutput(true);
			System.out.println(" 111111");

			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			System.out.println(" 111111");
			ScoreDeMatch sdm = new ScoreDeMatch (VariableStatique.getIdGardien(),VariableStatique.getIdRencontre(),tire);
			System.out.println(" 111111");

			fluxsortie.writeObject(sdm);
			System.out.println(" 111111");

			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			System.out.println(" 111111");

			ScoreDeMatch produits = (ScoreDeMatch) fluxentree.readObject();
			System.out.println(" 111111");
			
			
		}
		catch (Exception e)
		{
			System.out.println("erreur "+e);
		}
	
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
		//// terain 1
		if (e.getSource() == terrain1) {
	           System.out.println("terrain 1");
	           zoneterrain="terrain1";
	           System.out.println(zoneterrain);
	           
	        }
		if (e.getSource() == terrain2) {
	           System.out.println("terrain 2");
	           zoneterrain="terrain2";
	           System.out.println(zoneterrain);

	        }
		if (e.getSource() == terrain3) {
	           System.out.println("terrain 3");
	           zoneterrain="terrain3";
	           System.out.println(zoneterrain);

	        }
		if (e.getSource() == terrain4) {
	           System.out.println("terrain 4");
	           zoneterrain="terrain4";
	           System.out.println(zoneterrain);

	        }
		if (e.getSource() == terrain5) {
	           System.out.println("terrain 5");
	           zoneterrain="terrain5";
	           System.out.println(zoneterrain);

	        }
		if (e.getSource() == terrain6) {
	           System.out.println("terrain 6");
	           zoneterrain="terrain6";
	           System.out.println(zoneterrain);

	        }
		
		//// cage 
		if (e.getSource() == cageA) {
	           System.out.println("cage A");
	           zoneCage="CageA";
	           System.out.println(zoneCage);
	        }
		if (e.getSource() == cageB) {
	           System.out.println("cage B");
	           zoneCage="CageB";
	           System.out.println(zoneCage);
           }
		if (e.getSource() == cageC) {
	           System.out.println("cage C");
	           zoneCage="CageC";
	           System.out.println(zoneCage);
			}
		if (e.getSource() == cageD) {
	           System.out.println("cage D");
	           zoneCage="CageD";
	           System.out.println(zoneCage);
	        }
		if (e.getSource() == cageE) {
	           System.out.println("cage E");
	           zoneCage="CageE";
	           System.out.println(zoneCage);
	        }
		if (e.getSource() == cageF) {
	           System.out.println("cage F");
	           zoneCage="CageF";
	           System.out.println(zoneCage);
	        }
		if (e.getSource() == cageG) {
	           System.out.println("cage G");
	           zoneCage="CageG";
	           System.out.println(zoneCage);
	        }
		if (e.getSource() == cageH) {
	           System.out.println("cage H");
	           zoneCage="CageH";
	           System.out.println(zoneCage);
	        }
		if (e.getSource() == cageI) {
	           System.out.println("cage I");
	           zoneCage="CageI";
	           System.out.println(zoneCage);
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
