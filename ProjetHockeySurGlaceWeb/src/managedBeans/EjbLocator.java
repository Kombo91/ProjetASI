/**
 * 
 */
package managedBeans;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import hw.GestionGardienRemote;
import hw.GestionRencontreRemote;

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
		System.out.println("ejbClass -> "+ejbClass);
		System.out.println("beanName -> "+beanName);
		System.out.println("blablablablabla");
		try {
			final Hashtable jndiProperties = new Hashtable();
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			final Context context = new InitialContext(jndiProperties);
			final String appName = "ProjetHockeySurGlaceEAR";
			System.out.println("appName -> "+appName);
			final String moduleName = "ProjetHockeySurGlaceEJB";

			System.out.println("moduleName -> "+moduleName);
			System.out.println("java:global/" + appName + "/" + moduleName + "/" + beanName + "!" + ejbClass.getName());
			System.out.println("----> "+(T) context.lookup("java:global/" + appName + "/" + moduleName + "/" + beanName + "!" + ejbClass.getName()));
			return (T) context.lookup("java:global/" + appName + "/" + moduleName + "/" + beanName + "!" + ejbClass.getName());
			
		} catch (NamingException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}	
	public GestionRencontreRemote getGestionRencontre() {
		System.out.println("je suis dans le EjbLocator");

		return getEjb(GestionRencontreRemote.class, "GestionRencontre");
	}
// Rajouter ici une méthode pour tout nouvel EJB auquel on souhaite accéder
	}

