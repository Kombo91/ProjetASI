/**
 * 
 */
package applicationLourd;

/**
 * @author KP
 *
 */
public class VariableStatique {
	private static boolean choixDuMatchInOpen = false;
	private static boolean ApplicationSaisieScore = false;
	private static int idUtilisteur;
	private static int idGardien;
	private static int idRencontre;
	private static int idMonEquipe;
	private static int idEquipeAdvers;
	
	public static boolean isChoixDuMatchInOpen() {
		return choixDuMatchInOpen;
	}
	public static void setChoixDuMatchInOpen(boolean choixDuMatchInOpen) {
		VariableStatique.choixDuMatchInOpen = choixDuMatchInOpen;
	}
	public static boolean isApplicationSaisieScore() {
		return ApplicationSaisieScore;
	}
	public static void setApplicationSaisieScore(boolean applicationSaisieScore) {
		ApplicationSaisieScore = applicationSaisieScore;
	}
	public static int getIdUtilisteur() {
		return idUtilisteur;
	}
	public static void setIdUtilisteur(int idUtilisteur) {
		VariableStatique.idUtilisteur = idUtilisteur;
	}
	public static int getIdGardien() {
		return idGardien;
	}
	public static void setIdGardien(int idGardien) {
		VariableStatique.idGardien = idGardien;
	}
	public static int getIdRencontre() {
		return idRencontre;
	}
	public static void setIdRencontre(int idRencontre) {
		VariableStatique.idRencontre = idRencontre;
	}
	public static int getIdMonEquipe() {
		return idMonEquipe;
	}
	public static void setIdMonEquipe(int idMonEquipe) {
		VariableStatique.idMonEquipe = idMonEquipe;
	}
	public static int getIdEquipeAdvers() {
		return idEquipeAdvers;
	}
	public static void setIdEquipeAdvers(int idEquipeAdvers) {
		VariableStatique.idEquipeAdvers = idEquipeAdvers;
	}
	

	

	

}
