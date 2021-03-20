package hw;

import java.util.Collection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class GestionGardien
 */
@Stateless
@LocalBean
public class GestionGardien implements GestionGardienRemote {
	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public GestionGardien() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Gardien> listerGardien(int idMonEquipe) {
		return em.createQuery("SELECT gr FROM Gardien gr WHERE gr.idEquipe = " + idMonEquipe).getResultList();

	}

}
