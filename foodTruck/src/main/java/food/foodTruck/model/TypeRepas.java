package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;


public class TypeRepas {

	//attributs
	@Id
	private int idTypeRepas;
	private int libelle;
	private String heureLimite;
	private boolean actif;
	@OneToMany(mappedBy="typeRepas")
	private Collection<Produit> produits;
	@Version
	private int version;
	
	//constructeur
	public TypeRepas() {
		super();
	}

	//accssseurs
	public int getIdTypeRepas() {
		return idTypeRepas;
	}

	public void setIdTypeRepas(int idTypeRepas) {
		this.idTypeRepas = idTypeRepas;
	}

	public int getLibelle() {
		return libelle;
	}

	public void setLibelle(int libelle) {
		this.libelle = libelle;
	}

	public String getHeureLimite() {
		return heureLimite;
	}

	public void setHeureLimite(String heureLimite) {
		this.heureLimite = heureLimite;
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
