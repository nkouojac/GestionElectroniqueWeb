package cm.objis.gestionelectroniquedesdocuments.presentation.vues;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class GestionLyceeWebListner
 *
 */
@WebListener
public class GestionDocumentWebListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public GestionDocumentWebListner() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     *  Prepare the EntityManagerFactory 
     **/
    public void contextInitialized(ServletContextEvent e) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestionelectroniquedesdocuments-pu");
        e.getServletContext().setAttribute("emf", emf);
    }
 
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     *  Release the EntityManagerFactory:
     */
    public void contextDestroyed(ServletContextEvent e) {
        EntityManagerFactory emf =
            (EntityManagerFactory)e.getServletContext().getAttribute("emf");
        emf.close();
    }
   
}
