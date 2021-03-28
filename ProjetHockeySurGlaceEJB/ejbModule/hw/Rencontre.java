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
public class Rencontre implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8121144136904801500L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int idRencontre;

	private int idMonEquipe;
	private int idEquipeAdvers;
	private String statueRencontre;
	
	public Rencontre(int eq1,int eq2) {
		this.idMonEquipe = eq1; 
		this.idEquipeAdvers = eq2;
		this.statueRencontre = "En cours";
	}
	/**
	 * 
	 */
	public Rencontre() {
		// TODO Auto-generated constructor stub
	}
	public int getIdRencontre() {
		return idRencontre;
	}
	public void setIdRencontre(int idRencontre) {
		this.idRencontre = idRencontre;
	}
	public int getIdMonEquipe() {
		return idMonEquipe;
	}
	public void setIdMonEquipe(int idMonEquipe) {
		this.idMonEquipe = idMonEquipe;
	}

	public int getIdEquipeAdvers() {
		return idEquipeAdvers;
	}
	public void setIdEquipeAdvers(int idEquipeAdvers) {
		this.idEquipeAdvers = idEquipeAdvers;
	}
	public String getStatueRencontre() {
		return statueRencontre;
	}
	public void setStatueRencontre(String statueRencontre) {
		this.statueRencontre = statueRencontre;
	}
	
	

}
