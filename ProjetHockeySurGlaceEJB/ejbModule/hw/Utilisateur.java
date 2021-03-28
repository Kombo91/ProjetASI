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

public class Utilisateur implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2880116244664490551L;
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int idUtilisateur;
	private String nom;
	private String prenom;
	private String pseudo;
	private String mots_de_passe;
	private boolean est_connecte;
	private int idEquipe;
	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(String pseudo, String mots_de_passe) {
		super();
		this.pseudo = pseudo;
		this.mots_de_passe = mots_de_passe;
	}

	public Utilisateur(String nom,String prenom,String pseudo,String pwd) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.nom = pwd;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMots_de_passe() {
		return mots_de_passe;
	}
	public void setMots_de_passe(String mots_de_passe) {
		this.mots_de_passe = mots_de_passe;
	}
	@Override
	public String toString() {
		return "User [id=" + idUtilisateur + ", identifiant=" + pseudo
				+ ", password=" + mots_de_passe + "]";
	}
	public boolean isEst_connecte() {
		return est_connecte;
	}
	public void setEst_connecte(boolean est_connecte) {
		this.est_connecte = est_connecte;
	}

	public int getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	

}
