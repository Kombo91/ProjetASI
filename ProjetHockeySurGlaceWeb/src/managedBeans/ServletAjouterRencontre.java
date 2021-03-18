package managedBeans;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hw.GestionScoreDeMatchRemote;
import hw.Rencontre;
import hw.GestionConnexionRemote;
import hw.GestionRencontreRemote;
import hw.ScoreDeMatch;
import hw.Utilisateur;
/**
 * Servlet implementation class ServletAjouterRencontre
 */
@WebServlet("/ajouterRencontre")
public class ServletAjouterRencontre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAjouterRencontre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out=null;
    	response.setContentType("text/html");
    	out=response.getWriter();
    	out.println("<html>");
    	out.println("<head><title>Test de servlet</title></head>");
    	out.println("<body>");
    	out.println("Affichage de contenu de la Servlet Ajouter Rencontre");
    	out.println("</body>");
    	out.println("</html>");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	GestionRencontreRemote gestionEquipe=null; 
    	final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		Context context=null;	
		
		try {
			context = new InitialContext(jndiProperties);
			gestionEquipe = EjbLocator.getLocator().getGestionRencontre();

		} catch (NamingException e1) {
			e1.printStackTrace();
		}
    	
		try {
			ObjectInputStream entree=new ObjectInputStream(request.getInputStream());
			Rencontre  sdm=(Rencontre)entree.readObject();
			Rencontre rcd = gestionEquipe.ajouterRencontre(sdm);
			System.out.println("utttttttttttttttt" +rcd);
			ObjectOutputStream sortie=new ObjectOutputStream(response.getOutputStream());
			sortie.writeObject(rcd);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
    }

}
