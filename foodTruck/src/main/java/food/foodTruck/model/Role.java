package food.foodTruck.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Role {
	@Id
	private int idRole;
	private String nom;
	private Collection<Utilisateur> utilisateur;
	@Version
	private int version;
	
	
	//Constructeur
	public Role() {
		super();
	}
	
	
	
	public Role(int idRole, String nom, int version) {
		super();
		this.idRole = idRole;
		this.nom = nom;
		this.version = version;
	}



	//Accesseurs
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
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
