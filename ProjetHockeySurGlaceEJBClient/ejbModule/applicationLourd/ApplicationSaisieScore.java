/** 
 * 
 */
package applicationLourd;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

/**
 * @author KP
 *
 */
public class ApplicationSaisieScore extends JFrame implements MouseListener {

	private JPanel contentPane;
	JPanel train1;
	JPanel train2;
	JPanel train3;
	JPanel train4;
	JPanel train5;
	JPanel train6;

	JPanel cageA;
	JPanel cageB;
	JPanel cageC;
	JPanel cageD;
	JPanel cageE;
	JPanel cageF;
	JPanel cageG;
	JPanel cageH;
	JPanel cageI;
	
	String zoneTrain = "";
	String zoneCage = "";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationSaisieScore frame = new ApplicationSaisieScore();
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
	public ApplicationSaisieScore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/////// JPanel terain
		train1 = new JPanel();
		train1.setBackground(Color.PINK);
		train1.setBounds(10, 11, 50, 50);
		train1.addMouseListener(this);
		JLabel texteTrain1 = new JLabel("1");
		texteTrain1.setFont(new Font("Verdana",1,20));
	    train1.add(texteTrain1);
		contentPane.add(train1);
		
		train2 = new JPanel();
		train2.setBackground(Color.PINK);
		train2.setBounds(70, 11, 50, 50);
		train2.addMouseListener(this);
		JLabel texteTrain2 = new JLabel("2");
		texteTrain2.setFont(new Font("Verdana",1,20));
	    train2.add(texteTrain2);
		contentPane.add(train2);
		
		train3 = new JPanel();
		train3.setBackground(Color.PINK);
		train3.setBounds(10, 72, 50, 50);
		train3.addMouseListener(this);
		JLabel texteTrain3 = new JLabel("3");
		texteTrain3.setFont(new Font("Verdana",1,20));
	    train3.add(texteTrain3);
		contentPane.add(train3);
		
		train4 = new JPanel();
		train4.setBackground(Color.PINK);
		train4.setBounds(70, 72, 50, 50);
		train4.addMouseListener(this);
		JLabel texteTrain4 = new JLabel("4");
		texteTrain4.setFont(new Font("Verdana",1,20));
	    train4.add(texteTrain4);
		contentPane.add(train4);
		
		train5 = new JPanel();
		train5.setBackground(Color.PINK);
		train5.setBounds(10, 133, 50, 50);
		train5.addMouseListener(this);
		JLabel texteTrain5 = new JLabel("5");
		texteTrain5.setFont(new Font("Verdana",1,20));
	    train5.add(texteTrain5);
	    contentPane.add(train5);
		
	    train6 = new JPanel();
	    train6.setBackground(Color.PINK);
	    train6.setBounds(70, 133, 50, 50);
		train6.addMouseListener(this);
		JLabel texteTrain6 = new JLabel("6");
		texteTrain6.setFont(new Font("Verdana",1,20));
	    train6.add(texteTrain6);
		contentPane.add(train6);
		
		///// JPanel
		
		cageA = new JPanel();
		cageA.setBackground(Color.PINK);
		cageA.setBounds(179, 11, 50, 50);
		cageA.addMouseListener(this);
		JLabel texteCageA = new JLabel("A");
		texteCageA.setFont(new Font("Verdana",1,20));
		cageA.add(texteCageA);
		contentPane.add(cageA);
		
		cageB = new JPanel();
		cageB.setBackground(Color.PINK);
		cageB.setBounds(239, 11, 50, 50);
		cageB.addMouseListener(this);
		JLabel texteCageB= new JLabel("B");
		texteCageB.setFont(new Font("Verdana",1,20));
		cageB.add(texteCageB);
		contentPane.add(cageB);
		
		cageC = new JPanel();
		cageC.setBackground(Color.PINK);
		cageC.setBounds(299, 11, 50, 50);
		cageC.addMouseListener(this);
		JLabel texteCageC = new JLabel("C");
		texteCageC.setFont(new Font("Verdana",1,20));
		cageC.add(texteCageC);
		contentPane.add(cageC);
		
		cageD = new JPanel();
		cageD.setBackground(Color.PINK);
		cageD.setBounds(179, 72, 50, 50);
		cageD.addMouseListener(this);
		JLabel texteCageD = new JLabel("D");
		texteCageD.setFont(new Font("Verdana",1,20));
		cageD.add(texteCageD);
		contentPane.add(cageD);
		
		cageE = new JPanel();
		cageE.setBackground(Color.PINK);
		cageE.setBounds(239, 72, 50, 50);
		cageE.addMouseListener(this);
		JLabel texteCageE = new JLabel("E");
		texteCageE.setFont(new Font("Verdana",1,20));
		cageE.add(texteCageE);
		contentPane.add(cageE);
		
		cageF = new JPanel();
		cageF.setBackground(Color.PINK);
		cageF.setBounds(299, 72, 50, 50);
		cageF.addMouseListener(this);
		JLabel texteCageF = new JLabel("F");
		texteCageF.setFont(new Font("Verdana",1,20));
		cageF.add(texteCageF);
		contentPane.add(cageF);
		
		cageG = new JPanel();
		cageG.setBackground(Color.PINK);
		cageG.setBounds(179, 133, 50, 50);
		cageG.addMouseListener(this);
		JLabel texteCageG = new JLabel("G");
		texteCageG.setFont(new Font("Verdana",1,20));
		cageG.add(texteCageG);
		contentPane.add(cageG);
		
		cageH = new JPanel();
		cageH.setBackground(Color.PINK);
		cageH.setBounds(239, 133, 50, 50);
		cageH.addMouseListener(this);
		JLabel textecageH = new JLabel("H");
		textecageH.setFont(new Font("Verdana",1,20));
		cageH.add(textecageH);
		contentPane.add(cageH);		
		
		cageI = new JPanel();
		cageI.setBackground(Color.PINK);
		cageI.setBounds(299, 133, 50, 50);
		cageI.addMouseListener(this);
		JLabel texteCageI = new JLabel("I");
		texteCageI.setFont(new Font("Verdana",1,20));
		cageI.add(texteCageI);
		contentPane.add(cageI);	
		
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
