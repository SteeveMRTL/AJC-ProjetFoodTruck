package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Adresse {
    @Id
	private int idAdresse;
	private int numRue;
	private int codePostal;
	private String ville;
	private String pays;
	private String typeAdresse;
	@OneToMany (mappedBy="adresse")
	private Collection<Utilisateur> utilisateurs;
	private boolean isActive;
	@Version
	private int vesrsion;

	// Constructeurs

	public Adresse() {
		super();
	}


	public Adresse(int idAdresse, int numRue, int codePostal, String ville, String pays, Collection<Utilisateur> utilisateurs,
			boolean isActive, int vesrsion) {
		super();
		this.idAdresse = idAdresse;
		this.numRue = numRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.utilisateurs = utilisateurs;
		this.isActive = isActive;
		this.vesrsion = vesrsion;
	}



	// Accesseurs

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
		return pays;
	}

	public void setPays(String pays) {
		pays = pays;
	}

	public String getTypeAdresse() {
		return typeAdresse;
	}

	public void setTypeAdresse(String typeAdresse) {
		this.typeAdresse = typeAdresse;
	}

	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getVesrsion() {
		return vesrsion;
	}

	public void setVesrsion(int vesrsion) {
		this.vesrsion = vesrsion;
	}


	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numRue=" + numRue + ", codePostal=" + codePostal + ", ville="
				+ ville + ", pays=" + pays + ", typeAdresse=" + typeAdresse + ", utilisateurs=" + utilisateurs
				+ ", isActive=" + isActive + ", vesrsion=" + vesrsion + "]";
	}

	

}
