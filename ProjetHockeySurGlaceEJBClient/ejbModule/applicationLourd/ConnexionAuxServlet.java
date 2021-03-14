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
			// Connexion à la servlet
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/connexion");
			System.out.println("aaaaaaaaaaa");
			URLConnection connexion = url.openConnection();
			System.out.println("aaaaaaaaaaa");

			connexion.setDoOutput(true);
			// Récupération du flux de sortie
			System.out.println("aaaaaaaaaaa");
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			// Envoi du nom à rechercher
			System.out.println("aaaaaaaaaaa");
			System.out.println("Mon dfds : " + pseudo);
			System.out.println("Mon dfds :" + pwd);
			Utilisateur user = new Utilisateur(pseudo, pwd);
			System.out.println("aaaaaaaaaaa");
			fluxsortie.writeObject(user);
			// Récupération du flux d’entrée
			System.out.println("aaaaaaaaaaa");
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			// Récupération du résultat de la requête
			System.out.println("aaaaaaaaaaa");
			Utilisateur retourServlet = (Utilisateur) fluxentree.readObject();
			System.out.println("aaaaaaaaaaa" + retourServlet.getPseudo());
			
			return retourServlet;

		} catch (Exception e) {
			System.out.println("erreur " + e);
			return null;

		}
	}

	///////////////////////////////// demarrerMatch ////////////////////////
	public void demarrerMatch(int idEq1, int idEq2) {

		try {
			// Connexion à la servlet
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/choixDuMatch");
			System.out.println("aaaaaaaaaaa");
			URLConnection connexion = url.openConnection();
			System.out.println("aaaaaaaaaaa");

			connexion.setDoOutput(true);
			// Récupération du flux de sortie
			System.out.println("aaaaaaaaaaa");
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
			// Envoi du nom à rechercher
			System.out.println("aaaaaaaaaaa");
			Rencontre renc = new Rencontre(idEq1, idEq1);
			System.out.println("aaaaaaaaaaa");
			fluxsortie.writeObject(renc);
			// Récupération du flux d’entrée
			System.out.println("aaaaaaaaaaa");
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
			// Récupération du résultat de la requête
			System.out.println("aaaaaaaaaaa");
			Rencontre retourServlet = (Rencontre) fluxentree.readObject();
			System.out.println("aaaaaaaaaaa");

		} catch (Exception e) {
			System.out.println("erreur " + e);

		}
	}

///////////////////////////////// demarrerMatch ////////////////////////
	public void ajouterScoreDuMatch(int rencontre, int idGard) {

		try {
// Connexion à la servlet
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/ajouterRencontre");
			System.out.println("aaaaaaaaaaa");
			URLConnection connexion = url.openConnection();
			System.out.println("aaaaaaaaaaa");

			connexion.setDoOutput(true);
// Récupération du flux de sortie
			System.out.println("aaaaaaaaaaa");
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
// Envoi du nom à rechercher
			System.out.println("aaaaaaaaaaa");
			ScoreDeMatch sdm = new ScoreDeMatch(rencontre, idGard);
			System.out.println("aaaaaaaaaaa");
			fluxsortie.writeObject(sdm);
// Récupération du flux d’entrée
			System.out.println("aaaaaaaaaaa");
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
// Récupération du résultat de la requête
			System.out.println("aaaaaaaaaaa");
			ScoreDeMatch retourServlet = (ScoreDeMatch) fluxentree.readObject();
			System.out.println("aaaaaaaaaaa");

		} catch (Exception e) {
			System.out.println("erreur " + e);

		}
	}

///////////////////////////////// demarrerMatch ////////////////////////
	public List<Gardien> recupererToutLesGardiens() {

		try {
//Connexion à la servlet
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/recupererToutLesGardiens");
			System.out.println("aaaaaaaaaaa");
			URLConnection connexion = url.openConnection();
			System.out.println("aaaaaaaaaaa");

			connexion.setDoOutput(true);
//Récupération du flux de sortie
			System.out.println("aaaaaaaaaaa");
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
//Envoi du nom à rechercher
			System.out.println("aaaaaaaaaaa");
			Gardien sdm = null;
			System.out.println("aaaaaaaaaaa");
			fluxsortie.writeObject(sdm);
//Récupération du flux d’entrée
			System.out.println("aaaaaaaaaaa");
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
//Récupération du résultat de la requête
			System.out.println("aaaaaaaaaaa");
			List<Gardien> retourServlet = (List<Gardien>) fluxentree.readObject();
			for (Gardien eq : retourServlet) {
				System.out.println("nom : " + eq.getNom());
			}
			System.out.println("aaaaaaaaaaa");
			return retourServlet;

		} catch (Exception e) {
			System.out.println("erreur " + e);
			return null;

		}
	}

///////////////////////////////// demarrerMatch ////////////////////////
	public List<Equipe> recupererToutesLesEquipes() {

		try {
//Connexion à la servlet
			URL url = new URL("http://localhost:8080/ProjetHockeySurGlaceWeb/equipe");
			System.out.println("aaaaaaaaaaa");
			URLConnection connexion = url.openConnection();
			System.out.println("aaaaaaaaaaa");

			connexion.setDoOutput(true);
//Récupération du flux de sortie
			System.out.println("aaaaaaaaaaa");
			ObjectOutputStream fluxsortie = new ObjectOutputStream(connexion.getOutputStream());
//Envoi du nom à rechercher
			System.out.println("aaaaaaaaaaa");
			Equipe sdm = null;
			System.out.println("aaaaaaaaaaa");
			fluxsortie.writeObject(sdm);
//Récupération du flux d’entrée
			System.out.println("aaaaaaaaaaa");
			ObjectInputStream fluxentree = new ObjectInputStream(connexion.getInputStream());
//Récupération du résultat de la requête
			System.out.println("aaaaaaaaaaa");
			List<Equipe> retourServlet = (List<Equipe>) fluxentree.readObject();
			for (Equipe eq : retourServlet) {
				System.out.println("nom : " + eq.getNomEquipe());
			}
			System.out.println("aaaaaaaaaaa");
			return retourServlet;
			

		} catch (Exception e) {
			System.out.println("erreur " + e);
			return null;

		}
	}

}
