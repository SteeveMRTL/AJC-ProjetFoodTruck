package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Societe {
	
	@Id
	@GeneratedValue
	private int idSociete;
	private String nom;
	@OneToMany (mappedBy ="societe")
	private Collection<Utilisateur> utilisateurs;
	@Version
	private int version;
	
	
	
	
	
	//Constructeur
	public Societe() {
		super();
	}
	
	
	public Societe(int idSociete, String nom, Collection<Utilisateur> utilisateurs, int version) {
		super();
		this.idSociete = idSociete;
		this.nom = nom;
		this.utilisateurs = utilisateurs;
		this.version = version;
	}

	
	//Accesseur
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
		return "Societe [idSociete=" + idSociete + ", nom=" + nom + ", utilisateurs=" + utilisateurs + ", version="
				+ version + "]";
	}

	

}
