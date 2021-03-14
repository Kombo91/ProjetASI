package hw;

import javax.ejb.Remote;

@Remote
public interface GestionConnexionRemote {
	 public Utilisateur connexion(Utilisateur user);
	 public void deconnexion(Utilisateur user);
	 public boolean etreConnecte();
}
