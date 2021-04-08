/**
 * 
 */
package managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
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
	private Collection<hw.Equipe> lesEquipesContre = new ArrayList<Equipe>();
	private Collection<hw.Gardien> lesGardien = new ArrayList<Gardien>();
	private Collection<hw.ScoreDeMatch> lesScoreDeMatch = new ArrayList<ScoreDeMatch>();
	private String currentType = "";
	private List<SelectItem> listEquipe = new ArrayList<SelectItem>();
	private List<SelectItem> listEquipeContre = new ArrayList<SelectItem>();
	private List<SelectItem> listGradien = new ArrayList<SelectItem>();
	private List<SelectItem> listZoneTerrain = new ArrayList<SelectItem>();
	private List<SelectItem> listZoneCage = new ArrayList<SelectItem>();

	private StringChartDataModel pieLancersParZoneDArret;
	private StringChartDataModel pieLancersParZoneDeTir;
	private StringChartDataModel pieArretsParZoneDArret;
	private StringChartDataModel pieArretsParZoneDeTir;
	private List<ScoreDeMatch> sdm;
	private int idEquipeChoisi;
	private int idEquipeChoisiplusDeDetails;
	private int idGardien;
	private String plusDeChoix;
	private String pasDeGardien;
	private String afficherGraphs;

	private List<SelectItem> choixStatistique = new ArrayList<SelectItem>();

	public ApplicatioAnalyseDesDonnDesBean() {
		listeDesEquipes();
		gestionScoreDeMatch = EjbLocator.getLocator().getGestionScoreDeMatch();
		pieLancersParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);
		pieLancersParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);
		pieArretsParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);
		pieArretsParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);

	}

	////////////////////// Liste Equipe //////////////////////
	public void listeDesEquipes() {
		afficherGraphs ="";
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
		afficherGraphs ="";
plusDeChoix = "";
		listGradien.clear();
		SelectItem item = new SelectItem("", "");
		listGradien.add(item);
		if (event.getNewValue() != null) {
			gestionGardien = EjbLocator.getLocator().getGestionGardien();
			if (gestionGardien != null) {
				lesGardien = gestionGardien.listerGardien(idEquipeChoisi);
				System.out.println("je suis null"+lesGardien);
				if (lesGardien.size()!=0) {
					pasDeGardien ="";
					for (Gardien gard : lesGardien) {
						item = new SelectItem(gard.getIdGardien(), gard.getPrenom() + " " + gard.getNom());
						listGradien.add(item);
					}
				} else {
					pasDeGardien ="pasDeGardien";
					System.out.println("je suis null");
				}
			}
			
			pieLancersParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);
			pieLancersParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);
			pieArretsParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);
			pieArretsParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);
			choixStatistique.clear();
			SelectItem item2 = new SelectItem("", "");
			choixStatistique.add(item2);
			item2 = new SelectItem("matchParticulie", "Match Particulié");
			choixStatistique.add(item2);
			item2 = new SelectItem("touteLaSaison", "Toute la saison");
			choixStatistique.add(item2);

		}
	}

	public void choisirGadien(ValueChangeEvent event) {
		plusDeChoix = "";
		afficherGraphs ="";
if (event.getNewValue() != null) {
			sdm = new LinkedList<ScoreDeMatch>();
			pieLancersParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);
			pieLancersParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);
			pieArretsParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);
			pieArretsParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);

			idGardien = Integer.parseInt((String) event.getNewValue());
			System.out.println("idGardien : " + idGardien);
		} else {
			
			System.out.println("je suis nul");
		}

	}

	public void statistiqueSaisonOuMatchParticulie(ValueChangeEvent event) {
		listEquipeContre.clear();
		afficherGraphs ="";
if (((String) event.getNewValue()).equals("matchParticulie")) {

			plusDeChoix = "matchParticulie";
			gestionEquipe = EjbLocator.getLocator().getGestionEquipe();
			SelectItem item = new SelectItem("", "");
			listEquipe.add(item);
			gestionEquipe = EjbLocator.getLocator().getGestionEquipe();
			if (gestionEquipe != null) {
				lesEquipesContre = gestionEquipe.listerEquipeContre(idEquipeChoisi);
				for (Equipe eq : lesEquipesContre) {
					item = new SelectItem(eq.getIdEquipe(), eq.getNomEquipe());
					listEquipeContre.add(item);
				}

			}

		}
		if (((String) event.getNewValue()).equals("touteLaSaison")) {
			afficherGraphs = "afficherGraphs";
			plusDeChoix = "";
			lancersParZoneDeTir(lesScoreDeMatch);
			LancersParZoneDArret(lesScoreDeMatch);
			arretsParZoneDeTir(lesScoreDeMatch);
			arretsParZoneDArret(lesScoreDeMatch);
			totalButArreteEtEncaisse(lesScoreDeMatch);
		}

	}

	public void plusDeDetails(ValueChangeEvent event) {
		afficherGraphs ="";
idEquipeChoisiplusDeDetails = Integer.parseInt((String) event.getNewValue());
		System.out.println("idGardien  " + idGardien + "idEquipeChoisiplusDeDetails : " + idEquipeChoisiplusDeDetails);
		lesScoreDeMatch = gestionScoreDeMatch.staticDUnGardienParRaportAUnMatch(idGardien, idEquipeChoisi,
				idEquipeChoisiplusDeDetails);
		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			System.out.println("id Score De Match : " + terrain.getIdScoreDeMatch());
		}
		lancersParZoneDeTir(lesScoreDeMatch);
		LancersParZoneDArret(lesScoreDeMatch);
		afficherGraphs ="afficherGraphs";

	}

	public void lancersParZoneDeTir(Collection<hw.ScoreDeMatch> lesScoreDeMatch) {

		pieLancersParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);
		// lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(idGardien);
		int lancersDepuisTerrain1 = 0;
		int lancersDepuisTerrain2 = 0;
		int lancersDepuisTerrain3 = 0;
		int lancersDepuisTerrain4 = 0;
		int lancersDepuisTerrain5 = 0;
		int lancersDepuisTerrain6 = 0;

		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			lancersDepuisTerrain1 += terrain.getTerrain1CageABut() + terrain.getTerrain1CageApasBut()
					+ terrain.getTerrain1CageBBut() + terrain.getTerrain1CageBpasBut() + terrain.getTerrain1CageCBut()
					+ terrain.getTerrain1CageCpasBut() + terrain.getTerrain1CageDBut()
					+ terrain.getTerrain1CageDpasBut() + terrain.getTerrain1CageEBut()
					+ terrain.getTerrain1CageEpasBut() + terrain.getTerrain1CageFBut()
					+ terrain.getTerrain1CageFpasBut() + terrain.getTerrain1CageGBut()
					+ terrain.getTerrain1CageGpasBut() + terrain.getTerrain1CageHBut()
					+ terrain.getTerrain1CageHpasBut() + terrain.getTerrain1CageIBut()
					+ terrain.getTerrain1CageIpasBut();

			lancersDepuisTerrain2 += terrain.getTerrain2CageABut() + terrain.getTerrain2CageApasBut()
					+ terrain.getTerrain2CageBBut() + terrain.getTerrain2CageBpasBut() + terrain.getTerrain2CageCBut()
					+ terrain.getTerrain2CageCpasBut() + terrain.getTerrain2CageDBut()
					+ terrain.getTerrain2CageDpasBut() + terrain.getTerrain2CageEBut()
					+ terrain.getTerrain2CageEpasBut() + terrain.getTerrain2CageFBut()
					+ terrain.getTerrain2CageFpasBut() + terrain.getTerrain2CageGBut()
					+ terrain.getTerrain2CageGpasBut() + terrain.getTerrain2CageHBut()
					+ terrain.getTerrain2CageHpasBut() + terrain.getTerrain2CageIBut()
					+ terrain.getTerrain2CageIpasBut();

			lancersDepuisTerrain3 += terrain.getTerrain3CageABut() + terrain.getTerrain3CageApasBut()
					+ terrain.getTerrain3CageBBut() + terrain.getTerrain3CageBpasBut() + terrain.getTerrain3CageCBut()
					+ terrain.getTerrain3CageCpasBut() + terrain.getTerrain3CageDBut()
					+ terrain.getTerrain3CageDpasBut() + terrain.getTerrain3CageEBut()
					+ terrain.getTerrain3CageEpasBut() + terrain.getTerrain3CageFBut()
					+ terrain.getTerrain3CageFpasBut() + terrain.getTerrain3CageGBut()
					+ terrain.getTerrain3CageGpasBut() + terrain.getTerrain3CageHBut()
					+ terrain.getTerrain3CageHpasBut() + terrain.getTerrain3CageIBut()
					+ terrain.getTerrain3CageIpasBut();

			lancersDepuisTerrain4 += terrain.getTerrain4CageABut() + terrain.getTerrain4CageApasBut()
					+ terrain.getTerrain4CageBBut() + terrain.getTerrain4CageBpasBut() + terrain.getTerrain4CageCBut()
					+ terrain.getTerrain4CageCpasBut() + terrain.getTerrain4CageDBut()
					+ terrain.getTerrain4CageDpasBut() + terrain.getTerrain4CageEBut()
					+ terrain.getTerrain4CageEpasBut() + terrain.getTerrain4CageFBut()
					+ terrain.getTerrain4CageFpasBut() + terrain.getTerrain4CageGBut()
					+ terrain.getTerrain4CageGpasBut() + terrain.getTerrain4CageHBut()
					+ terrain.getTerrain4CageHpasBut() + terrain.getTerrain4CageIBut()
					+ terrain.getTerrain4CageIpasBut();

			lancersDepuisTerrain5 += terrain.getTerrain5CageABut() + terrain.getTerrain5CageApasBut()
					+ terrain.getTerrain5CageBBut() + terrain.getTerrain5CageBpasBut() + terrain.getTerrain5CageCBut()
					+ terrain.getTerrain5CageCpasBut() + terrain.getTerrain5CageDBut()
					+ terrain.getTerrain5CageDpasBut() + terrain.getTerrain5CageEBut()
					+ terrain.getTerrain5CageEpasBut() + terrain.getTerrain5CageFBut()
					+ terrain.getTerrain5CageFpasBut() + terrain.getTerrain5CageGBut()
					+ terrain.getTerrain5CageGpasBut() + terrain.getTerrain5CageHBut()
					+ terrain.getTerrain5CageHpasBut() + terrain.getTerrain5CageIBut()
					+ terrain.getTerrain5CageIpasBut();

			lancersDepuisTerrain6 += terrain.getTerrain6CageABut() + terrain.getTerrain6CageApasBut()
					+ terrain.getTerrain6CageBBut() + terrain.getTerrain6CageBpasBut() + terrain.getTerrain6CageCBut()
					+ terrain.getTerrain6CageCpasBut() + terrain.getTerrain6CageDBut()
					+ terrain.getTerrain6CageDpasBut() + terrain.getTerrain6CageEBut()
					+ terrain.getTerrain6CageEpasBut() + terrain.getTerrain6CageFBut()
					+ terrain.getTerrain6CageFpasBut() + terrain.getTerrain6CageGBut()
					+ terrain.getTerrain6CageGpasBut() + terrain.getTerrain6CageHBut()
					+ terrain.getTerrain6CageHpasBut() + terrain.getTerrain6CageIBut()
					+ terrain.getTerrain6CageIpasBut();
		}

		pieLancersParZoneDeTir.put("lancers depuis terrain 1" + lancersDepuisTerrain1, lancersDepuisTerrain1);
		pieLancersParZoneDeTir.put("lancers depuis terrain 2" + lancersDepuisTerrain2, lancersDepuisTerrain2);
		pieLancersParZoneDeTir.put("lancers depuis terrain 3" + lancersDepuisTerrain3, lancersDepuisTerrain3);
		pieLancersParZoneDeTir.put("lancers depuis terrain 4" + lancersDepuisTerrain4, lancersDepuisTerrain4);
		pieLancersParZoneDeTir.put("lancers depuis terrain 5" + lancersDepuisTerrain5, lancersDepuisTerrain5);
		pieLancersParZoneDeTir.put("lancers depuis terrain 6" + lancersDepuisTerrain6, lancersDepuisTerrain6);

	}

	public void LancersParZoneDArret(Collection<hw.ScoreDeMatch> lesScoreDeMatch) {
		pieLancersParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);
		//lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(idGardien);
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
			lancersVersCageA += terrain.getTerrain1CageABut() + terrain.getTerrain1CageApasBut()
					+ terrain.getTerrain2CageABut() + terrain.getTerrain2CageApasBut() + terrain.getTerrain3CageABut()
					+ terrain.getTerrain3CageApasBut() + terrain.getTerrain4CageABut()
					+ terrain.getTerrain4CageApasBut() + terrain.getTerrain5CageABut()
					+ terrain.getTerrain5CageApasBut() + terrain.getTerrain6CageABut()
					+ terrain.getTerrain6CageApasBut();

			lancersVersCageB += terrain.getTerrain1CageBBut() + terrain.getTerrain1CageBpasBut()
					+ terrain.getTerrain2CageBBut() + terrain.getTerrain2CageBpasBut() + terrain.getTerrain3CageBBut()
					+ terrain.getTerrain3CageBpasBut() + terrain.getTerrain4CageBBut()
					+ terrain.getTerrain4CageBpasBut() + terrain.getTerrain5CageBBut()
					+ terrain.getTerrain5CageBpasBut() + terrain.getTerrain6CageBBut()
					+ terrain.getTerrain6CageBpasBut();

			lancersVersCageC += terrain.getTerrain1CageCBut() + terrain.getTerrain1CageCpasBut()
					+ terrain.getTerrain2CageCBut() + terrain.getTerrain2CageCpasBut() + terrain.getTerrain3CageCBut()
					+ terrain.getTerrain3CageCpasBut() + terrain.getTerrain4CageCBut()
					+ terrain.getTerrain4CageCpasBut() + terrain.getTerrain5CageCBut()
					+ terrain.getTerrain5CageCpasBut() + terrain.getTerrain6CageCBut()
					+ terrain.getTerrain6CageCpasBut();

			lancersVersCageD += terrain.getTerrain1CageDBut() + terrain.getTerrain1CageDpasBut()
					+ terrain.getTerrain2CageDBut() + terrain.getTerrain2CageDpasBut() + terrain.getTerrain3CageDBut()
					+ terrain.getTerrain3CageDpasBut() + terrain.getTerrain4CageDBut()
					+ terrain.getTerrain4CageDpasBut() + terrain.getTerrain5CageDBut()
					+ terrain.getTerrain5CageDpasBut() + terrain.getTerrain6CageDBut()
					+ terrain.getTerrain6CageDpasBut();

			lancersVersCageE += terrain.getTerrain1CageEBut() + terrain.getTerrain1CageEpasBut()
					+ terrain.getTerrain2CageEBut() + terrain.getTerrain2CageEpasBut() + terrain.getTerrain3CageEBut()
					+ terrain.getTerrain3CageEpasBut() + terrain.getTerrain4CageEBut()
					+ terrain.getTerrain4CageEpasBut() + terrain.getTerrain5CageEBut()
					+ terrain.getTerrain5CageEpasBut() + terrain.getTerrain6CageEBut()
					+ terrain.getTerrain6CageEpasBut();

			lancersVersCageF += terrain.getTerrain1CageFBut() + terrain.getTerrain1CageFpasBut()
					+ terrain.getTerrain2CageFBut() + terrain.getTerrain2CageFpasBut() + terrain.getTerrain3CageFBut()
					+ terrain.getTerrain3CageFpasBut() + terrain.getTerrain4CageFBut()
					+ terrain.getTerrain4CageFpasBut() + terrain.getTerrain5CageFBut()
					+ terrain.getTerrain5CageFpasBut() + terrain.getTerrain6CageFBut()
					+ terrain.getTerrain6CageFpasBut();

			lancersVersCageG += terrain.getTerrain1CageGBut() + terrain.getTerrain1CageGpasBut()
					+ terrain.getTerrain2CageGBut() + terrain.getTerrain2CageGpasBut() + terrain.getTerrain3CageGBut()
					+ terrain.getTerrain3CageGpasBut() + terrain.getTerrain4CageGBut()
					+ terrain.getTerrain4CageGpasBut() + terrain.getTerrain5CageGBut()
					+ terrain.getTerrain5CageGpasBut() + terrain.getTerrain6CageGBut()
					+ terrain.getTerrain6CageGpasBut();

			lancersVersCageH += terrain.getTerrain1CageHBut() + terrain.getTerrain1CageHpasBut()
					+ terrain.getTerrain2CageHBut() + terrain.getTerrain2CageHpasBut() + terrain.getTerrain3CageHBut()
					+ terrain.getTerrain3CageHpasBut() + terrain.getTerrain4CageHBut()
					+ terrain.getTerrain4CageHpasBut() + terrain.getTerrain5CageHBut()
					+ terrain.getTerrain5CageHpasBut() + terrain.getTerrain6CageHBut()
					+ terrain.getTerrain6CageHpasBut();

			lancersVersCageI += terrain.getTerrain1CageIBut() + terrain.getTerrain1CageIpasBut()
					+ terrain.getTerrain2CageIBut() + terrain.getTerrain2CageIpasBut() + terrain.getTerrain3CageIBut()
					+ terrain.getTerrain3CageIpasBut() + terrain.getTerrain4CageIBut()
					+ terrain.getTerrain4CageIpasBut() + terrain.getTerrain5CageIBut()
					+ terrain.getTerrain5CageIpasBut() + terrain.getTerrain6CageIBut()
					+ terrain.getTerrain6CageIpasBut();
		}

		pieLancersParZoneDArret.put("lancers vers cage A", lancersVersCageA);
		pieLancersParZoneDArret.put("lancers vers cage B", lancersVersCageB);
		pieLancersParZoneDArret.put("lancers vers cage C", lancersVersCageC);
		pieLancersParZoneDArret.put("lancers vers cage D", lancersVersCageD);
		pieLancersParZoneDArret.put("lancers vers cage E", lancersVersCageE);
		pieLancersParZoneDArret.put("lancers vers cage F", lancersVersCageF);
		pieLancersParZoneDArret.put("lancers vers cage G", lancersVersCageG);
		pieLancersParZoneDArret.put("lancers vers cage H", lancersVersCageH);
		pieLancersParZoneDArret.put("lancers vers cage I", lancersVersCageI);

	}

	public void arretsParZoneDeTir(Collection<hw.ScoreDeMatch> lesScoreDeMatch) {
		//lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(idGardien);
		pieArretsParZoneDeTir = new StringChartDataModel(ChartDataModel.ChartType.pie);

		int zoneTerrain1Arret = 0;
		int zoneTerrain2Arret = 0;
		int zoneTerrain3Arret = 0;
		int zoneTerrain4Arret = 0;
		int zoneTerrain5Arret = 0;
		int zoneTerrain6Arret = 0;
		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			zoneTerrain1Arret += terrain.getTerrain1CageApasBut() + terrain.getTerrain1CageBpasBut()
					+ terrain.getTerrain1CageCpasBut() + terrain.getTerrain1CageDpasBut()
					+ terrain.getTerrain1CageEpasBut() + terrain.getTerrain1CageFpasBut()
					+ terrain.getTerrain1CageGpasBut() + terrain.getTerrain1CageHpasBut()
					+ terrain.getTerrain1CageIpasBut();

			zoneTerrain2Arret += terrain.getTerrain2CageApasBut() + terrain.getTerrain2CageBpasBut()
					+ terrain.getTerrain2CageCpasBut() + terrain.getTerrain2CageDpasBut()
					+ terrain.getTerrain2CageEpasBut() + terrain.getTerrain2CageFpasBut()
					+ terrain.getTerrain2CageGpasBut() + terrain.getTerrain2CageHpasBut()
					+ terrain.getTerrain2CageIpasBut();

			zoneTerrain3Arret += terrain.getTerrain3CageApasBut() + terrain.getTerrain3CageBpasBut()
					+ terrain.getTerrain3CageCpasBut() + terrain.getTerrain3CageDpasBut()
					+ terrain.getTerrain3CageEpasBut() + terrain.getTerrain3CageFpasBut()
					+ terrain.getTerrain3CageGpasBut() + terrain.getTerrain3CageHpasBut()
					+ terrain.getTerrain3CageIpasBut();

			zoneTerrain4Arret += terrain.getTerrain4CageApasBut() + terrain.getTerrain4CageBpasBut()
					+ terrain.getTerrain4CageCpasBut() + terrain.getTerrain4CageDpasBut()
					+ terrain.getTerrain4CageEpasBut() + terrain.getTerrain4CageFpasBut()
					+ terrain.getTerrain4CageGpasBut() + terrain.getTerrain4CageHpasBut()
					+ terrain.getTerrain4CageIpasBut();

			zoneTerrain5Arret += terrain.getTerrain5CageApasBut() + terrain.getTerrain5CageBpasBut()
					+ terrain.getTerrain5CageCpasBut() + terrain.getTerrain5CageDpasBut()
					+ terrain.getTerrain5CageEpasBut() + terrain.getTerrain5CageFpasBut()
					+ terrain.getTerrain5CageGpasBut() + terrain.getTerrain5CageHpasBut()
					+ terrain.getTerrain5CageIpasBut();

			zoneTerrain6Arret += terrain.getTerrain6CageApasBut() + terrain.getTerrain6CageBpasBut()
					+ terrain.getTerrain6CageCpasBut() + terrain.getTerrain6CageDpasBut()
					+ terrain.getTerrain6CageEpasBut() + terrain.getTerrain6CageFpasBut()
					+ terrain.getTerrain6CageGpasBut() + terrain.getTerrain6CageHpasBut()
					+ terrain.getTerrain6CageIpasBut();
		}
		pieArretsParZoneDeTir.put("lancers vers cage A", zoneTerrain1Arret);
		pieArretsParZoneDeTir.put("lancers vers cage B", zoneTerrain2Arret);
		pieArretsParZoneDeTir.put("lancers vers cage C", zoneTerrain3Arret);
		pieArretsParZoneDeTir.put("lancers vers cage D", zoneTerrain4Arret);
		pieArretsParZoneDeTir.put("lancers vers cage E", zoneTerrain5Arret);
		pieArretsParZoneDeTir.put("lancers vers cage F", zoneTerrain6Arret);

	}

	public void totalButArreteEtEncaisse(Collection<hw.ScoreDeMatch> lesScoreDeMatch) {
		lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(idGardien);
		sdm = new LinkedList<ScoreDeMatch>();

		int nombreDeButArrete = 0;
		int nombreDeButEncaisse = 0;

		for (ScoreDeMatch terrain : lesScoreDeMatch) {
			nombreDeButArrete += terrain.getNombreDeButArrete();
			nombreDeButEncaisse += terrain.getNombreDeButEncaisse();
		}
		sdm.add(new ScoreDeMatch(1, nombreDeButArrete, nombreDeButEncaisse));
	}

	public void arretsParZoneDArret(Collection<hw.ScoreDeMatch> lesScoreDeMatch) {
		lesScoreDeMatch = gestionScoreDeMatch.staticTouteLaSaison(idGardien);
		pieArretsParZoneDArret = new StringChartDataModel(ChartDataModel.ChartType.pie);

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
			arretsCageAArret += terrain.getTerrain1CageApasBut() + terrain.getTerrain2CageApasBut()
					+ terrain.getTerrain3CageApasBut() + terrain.getTerrain4CageApasBut()
					+ terrain.getTerrain5CageApasBut() + terrain.getTerrain6CageApasBut();

			arretsCageBArret += terrain.getTerrain1CageBpasBut() + terrain.getTerrain2CageBpasBut()
					+ terrain.getTerrain3CageBpasBut() + terrain.getTerrain4CageBpasBut()
					+ terrain.getTerrain5CageBpasBut() + terrain.getTerrain6CageBpasBut();

			arretsCageCArret += terrain.getTerrain1CageCpasBut() + terrain.getTerrain2CageCpasBut()
					+ terrain.getTerrain3CageCpasBut() + terrain.getTerrain4CageCpasBut()
					+ terrain.getTerrain5CageCpasBut() + terrain.getTerrain6CageCpasBut();

			arretsCageDArret += terrain.getTerrain1CageDpasBut() + terrain.getTerrain2CageDpasBut()
					+ terrain.getTerrain3CageDpasBut() + terrain.getTerrain4CageDpasBut()
					+ terrain.getTerrain5CageDpasBut() + terrain.getTerrain6CageDpasBut();

			arretsCageEArret += terrain.getTerrain1CageEpasBut() + terrain.getTerrain2CageEpasBut()
					+ terrain.getTerrain3CageEpasBut() + terrain.getTerrain4CageEpasBut()
					+ terrain.getTerrain5CageEpasBut() + terrain.getTerrain6CageEpasBut();

			arretsCageFArret += terrain.getTerrain1CageFpasBut() + terrain.getTerrain2CageFpasBut()
					+ terrain.getTerrain3CageFpasBut() + terrain.getTerrain4CageFpasBut()
					+ terrain.getTerrain5CageFpasBut() + terrain.getTerrain6CageFpasBut();

			arretsCageGArret += terrain.getTerrain1CageGpasBut() + terrain.getTerrain2CageGpasBut()
					+ terrain.getTerrain3CageGpasBut() + terrain.getTerrain4CageGpasBut()
					+ terrain.getTerrain5CageGpasBut() + terrain.getTerrain6CageGpasBut();

			arretsCageHArret += terrain.getTerrain1CageHpasBut() + terrain.getTerrain2CageHpasBut()
					+ terrain.getTerrain3CageHpasBut() + terrain.getTerrain4CageHpasBut()
					+ terrain.getTerrain5CageHpasBut() + terrain.getTerrain6CageHpasBut();

			arretsCageIArret += terrain.getTerrain1CageIpasBut() + terrain.getTerrain2CageIpasBut()
					+ terrain.getTerrain3CageIpasBut() + terrain.getTerrain4CageIpasBut()
					+ terrain.getTerrain5CageIpasBut() + terrain.getTerrain6CageIpasBut();
		}
		pieArretsParZoneDArret.put("lancers vers cage A", arretsCageAArret);
		pieArretsParZoneDArret.put("lancers vers cage B", arretsCageBArret);
		pieArretsParZoneDArret.put("lancers vers cage C", arretsCageCArret);
		pieArretsParZoneDArret.put("lancers vers cage D", arretsCageDArret);
		pieArretsParZoneDArret.put("lancers vers cage E", arretsCageEArret);
		pieArretsParZoneDArret.put("lancers vers cage F", arretsCageFArret);
		pieArretsParZoneDArret.put("lancers vers cageGD", arretsCageGArret);
		pieArretsParZoneDArret.put("lancers vers cageHE", arretsCageHArret);
		pieArretsParZoneDArret.put("lancers vers cageIF", arretsCageIArret);
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

	public List<SelectItem> getChoixStatistique() {
		return choixStatistique;
	}

	public void setChoixStatistique(List<SelectItem> choixStatistique) {
		this.choixStatistique = choixStatistique;
	}

	public List<ScoreDeMatch> getSdm() {
		return sdm;
	}

	public void setSdm(List<ScoreDeMatch> sdm) {
		this.sdm = sdm;
	}

	public StringChartDataModel getPieLancersParZoneDArret() {
		return pieLancersParZoneDArret;
	}

	public void setPieLancersParZoneDArret(StringChartDataModel pieLancersParZoneDArret) {
		this.pieLancersParZoneDArret = pieLancersParZoneDArret;
	}

	public StringChartDataModel getPieLancersParZoneDeTir() {
		return pieLancersParZoneDeTir;
	}

	public void setPieLancersParZoneDeTir(StringChartDataModel pieLancersParZoneDeTir) {
		this.pieLancersParZoneDeTir = pieLancersParZoneDeTir;
	}

	public StringChartDataModel getPieArretsParZoneDArret() {
		return pieArretsParZoneDArret;
	}

	public void setPieArretsParZoneDArret(StringChartDataModel pieArretsParZoneDArret) {
		this.pieArretsParZoneDArret = pieArretsParZoneDArret;
	}

	public StringChartDataModel getPieArretsParZoneDeTir() {
		return pieArretsParZoneDeTir;
	}

	public void setPieArretsParZoneDeTir(StringChartDataModel pieArretsParZoneDeTir) {
		this.pieArretsParZoneDeTir = pieArretsParZoneDeTir;
	}

	public String getPlusDeChoix() {
		return plusDeChoix;
	}

	public void setPlusDeChoix(String plusDeChoix) {
		this.plusDeChoix = plusDeChoix;
	}

	public Collection<hw.Equipe> getLesEquipesContre() {
		return lesEquipesContre;
	}

	public void setLesEquipesContre(Collection<hw.Equipe> lesEquipesContre) {
		this.lesEquipesContre = lesEquipesContre;
	}

	public List<SelectItem> getListEquipeContre() {
		return listEquipeContre;
	}

	public void setListEquipeContre(List<SelectItem> listEquipeContre) {
		this.listEquipeContre = listEquipeContre;
	}

	public int getIdEquipeChoisiplusDeDetails() {
		return idEquipeChoisiplusDeDetails;
	}

	public void setIdEquipeChoisiplusDeDetails(int idEquipeChoisiplusDeDetails) {
		this.idEquipeChoisiplusDeDetails = idEquipeChoisiplusDeDetails;
	}

	public String getPasDeGardien() {
		return pasDeGardien;
	}

	public void setPasDeGardien(String pasDeGardien) {
		this.pasDeGardien = pasDeGardien;
	}

	public String getAfficherGraphs() {
		return afficherGraphs;
	}

	public void setAfficherGraphs(String afficherGraphs) {
		this.afficherGraphs = afficherGraphs;
	}
	
}
