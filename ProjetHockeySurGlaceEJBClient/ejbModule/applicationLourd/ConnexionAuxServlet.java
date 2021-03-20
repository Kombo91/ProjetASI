/**
 * 
 */
package applicationLourd;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import hw.Equipe;
import hw.Gardien;
import hw.Rencontre;
import hw.ScoreDeMatch;
import hw.Utilisateur;

/**
 * @author KP
 *
 */
public class ConnexionAuxServlet {

	////////////////////////// CONEXION ///////////////////////////////
	public Utilisateur connexion(String pseudo, String pwd) {
		try {
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/connexion");
			URLConnection connexion = url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			Utilisateur user = new Utilisateur(pseudo, pwd);
			fluxsortie.writeObject(user);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			Utilisateur retourServlet = (Utilisateur) fluxentree.readObject();
			return retourServlet;
		} catch (Exception e) {
			System.out.println("erreur " + e);
			return null;
		}
	}

	
	
	
	
	///////////////////////////////// demarrerMatch ////////////////////////
	public Rencontre ajouterRencontre(int idEq1, int idEq2) {

		try {
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/ajouterRencontre");
			URLConnection connexion = url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			Rencontre renc = new Rencontre(idEq1, idEq2);
			fluxsortie.writeObject(renc);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			Rencontre retourServlet = (Rencontre) fluxentree.readObject();
			return retourServlet;
		} catch (Exception e) {
			System.out.println("erreur " + e);
			return null;
		}
	}

///////////////////////////////// demarrerMatch ////////////////////////
	public void ajouterScoreDuMatch(int rencontre, int idGard) {
		try {
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/ajouterScoreDuMatch");
			URLConnection connexion = url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			ScoreDeMatch sdm = new ScoreDeMatch(rencontre, idGard);
			fluxsortie.writeObject(sdm);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			ScoreDeMatch retourServlet = (ScoreDeMatch) fluxentree.readObject();
		} catch (Exception e) {
			System.out.println("erreur " + e);

		}
	}

///////////////////////////////// demarrerMatch ////////////////////////
	public List<Gardien> recupererToutLesGardiens(int idMonEquipe) {
		try {
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/recupererToutLesGardiens");
			URLConnection connexion = url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			fluxsortie.writeObject(idMonEquipe);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			List<Gardien> retourServlet = (List<Gardien>) fluxentree.readObject();
			return retourServlet;

		} catch (Exception e) {
			System.out.println("erreur " + e);
			return null;
		}
	}

///////////////////////////////// demarrerMatch ////////////////////////
	public List<Equipe> recupererToutesLesEquipes(int idMonEquipe) {
		try {
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/equipe");
			URLConnection connexion = url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			fluxsortie.writeObject(idMonEquipe);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			List<Equipe> retourServlet = (List<Equipe>) fluxentree.readObject();
			return retourServlet;

		} catch (Exception e) {
			System.out.println("erreur " + e);
			return null;
		}
	}

///////////////////////////////// demarrerMatch ////////////////////////
	public void connecte( int idUtilisateur) {
		try {
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/utilisateurConnecte");
			URLConnection connexion = url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			fluxsortie.writeObject(idUtilisateur);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			int retourServlet = (int) fluxentree.readObject();
		} catch (Exception e) {
			System.out.println("erreur " + e);			
		}
	}
	public void deconnecte( int idUtilisateur) {

		try {
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/utilisateurDeconnecte");
			URLConnection connexion = url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			fluxsortie.writeObject(idUtilisateur);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			int retourServlet = (int) fluxentree.readObject();
		} catch (Exception e) {
			System.out.println("erreur " + e);			
		}
	}
	
	public void modifierScooreDeMatch(int idGardien,int idRencontre, String tire){
		try
		{
			URL url=new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/ScoreDeMatch");
			URLConnection connexion=url.openConnection();
			connexion.setDoOutput(true);
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			ScoreDeMatch sdm = new ScoreDeMatch (idGardien,idRencontre,tire);
			fluxsortie.writeObject(sdm);
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			ScoreDeMatch produits = (ScoreDeMatch) fluxentree.readObject();
		}
		catch (Exception e)
		{
			System.out.println("erreur "+e);
		}
	}

}
