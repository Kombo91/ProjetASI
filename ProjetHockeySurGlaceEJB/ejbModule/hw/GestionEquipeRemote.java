package hw;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface GestionEquipeRemote {
	 public Equipe ajouterEquipe(Equipe eq);
	 public Collection<Equipe> listerEquipeAdvers(int idMonEquipe);
	 public Collection<Equipe> listerEquipe();
	 public Collection<Equipe> listerEquipeContre(int idEquipeChoisi);
	 
}
