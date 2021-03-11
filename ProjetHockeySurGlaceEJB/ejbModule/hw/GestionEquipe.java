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
	public Collection<Equipe> listerEquipe() {
		return em.createQuery("SELECT eq FROM Equipe eq").getResultList();

	}

}
