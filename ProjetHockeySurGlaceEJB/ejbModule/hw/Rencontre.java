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
public class Rencontre implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int id;

	private int idEquipe1;
	private int idEquipe2;
	private int idGardien;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEquipe1() {
		return idEquipe1;
	}
	public void setIdEquipe1(int idEquipe1) {
		this.idEquipe1 = idEquipe1;
	}
	public int getIdGardien() {
		return idGardien;
	}
	public void setIdGardien(int idGardien) {
		this.idGardien = idGardien;
	}
	public int getIdEquipe2() {
		return idEquipe2;
	}
	public void setIdEquipe2(int idEquipe2) {
		this.idEquipe2 = idEquipe2;
	}
	

}
