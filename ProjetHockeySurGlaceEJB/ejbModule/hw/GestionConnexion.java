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
	    		
	    		return user1;
	    	}
		} catch (Exception e) {
			System.out.println("je suis dans le ejb " +user1);
			System.out.println("erreur "+e);

		}
    	
    	return user1;
    	
    	
    }
	@Override
	public int connexion(int idUtilisateur) {
		// TODO Auto-generated method stub
		Utilisateur sdj =  em.find(Utilisateur.class, idUtilisateur);
		sdj.setEst_connecte(true);
		em.persist(sdj);
		return idUtilisateur;
		
	}
	@Override
	public int deconnexion(int idUtilisateur) {
		// TODO Auto-generated method stub
		Utilisateur sdj =  em.find(Utilisateur.class, idUtilisateur);
		sdj.setEst_connecte(false);
		em.persist(sdj);
		return idUtilisateur;
		
	}

	@Override
	public boolean etreConnecte() {
		// TODO Auto-generated method stub
		return false;
	}

}
