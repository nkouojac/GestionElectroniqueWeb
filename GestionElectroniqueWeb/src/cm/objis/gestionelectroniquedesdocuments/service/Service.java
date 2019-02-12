
package cm.objis.gestionelectroniquedesdocuments.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import cm.objis.gestionelectroniquedesdocuments.dao.Dao;
import cm.objis.gestionelectroniquedesdocuments.dao.IDao;
import cm.objis.gestionelectroniquedesdocuments.domaine.Document;

/**
 * 
 * cette classe (Service) implemente un ensemble des méthodes permettant
 * d'enrégistrer un document,d'afficher un document
 */
public class Service implements IService {
	private IDao dao;

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public Service(IDao dao) {
		super();
		this.dao = dao;
	}
	public Service(EntityManager em) {
		
		this.dao = new Dao(em);
	}

	@Override
	public int enregistrerDocumentService(Document document) {
		// TODO Auto-generated method stub
		return dao.saveDocumentDao(document);
	}

	@Override
	public List<Document> getAllDocumentService() {
		// TODO Auto-generated method stub
		return dao.getAllDocuments();
	}

}
