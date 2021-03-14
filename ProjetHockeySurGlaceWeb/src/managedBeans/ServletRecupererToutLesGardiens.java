package managedBeans;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hw.Gardien;
import hw.GestionGardienRemote;
import hw.GestionScoreDeMatchRemote;
import hw.ScoreDeMatch;

/**
 * Servlet implementation class ServletRecupererToutLesGardiens
 */
@WebServlet("/recupererToutLesGardiens")
public class ServletRecupererToutLesGardiens extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRecupererToutLesGardiens() {
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
    	out.println("Affichage de contenu de la Servlet Recuperer Tout Les Gardiens");
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
    	GestionGardienRemote gestionEquipe=null; 
    	final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		Context context=null;	
		
		try {
			context = new InitialContext(jndiProperties);
			gestionEquipe = EjbLocator.getLocator().getGestionGardien();

		} catch (NamingException e1) {
			e1.printStackTrace();
		}
    	
		try {
			ObjectInputStream entree=new ObjectInputStream(request.getInputStream());
			Gardien  sdm=(Gardien)entree.readObject();
			Collection<Gardien> sdmret = gestionEquipe.listerGardien();
			System.out.println("utttttttttttttttt" +sdmret);
			ObjectOutputStream sortie=new ObjectOutputStream(response.getOutputStream());
			sortie.writeObject(sdmret);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
    }


}
