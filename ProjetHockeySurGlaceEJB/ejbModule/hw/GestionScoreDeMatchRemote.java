package hw;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface GestionScoreDeMatchRemote {
	public ScoreDeMatch ajouterScoreDeMatch(ScoreDeMatch sdm);
	public ScoreDeMatch modifierScoreDeMatch(ScoreDeMatch sdm);
	public ScoreDeMatch lesScoreDeMatch(int idRencontre);
	
}
