package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Produit {
	
	//attributs
	private int idProduit;
	private TypeRepas typeRepas;
	private FamilleProduit familleproduit;
	private int prix;
	private String imageUrl;
	private String compoProduit;
	private int stock;
	private String dateLivraison;//à revoir dans le MOA
	private RegimeSpecial regimeSpecial;
	private String jourDispo;
	private int version;
	
	//constructeur
	public Produit() {
		super();
	}

	@Id
	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	@ManyToOne
	@JoinColumn(name="idTypeRepas")
	public TypeRepas getTypeRepas() {
		return typeRepas;
	}

	public void setTypeRepas(TypeRepas typeRepas) {
		this.typeRepas = typeRepas;
	}

	@ManyToOne
	@JoinColumn(name="idFamilleProduit")
	public FamilleProduit getFamilleproduit() {
		return familleproduit;
	}

	public void setFamilleproduit(FamilleProduit familleproduit) {
		this.familleproduit = familleproduit;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCompoProduit() {
		return compoProduit;
	}

	public void setCompoProduit(String compoProduit) {
		this.compoProduit = compoProduit;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(String dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	@ManyToOne
	@JoinColumn(name="idRegimeSpecial")
	public RegimeSpecial getRegimeSpecial() {
		return regimeSpecial;
	}

	public void setRegimeSpecial(RegimeSpecial regimeSpecial) {
		this.regimeSpecial = regimeSpecial;
	}

	public String getJourDispo() {
		return jourDispo;
	}

	public void setJourDispo(String jourDispo) {
		this.jourDispo = jourDispo;
	}

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
