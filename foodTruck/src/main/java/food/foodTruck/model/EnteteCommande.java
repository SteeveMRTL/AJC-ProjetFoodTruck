package food.foodTruck.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EnteteCommande {
	
	@Id
	private int idEnteteCommande;
	
	//cardinalité à définir
//private Adresse adresseLivraison;
//	//cardinalité à définir
//private Adresse adresseFacturation;
	
	private String dateCommande;
	
	private boolean livraisonDomicile;
	
	private int totalCommande;

	public EnteteCommande() {
		super();
	}

	public int getIdEnteteCommande() {
		return idEnteteCommande;
	}

	public void setIdEnteteCommande(int idEnteteCommande) {
		this.idEnteteCommande = idEnteteCommande;
	}

//	public Adresse getAdresseLivraison() {
//		return adresseLivraison;
//	}
//
//	public void setAdresseLivraison(Adresse adresseLivraison) {
//		this.adresseLivraison = adresseLivraison;
//	}
//
//	public Adresse getAdresseFacturation() {
//		return adresseFacturation;
//	}
//
//	public void setAdresseFacturation(Adresse adresseFacturation) {
//		this.adresseFacturation = adresseFacturation;
//	}

	public String getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}

	public boolean isLivraisonDomicile() {
		return livraisonDomicile;
	}

	public void setLivraisonDomicile(boolean livraisonDomicile) {
		this.livraisonDomicile = livraisonDomicile;
	}

	public int getTotalCommande() {
		return totalCommande;
	}

	public void setTotalCommande(int totalCommande) {
		this.totalCommande = totalCommande;
	}
	

	
}



