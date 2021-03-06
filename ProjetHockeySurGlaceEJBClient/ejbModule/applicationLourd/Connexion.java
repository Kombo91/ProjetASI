/**
 * 
 */
package applicationLourd;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hw.Utilisateur;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
/**
 * @author KP
 *
 */
public class Connexion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pseudo;
	private JTextField pwd;
	private JLabel msgErreur;
	
	ConnexionAuxServlet conAuxServ = new ConnexionAuxServlet();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
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
	public Connexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		setBounds(100, 100, 450, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelConnexion = new JLabel("CONNEXION");
		labelConnexion.setBounds(162, 11, 112, 28);
		labelConnexion.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		contentPane.add(labelConnexion);
		
		JLabel lblNewLabel = new JLabel("Login :");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(45, 63, 107, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblMotDePasse.setBounds(45, 102, 107, 28);
		contentPane.add(lblMotDePasse);
		
		JButton connexionButton = new JButton("Connexion");
		connexionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilisateur util = conAuxServ.connexion(pseudo.getText(),pwd.getText());

				if (util.getPseudo() != null) {
					if (!util.isEst_connecte()) {
						conAuxServ.connecte(util.getIdUtilisateur());
						//VariableStatique.setChoixDuMatchIsOpen(true);
						VariableStatique.setIdUtilisteur(util.getIdUtilisateur());
						VariableStatique.setIdMonEquipe(util.getIdEquipe());
						dispose();
						new ChoixDuMatch().setVisible(true);						
					}
					else {
						msgErreur.setText("Un autre utilisateur est connect� avec les m�mes coordonn�es");
					}
				}
				else {
					msgErreur.setText("Pseudo ou Mot de passe incorrect");
				}
			}
		});
		connexionButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		connexionButton.setBounds(182, 179, 123, 42);
		contentPane.add(connexionButton);
		
		pseudo = new JTextField();
		pseudo.setBounds(162, 64, 200, 30);
		contentPane.add(pseudo);
		pseudo.setColumns(10);
		
				
		pwd = new JTextField();
		pwd.setBounds(162, 103, 200, 30);
		contentPane.add(pwd);
		pwd.setColumns(10);
		
		msgErreur = new JLabel("");
		msgErreur.setForeground(Color.RED);
		msgErreur.setBounds(32, 141, 369, 25);
		contentPane.add(msgErreur);
	}
	
	
}
