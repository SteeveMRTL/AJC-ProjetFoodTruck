package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Produit {
	
	//attributs
	@Id
	private int idProduit;
	
	@ManyToOne
	@JoinColumn(name="idTypeRepas")
	private TypeRepas typeRepas;
	
	@ManyToOne
	@JoinColumn(name="idFamilleProduit")
	private FamilleProduit familleProduit;
	private int prix;
	private String imageUrl;
	private String compoProduit;
	private int stock;
	@ManyToOne
	@JoinColumn(name="idRegimeSpecial")
	private RegimeSpecial regimeSpecial;
	private String jourDispo;
	@Version
	private int version;
	
	//constructeur
	public Produit() {
		super();
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public TypeRepas getTypeRepas() {
		return typeRepas;
	}

	public void setTypeRepas(TypeRepas typeRepas) {
		this.typeRepas = typeRepas;
	}

	public FamilleProduit getFamilleproduit() {
		return familleProduit;
	}

	public void setFamilleproduit(FamilleProduit familleproduit) {
		this.familleProduit = familleproduit;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
