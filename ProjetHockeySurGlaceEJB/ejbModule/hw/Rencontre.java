/**
 * 
 */
package hw;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author KP
 *
 */
@Entity
public class Rencontre {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int id;
	
	private int idEquipe;
	private int idGardien;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	public int getIdGardien() {
		return idGardien;
	}
	public void setIdGardien(int idGardien) {
		this.idGardien = idGardien;
	}
	

}