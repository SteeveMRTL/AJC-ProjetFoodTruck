package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue
	private String idUtilisateur;
	private String nom;
	private String prenom;
	@ManyToOne
	@JoinColumn(name ="idGenre")
	private Genre genre;
	private String dateDeNaissance;
	private String mdp;
	private String email;
	@ManyToOne
	@JoinColumn (name ="idSociete")
	private Societe societe;
	private String historique;
	@ManyToOne
	@JoinColumn (name ="idRole")
	private Role role;
	@ManyToOne
	@JoinColumn(name= "idAdresse")
	private Adresse adresse;
	@OneToMany(mappedBy="utilisateur")
	private Collection<Avis> avis;
	@Version
	private int version;
	
	
//Constructeur

	public Utilisateur() {
		super();
	}
	

	public Utilisateur(String idUtilisateur, String nom, String prenom, Genre genre, String dateDeNaissance, String mdp,
		String email, Societe societe, String historique, Role role, Adresse adresse, int version) {
	super();
	this.idUtilisateur = idUtilisateur;
	this.nom = nom;
	this.prenom = prenom;
	this.genre = genre;
	this.dateDeNaissance = dateDeNaissance;
	this.mdp = mdp;
	this.email = email;
	this.societe = societe;
	this.historique = historique;
	this.role = role;
	this.adresse = adresse;
	this.version = version;
}


	//Accesseurs
	
	public String getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Societe getSociete() {
		return societe;
	}


	public void setSociete(Societe societe) {
		this.societe = societe;
	}


	public String getHistorique() {
		return historique;
	}


	public void setHistorique(String historique) {
		this.historique = historique;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", genre="
				+ genre + ", dateDeNaissance=" + dateDeNaissance + ", mdp=" + mdp + ", email=" + email + ", societe="
				+ societe + ", historique=" + historique + ", role=" + role + ", adresse=" + adresse + ", version="
				+ version + "]";
	}

	
	

	
	
	
	
	
	
	
	
	

}
