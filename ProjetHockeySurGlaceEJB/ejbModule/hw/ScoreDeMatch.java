/**
 * 
 */
package hw;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author KP
 *
 */
@Entity
public class ScoreDeMatch implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int id;
	private int idGardien;
	private int idRencontre;
	private int terrain1CageABut;
	private int terrain1CageApasBut;
	private int terrain1CageBBut;
	private int terrain1CageBpasBut;
	private int terrain1CageCBut;
	private int terrain1CageCpasBut;
	private int terrain1CageDBut;
	private int terrain1CageDpasBut;
	private int terrain1CageEBut;
	private int terrain1CageEpasBut;
	private int terrain1CageFBut;
	private int terrain1CageFpasBut;
	private int terrain1CageGBut;
	private int terrain1CageGpasBut;
	private int terrain1CageHBut;
	private int terrain1CageHpasBut;
	private int terrain1CageIBut;
	private int terrain1CageIpasBut;
	private int terrain2CageABut;
	private int terrain2CageApasBut;
	private int terrain2CageBBut;
	private int terrain2CageBpasBut;
	private int terrain2CageCBut;
	private int terrain2CageCpasBut;
	private int terrain2CageDBut;
	private int terrain2CageDpasBut;
	private int terrain2CageEBut;
	private int terrain2CageEpasBut;
	private int terrain2CageFBut;
	private int terrain2CageFpasBut;
	private int terrain2CageGBut;
	private int terrain2CageGpasBut;
	private int terrain2CageHBut;
	private int terrain2CageHpasBut;
	private int terrain2CageIBut;
	private int terrain2CageIpasBut;
	private int terrain3CageABut;
	private int terrain3CageApasBut;
	private int terrain3CageBBut;
	private int terrain3CageBpasBut;
	private int terrain3CageCBut;
	private int terrain3CageCpasBut;
	private int terrain3CageDBut;
	private int terrain3CageDpasBut;
	private int terrain3CageEBut;
	private int terrain3CageEpasBut;
	private int terrain3CageFBut;
	private int terrain3CageFpasBut;
	private int terrain3CageGBut;
	private int terrain3CageGpasBut;
	private int terrain3CageHBut;
	private int terrain3CageHpasBut;
	private int terrain3CageIBut;
	private int terrain3CageIpasBut;
	private int terrain4CageABut;
	private int terrain4CageApasBut;
	private int terrain4CageBBut;
	private int terrain4CageBpasBut;
	private int terrain4CageCBut;
	private int terrain4CageCpasBut;
	private int terrain4CageDBut;
	private int terrain4CageDpasBut;
	private int terrain4CageEBut;
	private int terrain4CageEpasBut;
	private int terrain4CageFBut;
	private int terrain4CageFpasBut;
	private int terrain4CageGBut;
	private int terrain4CageGpasBut;
	private int terrain4CageHBut;
	private int terrain4CageHpasBut;
	private int terrain4CageIBut;
	private int terrain4CageIpasBut;
	private int terrain5CageABut;
	private int terrain5CageApasBut;
	private int terrain5CageBBut;
	private int terrain5CageBpasBut;
	private int terrain5CageCBut;
	private int terrain5CageCpasBut;
	private int terrain5CageDBut;
	private int terrain5CageDpasBut;
	private int terrain5CageEBut;
	private int terrain5CageEpasBut;
	private int terrain5CageFBut;
	private int terrain5CageFpasBut;
	private int terrain5CageGBut;
	private int terrain5CageGpasBut;
	private int terrain5CageHBut;
	private int terrain5CageHpasBut;
	private int terrain5CageIBut;
	private int terrain5CageIpasBut;
	private int terrain6CageABut;
	private int terrain6CageApasBut;
	private int terrain6CageBBut;
	private int terrain6CageBpasBut;
	private int terrain6CageCBut;
	private int terrain6CageCpasBut;
	private int terrain6CageDBut;
	private int terrain6CageDpasBut;
	private int terrain6CageEBut;
	private int terrain6CageEpasBut;
	private int terrain6CageFBut;
	private int terrain6CageFpasBut;
	private int terrain6CageGBut;
	private int terrain6CageGpasBut;
	private int terrain6CageHBut;
	private int terrain6CageHpasBut;
	private int terrain6CageIBut;
	private int terrain6CageIpasBut;
	private String zoneDeTire;
	
	public ScoreDeMatch() {}
	public ScoreDeMatch(int idGardien, int idRencontre) {
		super();
		this.idGardien = idGardien;
		this.idRencontre = idRencontre;
	}
	
	public ScoreDeMatch(int idGardien, int idRencontre, String zoneDeTire) {
		super();
		this.idGardien = idGardien;
		this.idRencontre = idRencontre;
		this.zoneDeTire = zoneDeTire;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdGardien() {
		return idGardien;
	}
	public void setIdGardien(int idGardien) {
		this.idGardien = idGardien;
	}
	public int getIdRencontre() {
		return idRencontre;
	}
	public void setIdRencontre(int idRencontre) {
		this.idRencontre = idRencontre;
	}
	public int getTerrain1CageABut() {
		return terrain1CageABut;
	}
	public void setTerrain1CageABut(int terrain1CageABut) {
		this.terrain1CageABut = terrain1CageABut;
	}
	public int getTerrain1CageApasBut() {
		return terrain1CageApasBut;
	}
	public void setTerrain1CageApasBut(int terrain1CageApasBut) {
		this.terrain1CageApasBut = terrain1CageApasBut;
	}
	public int getTerrain1CageBBut() {
		return terrain1CageBBut;
	}
	public void setTerrain1CageBBut(int terrain1CageBBut) {
		this.terrain1CageBBut = terrain1CageBBut;
	}
	public int getTerrain1CageBpasBut() {
		return terrain1CageBpasBut;
	}
	public void setTerrain1CageBpasBut(int terrain1CageBpasBut) {
		this.terrain1CageBpasBut = terrain1CageBpasBut;
	}
	public int getTerrain1CageCBut() {
		return terrain1CageCBut;
	}
	public void setTerrain1CageCBut(int terrain1CageCBut) {
		this.terrain1CageCBut = terrain1CageCBut;
	}
	public int getTerrain1CageCpasBut() {
		return terrain1CageCpasBut;
	}
	public void setTerrain1CageCpasBut(int terrain1CageCpasBut) {
		this.terrain1CageCpasBut = terrain1CageCpasBut;
	}
	public int getTerrain1CageDBut() {
		return terrain1CageDBut;
	}
	public void setTerrain1CageDBut(int terrain1CageDBut) {
		this.terrain1CageDBut = terrain1CageDBut;
	}
	public int getTerrain1CageDpasBut() {
		return terrain1CageDpasBut;
	}
	public void setTerrain1CageDpasBut(int terrain1CageDpasBut) {
		this.terrain1CageDpasBut = terrain1CageDpasBut;
	}
	public int getTerrain1CageEBut() {
		return terrain1CageEBut;
	}
	public void setTerrain1CageEBut(int terrain1CageEBut) {
		this.terrain1CageEBut = terrain1CageEBut;
	}
	public int getTerrain1CageEpasBut() {
		return terrain1CageEpasBut;
	}
	public void setTerrain1CageEpasBut(int terrain1CageEpasBut) {
		this.terrain1CageEpasBut = terrain1CageEpasBut;
	}
	public int getTerrain1CageFBut() {
		return terrain1CageFBut;
	}
	public void setTerrain1CageFBut(int terrain1CageFBut) {
		this.terrain1CageFBut = terrain1CageFBut;
	}
	public int getTerrain1CageFpasBut() {
		return terrain1CageFpasBut;
	}
	public void setTerrain1CageFpasBut(int terrain1CageFpasBut) {
		this.terrain1CageFpasBut = terrain1CageFpasBut;
	}
	public int getTerrain1CageGBut() {
		return terrain1CageGBut;
	}
	public void setTerrain1CageGBut(int terrain1CageGBut) {
		this.terrain1CageGBut = terrain1CageGBut;
	}
	public int getTerrain1CageGpasBut() {
		return terrain1CageGpasBut;
	}
	public void setTerrain1CageGpasBut(int terrain1CageGpasBut) {
		this.terrain1CageGpasBut = terrain1CageGpasBut;
	}
	public int getTerrain1CageHBut() {
		return terrain1CageHBut;
	}
	public void setTerrain1CageHBut(int terrain1CageHBut) {
		this.terrain1CageHBut = terrain1CageHBut;
	}
	public int getTerrain1CageHpasBut() {
		return terrain1CageHpasBut;
	}
	public void setTerrain1CageHpasBut(int terrain1CageHpasBut) {
		this.terrain1CageHpasBut = terrain1CageHpasBut;
	}
	public int getTerrain1CageIBut() {
		return terrain1CageIBut;
	}
	public void setTerrain1CageIBut(int terrain1CageIBut) {
		this.terrain1CageIBut = terrain1CageIBut;
	}
	public int getTerrain1CageIpasBut() {
		return terrain1CageIpasBut;
	}
	public void setTerrain1CageIpasBut(int terrain1CageIpasBut) {
		this.terrain1CageIpasBut = terrain1CageIpasBut;
	}
	public int getTerrain2CageABut() {
		return terrain2CageABut;
	}
	public void setTerrain2CageABut(int terrain2CageABut) {
		this.terrain2CageABut = terrain2CageABut;
	}
	public int getTerrain2CageApasBut() {
		return terrain2CageApasBut;
	}
	public void setTerrain2CageApasBut(int terrain2CageApasBut) {
		this.terrain2CageApasBut = terrain2CageApasBut;
	}
	public int getTerrain2CageBBut() {
		return terrain2CageBBut;
	}
	public void setTerrain2CageBBut(int terrain2CageBBut) {
		this.terrain2CageBBut = terrain2CageBBut;
	}
	public int getTerrain2CageBpasBut() {
		return terrain2CageBpasBut;
	}
	public void setTerrain2CageBpasBut(int terrain2CageBpasBut) {
		this.terrain2CageBpasBut = terrain2CageBpasBut;
	}
	public int getTerrain2CageCBut() {
		return terrain2CageCBut;
	}
	public void setTerrain2CageCBut(int terrain2CageCBut) {
		this.terrain2CageCBut = terrain2CageCBut;
	}
	public int getTerrain2CageCpasBut() {
		return terrain2CageCpasBut;
	}
	public void setTerrain2CageCpasBut(int terrain2CageCpasBut) {
		this.terrain2CageCpasBut = terrain2CageCpasBut;
	}
	public int getTerrain2CageDBut() {
		return terrain2CageDBut;
	}
	public void setTerrain2CageDBut(int terrain2CageDBut) {
		this.terrain2CageDBut = terrain2CageDBut;
	}
	public int getTerrain2CageDpasBut() {
		return terrain2CageDpasBut;
	}
	public void setTerrain2CageDpasBut(int terrain2CageDpasBut) {
		this.terrain2CageDpasBut = terrain2CageDpasBut;
	}
	public int getTerrain2CageEBut() {
		return terrain2CageEBut;
	}
	public void setTerrain2CageEBut(int terrain2CageEBut) {
		this.terrain2CageEBut = terrain2CageEBut;
	}
	public int getTerrain2CageEpasBut() {
		return terrain2CageEpasBut;
	}
	public void setTerrain2CageEpasBut(int terrain2CageEpasBut) {
		this.terrain2CageEpasBut = terrain2CageEpasBut;
	}
	public int getTerrain2CageFBut() {
		return terrain2CageFBut;
	}
	public void setTerrain2CageFBut(int terrain2CageFBut) {
		this.terrain2CageFBut = terrain2CageFBut;
	}
	public int getTerrain2CageFpasBut() {
		return terrain2CageFpasBut;
	}
	public void setTerrain2CageFpasBut(int terrain2CageFpasBut) {
		this.terrain2CageFpasBut = terrain2CageFpasBut;
	}
	public int getTerrain2CageGBut() {
		return terrain2CageGBut;
	}
	public void setTerrain2CageGBut(int terrain2CageGBut) {
		this.terrain2CageGBut = terrain2CageGBut;
	}
	public int getTerrain2CageGpasBut() {
		return terrain2CageGpasBut;
	}
	public void setTerrain2CageGpasBut(int terrain2CageGpasBut) {
		this.terrain2CageGpasBut = terrain2CageGpasBut;
	}
	public int getTerrain2CageHBut() {
		return terrain2CageHBut;
	}
	public void setTerrain2CageHBut(int terrain2CageHBut) {
		this.terrain2CageHBut = terrain2CageHBut;
	}
	public int getTerrain2CageHpasBut() {
		return terrain2CageHpasBut;
	}
	public void setTerrain2CageHpasBut(int terrain2CageHpasBut) {
		this.terrain2CageHpasBut = terrain2CageHpasBut;
	}
	public int getTerrain2CageIBut() {
		return terrain2CageIBut;
	}
	public void setTerrain2CageIBut(int terrain2CageIBut) {
		this.terrain2CageIBut = terrain2CageIBut;
	}
	public int getTerrain2CageIpasBut() {
		return terrain2CageIpasBut;
	}
	public void setTerrain2CageIpasBut(int terrain2CageIpasBut) {
		this.terrain2CageIpasBut = terrain2CageIpasBut;
	}
	public int getTerrain3CageABut() {
		return terrain3CageABut;
	}
	public void setTerrain3CageABut(int terrain3CageABut) {
		this.terrain3CageABut = terrain3CageABut;
	}
	public int getTerrain3CageApasBut() {
		return terrain3CageApasBut;
	}
	public void setTerrain3CageApasBut(int terrain3CageApasBut) {
		this.terrain3CageApasBut = terrain3CageApasBut;
	}
	public int getTerrain3CageBBut() {
		return terrain3CageBBut;
	}
	public void setTerrain3CageBBut(int terrain3CageBBut) {
		this.terrain3CageBBut = terrain3CageBBut;
	}
	public int getTerrain3CageBpasBut() {
		return terrain3CageBpasBut;
	}
	public void setTerrain3CageBpasBut(int terrain3CageBpasBut) {
		this.terrain3CageBpasBut = terrain3CageBpasBut;
	}
	public int getTerrain3CageCBut() {
		return terrain3CageCBut;
	}
	public void setTerrain3CageCBut(int terrain3CageCBut) {
		this.terrain3CageCBut = terrain3CageCBut;
	}
	public int getTerrain3CageCpasBut() {
		return terrain3CageCpasBut;
	}
	public void setTerrain3CageCpasBut(int terrain3CageCpasBut) {
		this.terrain3CageCpasBut = terrain3CageCpasBut;
	}
	public int getTerrain3CageDBut() {
		return terrain3CageDBut;
	}
	public void setTerrain3CageDBut(int terrain3CageDBut) {
		this.terrain3CageDBut = terrain3CageDBut;
	}
	public int getTerrain3CageDpasBut() {
		return terrain3CageDpasBut;
	}
	public void setTerrain3CageDpasBut(int terrain3CageDpasBut) {
		this.terrain3CageDpasBut = terrain3CageDpasBut;
	}
	public int getTerrain3CageEBut() {
		return terrain3CageEBut;
	}
	public void setTerrain3CageEBut(int terrain3CageEBut) {
		this.terrain3CageEBut = terrain3CageEBut;
	}
	public int getTerrain3CageEpasBut() {
		return terrain3CageEpasBut;
	}
	public void setTerrain3CageEpasBut(int terrain3CageEpasBut) {
		this.terrain3CageEpasBut = terrain3CageEpasBut;
	}
	public int getTerrain3CageFBut() {
		return terrain3CageFBut;
	}
	public void setTerrain3CageFBut(int terrain3CageFBut) {
		this.terrain3CageFBut = terrain3CageFBut;
	}
	public int getTerrain3CageFpasBut() {
		return terrain3CageFpasBut;
	}
	public void setTerrain3CageFpasBut(int terrain3CageFpasBut) {
		this.terrain3CageFpasBut = terrain3CageFpasBut;
	}
	public int getTerrain3CageGBut() {
		return terrain3CageGBut;
	}
	public void setTerrain3CageGBut(int terrain3CageGBut) {
		this.terrain3CageGBut = terrain3CageGBut;
	}
	public int getTerrain3CageGpasBut() {
		return terrain3CageGpasBut;
	}
	public void setTerrain3CageGpasBut(int terrain3CageGpasBut) {
		this.terrain3CageGpasBut = terrain3CageGpasBut;
	}
	public int getTerrain3CageHBut() {
		return terrain3CageHBut;
	}
	public void setTerrain3CageHBut(int terrain3CageHBut) {
		this.terrain3CageHBut = terrain3CageHBut;
	}
	public int getTerrain3CageHpasBut() {
		return terrain3CageHpasBut;
	}
	public void setTerrain3CageHpasBut(int terrain3CageHpasBut) {
		this.terrain3CageHpasBut = terrain3CageHpasBut;
	}
	public int getTerrain3CageIBut() {
		return terrain3CageIBut;
	}
	public void setTerrain3CageIBut(int terrain3CageIBut) {
		this.terrain3CageIBut = terrain3CageIBut;
	}
	public int getTerrain3CageIpasBut() {
		return terrain3CageIpasBut;
	}
	public void setTerrain3CageIpasBut(int terrain3CageIpasBut) {
		this.terrain3CageIpasBut = terrain3CageIpasBut;
	}
	public int getTerrain4CageABut() {
		return terrain4CageABut;
	}
	public void setTerrain4CageABut(int terrain4CageABut) {
		this.terrain4CageABut = terrain4CageABut;
	}
	public int getTerrain4CageApasBut() {
		return terrain4CageApasBut;
	}
	public void setTerrain4CageApasBut(int terrain4CageApasBut) {
		this.terrain4CageApasBut = terrain4CageApasBut;
	}
	public int getTerrain4CageBBut() {
		return terrain4CageBBut;
	}
	public void setTerrain4CageBBut(int terrain4CageBBut) {
		this.terrain4CageBBut = terrain4CageBBut;
	}
	public int getTerrain4CageBpasBut() {
		return terrain4CageBpasBut;
	}
	public void setTerrain4CageBpasBut(int terrain4CageBpasBut) {
		this.terrain4CageBpasBut = terrain4CageBpasBut;
	}
	public int getTerrain4CageCBut() {
		return terrain4CageCBut;
	}
	public void setTerrain4CageCBut(int terrain4CageCBut) {
		this.terrain4CageCBut = terrain4CageCBut;
	}
	public int getTerrain4CageCpasBut() {
		return terrain4CageCpasBut;
	}
	public void setTerrain4CageCpasBut(int terrain4CageCpasBut) {
		this.terrain4CageCpasBut = terrain4CageCpasBut;
	}
	public int getTerrain4CageDBut() {
		return terrain4CageDBut;
	}
	public void setTerrain4CageDBut(int terrain4CageDBut) {
		this.terrain4CageDBut = terrain4CageDBut;
	}
	public int getTerrain4CageDpasBut() {
		return terrain4CageDpasBut;
	}
	public void setTerrain4CageDpasBut(int terrain4CageDpasBut) {
		this.terrain4CageDpasBut = terrain4CageDpasBut;
	}
	public int getTerrain4CageEBut() {
		return terrain4CageEBut;
	}
	public void setTerrain4CageEBut(int terrain4CageEBut) {
		this.terrain4CageEBut = terrain4CageEBut;
	}
	public int getTerrain4CageEpasBut() {
		return terrain4CageEpasBut;
	}
	public void setTerrain4CageEpasBut(int terrain4CageEpasBut) {
		this.terrain4CageEpasBut = terrain4CageEpasBut;
	}
	public int getTerrain4CageFBut() {
		return terrain4CageFBut;
	}
	public void setTerrain4CageFBut(int terrain4CageFBut) {
		this.terrain4CageFBut = terrain4CageFBut;
	}
	public int getTerrain4CageFpasBut() {
		return terrain4CageFpasBut;
	}
	public void setTerrain4CageFpasBut(int terrain4CageFpasBut) {
		this.terrain4CageFpasBut = terrain4CageFpasBut;
	}
	public int getTerrain4CageGBut() {
		return terrain4CageGBut;
	}
	public void setTerrain4CageGBut(int terrain4CageGBut) {
		this.terrain4CageGBut = terrain4CageGBut;
	}
	public int getTerrain4CageGpasBut() {
		return terrain4CageGpasBut;
	}
	public void setTerrain4CageGpasBut(int terrain4CageGpasBut) {
		this.terrain4CageGpasBut = terrain4CageGpasBut;
	}
	public int getTerrain4CageHBut() {
		return terrain4CageHBut;
	}
	public void setTerrain4CageHBut(int terrain4CageHBut) {
		this.terrain4CageHBut = terrain4CageHBut;
	}
	public int getTerrain4CageHpasBut() {
		return terrain4CageHpasBut;
	}
	public void setTerrain4CageHpasBut(int terrain4CageHpasBut) {
		this.terrain4CageHpasBut = terrain4CageHpasBut;
	}
	public int getTerrain4CageIBut() {
		return terrain4CageIBut;
	}
	public void setTerrain4CageIBut(int terrain4CageIBut) {
		this.terrain4CageIBut = terrain4CageIBut;
	}
	public int getTerrain4CageIpasBut() {
		return terrain4CageIpasBut;
	}
	public void setTerrain4CageIpasBut(int terrain4CageIpasBut) {
		this.terrain4CageIpasBut = terrain4CageIpasBut;
	}
	public int getTerrain5CageABut() {
		return terrain5CageABut;
	}
	public void setTerrain5CageABut(int terrain5CageABut) {
		this.terrain5CageABut = terrain5CageABut;
	}
	public int getTerrain5CageApasBut() {
		return terrain5CageApasBut;
	}
	public void setTerrain5CageApasBut(int terrain5CageApasBut) {
		this.terrain5CageApasBut = terrain5CageApasBut;
	}
	public int getTerrain5CageBBut() {
		return terrain5CageBBut;
	}
	public void setTerrain5CageBBut(int terrain5CageBBut) {
		this.terrain5CageBBut = terrain5CageBBut;
	}
	public int getTerrain5CageBpasBut() {
		return terrain5CageBpasBut;
	}
	public void setTerrain5CageBpasBut(int terrain5CageBpasBut) {
		this.terrain5CageBpasBut = terrain5CageBpasBut;
	}
	public int getTerrain5CageCBut() {
		return terrain5CageCBut;
	}
	public void setTerrain5CageCBut(int terrain5CageCBut) {
		this.terrain5CageCBut = terrain5CageCBut;
	}
	public int getTerrain5CageCpasBut() {
		return terrain5CageCpasBut;
	}
	public void setTerrain5CageCpasBut(int terrain5CageCpasBut) {
		this.terrain5CageCpasBut = terrain5CageCpasBut;
	}
	public int getTerrain5CageDBut() {
		return terrain5CageDBut;
	}
	public void setTerrain5CageDBut(int terrain5CageDBut) {
		this.terrain5CageDBut = terrain5CageDBut;
	}
	public int getTerrain5CageDpasBut() {
		return terrain5CageDpasBut;
	}
	public void setTerrain5CageDpasBut(int terrain5CageDpasBut) {
		this.terrain5CageDpasBut = terrain5CageDpasBut;
	}
	public int getTerrain5CageEBut() {
		return terrain5CageEBut;
	}
	public void setTerrain5CageEBut(int terrain5CageEBut) {
		this.terrain5CageEBut = terrain5CageEBut;
	}
	public int getTerrain5CageEpasBut() {
		return terrain5CageEpasBut;
	}
	public void setTerrain5CageEpasBut(int terrain5CageEpasBut) {
		this.terrain5CageEpasBut = terrain5CageEpasBut;
	}
	public int getTerrain5CageFBut() {
		return terrain5CageFBut;
	}
	public void setTerrain5CageFBut(int terrain5CageFBut) {
		this.terrain5CageFBut = terrain5CageFBut;
	}
	public int getTerrain5CageFpasBut() {
		return terrain5CageFpasBut;
	}
	public void setTerrain5CageFpasBut(int terrain5CageFpasBut) {
		this.terrain5CageFpasBut = terrain5CageFpasBut;
	}
	public int getTerrain5CageGBut() {
		return terrain5CageGBut;
	}
	public void setTerrain5CageGBut(int terrain5CageGBut) {
		this.terrain5CageGBut = terrain5CageGBut;
	}
	public int getTerrain5CageGpasBut() {
		return terrain5CageGpasBut;
	}
	public void setTerrain5CageGpasBut(int terrain5CageGpasBut) {
		this.terrain5CageGpasBut = terrain5CageGpasBut;
	}
	public int getTerrain5CageHBut() {
		return terrain5CageHBut;
	}
	public void setTerrain5CageHBut(int terrain5CageHBut) {
		this.terrain5CageHBut = terrain5CageHBut;
	}
	public int getTerrain5CageHpasBut() {
		return terrain5CageHpasBut;
	}
	public void setTerrain5CageHpasBut(int terrain5CageHpasBut) {
		this.terrain5CageHpasBut = terrain5CageHpasBut;
	}
	public int getTerrain5CageIBut() {
		return terrain5CageIBut;
	}
	public void setTerrain5CageIBut(int terrain5CageIBut) {
		this.terrain5CageIBut = terrain5CageIBut;
	}
	public int getTerrain5CageIpasBut() {
		return terrain5CageIpasBut;
	}
	public void setTerrain5CageIpasBut(int terrain5CageIpasBut) {
		this.terrain5CageIpasBut = terrain5CageIpasBut;
	}
	public int getTerrain6CageABut() {
		return terrain6CageABut;
	}
	public void setTerrain6CageABut(int terrain6CageABut) {
		this.terrain6CageABut = terrain6CageABut;
	}
	public int getTerrain6CageApasBut() {
		return terrain6CageApasBut;
	}
	public void setTerrain6CageApasBut(int terrain6CageApasBut) {
		this.terrain6CageApasBut = terrain6CageApasBut;
	}
	public int getTerrain6CageBBut() {
		return terrain6CageBBut;
	}
	public void setTerrain6CageBBut(int terrain6CageBBut) {
		this.terrain6CageBBut = terrain6CageBBut;
	}
	public int getTerrain6CageBpasBut() {
		return terrain6CageBpasBut;
	}
	public void setTerrain6CageBpasBut(int terrain6CageBpasBut) {
		this.terrain6CageBpasBut = terrain6CageBpasBut;
	}
	public int getTerrain6CageCBut() {
		return terrain6CageCBut;
	}
	public void setTerrain6CageCBut(int terrain6CageCBut) {
		this.terrain6CageCBut = terrain6CageCBut;
	}
	public int getTerrain6CageCpasBut() {
		return terrain6CageCpasBut;
	}
	public void setTerrain6CageCpasBut(int terrain6CageCpasBut) {
		this.terrain6CageCpasBut = terrain6CageCpasBut;
	}
	public int getTerrain6CageDBut() {
		return terrain6CageDBut;
	}
	public void setTerrain6CageDBut(int terrain6CageDBut) {
		this.terrain6CageDBut = terrain6CageDBut;
	}
	public int getTerrain6CageDpasBut() {
		return terrain6CageDpasBut;
	}
	public void setTerrain6CageDpasBut(int terrain6CageDpasBut) {
		this.terrain6CageDpasBut = terrain6CageDpasBut;
	}
	public int getTerrain6CageEBut() {
		return terrain6CageEBut;
	}
	public void setTerrain6CageEBut(int terrain6CageEBut) {
		this.terrain6CageEBut = terrain6CageEBut;
	}
	public int getTerrain6CageEpasBut() {
		return terrain6CageEpasBut;
	}
	public void setTerrain6CageEpasBut(int terrain6CageEpasBut) {
		this.terrain6CageEpasBut = terrain6CageEpasBut;
	}
	public int getTerrain6CageFBut() {
		return terrain6CageFBut;
	}
	public void setTerrain6CageFBut(int terrain6CageFBut) {
		this.terrain6CageFBut = terrain6CageFBut;
	}
	public int getTerrain6CageFpasBut() {
		return terrain6CageFpasBut;
	}
	public void setTerrain6CageFpasBut(int terrain6CageFpasBut) {
		this.terrain6CageFpasBut = terrain6CageFpasBut;
	}
	public int getTerrain6CageGBut() {
		return terrain6CageGBut;
	}
	public void setTerrain6CageGBut(int terrain6CageGBut) {
		this.terrain6CageGBut = terrain6CageGBut;
	}
	public int getTerrain6CageGpasBut() {
		return terrain6CageGpasBut;
	}
	public void setTerrain6CageGpasBut(int terrain6CageGpasBut) {
		this.terrain6CageGpasBut = terrain6CageGpasBut;
	}
	public int getTerrain6CageHBut() {
		return terrain6CageHBut;
	}
	public void setTerrain6CageHBut(int terrain6CageHBut) {
		this.terrain6CageHBut = terrain6CageHBut;
	}
	public int getTerrain6CageHpasBut() {
		return terrain6CageHpasBut;
	}
	public void setTerrain6CageHpasBut(int terrain6CageHpasBut) {
		this.terrain6CageHpasBut = terrain6CageHpasBut;
	}
	public int getTerrain6CageIBut() {
		return terrain6CageIBut;
	}
	public void setTerrain6CageIBut(int terrain6CageIBut) {
		this.terrain6CageIBut = terrain6CageIBut;
	}
	public int getTerrain6CageIpasBut() {
		return terrain6CageIpasBut;
	}
	public void setTerrain6CageIpasBut(int terrain6CageIpasBut) {
		this.terrain6CageIpasBut = terrain6CageIpasBut;
	}
	public String getZoneDeTire() {
		return zoneDeTire;
	}
	public void setZoneDeTire(String zoneDeTire) {
		this.zoneDeTire = zoneDeTire;
	}
	
	

}
