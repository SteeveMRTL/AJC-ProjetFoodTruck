package food.foodTruck.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

@Entity
public class actualite {
	
	private int id;
	private String title;
	private String description;
	private String dateCreation;
	private String dateFinValidité;
	private String imageURL;
	private String utilisateurCreation;
	private int version;
	
	
	//Constructeur
	public actualite(int id, String title, String description, String dateCreation, String dateFinValidité,
			String imageURL, String utilisateurCreation, int version) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.dateCreation = dateCreation;
		this.dateFinValidité = dateFinValidité;
		this.imageURL = imageURL;
		this.utilisateurCreation = utilisateurCreation;
		this.version = version;
	}


	public actualite() {
		super();
	}


	
	//Accesseurs
	@Id
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}


	public String getDateFinValidité() {
		return dateFinValidité;
	}


	public void setDateFinValidité(String dateFinValidité) {
		this.dateFinValidité = dateFinValidité;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getUtilisateurCreation() {
		return utilisateurCreation;
	}


	public void setUtilisateurCreation(String utilisateurCreation) {
		this.utilisateurCreation = utilisateurCreation;
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
		return "actualite [id=" + id + ", title=" + title + ", description=" + description + ", dateCreation="
				+ dateCreation + ", dateFinValidité=" + dateFinValidité + ", imageURL=" + imageURL
				+ ", utilisateurCreation=" + utilisateurCreation + ", version=" + version + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
