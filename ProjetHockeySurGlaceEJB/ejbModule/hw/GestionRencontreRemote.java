package hw;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface GestionRencontreRemote {
    public Rencontre ajouterRencontre(Rencontre ren);
    public Collection<Rencontre> listerRencontre();

}
