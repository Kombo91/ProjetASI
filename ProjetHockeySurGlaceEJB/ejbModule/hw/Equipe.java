/**
 * 
 */
package hw;

import java.io.Serializable;
import java.text.MessageFormat;

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
	/**
	 * 
	 */
	private static final long serialVersionUID = -7213564531966500970L;
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int idEquipe;
	private String nomEquipe;
	
	public Equipe(int idEquipe, String nomEquipe) {
		super();
		this.idEquipe = idEquipe;
		this.nomEquipe = nomEquipe;
	}
	public Equipe() {
		super();
	}
	public Equipe(String nomEquipe) {
		super();
		this.nomEquipe = nomEquipe;
	}
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	 @Override
     public String toString() {
         return MessageFormat.format("{1}", getIdEquipe(),getNomEquipe());
     }
}
