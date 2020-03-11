package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@ Entity
public class FamilleProduit {

	// attributs
	@Id
	private int idFamilleProduit;
	
	private String libelle;
	
	private boolean actif;
	
	@OneToMany(mappedBy="familleProduit")
	public Collection<Produit> produits;
	
	@Version
	private int version;

	
	//constructeur
	public FamilleProduit() {
		super();
	}
	
	//accesseurs
	public int getIdFamilleProduit() {
		return idFamilleProduit;
	}

	public void setIdFamilleProduit(int idFamilleProduit) {
		this.idFamilleProduit = idFamilleProduit;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
