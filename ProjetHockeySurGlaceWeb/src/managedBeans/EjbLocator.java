/**
 * 
 */
package managedBeans;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import hw.GestionConnexionRemote;
import hw.GestionEquipeRemote;
import hw.GestionGardienRemote;
import hw.GestionRencontreRemote;
import hw.GestionScoreDeMatchRemote;

/**
 * @author KP
 *
 */
public class EjbLocator {
	private static Context ctx;
	private static EjbLocator instance = new EjbLocator();

	private EjbLocator() {
	}

	public static EjbLocator getLocator() {
		return instance;
	}

	private <T> T getEjb(Class<T> ejbClass, String beanName) {
		try {
			final Hashtable jndiProperties = new Hashtable();
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			final Context context = new InitialContext(jndiProperties);
			final String appName = "ProjetHockeySurGlaceEAR";
			final String moduleName = "ProjetHockeySurGlaceEJB";
			return (T) context
					.lookup("java:global/" + appName + "/" + moduleName + "/" + beanName + "!" + ejbClass.getName());

		} catch (NamingException e) {
			return null;
		}
	}

	public GestionEquipeRemote getGestionEquipe() {

		return getEjb(GestionEquipeRemote.class, "GestionEquipe");
	}

	public GestionScoreDeMatchRemote getGestionScoreDeMatch() {
		return getEjb(GestionScoreDeMatchRemote.class, "GestionScoreDeMatch");
	}

	public GestionConnexionRemote getGestionConnexion() {
		return getEjb(GestionConnexionRemote.class, "GestionConnexion");
	}

	public GestionRencontreRemote getGestionRencontre() {
		return getEjb(GestionRencontreRemote.class, "GestionRencontre");
	}

	public GestionGardienRemote getGestionGardien() {
		return getEjb(GestionGardienRemote.class, "GestionGardien");
	}

// Rajouter ici une méthode pour tout nouvel EJB auquel on souhaite accéder
}
