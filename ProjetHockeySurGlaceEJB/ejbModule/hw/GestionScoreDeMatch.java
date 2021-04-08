package hw;

import java.util.Collection;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public ScoreDeMatch modifierScoreDeMatch(ScoreDeMatch sdm) {

		//////// switch case
		ScoreDeMatch sdmToUpdate = (ScoreDeMatch) em
				.createQuery("SELECT sdm FROM ScoreDeMatch sdm WHERE sdm.idGardien = " + sdm.getIdGardien()
						+ " AND sdm.idRencontre = " + sdm.getIdRencontre())
				.getSingleResult();
		if (sdm.getZoneDeTire().equals("terrain1CageABut")) {
			sdmToUpdate.setTerrain1CageABut(sdmToUpdate.getTerrain1CageABut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageBBut")) {
			sdmToUpdate.setTerrain1CageBBut(sdmToUpdate.getTerrain1CageBBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageCBut")) {
			sdmToUpdate.setTerrain1CageCBut(sdmToUpdate.getTerrain1CageCBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageDBut")) {
			sdmToUpdate.setTerrain1CageDBut(sdmToUpdate.getTerrain1CageDBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageEBut")) {
			sdmToUpdate.setTerrain1CageEBut(sdmToUpdate.getTerrain1CageEBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageFBut")) {
			sdmToUpdate.setTerrain1CageFBut(sdmToUpdate.getTerrain1CageFBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageGBut")) {
			sdmToUpdate.setTerrain1CageGBut(sdmToUpdate.getTerrain1CageGBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageHBut")) {
			sdmToUpdate.setTerrain1CageHBut(sdmToUpdate.getTerrain1CageHBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageIBut")) {
			sdmToUpdate.setTerrain1CageHBut(sdmToUpdate.getTerrain1CageHBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageApasBut")) {
			sdmToUpdate.setTerrain1CageApasBut(sdmToUpdate.getTerrain1CageApasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageBpasBut")) {
			sdmToUpdate.setTerrain1CageBpasBut(sdmToUpdate.getTerrain1CageBpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageCpasBut")) {
			sdmToUpdate.setTerrain1CageCpasBut(sdmToUpdate.getTerrain1CageCpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageDpasBut")) {
			sdmToUpdate.setTerrain1CageDpasBut(sdmToUpdate.getTerrain1CageDpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageEpasBut")) {
			sdmToUpdate.setTerrain1CageEpasBut(sdmToUpdate.getTerrain1CageEpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageFpasBut")) {
			sdmToUpdate.setTerrain1CageFpasBut(sdmToUpdate.getTerrain1CageFpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageGpasBut")) {
			sdmToUpdate.setTerrain1CageGpasBut(sdmToUpdate.getTerrain1CageGpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageHpasBut")) {
			sdmToUpdate.setTerrain1CageHpasBut(sdmToUpdate.getTerrain1CageHpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain1CageIpasBut")) {
			sdmToUpdate.setTerrain1CageIpasBut(sdmToUpdate.getTerrain1CageIpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageABut")) {
			sdmToUpdate.setTerrain2CageABut(sdmToUpdate.getTerrain2CageABut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageBBut")) {
			sdmToUpdate.setTerrain2CageBBut(sdmToUpdate.getTerrain2CageBBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageCBut")) {
			sdmToUpdate.setTerrain2CageCBut(sdmToUpdate.getTerrain2CageCBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageDBut")) {
			sdmToUpdate.setTerrain2CageDBut(sdmToUpdate.getTerrain2CageDBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageEBut")) {
			sdmToUpdate.setTerrain2CageEBut(sdmToUpdate.getTerrain2CageEBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageFBut")) {
			sdmToUpdate.setTerrain2CageFBut(sdmToUpdate.getTerrain2CageFBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageGBut")) {
			sdmToUpdate.setTerrain2CageGBut(sdmToUpdate.getTerrain2CageGBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageHBut")) {
			sdmToUpdate.setTerrain2CageHBut(sdmToUpdate.getTerrain2CageHBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageIBut")) {
			sdmToUpdate.setTerrain2CageIBut(sdmToUpdate.getTerrain2CageIBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageApasBut")) {
			sdmToUpdate.setTerrain2CageApasBut(sdmToUpdate.getTerrain2CageApasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageBpasBut")) {
			sdmToUpdate.setTerrain2CageBpasBut(sdmToUpdate.getTerrain2CageBpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageCpasBut")) {
			sdmToUpdate.setTerrain2CageCpasBut(sdmToUpdate.getTerrain2CageCpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageDpasBut")) {
			sdmToUpdate.setTerrain2CageDpasBut(sdmToUpdate.getTerrain2CageDpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageEpasBut")) {
			sdmToUpdate.setTerrain2CageEpasBut(sdmToUpdate.getTerrain2CageEpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageFpasBut")) {
			sdmToUpdate.setTerrain2CageFpasBut(sdmToUpdate.getTerrain2CageFpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageGpasBut")) {
			sdmToUpdate.setTerrain2CageGpasBut(sdmToUpdate.getTerrain2CageGpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageHpasBut")) {
			sdmToUpdate.setTerrain2CageHpasBut(sdmToUpdate.getTerrain2CageHpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain2CageIpasBut")) {
			sdmToUpdate.setTerrain2CageIpasBut(sdmToUpdate.getTerrain2CageIpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageABut")) {
			sdmToUpdate.setTerrain3CageABut(sdmToUpdate.getTerrain3CageABut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageBBut")) {
			sdmToUpdate.setTerrain3CageBBut(sdmToUpdate.getTerrain3CageBBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageCBut")) {
			sdmToUpdate.setTerrain3CageCBut(sdmToUpdate.getTerrain3CageCBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageDBut")) {
			sdmToUpdate.setTerrain3CageDBut(sdmToUpdate.getTerrain3CageDBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageEBut")) {
			sdmToUpdate.setTerrain3CageEBut(sdmToUpdate.getTerrain3CageEBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageFBut")) {
			sdmToUpdate.setTerrain3CageFBut(sdmToUpdate.getTerrain3CageFBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageGBut")) {
			sdmToUpdate.setTerrain3CageGBut(sdmToUpdate.getTerrain3CageGBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageHBut")) {
			sdmToUpdate.setTerrain3CageHBut(sdmToUpdate.getTerrain3CageHBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageIBut")) {
			sdmToUpdate.setTerrain3CageIBut(sdmToUpdate.getTerrain3CageIBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageApasBut")) {
			sdmToUpdate.setTerrain3CageApasBut(sdmToUpdate.getTerrain3CageApasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageBpasBut")) {
			sdmToUpdate.setTerrain3CageBpasBut(sdmToUpdate.getTerrain3CageBpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageCpasBut")) {
			sdmToUpdate.setTerrain3CageCpasBut(sdmToUpdate.getTerrain3CageCpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageDpasBut")) {
			sdmToUpdate.setTerrain3CageDpasBut(sdmToUpdate.getTerrain3CageDpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageEpasBut")) {
			sdmToUpdate.setTerrain3CageEpasBut(sdmToUpdate.getTerrain3CageEpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageFpasBut")) {
			sdmToUpdate.setTerrain3CageFpasBut(sdmToUpdate.getTerrain3CageFpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageGpasBut")) {
			sdmToUpdate.setTerrain3CageGpasBut(sdmToUpdate.getTerrain3CageGpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageHpasBut")) {
			sdmToUpdate.setTerrain3CageHpasBut(sdmToUpdate.getTerrain3CageHpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain3CageIpasBut")) {
			sdmToUpdate.setTerrain3CageIpasBut(sdmToUpdate.getTerrain3CageIpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageABut")) {
			sdmToUpdate.setTerrain4CageABut(sdmToUpdate.getTerrain4CageABut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageBBut")) {
			sdmToUpdate.setTerrain4CageBBut(sdmToUpdate.getTerrain4CageBBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageCBut")) {
			sdmToUpdate.setTerrain4CageCBut(sdmToUpdate.getTerrain4CageCBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageDBut")) {
			sdmToUpdate.setTerrain4CageDBut(sdmToUpdate.getTerrain4CageDBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageEBut")) {
			sdmToUpdate.setTerrain4CageEBut(sdmToUpdate.getTerrain4CageEBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageFBut")) {
			sdmToUpdate.setTerrain4CageFBut(sdmToUpdate.getTerrain4CageFBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageGBut")) {
			sdmToUpdate.setTerrain4CageGBut(sdmToUpdate.getTerrain4CageGBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageHBut")) {
			sdmToUpdate.setTerrain4CageHBut(sdmToUpdate.getTerrain4CageHBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageIBut")) {
			sdmToUpdate.setTerrain4CageIBut(sdmToUpdate.getTerrain4CageIBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageApasBut")) {
			sdmToUpdate.setTerrain4CageApasBut(sdmToUpdate.getTerrain4CageApasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageBpasBut")) {
			sdmToUpdate.setTerrain4CageBpasBut(sdmToUpdate.getTerrain4CageBpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageCpasBut")) {
			sdmToUpdate.setTerrain4CageCpasBut(sdmToUpdate.getTerrain4CageCpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageDpasBut")) {
			sdmToUpdate.setTerrain4CageDpasBut(sdmToUpdate.getTerrain4CageDpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageEpasBut")) {
			sdmToUpdate.setTerrain4CageEpasBut(sdmToUpdate.getTerrain4CageEpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageFpasBut")) {
			sdmToUpdate.setTerrain4CageFpasBut(sdmToUpdate.getTerrain4CageFpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageGpasBut")) {
			sdmToUpdate.setTerrain4CageGpasBut(sdmToUpdate.getTerrain4CageGpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageHpasBut")) {
			sdmToUpdate.setTerrain4CageHpasBut(sdmToUpdate.getTerrain4CageHpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain4CageIpasBut")) {
			sdmToUpdate.setTerrain4CageIpasBut(sdmToUpdate.getTerrain4CageIpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageABut")) {
			sdmToUpdate.setTerrain5CageABut(sdmToUpdate.getTerrain5CageABut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageBBut")) {
			sdmToUpdate.setTerrain5CageBBut(sdmToUpdate.getTerrain5CageBBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageCBut")) {
			sdmToUpdate.setTerrain5CageCBut(sdmToUpdate.getTerrain5CageCBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageDBut")) {
			sdmToUpdate.setTerrain5CageDBut(sdmToUpdate.getTerrain5CageDBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageEBut")) {
			sdmToUpdate.setTerrain5CageEBut(sdmToUpdate.getTerrain5CageEBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageFBut")) {
			sdmToUpdate.setTerrain5CageFBut(sdmToUpdate.getTerrain5CageFBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageGBut")) {
			sdmToUpdate.setTerrain5CageGBut(sdmToUpdate.getTerrain5CageGBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageHBut")) {
			sdmToUpdate.setTerrain5CageHBut(sdmToUpdate.getTerrain5CageHBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageIBut")) {
			sdmToUpdate.setTerrain5CageIBut(sdmToUpdate.getTerrain5CageIBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageApasBut")) {
			sdmToUpdate.setTerrain5CageApasBut(sdmToUpdate.getTerrain5CageApasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageBpasBut")) {
			sdmToUpdate.setTerrain5CageBpasBut(sdmToUpdate.getTerrain5CageBpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageCpasBut")) {
			sdmToUpdate.setTerrain5CageCpasBut(sdmToUpdate.getTerrain5CageCpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageDpasBut")) {
			sdmToUpdate.setTerrain5CageDpasBut(sdmToUpdate.getTerrain5CageDpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageEpasBut")) {
			sdmToUpdate.setTerrain5CageEpasBut(sdmToUpdate.getTerrain5CageEpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageFpasBut")) {
			sdmToUpdate.setTerrain5CageFpasBut(sdmToUpdate.getTerrain5CageFpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageGpasBut")) {
			sdmToUpdate.setTerrain5CageGpasBut(sdmToUpdate.getTerrain5CageGpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageHpasBut")) {
			sdmToUpdate.setTerrain5CageHpasBut(sdmToUpdate.getTerrain5CageHpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain5CageIpasBut")) {
			sdmToUpdate.setTerrain5CageIpasBut(sdmToUpdate.getTerrain5CageIpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageABut")) {
			sdmToUpdate.setTerrain6CageABut(sdmToUpdate.getTerrain6CageABut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageBBut")) {
			sdmToUpdate.setTerrain6CageBBut(sdmToUpdate.getTerrain6CageBBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageCBut")) {
			sdmToUpdate.setTerrain6CageCBut(sdmToUpdate.getTerrain6CageCBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageDBut")) {
			sdmToUpdate.setTerrain6CageDBut(sdmToUpdate.getTerrain6CageDBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageEBut")) {
			sdmToUpdate.setTerrain6CageEBut(sdmToUpdate.getTerrain6CageEBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageFBut")) {
			sdmToUpdate.setTerrain6CageFBut(sdmToUpdate.getTerrain6CageFBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageGBut")) {
			sdmToUpdate.setTerrain6CageGBut(sdmToUpdate.getTerrain6CageGBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageHBut")) {
			sdmToUpdate.setTerrain6CageHBut(sdmToUpdate.getTerrain6CageHBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageIBut")) {
			sdmToUpdate.setTerrain6CageIBut(sdmToUpdate.getTerrain6CageIBut() + 1);
			sdmToUpdate.setNombreDeButEncaisse(sdmToUpdate.getNombreDeButEncaisse() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageApasBut")) {
			sdmToUpdate.setTerrain6CageApasBut(sdmToUpdate.getTerrain6CageApasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageBpasBut")) {
			sdmToUpdate.setTerrain6CageBpasBut(sdmToUpdate.getTerrain6CageBpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageCpasBut")) {
			sdmToUpdate.setTerrain6CageCpasBut(sdmToUpdate.getTerrain6CageCpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageDpasBut")) {
			sdmToUpdate.setTerrain6CageDpasBut(sdmToUpdate.getTerrain6CageDpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageEpasBut")) {
			sdmToUpdate.setTerrain6CageEpasBut(sdmToUpdate.getTerrain6CageEpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageFpasBut")) {
			sdmToUpdate.setTerrain6CageFpasBut(sdmToUpdate.getTerrain6CageFpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageGpasBut")) {
			sdmToUpdate.setTerrain6CageGpasBut(sdmToUpdate.getTerrain6CageGpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageHpasBut")) {
			sdmToUpdate.setTerrain6CageHpasBut(sdmToUpdate.getTerrain6CageHpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);
		} else if (sdm.getZoneDeTire().equals("terrain6CageIpasBut")) {
			sdmToUpdate.setTerrain6CageIpasBut(sdmToUpdate.getTerrain6CageIpasBut() + 1);
			sdmToUpdate.setNombreDeButArrete(sdmToUpdate.getNombreDeButArrete() + 1);

		}
		em.persist(sdmToUpdate);
		em.flush();
		return sdmToUpdate;
	}

	@Override
	public ScoreDeMatch lesScoreDeMatch(int idScoreDeMatch) {
		// TODO Auto-generated method stub
		return (ScoreDeMatch) em
				.createQuery("SELECT sdm FROM ScoreDeMatch sdm WHERE sdm.idScoreDeMatch= " + idScoreDeMatch)
				.getSingleResult();
	}

	@Override
	public Collection<ScoreDeMatch> nbrTotalTirVersGardien(int idGadien) {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT sdm FROM ScoreDeMatch sdm WHERE sdm.idGardien= " + idGadien).getResultList();

	}

	@Override
	public List<ScoreDeMatch> staticTouteLaSaison(int idGardien) {
		List<ScoreDeMatch> staticTouteLaSaison = em
				.createQuery("SELECT sdm FROM ScoreDeMatch sdm WHERE sdm.idGardien= " + idGardien).getResultList();
				
		return staticTouteLaSaison;

	}
	@Override
	public List<ScoreDeMatch> staticDUnGardienParRaportAUnMatch(int idGardien, int idEquipeChoisi, int idEquipeChoisiplusDeDetails) {
		List<Rencontre> rencontre  = em.createQuery("SELECT re FROM Rencontre re WHERE re.idMonEquipe = "+idEquipeChoisi + "AND re.idEquipeAdvers = "+idEquipeChoisiplusDeDetails).getResultList();
		System.out.println(" rencontre = "+rencontre.get(0).getIdRencontre());
		List<ScoreDeMatch> staticDUnGardienParRaportAUnMatch = em .createQuery("SELECT sdm FROM ScoreDeMatch sdm WHERE sdm.idGardien= " + idGardien +" AND  sdm.idRencontre = "+rencontre.get(0).getIdRencontre()).getResultList();
		System.out.println(" staticDUnGardienParRaportAUnMatch = "+staticDUnGardienParRaportAUnMatch.get(0).getIdScoreDeMatch());
		return staticDUnGardienParRaportAUnMatch;

	}

}
