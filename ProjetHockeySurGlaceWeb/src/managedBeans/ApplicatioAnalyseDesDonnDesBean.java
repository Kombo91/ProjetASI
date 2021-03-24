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
	private hw.ScoreDeMatch lesScoreDeMatch = new ScoreDeMatch();
	private String currentType = "";
	private List<SelectItem> listEquipe = new ArrayList<SelectItem>();
	private List<SelectItem> listGradien = new ArrayList<SelectItem>();
	private List<SelectItem> listZoneTerrain = new ArrayList<SelectItem>();
	private List<SelectItem> listZoneCage = new ArrayList<SelectItem>();
	private StringChartDataModel pie;
	

	public ApplicatioAnalyseDesDonnDesBean() {
		listeDesEquipes();

		pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
		//choisirZoneTerrain();
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
		listGradien.clear();
		pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
		SelectItem item = new SelectItem("", "");
		listGradien.add(item);
		if (null != event.getNewValue()) {
			gestionGardien = EjbLocator.getLocator().getGestionGardien();
			if (gestionGardien != null) {
				lesGardien = gestionGardien.listerGardien(Integer.parseInt((String) event.getNewValue()));
				
				for (Gardien gard : lesGardien) {
					item = new SelectItem(gard.getIdGardien(), gard.getNom());
					listGradien.add(item);
				}

			}
		}
	}
	public void choisirGadien(ValueChangeEvent event) {
		System.out.println("sdgfhjghghghghjghg"+event.getNewValue());
		gestionScoreDeMatch = EjbLocator.getLocator().getGestionScoreDeMatch();
		if (gestionScoreDeMatch != null) {
			lesScoreDeMatch = gestionScoreDeMatch.lesScoreDeMatch(608);
			
			
	        pie.put("Nombre De But Arrete", lesScoreDeMatch.getNombreDeButArrete());
	        pie.put("Nombre De But Encaisse", lesScoreDeMatch.getNombreDeButEncaisse());
	        pie.put("Nombre De But Encaisseyfy", 222);
	        pie.put("Nombre De But Encadeisseeyfy", 222);
	        pie.put("Nombre De But Encadedeiesseyfy", 222);
	        pie.put("Nombre De But Endecedaiesseyfy", 222);
	        pie.put("Nombre De But Encaisseyfy", 222);
	        pie.put("Nombre De But Encaiedesseyfy", 222);
			
		}
	}
	public void choisirZoneTerrain() {
	
			
		
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

	public hw.ScoreDeMatch getLesScoreDeMatch() {
		return lesScoreDeMatch;
	}

	public void setLesScoreDeMatch(hw.ScoreDeMatch lesScoreDeMatch) {
		this.lesScoreDeMatch = lesScoreDeMatch;
	}

	public StringChartDataModel getPie() {
		return pie;
	}

	public void setPie(StringChartDataModel pie) {
		this.pie = pie;
	}
	
	

}
