package cm.objis.gestionelectroniquedesdocuments.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import cm.objis.gestionelectroniquedesdocuments.domaine.Document;
import cm.objis.gestionelectroniquedesdocuments.utilitaires.ConnectionMYSQL;

/**
 * @author jaqueline classe qui implemmente l'interface IDao
 *
 */
public class Dao implements IDao {
private EntityManager em;
	public Dao(EntityManager em) {
		super();
this.em= em;
		// TODO Auto-generated constructor stub
	}
	public int saveDocumentDao(Document document) {
		// TODO Auto-generated method stub
		
		
		try {
			// 2 : Ouverture transaction 
						EntityTransaction tx =  em.getTransaction();
						tx.begin();
					
						// 3 : tance ObjPersiset/Relationnel : cr�ation d'un enregistrement en base
						
						 em.persist(document);
						
						// 4 : Fermeture transaction 
						 tx.commit();
						
			
	/**public int enregistrerDocumentDao(Document document) {

		try {
			// Etape1:r�cup�ration de la connexion
			Connection cn = ConnectionMYSQL.getInstance();
			String sql = "INSERT  INTO`document`(`nomDuDocument`,`objet`,`auteur` ,`destinataire`,`dateRedaction`,`nombreDesPiecesJointes`)"
					+ "VALUES(?,?,?,?,?,?)";

			// Etape2: Cr�ation d'un statement

			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, document.getNomDuDocument());
			ps.setString(2, document.getObjet());
			ps.setString(3, document.getAuteur());
			ps.setString(4, document.getDestinataire());
			ps.setString(5, document.getDateRedaction());
			ps.setInt(6, document.getNombrePiecesJointes());

			// Etape 3: execution requ�te
			ps.executeUpdate();

			

			// Etape4 gestion des exceptions et lib�ration automatique des
			// ressources*/

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			

		}
		return 1;
	}

	@Override

	public List<Document> getAllDocuments() {

		/*
		 * *cr�ation d'une collection des documents
		 */
		List<Document> maListeDocument = new ArrayList<Document>();
		try {

			// 2 : Ouverture transaction 
			EntityTransaction tx =  em.getTransaction();
			tx.begin();
		
			// 3 : obtention de la liste des documents via entityManager
			 maListeDocument = em.createQuery("From Document", Document.class).getResultList();
					         
			// 4 : Fermeture transaction 
			 tx.commit();
			
			/*
			// Etappe1: r�cup�ration de la connexion

			Connection cn = ConnectionMYSQL.getInstance();

			// Etappe2:preparation d la requ�te
			Statement st = cn.createStatement();
			String sql = "SELECT * FROM document";

			// Etappe3:execution requ�te
			ResultSet rs = st.executeQuery(sql);

			// Etappe 4: parcours Resultset (optionnel)
			while (rs.next()) {

				Document document = new Document();
				// document.setRefference(rs.getString("id"));
				document.setNomDuDocument(rs.getString("nomDuDocument"));
				document.setObjet(rs.getString("objet"));
				document.setAuteur(rs.getString("auteur"));
				document.setDestinataire(rs.getString("destinataire"));
				document.setRefference(rs.getInt("idDocument"));
				document.setNombrePiecesJointes(rs.getInt("nombreDesPiecesJointes"));

				/**
				 * Instuction permettant d'ajouter un objet document dans la
				 * liste des documents
				 * 
				
				maListeDocument.add(document);
				// System.out.println(rs.getString("nomDuDocument")+""+rs.getString("objet"));
			}
			// Etape5: gestion des exceptions et liberation automatique' des
			// ressources 
		*/
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return maListeDocument;

	}
	@Override
	public int enregistrerDocumentDao(Document document) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*public int enregistrerDocumentDao(Document document) {
		// TODO Auto-generated method stub
		return 0;*/
	}


