package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Avis {
	
	//attribut
	@Id
	private int idAvis;
	
	@ManyToOne
	@JoinColumn (name ="idUtilisateur")
	private Utilisateur utilisateur;
	
	private String commentaire;
	
	private int note;
	
	@Version
	private int version;
	
	
	//constructeur
	public Avis() {
		super();
	}

	public int getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(int idAvis) {
		this.idAvis = idAvis;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
	

}
