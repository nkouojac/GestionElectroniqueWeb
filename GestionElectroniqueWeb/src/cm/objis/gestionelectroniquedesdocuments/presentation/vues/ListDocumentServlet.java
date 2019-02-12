package cm.objis.gestionelectroniquedesdocuments.presentation.vues;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.objis.gestionelectroniquedesdocuments.domaine.Document;
import cm.objis.gestionelectroniquedesdocuments.service.IService;
import cm.objis.gestionelectroniquedesdocuments.service.Service;



/**
 * Servlet implementation class ListEleveServlet
 */
@WebServlet("/ListDocumentServlet")
public class ListDocumentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListDocumentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recuperation de la liste des eleves enregistres
		// Obtain a database connection:
        EntityManagerFactory emf =
           (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
	
				IService service = new Service(em);
				
				List<Document>listDocument;
				
				listDocument =service.getAllDocumentService();
				
				// enregistrement de la liste dans la session
				
				HttpSession session=request.getSession();
				session.setAttribute("ListDocument", listDocument);
				System.out.println(listDocument);
				request.getRequestDispatcher("liste-des-documents.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
