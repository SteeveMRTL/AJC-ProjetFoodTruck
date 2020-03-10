package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private int idGenre;
	private String genre;
	@OneToMany(mappedBy= "genre")
	private Collection<Utilisateur> utilisateurs;
	@Version
	private int version;

//Constructeurs

	public Genre() {
		super();
	}

	public Genre(int idGenre, String genre, Collection<Utilisateur> utilisateurs, int version) {
		super();
		this.idGenre = idGenre;
		this.genre = genre;
		this.utilisateurs = utilisateurs;
		this.version = version;
	}

//Accesseur
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

	public Collection<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Genre [idGenre=" + idGenre + ", genre=" + genre + ", utilisateurs=" + utilisateurs + ", version="
				+ version + "]";
	}

}
