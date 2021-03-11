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
public class Equipe implements Serializable  {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int id;
	private String nomEquipe;
	
	public Equipe() {
		super();
	}
	public Equipe(String nomEquipe) {
		super();
		this.nomEquipe = nomEquipe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

}
