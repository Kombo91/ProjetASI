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
	private JPanel train1;
	private JPanel train2;
	private JPanel train3;
	private JPanel train4;
	private JPanel train5;
	private JPanel train6;

	private JPanel cageA;
	private JPanel cageB;
	private JPanel cageC;
	private JPanel cageD;
	private JPanel cageE;
	private JPanel cageF;
	private JPanel cageG;
	private JPanel cageH;
	private JPanel cageI;
	
	private String zoneTrain = "";
	private String zoneCage = "";
	private String tire ="";
	private JButton PasBut;
	private JButton But;
	private JButton finDeMatch;
	private JTextField txtZoneDeTire;

	
	

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
		train1 = new JPanel();
		train1.setBackground(Color.PINK);
		train1.setBounds(10, 45, 50, 50);
		train1.addMouseListener(this);
		JLabel texteTrain1 = new JLabel("1");
		texteTrain1.setFont(new Font("Verdana",1,20));
	    train1.add(texteTrain1);
		contentPane.add(train1);
		
		train2 = new JPanel();
		train2.setBackground(Color.PINK);
		train2.setBounds(70, 45, 50, 50);
		train2.addMouseListener(this);
		JLabel texteTrain2 = new JLabel("2");
		texteTrain2.setFont(new Font("Verdana",1,20));
	    train2.add(texteTrain2);
		contentPane.add(train2);
		
		train3 = new JPanel();
		train3.setBackground(Color.PINK);
		train3.setBounds(10, 106, 50, 50);
		train3.addMouseListener(this);
		JLabel texteTrain3 = new JLabel("3");
		texteTrain3.setFont(new Font("Verdana",1,20));
	    train3.add(texteTrain3);
		contentPane.add(train3);
		
		train4 = new JPanel();
		train4.setBackground(Color.PINK);
		train4.setBounds(70, 106, 50, 50);
		train4.addMouseListener(this);
		JLabel texteTrain4 = new JLabel("4");
		texteTrain4.setFont(new Font("Verdana",1,20));
	    train4.add(texteTrain4);
		contentPane.add(train4);
		
		train5 = new JPanel();
		train5.setBackground(Color.PINK);
		train5.setBounds(10, 167, 50, 50);
		train5.addMouseListener(this);
		JLabel texteTrain5 = new JLabel("5");
		texteTrain5.setFont(new Font("Verdana",1,20));
	    train5.add(texteTrain5);
	    contentPane.add(train5);
		
	    train6 = new JPanel();
	    train6.setBackground(Color.PINK);
	    train6.setBounds(70, 167, 50, 50);
		train6.addMouseListener(this);
		JLabel texteTrain6 = new JLabel("6");
		texteTrain6.setFont(new Font("Verdana",1,20));
	    train6.add(texteTrain6);
		contentPane.add(train6);
		
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
				executerServlet();
				
				
				if(zoneTrain == "") {
					System.out.println("Sélectionnez une zone train");
				}
				if(zoneCage == "") {
					System.out.println("Sélectionnez une zone cage");
				}
				
				if(zoneTrain != "" && zoneCage != "") {
					System.out.println("But");
					tire=zoneTrain+zoneCage+"But";
					System.out.println("tire "+tire);
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
				if(zoneTrain == "") {
					System.out.println("Sélectionnez une zone train");
				}
				if(zoneCage == "") {
					System.out.println("Sélectionnez une zone cage");
				}
				
				if(zoneTrain != "" && zoneCage != "") {
					System.out.println("Pas but");
					zoneCage = "";
					zoneTrain = "";
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
		
		try
		{

			URL url=new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/equipe");
			System.out.println(" 111111");
			URLConnection connexion=url.openConnection();
			System.out.println(" 111111");

			connexion.setDoOutput(true);
			System.out.println(" 111111");

			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			System.out.println(" 111111");

			Equipe eq = new Equipe(nomEquipe);
			System.out.println(" 111111");

			fluxsortie.writeObject(eq);
			System.out.println(" 111111");

			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			System.out.println(" 111111");

			Equipe produits = (Equipe) fluxentree.readObject();
			System.out.println(" 111111");
			
			
		}
		catch (Exception e)
		{
			System.out.println("erreur "+e);
		}
	
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//// terain 1
		if (e.getSource() == train1) {
	           System.out.println("train 1");
	           zoneTrain="train1";
	           System.out.println(zoneTrain);
	           
	        }
		if (e.getSource() == train2) {
	           System.out.println("train 2");
	           zoneTrain="train2";
	           System.out.println(zoneTrain);

	        }
		if (e.getSource() == train3) {
	           System.out.println("train 3");
	           zoneTrain="train3";
	           System.out.println(zoneTrain);

	        }
		if (e.getSource() == train4) {
	           System.out.println("train 4");
	           zoneTrain="train4";
	           System.out.println(zoneTrain);

	        }
		if (e.getSource() == train5) {
	           System.out.println("train 5");
	           zoneTrain="train5";
	           System.out.println(zoneTrain);

	        }
		if (e.getSource() == train6) {
	           System.out.println("train 6");
	           zoneTrain="train6";
	           System.out.println(zoneTrain);

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
