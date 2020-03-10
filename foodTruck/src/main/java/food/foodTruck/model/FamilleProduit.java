package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

public class FamilleProduit {

	// attributs
	private int idFamilleProduit;
	private String libelle;
	private boolean actif;
	public Collection<Produit> produits;
	private int version;

	@Id
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

	@OneToMany(mappedBy="FamilleProduit")
	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
