package hw;


import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface GestionScoreDeMatchRemote {
	public ScoreDeMatch ajouterScoreDeMatch(ScoreDeMatch sdm);
	public ScoreDeMatch modifierScoreDeMatch(ScoreDeMatch sdm);
	public ScoreDeMatch lesScoreDeMatch(int idRencontre);
	public Collection<ScoreDeMatch> nbrTotalTirVersGardien(int idGadien);
	public List<ScoreDeMatch> staticTouteLaSaison(int idGardien);
	public List<ScoreDeMatch> staticDUnGardienParRaportAUnMatch(int idGardien,int idRencontre);

	
}
