package hw;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class GestionScoreDeMatch
 */
@Stateless
@LocalBean
public class GestionScoreDeMatch implements GestionScoreDeMatchRemote {
	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionScoreDeMatch() {
        // TODO Auto-generated constructor stub
    }
    @Override
	public ScoreDeMatch ajouterScoreDeMatch(ScoreDeMatch sdm) {
		em.persist(sdm);
		return sdm;
	}

    @Override
	public ScoreDeMatch modifierScoreDeMatch(int id, String zone) {
    	ResultSet  scoreDeMatchToUpdate = (ResultSet) em.createQuery("SELECT id FROM ScoreDeMatch sdm WHERE id = "+id);
    	
    	try {
			ResultSetMetaData metadata =  scoreDeMatchToUpdate.getMetaData();
			//    https://www.roseindia.net/jdbc/jdbc-mysql/ColumnName.shtml
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public Collection<ScoreDeMatch> listerScoreDeMatch() {
		return em.createQuery("SELECT sdm FROM ScoreDeMatch sdm").getResultList();
		
	}

}
