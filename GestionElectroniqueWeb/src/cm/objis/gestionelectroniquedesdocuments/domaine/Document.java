package cm.objis.gestionelectroniquedesdocuments.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * @author jaqueline La classe document fournit les methodes permettant de
 *         recup�rer les informations d'un document
 */
public class Document {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDocument;
	
	private String nomDuDocument;// propri�t�
	private String objet;// propri�t�
	protected String auteur;// propri�t�
	private String destinataire;// propri�t�
	private String refference;// propri�t�
	private String dateRedaction;// propri�t�
	private int nombrePiecesJointes;// propri�t�

	/*
	 * Constructeurs de la classe
	 * 
	 * @param nomDuDocument
	 * 
	 * @param objet
	 * 
	 * @param auteur
	 * 
	 * @param destinataire
	 * 
	 * @param refference
	 * 
	 * @param date
	 * 
	 * @param nombrepiecesjointes constructeur prenant en parametres tous les
	 * parametres de la classe Document(nom du document,l'objet,l'auteur,le
	 * destinataire,la refference, la date et le nombre des pi�es jointes
	 */

	public Document(String nomDuDocument, String objet, String auteur, String destinataire, String refference, String date,
			int nombrepiecesjointes) {
		super();// super fait refference au constructeur de la classe parente
		this.nomDuDocument = nomDuDocument;// this d�signe l'objet courant(cette
											// instance de l'objet)
		this.objet = objet;
		this.auteur = auteur;
		this.destinataire = destinataire;
		this.refference = refference;
		this.dateRedaction = date;
		this.nombrePiecesJointes = nombrepiecesjointes;
	}

	public Document(String nomDuDocument, String objet, String auteur, String destinataire, String date,
			int nombrepiecesjointes) {
		super();
		this.nomDuDocument = nomDuDocument;
		this.objet = objet;
		this.auteur = auteur;
		this.destinataire = destinataire;
		this.dateRedaction = date;
		this.nombrePiecesJointes = nombrepiecesjointes;
	}

	/**
	 * 
	 * constructeur par defaut qui ne prend aucun param�tre
	 */
	public Document() {
		super();// super fait reference au constructeur de la classe parente
	}

	public Document(String nomDuDocument2, Utilisateur uilisateur2, String destinataire2, int refference2,
			String date2) {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Getter et Setter
	 * 
	 */

	/**
	 * methode permettant d'obtenir le nom du document
	 * 
	 * @return
	 */
	public String getNomDuDocument() {
		return nomDuDocument;
	}

	/**
	 * @param nomDuDocument
	 *            m�thode permettant de modifier le nom du document dans la
	 *            classe en prenant en param�tre le nom du document
	 * 
	 */
	public void setNomDuDocument(String nomDuDocument) {
		this.nomDuDocument = nomDuDocument;
	}

	/**
	 * @return m�thode permettant de lire l'objet de la classe et qui retourne
	 *         l'objet
	 */

	public String getObjet() {
		return objet;
	}

	/**
	 * @param objet
	 *            m�thode permettant de modifier l'objet de la classe en prenant
	 *            en param�tre l'objet
	 */
	public void setObjet(String objet) {
		this.objet = objet;
	}

	/**
	 * @return m�thode permettant de lire le nom de l'auteur du document et qui
	 *         retourne l'auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur
	 *            m�thode permettant de modifier le nom de l'auteur du document
	 *            dans la classe en prenant en param�tre l'auteur
	 * 
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return m�thode permettant de lire le nom du destinataire du document
	 *         dans la classe et retourne le detinataire
	 * 
	 */
	public String getDestinataire() {
		return destinataire;
	}

	/**
	 * @param destinataire
	 *            m�thode permettant de modifier le nom du destinataire dans la
	 *            classe et retourne le destinataire
	 * 
	 */
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	/**
	 * @return m�thode permettant de lire la refferene du document et retourne
	 *         la refference
	 * 
	 */
	public String getRefference() {
		return refference;
	}

	/**
	 * @param reference
	 *            m�thode permettant de modifier la reference du document en
	 *            prenant en param�tre la refference
	 * 
	 */
	public void setRefference(String refference) {
		this.refference = refference;
	}

	/**
	 * @return m�thode permettant de lire la date de r�daction du document et
	 *         qui retourne la date
	 * 
	 */
	public String getDateRedaction() {
		return dateRedaction;
	}

	/**
	 * @param date
	 *            m�thode permettant de modifier la date de r�daction du
	 *            document en prnant enn param�tre la date
	 */
	public void setDateRedaction(String date) {
		this.dateRedaction = date;
	}

	/**
	 * @return m�thode permettant de lire le nombre des pi�ces jointes au
	 *         document et qui retourne le nombre des pi�ces jointes
	 */
	public int getNombrePiecesJointes() {
		return nombrePiecesJointes;
	}

	/**
	 * @param nombrePiecesJointes
	 *            m�thode permettant de modifier le nombre des pi�ces jointes au
	 *            document en prenant en param�tre le nombre des p�i�ces jointes
	 * 
	 */
	public void setNombrePiecesJointes(int nombrePiecesJointes) {
		this.nombrePiecesJointes = nombrePiecesJointes;
	}

	@Override
	public String toString() {
		return "Document [nomDuDocument=" + nomDuDocument + ", objet=" + objet + ", auteur=" + auteur
				+ ", destinataire=" + destinataire + ", refference=" + refference + ", date=" + dateRedaction
				+ ", nombrepiecesjointes=" + nombrePiecesJointes + "]";
		// methode permettant d'afficher l'etat de l' objet en memoire
	}

}
