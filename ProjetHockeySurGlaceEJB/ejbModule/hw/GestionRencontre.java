package hw;

import java.util.Collection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class GestionRencontre
 */
@Stateless
@LocalBean
public class GestionRencontre implements GestionRencontreRemote {
	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public GestionRencontre() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Rencontre ajouterRencontre(Rencontre ren) {
		em.persist(ren);

		em.flush();
		return ren;
	}

	@Override
	public Collection<Rencontre> listerRencontre() {
		return em.createQuery("SELECT re FROM Rencontre re").getResultList();

	}

}
