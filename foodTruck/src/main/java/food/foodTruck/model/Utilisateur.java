package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Utilisateur {
	private String idUtilisateur;
	private String idSociete;
	private String idAdresse;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String mdp;
	private String genre;
	private String email;
	private String societe;
	private String historique;
	private String role;
	private String adresses;
	private int version;
	
	
	
	
	
//Constructeur

	public Utilisateur() {
		super();
	}
	


	public Utilisateur(String idUtilisateur, String idSociete, String idAdresse, String nom, String prenom,
		String dateDeNaissance, String mdp, String genre, String email, String societe, String historique, String role,
		String adresses, int version) {
	super();
	this.idUtilisateur = idUtilisateur;
	this.idSociete = idSociete;
	this.idAdresse = idAdresse;
	this.nom = nom;
	this.prenom = prenom;
	this.dateDeNaissance = dateDeNaissance;
	this.mdp = mdp;
	this.genre = genre;
	this.email = email;
	this.societe = societe;
	this.historique = historique;
	this.role = role;
	this.adresses = adresses;
	this.version = version;
}


	//Accesseurs
	
	@Id
	public String getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getIdSociete() {
		return idSociete;
	}
	public void setIdSociete(String idSociete) {
		this.idSociete = idSociete;
	}
	public String getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(String idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public String getHistorique() {
		return historique;
	}
	public void setHistorique(String historique) {
		this.historique = historique;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAdresses() {
		return adresses;
	}
	public void setAdresses(String adresses) {
		this.adresses = adresses;
	}
@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	//ToString
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", idSociete=" + idSociete + ", idAdresse=" + idAdresse
				+ ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + ", mdp=" + mdp
				+ ", genre=" + genre + ", email=" + email + ", societe=" + societe + ", historique=" + historique
				+ ", role=" + role + ", adresses=" + adresses + "]";
	}

	
	
	
	
	
	
	

}
