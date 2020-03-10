package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Genre {
	private int idGenre;
	private String genre;
	private int version;

//Constructeurs

	public Genre(int idGenre, String genre, int version) {
		super();
		this.idGenre = idGenre;
		this.genre = genre;
		this.version = version;
	}

	public Genre() {
		super();
	}
	
	
	//Accesseur
	@Id
	public int getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(int idGenre) {
		this.idGenre = idGenre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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
		return "Genre [idGenre=" + idGenre + ", genre=" + genre + ", version=" + version + "]";
	}
	
	
	
	
	
	
	

}
