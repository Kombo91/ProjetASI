package managedBeans;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hw.Equipe;
import hw.GestionEquipeRemote;
import hw.GestionRencontreRemote;
import hw.Rencontre;

/**
 * Servlet implementation class ServletEquipe
 */
@WebServlet("/equipe")
public class ServletEquipe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEquipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = null;
		response.setContentType("text/html");
		out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Test de servlet</title></head>");
		out.println("<body>");
		out.println("Affichage de contenu de la Servlet Equipe");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestionEquipeRemote gestionEquipe = null;
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		Context context = null;

		try {
			context = new InitialContext(jndiProperties);
			gestionEquipe = EjbLocator.getLocator().getGestionEquipe();

		} catch (NamingException e1) {
			e1.printStackTrace();
		}

		try {
			ObjectInputStream entree = new ObjectInputStream(request.getInputStream());
			int id = (int) entree.readObject();
			List<Equipe> equipes = (List<Equipe>) gestionEquipe.listerEquipeAdvers(id);
			ObjectOutputStream sortie = new ObjectOutputStream(response.getOutputStream());
			sortie.writeObject(equipes);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
