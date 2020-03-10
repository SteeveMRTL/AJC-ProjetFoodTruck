package food.foodTruck.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class RegimeSpecial {

	//attributs
	private int idRegimeSpecial;
	private String regimeSpecial;
	private Collection<Produit> produits;
	private int version;
		
	public RegimeSpecial() {
		super();
	}
	
	@Id
	public int getIdRegimeSpecial() {
		return idRegimeSpecial;
	}
	public void setIdRegimeSpecial(int idRegimeSpecial) {
		this.idRegimeSpecial = idRegimeSpecial;
	}
	public String getRegimeSpecial() {
		return regimeSpecial;
	}
	public void setRegimeSpecial(String regimeSpecial) {
		this.regimeSpecial = regimeSpecial;
	}
	
	@OneToMany(mappedBy="regimeSpecial")
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
