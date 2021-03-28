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
public class Gardien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2015470704533427399L;
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO) 
	private int idGardien;
	private String nom;
	private String prenom;
	private int Age;
	private int idEquipe;
	public Gardien() {}
	public Gardien(int idGardien, String nom) {
		super();
		this.idGardien = idGardien;
		this.nom = nom;
	}
	
	public Gardien(int idGardien, String prenom, String nom) {
		super();
		this.idGardien = idGardien;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getIdGardien() {
		return idGardien;
	}
	public void setIdGardien(int idGardien) {
		this.idGardien = idGardien;
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	
	@Override
    public String toString() {
        return MessageFormat.format("{1} {2}", getIdGardien(),getPrenom(),getNom());
    }
	
	 
	

}
