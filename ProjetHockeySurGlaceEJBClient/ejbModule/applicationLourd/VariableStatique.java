/**
 * 
 */
package applicationLourd;

import java.util.List;
import java.util.Set;

import hw.Gardien;

/**
 * @author KP
 *
 */
public class VariableStatique {
	private static boolean choixDuMatchIsOpen = false;
	private static boolean ApplicationSaisieScoreIsOpen = false;
	private static boolean choixDuGardienIsOpen = false;
	private static boolean changerGardien = false;
	private static int idUtilisteur;
	private static int idGardien;
	private static int idGardienEntrant;
	private static int idRencontre;
	private static int idMonEquipe;
	private static int nomMonEquipe;
	private static int idEquipeAdvers;
	private static List<Gardien> listeGardientEntrant;
	private static List<Gardien> listeTousLesGardiens;
	private static Set<Gardien> listedesGradiensSurTerrain;
	private static Gardien GradienEntrant;
	
	public static boolean isChoixDuMatchIsOpen() {
		return choixDuMatchIsOpen;
	}
	public static void setChoixDuMatchIsOpen(boolean choixDuMatchIsOpen) {
		VariableStatique.choixDuMatchIsOpen = choixDuMatchIsOpen;
	}
	public static boolean isApplicationSaisieScoreIsOpen() {
		return ApplicationSaisieScoreIsOpen;
	}
	public static void setApplicationSaisieScoreIsOpen(boolean applicationSaisieScoreIsOpen) {
		ApplicationSaisieScoreIsOpen = applicationSaisieScoreIsOpen;
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
	public static Set<Gardien> getListedesGradiensSurTerrain() {
		return listedesGradiensSurTerrain;
	}
	public static void setListedesGradiensSurTerrain(Set<Gardien> listedesGradiensSurTerrain) {
		VariableStatique.listedesGradiensSurTerrain = listedesGradiensSurTerrain;
	}
	public static int getIdGardienEntrant() {
		return idGardienEntrant;
	}
	public static void setIdGardienEntrant(int idGardienEntrant) {
		VariableStatique.idGardienEntrant = idGardienEntrant;
	}
	public static Gardien getGradienEntrant() {
		return GradienEntrant;
	}
	public static void setGradienEntrant(Gardien gradienEntrant) {
		GradienEntrant = gradienEntrant;
	}
	public static int getNomMonEquipe() {
		return nomMonEquipe;
	}
	public static void setNomMonEquipe(int nomMonEquipe) {
		VariableStatique.nomMonEquipe = nomMonEquipe;
	}
	public static boolean isChoixDuGardienIsOpen() {
		return choixDuGardienIsOpen;
	}
	public static void setChoixDuGardienIsOpen(boolean choixDuGardienIsOpen) {
		VariableStatique.choixDuGardienIsOpen = choixDuGardienIsOpen;
	}
	public static boolean isChangerGardien() {
		return changerGardien;
	}
	public static void setChangerGardien(boolean changerGardien) {
		VariableStatique.changerGardien = changerGardien;
	}
	

	

	

}
