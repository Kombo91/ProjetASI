package hw;

import java.util.Collection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class GestionEquipe
 */
@Stateless
@LocalBean
public class GestionEquipe implements GestionEquipeRemote {
	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public GestionEquipe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Equipe ajouterEquipe(Equipe eq) {
		System.out.println("je suis la");
		em.persist(eq);
		return eq;
	}

	@Override
	public Collection<Equipe> listerEquipeAdvers(int idMonEquipe) {
		return em.createQuery(
				"SELECT eq FROM Equipe eq WHERE eq.idEquipe NOT IN (SELECT ren.idEquipeAdvers FROM Rencontre ren WHERE ren.idMonEquipe ="
						+ idMonEquipe + ") and eq.idEquipe !=" + idMonEquipe)
				.getResultList();
		// return em.createQuery("SELECT eq FROM Equipe eq WHERE eq.idEquipe
		// !="+idMonEquipe).getResultList();

	}
	@Override
	public Collection<Equipe> listerEquipeContre(int idEquipeChoisi) {
		return em.createQuery("SELECT eq FROM Equipe eq WHERE eq.idEquipe !=" + idEquipeChoisi).getResultList();
		// return em.createQuery("SELECT eq FROM Equipe eq WHERE eq.idEquipe
		// !="+idMonEquipe).getResultList();

	}
	
	@Override
	public Collection<Equipe> listerEquipe() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT eq FROM Equipe eq").getResultList();
	}
	

}
