package cm.objis.gestionelectroniquedesdocuments.domaine;

public class Utilisateur {
	String nomUtilisateur;
	String prenomUtilisateur;
	String sexeUtilisateur;
	String relationUtilisateur;
	int ageUtilisateur;

	/**
	 * constructeur par defaut qui ne prend aucunn param�tre
	 */
	public Utilisateur() {
		super();
	}

	/**
	 * @param nomUtilisateur
	 * @param prenomUtilisateur
	 * @param sexeUtilisateur
	 * @param relationUtilisateur
	 * @param ageUtilisateur
	 * constructeur prenant en param�tres le nom de l'utilisateur,son prenom ,son sexe ,sa  relation et son age
	 */
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String sexeUtilisateur,
			String relationUtilisateur, int ageUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.sexeUtilisateur = sexeUtilisateur;
		this.relationUtilisateur = relationUtilisateur;
		this.ageUtilisateur = ageUtilisateur;
	}

	/**
	 * @return
	 * methode qui permet de lire le nom de  lutlisateur et retourne le nom de l'utilisateur
	 */
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	/**
	 * @param nomUtilisateur
	 * methode qui permet de modifier le nom del'utilisateur avec pour pram�tre nom de l'utilisateur
	 */
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	/**
	 * @return
	 * 
	 * methode qui permet de lire le prenom de l'utlisateuur et retourne le prenom de l'utilisateur
	 */
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	/**
	 * @param prenomUtilisateur
	 * methode qui permet de modifier le prenom de l'utilisateur en prenant en param�tre le prenom de l'utilisateur
	 */
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	/**
	 * @return
	 * methode qui permet de lire le sexe de l'utilisateur et retourne le sexe de l'utilisateur
	 */
	public String getSexeUtilisateur() {
		return sexeUtilisateur;
	}

	/**
	 * @param sexeUtilisateur
	 * methode qui permet de modifier le sexe de l'utilisateur en prenant en param�tre le sexe de l'utilisateur
	 */
	public void setSexeUtilisateur(String sexeUtilisateur) {
		this.sexeUtilisateur = sexeUtilisateur;
	}

	/**
	 * @return
	 * methode qui permet de lire la relation de l'utilisateur et retourne la relation avec l'utilisateur
	 */
	public String getRelationUtilisateur() {
		return relationUtilisateur;
	}

	/**
	 * @param relationUtilisateur
	 * methode qui permet de modifier la relation avec l'utilisateur en prennant en param�tre la relationUtilisateur
	 */
	public void setRelationUtilisateur(String relationUtilisateur) {
		this.relationUtilisateur = relationUtilisateur;
	}

	/**
	 * @return
	 * methode qui permet lire l'age de l'utilisateur et retourne l'�ge de l'utilisateur
	 */
	public int getAgeUtilisateur() {
		return ageUtilisateur;
	}

	/**
	 * @param ageUtilisateur
	 * methode qui permet modifier l'age de l'utilisateur en prenant en param�tre l'�ge de l'utilisateur
	 */
	public void setAgeUtilisateur(int ageUtilisateur) {
		this.ageUtilisateur = ageUtilisateur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() 
	 * m�thode qui permet d'afficher l'etat des objets en m�moire
	 */
	@Override
	public String toString() {
		return "Utilisateur [nomUtilisateur=" + nomUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur
				+ ", sexeUtilisateur=" + sexeUtilisateur + ", relationUtilisateur=" + relationUtilisateur
				+ ", ageUtilisateur=" + ageUtilisateur + "]";
	}

}
