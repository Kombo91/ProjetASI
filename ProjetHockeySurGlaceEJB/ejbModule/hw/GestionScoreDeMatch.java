package hw;



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
    	System.out.println("sdm" + sdm);
    	if(sdm.getZoneDeTire() == "train1CageABut") {
    		System.err.println("blablabla");
    	}
    	else {
    		System.out.println("----------------" +sdm.getZoneDeTire());
    	}
    	
    	
    	System.out.println("-----atatatatatatatat-----------" +sdm.getZoneDeTire());
		em.persist(sdm);
		return sdm;
	}

    @Override
	public ScoreDeMatch modifierScoreDeMatch(ScoreDeMatch sdm) {
    	System.out.println("je suis dans modifierScoreDeMatch");
    	ScoreDeMatch  sdmToUpdate =  (ScoreDeMatch) em.createQuery("SELECT sdm FROM ScoreDeMatch sdm WHERE sdm.idGardien = "+sdm.getIdGardien()+" AND sdm.idRencontre = "+sdm.getIdRencontre()).getSingleResult();
    System.err.println("sdm.getZoneDeTire() "+sdm.getZoneDeTire());
    	 if(sdm.getZoneDeTire().equals("terrain1CageABut")){
    		 
    		 System.out.println("je suis dans modifierScoreDeMatch terrain1CageABut");
    		
    	 	 sdmToUpdate.setTerrain1CageABut(sdmToUpdate.getTerrain1CageABut()+1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageBBut")){
    	 	 sdmToUpdate.setTerrain1CageBBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageCBut")){
    	 	 sdmToUpdate.setTerrain1CageCBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageDBut")){
    	 	 sdmToUpdate.setTerrain1CageDBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageEBut")){
    	 	 sdmToUpdate.setTerrain1CageEBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageFBut")){
    	 	 sdmToUpdate.setTerrain1CageFBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageGBut")){
    	 	 sdmToUpdate.setTerrain1CageGBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageHBut")){
    	 	 sdmToUpdate.setTerrain1CageHBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageIBut")){
    	 	 sdmToUpdate.setTerrain1CageHBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageApasBut")){
    	 	 sdmToUpdate.setTerrain1CageApasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageBpasBut")){
    	 	 sdmToUpdate.setTerrain1CageBpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageCpasBut")){
    	 	 sdmToUpdate.setTerrain1CageCpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageDpasBut")){
    	 	 sdmToUpdate.setTerrain1CageDpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageEpasBut")){
    	 	 sdmToUpdate.setTerrain1CageEpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageFpasBut")){
    	 	 sdmToUpdate.setTerrain1CageFpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageGpasBut")){
    	 	 sdmToUpdate.setTerrain1CageGpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageHpasBut")){
    	 	 sdmToUpdate.setTerrain1CageHpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain1CageIpasBut")){
    	 	 sdmToUpdate.setTerrain1CageIpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageABut")){
    	 	 sdmToUpdate.setTerrain2CageABut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageBBut")){
    	 	 sdmToUpdate.setTerrain2CageBBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageCBut")){
    	 	 sdmToUpdate.setTerrain2CageCBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageDBut")){
    	 	 sdmToUpdate.setTerrain2CageDBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageEBut")){
    	 	 sdmToUpdate.setTerrain2CageEBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageFBut")){
    	 	 sdmToUpdate.setTerrain2CageFBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageGBut")){
    	 	 sdmToUpdate.setTerrain2CageGBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageHBut")){
    	 	 sdmToUpdate.setTerrain2CageHBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageIBut")){
    	 	 sdmToUpdate.setTerrain2CageIBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageApasBut")){
    	 	 sdmToUpdate.setTerrain2CageApasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageBpasBut")){
    	 	 sdmToUpdate.setTerrain2CageBpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageCpasBut")){
    	 	 sdmToUpdate.setTerrain2CageCpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageDpasBut")){
    	 	 sdmToUpdate.setTerrain2CageDpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageEpasBut")){
    	 	 sdmToUpdate.setTerrain2CageEpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageFpasBut")){
    	 	 sdmToUpdate.setTerrain2CageFpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageGpasBut")){
    	 	 sdmToUpdate.setTerrain2CageGpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageHpasBut")){
    	 	 sdmToUpdate.setTerrain2CageHpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain2CageIpasBut")){
    	 	 sdmToUpdate.setTerrain2CageIpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageABut")){
    	 	 sdmToUpdate.setTerrain3CageABut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageBBut")){
    	 	 sdmToUpdate.setTerrain3CageBBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageCBut")){
    	 	 sdmToUpdate.setTerrain3CageCBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageDBut")){
    	 	 sdmToUpdate.setTerrain3CageDBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageEBut")){
    	 	 sdmToUpdate.setTerrain3CageEBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageFBut")){
    	 	 sdmToUpdate.setTerrain3CageFBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageGBut")){
    	 	 sdmToUpdate.setTerrain3CageGBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageHBut")){
    	 	 sdmToUpdate.setTerrain3CageHBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageIBut")){
    	 	 sdmToUpdate.setTerrain3CageIBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageApasBut")){
    	 	 sdmToUpdate.setTerrain3CageApasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageBpasBut")){
    	 	 sdmToUpdate.setTerrain3CageBpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageCpasBut")){
    	 	 sdmToUpdate.setTerrain3CageCpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageDpasBut")){
    	 	 sdmToUpdate.setTerrain3CageDpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageEpasBut")){
    	 	 sdmToUpdate.setTerrain3CageEpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageFpasBut")){
    	 	 sdmToUpdate.setTerrain3CageFpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageGpasBut")){
    	 	 sdmToUpdate.setTerrain3CageGpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageHpasBut")){
    	 	 sdmToUpdate.setTerrain3CageHpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain3CageIpasBut")){
    	 	 sdmToUpdate.setTerrain3CageIpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageABut")){
    	 	 sdmToUpdate.setTerrain4CageABut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageBBut")){
    	 	 sdmToUpdate.setTerrain4CageBBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageCBut")){
    	 	 sdmToUpdate.setTerrain4CageCBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageDBut")){
    	 	 sdmToUpdate.setTerrain4CageDBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageEBut")){
    	 	 sdmToUpdate.setTerrain4CageEBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageFBut")){
    	 	 sdmToUpdate.setTerrain4CageFBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageGBut")){
    	 	 sdmToUpdate.setTerrain4CageGBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageHBut")){
    	 	 sdmToUpdate.setTerrain4CageHBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageIBut")){
    	 	 sdmToUpdate.setTerrain4CageIBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageApasBut")){
    	 	 sdmToUpdate.setTerrain4CageApasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageBpasBut")){
    	 	 sdmToUpdate.setTerrain4CageBpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageCpasBut")){
    	 	 sdmToUpdate.setTerrain4CageCpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageDpasBut")){
    	 	 sdmToUpdate.setTerrain4CageDpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageEpasBut")){
    	 	 sdmToUpdate.setTerrain4CageEpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageFpasBut")){
    	 	 sdmToUpdate.setTerrain4CageFpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageGpasBut")){
    	 	 sdmToUpdate.setTerrain4CageGpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageHpasBut")){
    	 	 sdmToUpdate.setTerrain4CageHpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain4CageIpasBut")){
    	 	 sdmToUpdate.setTerrain4CageIpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageABut")){
    	 	 sdmToUpdate.setTerrain5CageABut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageBBut")){
    	 	 sdmToUpdate.setTerrain5CageBBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageCBut")){
    	 	 sdmToUpdate.setTerrain5CageCBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageDBut")){
    	 	 sdmToUpdate.setTerrain5CageDBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageEBut")){
    	 	 sdmToUpdate.setTerrain5CageEBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageFBut")){
    	 	 sdmToUpdate.setTerrain5CageFBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageGBut")){
    	 	 sdmToUpdate.setTerrain5CageGBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageHBut")){
    	 	 sdmToUpdate.setTerrain5CageHBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageIBut")){
    	 	 sdmToUpdate.setTerrain5CageIBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageApasBut")){
    	 	 sdmToUpdate.setTerrain5CageApasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageBpasBut")){
    	 	 sdmToUpdate.setTerrain5CageBpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageCpasBut")){
    	 	 sdmToUpdate.setTerrain5CageCpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageDpasBut")){
    	 	 sdmToUpdate.setTerrain5CageDpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageEpasBut")){
    	 	 sdmToUpdate.setTerrain5CageEpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageFpasBut")){
    	 	 sdmToUpdate.setTerrain5CageFpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageGpasBut")){
    	 	 sdmToUpdate.setTerrain5CageGpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageHpasBut")){
    	 	 sdmToUpdate.setTerrain5CageHpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain5CageIpasBut")){
    	 	 sdmToUpdate.setTerrain5CageIpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageABut")){
    	 	 sdmToUpdate.setTerrain6CageABut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageBBut")){
    	 	 sdmToUpdate.setTerrain6CageBBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageCBut")){
    	 	 sdmToUpdate.setTerrain6CageCBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageDBut")){
    	 	 sdmToUpdate.setTerrain6CageDBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageEBut")){
    	 	 sdmToUpdate.setTerrain6CageEBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageFBut")){
    	 	 sdmToUpdate.setTerrain6CageFBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageGBut")){
    	 	 sdmToUpdate.setTerrain6CageGBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageHBut")){
    	 	 sdmToUpdate.setTerrain6CageHBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageIBut")){
    	 	 sdmToUpdate.setTerrain6CageIBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageApasBut")){
    	 	 sdmToUpdate.setTerrain6CageApasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageBpasBut")){
    	 	 sdmToUpdate.setTerrain6CageBpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageCpasBut")){
    	 	 sdmToUpdate.setTerrain6CageCpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageDpasBut")){
    	 	 sdmToUpdate.setTerrain6CageDpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageEpasBut")){
    	 	 sdmToUpdate.setTerrain6CageEpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageFpasBut")){
    	 	 sdmToUpdate.setTerrain6CageFpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageGpasBut")){
    	 	 sdmToUpdate.setTerrain6CageGpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageHpasBut")){
    	 	 sdmToUpdate.setTerrain6CageHpasBut(1);
    	} 
    	 if(sdm.getZoneDeTire().equals("terrain6CageIpasBut")){
    	 	 sdmToUpdate.setTerrain6CageIpasBut(1);
    	}
    	em.persist(sdmToUpdate);
		return sdmToUpdate;
	}
	

}
