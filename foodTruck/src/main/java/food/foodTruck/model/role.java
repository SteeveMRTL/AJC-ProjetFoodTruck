package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class role {
	private int idRole;
	private String nom;
	private int version;
	
	
	//Constructeur
	public role() {
		super();
	}
	
	
	
	public role(int idRole, String nom, int version) {
		super();
		this.idRole = idRole;
		this.nom = nom;
		this.version = version;
	}



	//Accesseurs
@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	@Id
	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	//ToString
	public String toString() {
		return "role [idRole=" + idRole + ", nom=" + nom + "]";
	}

	
	
	
	
	
	
	
	
	


	
	

	
	
	
	

}
