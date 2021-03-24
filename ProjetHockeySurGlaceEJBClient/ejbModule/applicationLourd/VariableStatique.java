/**
 * 
 */
package applicationLourd;

import java.util.List;

import hw.Gardien;

/**
 * @author KP
 *
 */
public class VariableStatique {
	private static boolean choixDuMatchInOpen = false;
	private static boolean ApplicationSaisieScore = false;
	private static boolean ajouterGardienALaListeSurTerrain = false;
	private static int idUtilisteur;
	private static int idGardien;
	private static int idGardienEntrant;
	private static int idRencontre;
	private static int idMonEquipe;
	private static int idEquipeAdvers;
	private static List<Gardien> listeGardientEntrant;
	private static List<Gardien> listeTousLesGardiens;
	private static List<Gardien> listedesGradiensSurTerrain;
	private static Gardien GradienEntrant;
	
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
	public static List<Gardien> getListeGardientEntrant() {
		return listeGardientEntrant;
	}
	public static void setListeGardientEntrant(List<Gardien> listeGardientEntrant) {
		VariableStatique.listeGardientEntrant = listeGardientEntrant;
	}
	public static List<Gardien> getListeTousLesGardiens() {
		return listeTousLesGardiens;
	}
	public static void setListeTousLesGardiens(List<Gardien> listeTousLesGardiens) {
		VariableStatique.listeTousLesGardiens = listeTousLesGardiens;
	}
	public static List<Gardien> getListedesGradiensSurTerrain() {
		return listedesGradiensSurTerrain;
	}
	public static void setListedesGradiensSurTerrain(List<Gardien> listedesGradiensSurTerrain) {
		VariableStatique.listedesGradiensSurTerrain = listedesGradiensSurTerrain;
	}
	public static int getIdGardienEntrant() {
		return idGardienEntrant;
	}
	public static void setIdGardienEntrant(int idGardienEntrant) {
		VariableStatique.idGardienEntrant = idGardienEntrant;
	}
	public static boolean isAjouterGardienALaListeSurTerrain() {
		return ajouterGardienALaListeSurTerrain;
	}
	public static void setAjouterGardienALaListeSurTerrain(boolean ajouterGardienALaListeSurTerrain) {
		VariableStatique.ajouterGardienALaListeSurTerrain = ajouterGardienALaListeSurTerrain;
	}
	public static Gardien getGradienEntrant() {
		return GradienEntrant;
	}
	public static void setGradienEntrant(Gardien gradienEntrant) {
		GradienEntrant = gradienEntrant;
	}
	

	

	

}
