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
 * Servlet implementation class EnregistrDocumentServlet
 */
@WebServlet("/EnregistrDocumentServlet")
public class EnregistrDocumentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnregistrDocumentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @param matricule 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//declaration des variables que l'utilisateur a saisi dans le formulaire
		        String nomDocument;
				String objet;
				String auteur;
				String destinataire;
				String reference;
				String dateRedaction;
				int  nombrePiecesJointes;
				// RECUPERATION DES PARAMETRES ENVOYER LE FORMULAIRE
				nomDocument = request.getParameter("nomDocument");
				objet = request.getParameter("objet");
				auteur = request.getParameter("auteur");
				destinataire = request.getParameter("destinataire");
				reference =request.getParameter("reference");
				dateRedaction = request.getParameter("dateRedaction");
				nombrePiecesJointes = Integer.parseInt(request.getParameter("nombrePiecesJointes"));

				
				Document document  = new Document();
				//initialisation des attributs de l'objet eleve
				
				document.setNomDuDocument(nomDocument);
				document.setObjet(objet);
				document.setAuteur(auteur);
				document.setDestinataire(destinataire);
				document.setRefference(reference);
				document.setDateRedaction(dateRedaction);
				document.setNombrePiecesJointes(nombrePiecesJointes);
				System.out.println(document);
				//enregistrement de l'objet eleve dans la base de donnee
			 // Obtain a database connection:
		        EntityManagerFactory emf =
		           (EntityManagerFactory)getServletContext().getAttribute("emf");
		        EntityManager em = emf.createEntityManager();
			
			   IService service = new Service(em);
			   service.enregistrerDocumentService(document);
			   
			    
			    request.getRequestDispatcher("/ListDocumentServlet").forward(request,response);
			    
	}

}
