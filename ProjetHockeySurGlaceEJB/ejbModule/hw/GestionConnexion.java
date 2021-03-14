package hw;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class GestionConnexion implements GestionConnexionRemote {
	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionConnexion() {
        // TODO Auto-generated constructor stub
    }
    
	@Override
    public Utilisateur connexion(Utilisateur user) {
		System.out.println("zertghjxgcvhnbdghvbn");
    	Utilisateur user1 = new Utilisateur();
    	try {
			user1 = (Utilisateur) em.createQuery("SELECT c FROM Utilisateur c WHERE c.pseudo = '"+user.getPseudo()+"' and c.mots_de_passe ='"+ user.getMots_de_passe()+"'").getSingleResult();
			if(user1 != null) {
	    		user1.setEst_connecte(true);
	    		em.persist(user1);
	    		return user1;
	    	}
		} catch (Exception e) {
			System.out.println("je suis dans le ejb " +user1);
			System.out.println("erreur "+e);

		}
    	
    	return user1;
    	
    	
    }

	@Override
	public void deconnexion(Utilisateur user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean etreConnecte() {
		// TODO Auto-generated method stub
		return false;
	}

}
