package food.foodTruck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.foodTruck.model.Produit;
import food.foodTruck.repository.EnteteCommandeRepository;
import food.foodTruck.repository.FamilleProduitRepository;
import food.foodTruck.repository.LigneCommandeRepository;
import food.foodTruck.repository.ProduitRepository;
import food.foodTruck.repository.TypeRepasRepository;

@RestController                   //ApiRest
@RequestMapping("/produit")
public class ProduitApiController {
	@Autowired
	private  EnteteCommandeRepository repoEntiteCommande;
	@Autowired
	private  TypeRepasRepository repoTypeRepas;
	@Autowired
	private  FamilleProduitRepository repoFamilleRepas;
	@Autowired
	private  ProduitRepository repoProduit;
	@Autowired
	private  LigneCommandeRepository RepoLigne;
	
	@GetMapping("findAll")
	public List<Produit> getAll() {
		return repoProduit.findAll();
	}

}
