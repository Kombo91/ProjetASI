package hw;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface GestionScoreDeMatchRemote {
	public ScoreDeMatch ajouterScoreDeMatch(ScoreDeMatch sdm);
	public ScoreDeMatch modifierScoreDeMatch(int id,String zone);
	public Collection<ScoreDeMatch> listerScoreDeMatch();
}
