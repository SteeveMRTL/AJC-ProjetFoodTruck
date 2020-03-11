package food.foodTruck.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class LigneCommande {
	@Id
	private int idLigneCommande;
	@OneToOne
	@JoinColumn(name="idProduit")
	private Produit produit;
	@ManyToOne
	@JoinColumn(name="idEnteteCommande")
	private EnteteCommande enteteCommande;
	private int quantite;
	private int prixUnitaire;
	@ManyToOne
	@JoinColumn(name="idTypeRepas")
	private TypeRepas typeRepas;
	
	//constructeur
	public LigneCommande() {
		super();
	}

	//accesseurs
	public int getIdLigneCommande() {
		return idLigneCommande;
	}

	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public EnteteCommande getEnteteCommande() {
		return enteteCommande;
	}

	public void setEnteteCommande(EnteteCommande enteteCommande) {
		this.enteteCommande = enteteCommande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public TypeRepas getTypeRepas() {
		return typeRepas;
	}

	public void setTypeRepas(TypeRepas typeRepas) {
		this.typeRepas = typeRepas;
	}
}
