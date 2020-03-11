package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;



@Entity
public class Actualite {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String description;
	private String dateCreation;
	private String dateFinValidité;
	private String imageUrl;
	private String utilisateurCreation;
	
	@Version
	private int version;

	public Actualite() {
		super();
	}


	
	//Accesseurs
	
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


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public String getUtilisateurCreation() {
		return utilisateurCreation;
	}


	public void setUtilisateurCreation(String utilisateurCreation) {
		this.utilisateurCreation = utilisateurCreation;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}

}
