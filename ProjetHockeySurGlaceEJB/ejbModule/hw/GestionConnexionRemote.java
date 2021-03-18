package hw;

import javax.ejb.Remote;

@Remote
public interface GestionConnexionRemote {
	 public Utilisateur connexion(Utilisateur user);
	 public int connexion(int idUtilisateur);
	 public int deconnexion(int idUtilisateur);
	 public boolean etreConnecte();
}
