package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Adresse {

	private int idAdresse;
	private int numRue;
	private int codePostal;
	private String ville;
	private String Pays;
	private String typeAdresse;
	private int idUtilisateur;
	private boolean isActive;
	private int vesrsion;

	// Constructeurs

	public Adresse() {
		super();
	}

	public Adresse(int idAdresse, int numRue, int codePostal, String ville, String pays, String typeAdresse,
			int idUtilisateur, boolean isActive, int vesrsion) {
		super();
		this.idAdresse = idAdresse;
		this.numRue = numRue;
		this.codePostal = codePostal;
		this.ville = ville;
		Pays = pays;
		this.typeAdresse = typeAdresse;
		this.idUtilisateur = idUtilisateur;
		this.isActive = isActive;
		this.vesrsion = vesrsion;
	}

	// Accesseurs
@Id
	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public String getTypeAdresse() {
		return typeAdresse;
	}

	public void setTypeAdresse(String typeAdresse) {
		this.typeAdresse = typeAdresse;
	}

	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
@Version
	public int getVesrsion() {
		return vesrsion;
	}

	public void setVesrsion(int vesrsion) {
		this.vesrsion = vesrsion;
	}

	// ToString
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numRue=" + numRue + ", codePostal=" + codePostal + ", ville="
				+ ville + ", Pays=" + Pays + ", typeAdresse=" + typeAdresse + ", idUtilisateur=" + idUtilisateur
				+ ", isActive=" + isActive + "]";
	}

}
