/**
 * 
 */
package managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import org.richfaces.model.ChartDataModel;

import org.richfaces.model.StringChartDataModel;

import hw.Equipe;
import hw.Gardien;
import hw.GestionEquipeRemote;
import hw.GestionGardienRemote;
import hw.GestionScoreDeMatchRemote;
import hw.ScoreDeMatch;

/**
 * @author KP
 *
 */
@Named("applicatioAnalyseDesDonnDesBean")
@SessionScoped

public class ApplicatioAnalyseDesDonnDesBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GestionEquipeRemote gestionEquipe;
	private GestionGardienRemote gestionGardien;
	private GestionScoreDeMatchRemote gestionScoreDeMatch;
	private Collection<hw.Equipe> lesEquipes = new ArrayList<Equipe>();
	private Collection<hw.Gardien> lesGardien = new ArrayList<Gardien>();
	private Collection<hw.ScoreDeMatch> lesScoreDeMatch = new ArrayList<ScoreDeMatch>();
	private String currentType = "";
	private List<SelectItem> listEquipe = new ArrayList<SelectItem>();
	private List<SelectItem> listGradien = new ArrayList<SelectItem>();
	private List<SelectItem> listZoneTerrain = new ArrayList<SelectItem>();
	private List<SelectItem> listZoneCage = new ArrayList<SelectItem>();
	private StringChartDataModel pie;
	private int idEquipeChoisi;
	private int idGardien;
	

	public ApplicatioAnalyseDesDonnDesBean() {
		listeDesEquipes();
		gestionScoreDeMatch = EjbLocator.getLocator().getGestionScoreDeMatch();
		pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
		
	}

	////////////////////// Liste Equipe //////////////////////
	public void listeDesEquipes() {
		SelectItem item = new SelectItem("", "");
		listEquipe.add(item);
		gestionEquipe = EjbLocator.getLocator().getGestionEquipe();
		if (gestionEquipe != null) {
			lesEquipes = gestionEquipe.listerEquipe();
			for (Equipe eq : lesEquipes) {
				item = new SelectItem(eq.getIdEquipe(), eq.getNomEquipe());
				listEquipe.add(item);
			}
		}
	}

	public void choisirEquipe(ValueChangeEvent event) {
		idEquipeChoisi = Integer.parseInt((String) event.getNewValue());
		System.out.println("idEquipeChoisi : "+idEquipeChoisi);
		listGradien.clear();
		SelectItem item = new SelectItem("", "");
		listGradien.add(item);
		if (event.getNewValue() != null) {
			gestionGardien = EjbLocator.getLocator().getGestionGardien();
			if (gestionGardien != null) {
				lesGardien = gestionGardien.listerGardien(idEquipeChoisi);				
				for (Gardien gard : lesGardien) {
					item = new SelectItem(gard.getIdGardien(), gard.getPrenom() +" "+gard.getNom() );
					listGradien.add(item);
				}

			}
		}
	}
	public void choisirGadien(ValueChangeEvent event) {
		if (event.getNewValue() != null) {
		idGardien = Integer.parseInt((String) event.getNewValue());
		System.out.println("idGardien " +idGardien );
		pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
		lesScoreDeMatch = gestionScoreDeMatch.staticDUnGardienParRaportAUnMatch(idGardien,idEquipeChoisi);
		int lancersDepuisTerrain1 = 0;
		int lancersDepuisTerrain2 = 0;
		int lancersDepuisTerrain3 = 0;
		int lancersDepuisTerrain4 = 0;
		int lancersDepuisTerrain5 = 0;
		int lancersDepuisTerrain6 = 0;
		
		
		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			lancersDepuisTerrain1 += 	  terrain.getTerrain1CageABut() 	+ terrain.getTerrain1CageApasBut() 
						+ terrain.getTerrain1CageBBut()		+ terrain.getTerrain1CageBpasBut()						 
						+ terrain.getTerrain1CageCBut()		+ terrain.getTerrain1CageCpasBut()						 
						+ terrain.getTerrain1CageDBut()		+ terrain.getTerrain1CageDpasBut()						 
						+ terrain.getTerrain1CageEBut()		+ terrain.getTerrain1CageEpasBut()						 
						+ terrain.getTerrain1CageFBut()		+ terrain.getTerrain1CageFpasBut()						 
						+ terrain.getTerrain1CageGBut()		+ terrain.getTerrain1CageGpasBut()						 
						+ terrain.getTerrain1CageHBut()		+ terrain.getTerrain1CageHpasBut()						 
						+ terrain.getTerrain1CageIBut()		+ terrain.getTerrain1CageIpasBut();
						
			lancersDepuisTerrain2 += 	  terrain.getTerrain2CageABut() 	+ terrain.getTerrain2CageApasBut() 
						+ terrain.getTerrain2CageBBut()		+ terrain.getTerrain2CageBpasBut()						 
						+ terrain.getTerrain2CageCBut()		+ terrain.getTerrain2CageCpasBut()						 
						+ terrain.getTerrain2CageDBut()		+ terrain.getTerrain2CageDpasBut()						 
						+ terrain.getTerrain2CageEBut()		+ terrain.getTerrain2CageEpasBut()						 
						+ terrain.getTerrain2CageFBut()		+ terrain.getTerrain2CageFpasBut()						 
						+ terrain.getTerrain2CageGBut()		+ terrain.getTerrain2CageGpasBut()						 
						+ terrain.getTerrain2CageHBut()		+ terrain.getTerrain2CageHpasBut()						 
						+ terrain.getTerrain2CageIBut()		+ terrain.getTerrain2CageIpasBut();
			
			lancersDepuisTerrain3 += 	  terrain.getTerrain3CageABut() 	+ terrain.getTerrain3CageApasBut() 
						+ terrain.getTerrain3CageBBut()		+ terrain.getTerrain3CageBpasBut()						 
						+ terrain.getTerrain3CageCBut()		+ terrain.getTerrain3CageCpasBut()						 
						+ terrain.getTerrain3CageDBut()		+ terrain.getTerrain3CageDpasBut()						 
						+ terrain.getTerrain3CageEBut()		+ terrain.getTerrain3CageEpasBut()						 
						+ terrain.getTerrain3CageFBut()		+ terrain.getTerrain3CageFpasBut()						 
						+ terrain.getTerrain3CageGBut()		+ terrain.getTerrain3CageGpasBut()						 
						+ terrain.getTerrain3CageHBut()		+ terrain.getTerrain3CageHpasBut()						 
						+ terrain.getTerrain3CageIBut()		+ terrain.getTerrain3CageIpasBut();
			
			lancersDepuisTerrain4 += 	  terrain.getTerrain4CageABut() 	+ terrain.getTerrain4CageApasBut() 
						+ terrain.getTerrain4CageBBut()		+ terrain.getTerrain4CageBpasBut()						 
						+ terrain.getTerrain4CageCBut()		+ terrain.getTerrain4CageCpasBut()						 
						+ terrain.getTerrain4CageDBut()		+ terrain.getTerrain4CageDpasBut()						 
						+ terrain.getTerrain4CageEBut()		+ terrain.getTerrain4CageEpasBut()						 
						+ terrain.getTerrain4CageFBut()		+ terrain.getTerrain4CageFpasBut()						 
						+ terrain.getTerrain4CageGBut()		+ terrain.getTerrain4CageGpasBut()						 
						+ terrain.getTerrain4CageHBut()		+ terrain.getTerrain4CageHpasBut()						 
						+ terrain.getTerrain4CageIBut()		+ terrain.getTerrain4CageIpasBut();
			
			lancersDepuisTerrain5 += 	  terrain.getTerrain5CageABut() 	+ terrain.getTerrain5CageApasBut() 
						+ terrain.getTerrain5CageBBut()		+ terrain.getTerrain5CageBpasBut()						 
						+ terrain.getTerrain5CageCBut()		+ terrain.getTerrain5CageCpasBut()						 
						+ terrain.getTerrain5CageDBut()		+ terrain.getTerrain5CageDpasBut()						 
						+ terrain.getTerrain5CageEBut()		+ terrain.getTerrain5CageEpasBut()						 
						+ terrain.getTerrain5CageFBut()		+ terrain.getTerrain5CageFpasBut()						 
						+ terrain.getTerrain5CageGBut()		+ terrain.getTerrain5CageGpasBut()						 
						+ terrain.getTerrain5CageHBut()		+ terrain.getTerrain5CageHpasBut()						 
						+ terrain.getTerrain5CageIBut()		+ terrain.getTerrain5CageIpasBut();			
			
			lancersDepuisTerrain6 += 	  terrain.getTerrain6CageABut() 	+ terrain.getTerrain6CageApasBut() 
						+ terrain.getTerrain6CageBBut()		+ terrain.getTerrain6CageBpasBut()						 
						+ terrain.getTerrain6CageCBut()		+ terrain.getTerrain6CageCpasBut()						 
						+ terrain.getTerrain6CageDBut()		+ terrain.getTerrain6CageDpasBut()						 
						+ terrain.getTerrain6CageEBut()		+ terrain.getTerrain6CageEpasBut()						 
						+ terrain.getTerrain6CageFBut()		+ terrain.getTerrain6CageFpasBut()						 
						+ terrain.getTerrain6CageGBut()		+ terrain.getTerrain6CageGpasBut()						 
						+ terrain.getTerrain6CageHBut()		+ terrain.getTerrain6CageHpasBut()						 
						+ terrain.getTerrain6CageIBut()		+ terrain.getTerrain6CageIpasBut();
		}
		System.out.println("Terrain 1 : " + lancersDepuisTerrain1);
		System.out.println("Terrain 2 : " + lancersDepuisTerrain2);
		System.out.println("Terrain 3 : " + lancersDepuisTerrain3);
		System.out.println("Terrain 4 : " + lancersDepuisTerrain4);
		System.out.println("Terrain 5 : " + lancersDepuisTerrain5);
		System.out.println("Terrain 6 : " + lancersDepuisTerrain6);
		
		pie.put("lancers depuis terrain 1", lancersDepuisTerrain1);
        pie.put("lancers depuis terrain 2", lancersDepuisTerrain2);
        pie.put("lancers depuis terrain 3", lancersDepuisTerrain3);
        pie.put("lancers depuis terrain 4", lancersDepuisTerrain4);
        pie.put("lancers depuis terrain 5", lancersDepuisTerrain5);
        pie.put("lancers depuis terrain 6", lancersDepuisTerrain6);
		
	
		}
		else {
			System.out.println("je suis nul");
		}
	        
	
	}
	
	
	public void lancersParZoneDeTir() {
		pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
		lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(1);
		int lancersDepuisTerrain1 = 0;
		int lancersDepuisTerrain2 = 0;
		int lancersDepuisTerrain3 = 0;
		int lancersDepuisTerrain4 = 0;
		int lancersDepuisTerrain5 = 0;
		int lancersDepuisTerrain6 = 0;
		
		
		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			lancersDepuisTerrain1 += 	  terrain.getTerrain1CageABut() 	+ terrain.getTerrain1CageApasBut() 
						+ terrain.getTerrain1CageBBut()		+ terrain.getTerrain1CageBpasBut()						 
						+ terrain.getTerrain1CageCBut()		+ terrain.getTerrain1CageCpasBut()						 
						+ terrain.getTerrain1CageDBut()		+ terrain.getTerrain1CageDpasBut()						 
						+ terrain.getTerrain1CageEBut()		+ terrain.getTerrain1CageEpasBut()						 
						+ terrain.getTerrain1CageFBut()		+ terrain.getTerrain1CageFpasBut()						 
						+ terrain.getTerrain1CageGBut()		+ terrain.getTerrain1CageGpasBut()						 
						+ terrain.getTerrain1CageHBut()		+ terrain.getTerrain1CageHpasBut()						 
						+ terrain.getTerrain1CageIBut()		+ terrain.getTerrain1CageIpasBut();
						
			lancersDepuisTerrain2 += 	  terrain.getTerrain2CageABut() 	+ terrain.getTerrain2CageApasBut() 
						+ terrain.getTerrain2CageBBut()		+ terrain.getTerrain2CageBpasBut()						 
						+ terrain.getTerrain2CageCBut()		+ terrain.getTerrain2CageCpasBut()						 
						+ terrain.getTerrain2CageDBut()		+ terrain.getTerrain2CageDpasBut()						 
						+ terrain.getTerrain2CageEBut()		+ terrain.getTerrain2CageEpasBut()						 
						+ terrain.getTerrain2CageFBut()		+ terrain.getTerrain2CageFpasBut()						 
						+ terrain.getTerrain2CageGBut()		+ terrain.getTerrain2CageGpasBut()						 
						+ terrain.getTerrain2CageHBut()		+ terrain.getTerrain2CageHpasBut()						 
						+ terrain.getTerrain2CageIBut()		+ terrain.getTerrain2CageIpasBut();
			
			lancersDepuisTerrain3 += 	  terrain.getTerrain3CageABut() 	+ terrain.getTerrain3CageApasBut() 
						+ terrain.getTerrain3CageBBut()		+ terrain.getTerrain3CageBpasBut()						 
						+ terrain.getTerrain3CageCBut()		+ terrain.getTerrain3CageCpasBut()						 
						+ terrain.getTerrain3CageDBut()		+ terrain.getTerrain3CageDpasBut()						 
						+ terrain.getTerrain3CageEBut()		+ terrain.getTerrain3CageEpasBut()						 
						+ terrain.getTerrain3CageFBut()		+ terrain.getTerrain3CageFpasBut()						 
						+ terrain.getTerrain3CageGBut()		+ terrain.getTerrain3CageGpasBut()						 
						+ terrain.getTerrain3CageHBut()		+ terrain.getTerrain3CageHpasBut()						 
						+ terrain.getTerrain3CageIBut()		+ terrain.getTerrain3CageIpasBut();
			
			lancersDepuisTerrain4 += 	  terrain.getTerrain4CageABut() 	+ terrain.getTerrain4CageApasBut() 
						+ terrain.getTerrain4CageBBut()		+ terrain.getTerrain4CageBpasBut()						 
						+ terrain.getTerrain4CageCBut()		+ terrain.getTerrain4CageCpasBut()						 
						+ terrain.getTerrain4CageDBut()		+ terrain.getTerrain4CageDpasBut()						 
						+ terrain.getTerrain4CageEBut()		+ terrain.getTerrain4CageEpasBut()						 
						+ terrain.getTerrain4CageFBut()		+ terrain.getTerrain4CageFpasBut()						 
						+ terrain.getTerrain4CageGBut()		+ terrain.getTerrain4CageGpasBut()						 
						+ terrain.getTerrain4CageHBut()		+ terrain.getTerrain4CageHpasBut()						 
						+ terrain.getTerrain4CageIBut()		+ terrain.getTerrain4CageIpasBut();
			
			lancersDepuisTerrain5 += 	  terrain.getTerrain5CageABut() 	+ terrain.getTerrain5CageApasBut() 
						+ terrain.getTerrain5CageBBut()		+ terrain.getTerrain5CageBpasBut()						 
						+ terrain.getTerrain5CageCBut()		+ terrain.getTerrain5CageCpasBut()						 
						+ terrain.getTerrain5CageDBut()		+ terrain.getTerrain5CageDpasBut()						 
						+ terrain.getTerrain5CageEBut()		+ terrain.getTerrain5CageEpasBut()						 
						+ terrain.getTerrain5CageFBut()		+ terrain.getTerrain5CageFpasBut()						 
						+ terrain.getTerrain5CageGBut()		+ terrain.getTerrain5CageGpasBut()						 
						+ terrain.getTerrain5CageHBut()		+ terrain.getTerrain5CageHpasBut()						 
						+ terrain.getTerrain5CageIBut()		+ terrain.getTerrain5CageIpasBut();			
			
			lancersDepuisTerrain6 += 	  terrain.getTerrain6CageABut() 	+ terrain.getTerrain6CageApasBut() 
						+ terrain.getTerrain6CageBBut()		+ terrain.getTerrain6CageBpasBut()						 
						+ terrain.getTerrain6CageCBut()		+ terrain.getTerrain6CageCpasBut()						 
						+ terrain.getTerrain6CageDBut()		+ terrain.getTerrain6CageDpasBut()						 
						+ terrain.getTerrain6CageEBut()		+ terrain.getTerrain6CageEpasBut()						 
						+ terrain.getTerrain6CageFBut()		+ terrain.getTerrain6CageFpasBut()						 
						+ terrain.getTerrain6CageGBut()		+ terrain.getTerrain6CageGpasBut()						 
						+ terrain.getTerrain6CageHBut()		+ terrain.getTerrain6CageHpasBut()						 
						+ terrain.getTerrain6CageIBut()		+ terrain.getTerrain6CageIpasBut();
		}
		System.out.println("Terrain 1 : " + lancersDepuisTerrain1);
		System.out.println("Terrain 2 : " + lancersDepuisTerrain2);
		System.out.println("Terrain 3 : " + lancersDepuisTerrain3);
		System.out.println("Terrain 4 : " + lancersDepuisTerrain4);
		System.out.println("Terrain 5 : " + lancersDepuisTerrain5);
		System.out.println("Terrain 6 : " + lancersDepuisTerrain6);
		
		pie.put("lancers depuis terrain 1", lancersDepuisTerrain1);
        pie.put("lancers depuis terrain 2", lancersDepuisTerrain2);
        pie.put("lancers depuis terrain 3", lancersDepuisTerrain3);
        pie.put("lancers depuis terrain 4", lancersDepuisTerrain4);
        pie.put("lancers depuis terrain 5", lancersDepuisTerrain5);
        pie.put("lancers depuis terrain 6", lancersDepuisTerrain6);
		
		
	}
	public void LancersParZoneDArret() {
		pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
		lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(1);
		int lancersVersCageA = 0;
		int lancersVersCageB = 0;
		int lancersVersCageC = 0;
		int lancersVersCageD = 0;
		int lancersVersCageE = 0;
		int lancersVersCageF = 0;
		int lancersVersCageG = 0;
		int lancersVersCageH = 0;
		int lancersVersCageI = 0;
		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			lancersVersCageA +=   terrain.getTerrain1CageABut() 	+ terrain.getTerrain1CageApasBut() 
					+ terrain.getTerrain2CageABut() 	+ terrain.getTerrain2CageApasBut() 
					+ terrain.getTerrain3CageABut() 	+ terrain.getTerrain3CageApasBut() 
					+ terrain.getTerrain4CageABut() 	+ terrain.getTerrain4CageApasBut() 
					+ terrain.getTerrain5CageABut() 	+ terrain.getTerrain5CageApasBut() 
					+ terrain.getTerrain6CageABut() 	+ terrain.getTerrain6CageApasBut();
			
			lancersVersCageB +=   terrain.getTerrain1CageBBut() 	+ terrain.getTerrain1CageBpasBut() 
					+ terrain.getTerrain2CageBBut() 	+ terrain.getTerrain2CageBpasBut() 
					+ terrain.getTerrain3CageBBut() 	+ terrain.getTerrain3CageBpasBut() 
					+ terrain.getTerrain4CageBBut() 	+ terrain.getTerrain4CageBpasBut() 
					+ terrain.getTerrain5CageBBut() 	+ terrain.getTerrain5CageBpasBut() 
					+ terrain.getTerrain6CageBBut() 	+ terrain.getTerrain6CageBpasBut();
			
			lancersVersCageC +=   terrain.getTerrain1CageCBut() 	+ terrain.getTerrain1CageCpasBut() 
					+ terrain.getTerrain2CageCBut() 	+ terrain.getTerrain2CageCpasBut() 
					+ terrain.getTerrain3CageCBut() 	+ terrain.getTerrain3CageCpasBut() 
					+ terrain.getTerrain4CageCBut() 	+ terrain.getTerrain4CageCpasBut() 
					+ terrain.getTerrain5CageCBut() 	+ terrain.getTerrain5CageCpasBut() 
					+ terrain.getTerrain6CageCBut() 	+ terrain.getTerrain6CageCpasBut();
			
			lancersVersCageD +=   terrain.getTerrain1CageDBut() 	+ terrain.getTerrain1CageDpasBut() 
					+ terrain.getTerrain2CageDBut() 	+ terrain.getTerrain2CageDpasBut() 
					+ terrain.getTerrain3CageDBut() 	+ terrain.getTerrain3CageDpasBut() 
					+ terrain.getTerrain4CageDBut() 	+ terrain.getTerrain4CageDpasBut() 
					+ terrain.getTerrain5CageDBut() 	+ terrain.getTerrain5CageDpasBut() 
					+ terrain.getTerrain6CageDBut() 	+ terrain.getTerrain6CageDpasBut();
			
			lancersVersCageE +=   terrain.getTerrain1CageEBut() 	+ terrain.getTerrain1CageEpasBut() 
					+ terrain.getTerrain2CageEBut() 	+ terrain.getTerrain2CageEpasBut() 
					+ terrain.getTerrain3CageEBut() 	+ terrain.getTerrain3CageEpasBut() 
					+ terrain.getTerrain4CageEBut() 	+ terrain.getTerrain4CageEpasBut() 
					+ terrain.getTerrain5CageEBut() 	+ terrain.getTerrain5CageEpasBut() 
					+ terrain.getTerrain6CageEBut() 	+ terrain.getTerrain6CageEpasBut();
			
			lancersVersCageF +=   terrain.getTerrain1CageFBut() 	+ terrain.getTerrain1CageFpasBut() 
					+ terrain.getTerrain2CageFBut() 	+ terrain.getTerrain2CageFpasBut() 
					+ terrain.getTerrain3CageFBut() 	+ terrain.getTerrain3CageFpasBut() 
					+ terrain.getTerrain4CageFBut() 	+ terrain.getTerrain4CageFpasBut() 
					+ terrain.getTerrain5CageFBut() 	+ terrain.getTerrain5CageFpasBut() 
					+ terrain.getTerrain6CageFBut() 	+ terrain.getTerrain6CageFpasBut();
			
			lancersVersCageG +=   terrain.getTerrain1CageGBut() 	+ terrain.getTerrain1CageGpasBut() 
					+ terrain.getTerrain2CageGBut() 	+ terrain.getTerrain2CageGpasBut() 
					+ terrain.getTerrain3CageGBut() 	+ terrain.getTerrain3CageGpasBut() 
					+ terrain.getTerrain4CageGBut() 	+ terrain.getTerrain4CageGpasBut() 
					+ terrain.getTerrain5CageGBut() 	+ terrain.getTerrain5CageGpasBut() 
					+ terrain.getTerrain6CageGBut() 	+ terrain.getTerrain6CageGpasBut();
			
			lancersVersCageH +=   terrain.getTerrain1CageHBut() 	+ terrain.getTerrain1CageHpasBut() 
					+ terrain.getTerrain2CageHBut() 	+ terrain.getTerrain2CageHpasBut() 
					+ terrain.getTerrain3CageHBut() 	+ terrain.getTerrain3CageHpasBut() 
					+ terrain.getTerrain4CageHBut() 	+ terrain.getTerrain4CageHpasBut() 
					+ terrain.getTerrain5CageHBut() 	+ terrain.getTerrain5CageHpasBut() 
					+ terrain.getTerrain6CageHBut() 	+ terrain.getTerrain6CageHpasBut();
			
			lancersVersCageI +=   terrain.getTerrain1CageIBut() 	+ terrain.getTerrain1CageIpasBut() 
					+ terrain.getTerrain2CageIBut() 	+ terrain.getTerrain2CageIpasBut() 
					+ terrain.getTerrain3CageIBut() 	+ terrain.getTerrain3CageIpasBut() 
					+ terrain.getTerrain4CageIBut() 	+ terrain.getTerrain4CageIpasBut() 
					+ terrain.getTerrain5CageIBut() 	+ terrain.getTerrain5CageIpasBut() 
					+ terrain.getTerrain6CageIBut() 	+ terrain.getTerrain6CageIpasBut();
	}
	
	System.out.println("cage A : " + lancersVersCageA);
	System.out.println("cage B : " + lancersVersCageB);
	System.out.println("cage C : " + lancersVersCageC);
	System.out.println("cage D : " + lancersVersCageD);
	System.out.println("cage E : " + lancersVersCageE);
	System.out.println("cage F : " + lancersVersCageF);
	System.out.println("cage G : " + lancersVersCageG);
	System.out.println("cage H : " + lancersVersCageH);
	System.out.println("cage I : " + lancersVersCageI);
	
	pie.put("lancers vers cage A", lancersVersCageA);
    pie.put("lancers vers cage B", lancersVersCageB);
    pie.put("lancers vers cage C", lancersVersCageC);
    pie.put("lancers vers cage D", lancersVersCageD);
    pie.put("lancers vers cage E", lancersVersCageE);
    pie.put("lancers vers cage F", lancersVersCageF);
    pie.put("lancers vers cage G", lancersVersCageG);
    pie.put("lancers vers cage H", lancersVersCageH);
    pie.put("lancers vers cage I", lancersVersCageI);
	
		
	}
	public void arretsParZoneDeTir() {
		lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(1);

		int zoneTerrain1Arret = 0;
		int zoneTerrain2Arret = 0;
		int zoneTerrain3Arret = 0;
		int zoneTerrain4Arret = 0;
		int zoneTerrain5Arret = 0;
		int zoneTerrain6Arret = 0;
		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			zoneTerrain1Arret += terrain.getTerrain1CageApasBut() 
							+ terrain.getTerrain1CageBpasBut()						 
							+ terrain.getTerrain1CageCpasBut()						 
							+ terrain.getTerrain1CageDpasBut()						 
							+ terrain.getTerrain1CageEpasBut()						 
							+ terrain.getTerrain1CageFpasBut()						 
							+ terrain.getTerrain1CageGpasBut()						 
							+ terrain.getTerrain1CageHpasBut()						 
							+ terrain.getTerrain1CageIpasBut();
						
			zoneTerrain2Arret += terrain.getTerrain2CageApasBut() 
							+ terrain.getTerrain2CageBpasBut()						 
							+ terrain.getTerrain2CageCpasBut()						 
							+ terrain.getTerrain2CageDpasBut()						 
							+ terrain.getTerrain2CageEpasBut()						 
							+ terrain.getTerrain2CageFpasBut()						 
							+ terrain.getTerrain2CageGpasBut()						 
							+ terrain.getTerrain2CageHpasBut()						 
							+ terrain.getTerrain2CageIpasBut();
			
			zoneTerrain3Arret += terrain.getTerrain3CageApasBut() 
							+ terrain.getTerrain3CageBpasBut()						 
							+ terrain.getTerrain3CageCpasBut()						 
							+ terrain.getTerrain3CageDpasBut()						 
							+ terrain.getTerrain3CageEpasBut()						 
							+ terrain.getTerrain3CageFpasBut()						 
							+ terrain.getTerrain3CageGpasBut()						 
							+ terrain.getTerrain3CageHpasBut()						 
							+ terrain.getTerrain3CageIpasBut();
			
			zoneTerrain4Arret += terrain.getTerrain4CageApasBut() 
							+ terrain.getTerrain4CageBpasBut()						 
							+ terrain.getTerrain4CageCpasBut()						 
							+ terrain.getTerrain4CageDpasBut()						 
							+ terrain.getTerrain4CageEpasBut()						 
							+ terrain.getTerrain4CageFpasBut()						 
							+ terrain.getTerrain4CageGpasBut()						 
							+ terrain.getTerrain4CageHpasBut()						 
							+ terrain.getTerrain4CageIpasBut();
			
			zoneTerrain5Arret +=  terrain.getTerrain5CageApasBut() 
							+ terrain.getTerrain5CageBpasBut()						 
							+ terrain.getTerrain5CageCpasBut()						 
							+ terrain.getTerrain5CageDpasBut()						 
							+ terrain.getTerrain5CageEpasBut()						 
							+ terrain.getTerrain5CageFpasBut()						 
							+ terrain.getTerrain5CageGpasBut()						 
							+ terrain.getTerrain5CageHpasBut()						 
							+ terrain.getTerrain5CageIpasBut();			
			
			zoneTerrain6Arret += terrain.getTerrain6CageApasBut() 
							+ terrain.getTerrain6CageBpasBut()						 
							+ terrain.getTerrain6CageCpasBut()						 
							+ terrain.getTerrain6CageDpasBut()						 
							+ terrain.getTerrain6CageEpasBut()						 
							+ terrain.getTerrain6CageFpasBut()						 
							+ terrain.getTerrain6CageGpasBut()						 
							+ terrain.getTerrain6CageHpasBut()						 
							+ terrain.getTerrain6CageIpasBut();
		}
		
		
		System.out.println("Terrain 1 Arret : " + zoneTerrain1Arret);
		System.out.println("Terrain 2 Arret : " + zoneTerrain2Arret);
		System.out.println("Terrain 3 Arret : " + zoneTerrain3Arret);
		System.out.println("Terrain 4 Arret : " + zoneTerrain4Arret);
		System.out.println("Terrain 5 Arret : " + zoneTerrain5Arret);
		System.out.println("Terrain 6 Arret : " + zoneTerrain6Arret);
		
		
	}
	public void arretsParZoneDArret() {
		lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(1);
		int arretsCageAArret = 0;
		int arretsCageBArret = 0;
		int arretsCageCArret = 0;
		int arretsCageDArret = 0;
		int arretsCageEArret = 0;
		int arretsCageFArret = 0;
		int arretsCageGArret = 0;
		int arretsCageHArret = 0;
		int arretsCageIArret = 0;	
		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			arretsCageAArret += terrain.getTerrain1CageApasBut() 
								+ terrain.getTerrain2CageApasBut() 
								+ terrain.getTerrain3CageApasBut() 
								+ terrain.getTerrain4CageApasBut() 
								+ terrain.getTerrain5CageApasBut() 
								+ terrain.getTerrain6CageApasBut();
			
			arretsCageBArret += terrain.getTerrain1CageBpasBut() 
								+ terrain.getTerrain2CageBpasBut() 
								+ terrain.getTerrain3CageBpasBut() 
								+ terrain.getTerrain4CageBpasBut() 
								+ terrain.getTerrain5CageBpasBut() 
								+ terrain.getTerrain6CageBpasBut();
			
			arretsCageCArret += terrain.getTerrain1CageCpasBut() 
								+ terrain.getTerrain2CageCpasBut() 
								+ terrain.getTerrain3CageCpasBut() 
								+ terrain.getTerrain4CageCpasBut() 
								+ terrain.getTerrain5CageCpasBut() 
								+ terrain.getTerrain6CageCpasBut();
			
			arretsCageDArret += terrain.getTerrain1CageDpasBut() 
								+ terrain.getTerrain2CageDpasBut() 
								+ terrain.getTerrain3CageDpasBut() 
								+ terrain.getTerrain4CageDpasBut() 
								+ terrain.getTerrain5CageDpasBut() 
								+ terrain.getTerrain6CageDpasBut();
			
			arretsCageEArret += terrain.getTerrain1CageEpasBut() 
						+ terrain.getTerrain2CageEpasBut() 
						+ terrain.getTerrain3CageEpasBut() 
					 	+ terrain.getTerrain4CageEpasBut() 
						+ terrain.getTerrain5CageEpasBut() 
						+ terrain.getTerrain6CageEpasBut();
			
			arretsCageFArret += terrain.getTerrain1CageFpasBut() 
								+ terrain.getTerrain2CageFpasBut() 
								+ terrain.getTerrain3CageFpasBut() 
								+ terrain.getTerrain4CageFpasBut() 
								+ terrain.getTerrain5CageFpasBut() 
								+ terrain.getTerrain6CageFpasBut();
			
			arretsCageGArret += terrain.getTerrain1CageGpasBut() 
								+ terrain.getTerrain2CageGpasBut() 
								+ terrain.getTerrain3CageGpasBut() 
								+ terrain.getTerrain4CageGpasBut() 
								+ terrain.getTerrain5CageGpasBut() 
								+ terrain.getTerrain6CageGpasBut();
			
			arretsCageHArret += terrain.getTerrain1CageHpasBut() 
								+ terrain.getTerrain2CageHpasBut() 
								+ terrain.getTerrain3CageHpasBut() 
								+ terrain.getTerrain4CageHpasBut() 
								+ terrain.getTerrain5CageHpasBut() 
								+ terrain.getTerrain6CageHpasBut();
			
			arretsCageIArret += terrain.getTerrain1CageIpasBut() 
								+ terrain.getTerrain2CageIpasBut() 
								+ terrain.getTerrain3CageIpasBut() 
								+ terrain.getTerrain4CageIpasBut() 
							 	+ terrain.getTerrain5CageIpasBut() 
								+ terrain.getTerrain6CageIpasBut();
	}
		
		System.out.println("cage A Arret : " + arretsCageAArret);
		System.out.println("cage B Arret : " + arretsCageBArret);
		System.out.println("cage C Arret : " + arretsCageCArret);
		System.out.println("cage D Arret : " + arretsCageDArret);
		System.out.println("cage E Arret : " + arretsCageEArret);
		System.out.println("cage F Arret : " + arretsCageFArret);
		System.out.println("cage G Arret : " + arretsCageGArret);
		System.out.println("cage H Arret : " + arretsCageHArret);
		System.out.println("cage I Arret : " + arretsCageIArret);
	
	}
	public void choisirZoneCage(ValueChangeEvent event) {
		
	}

	/////////////////////////////////////

	public GestionEquipeRemote getGestionEquipe() {
		return gestionEquipe;
	}

	public void setGestionEquipe(GestionEquipeRemote gestionEquipe) {
		this.gestionEquipe = gestionEquipe;
	}

	public Collection<hw.Equipe> getLesEquipes() {
		return lesEquipes;
	}

	public void setLesEquipes(Collection<hw.Equipe> lesEquipes) {
		this.lesEquipes = lesEquipes;
	}

	public String getCurrentType() {
		return currentType;
	}

	public void setCurrentType(String currentType) {
		this.currentType = currentType;
	}

	public List<SelectItem> getListEquipe() {
		return listEquipe;
	}

	public void setListEquipe(List<SelectItem> listEquipe) {
		this.listEquipe = listEquipe;
	}

	public List<SelectItem> getListGradien() {
		return listGradien;
	}

	public void setListGradien(List<SelectItem> listGradien) {
		this.listGradien = listGradien;
	}

	public Collection<hw.Gardien> getLesGardien() {
		return lesGardien;
	}

	public void setLesGardien(Collection<hw.Gardien> lesGardien) {
		this.lesGardien = lesGardien;
	}

	public GestionGardienRemote getGestionGardien() {
		return gestionGardien;
	}

	public void setGestionGardien(GestionGardienRemote gestionGardien) {
		this.gestionGardien = gestionGardien;
	}

	public GestionScoreDeMatchRemote getGestionScoreDeMatch() {
		return gestionScoreDeMatch;
	}

	public void setGestionScoreDeMatch(GestionScoreDeMatchRemote gestionScoreDeMatch) {
		this.gestionScoreDeMatch = gestionScoreDeMatch;
	}

	public List<SelectItem> getListZoneTerrain() {
		return listZoneTerrain;
	}

	public void setListZoneTerrain(List<SelectItem> listZoneTerrain) {
		this.listZoneTerrain = listZoneTerrain;
	}

	public List<SelectItem> getListZoneCage() {
		return listZoneCage;
	}

	public void setListZoneCage(List<SelectItem> listZoneCage) {
		this.listZoneCage = listZoneCage;
	}

	

	public StringChartDataModel getPie() {
		return pie;
	}

	public void setPie(StringChartDataModel pie) {
		this.pie = pie;
	}

	public Collection<hw.ScoreDeMatch> getLesScoreDeMatch() {
		return lesScoreDeMatch;
	}

	public void setLesScoreDeMatch(Collection<hw.ScoreDeMatch> lesScoreDeMatch) {
		this.lesScoreDeMatch = lesScoreDeMatch;
	}

	public int getIdEquipeChoisi() {
		return idEquipeChoisi;
	}

	public void setIdEquipeChoisi(int idEquipeChoisi) {
		this.idEquipeChoisi = idEquipeChoisi;
	}

	public int getIdGardien() {
		return idGardien;
	}

	public void setIdGardien(int idGardien) {
		this.idGardien = idGardien;
	}
	
	

}
