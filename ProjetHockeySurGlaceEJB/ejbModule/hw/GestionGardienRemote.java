package hw;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface GestionGardienRemote {
	 	
	    public Collection<Gardien> listerGardien();
}
