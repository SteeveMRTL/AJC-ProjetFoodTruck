package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Societe {
	private int idSociete;
	private String nom;
	private int version;
	
	
	
	
	//Constructeur
	public Societe() {
		super();
	}
	
	
	public Societe(int idSociete, String nom, int version) {
		super();
		this.idSociete = idSociete;
		this.nom = nom;
		this.version = version;
	}




	//Accesseur
	
	@Id
	public int getIdSociete() {
		return idSociete;
	}



	public void setIdSociete(int idSociete) {
		this.idSociete = idSociete;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
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
		return "Societe [idSociete=" + idSociete + ", nom=" + nom + ", version=" + version + "]";
	}
	
	
	
	
	
	
	
	
	

}
