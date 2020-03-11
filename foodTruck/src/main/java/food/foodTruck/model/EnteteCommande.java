package food.foodTruck.model;

import javax.persistence.Id;
import javax.persistence.OneToOne;

public class EnteteCommande {
	@Id
	private int idEnteteCommande;
	
	//cardinalité à définir
	private Adresse adresseLivraison;
	//cardinalité à définir
	private Adresse adresseFacturation;
	
	private String dateCommande;
	
	private boolean livraisonDomicile;
	
	private int totalCommande;
	
}
