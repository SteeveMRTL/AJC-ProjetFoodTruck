package food.foodTruck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.foodTruck.model.Utilisateur;
import food.foodTruck.repository.AdresseRepository;
import food.foodTruck.repository.GenreRepository;
import food.foodTruck.repository.RoleRepository;
import food.foodTruck.repository.UtilisateurRepository;

@RestController                   //ApiRest
@RequestMapping("/utilisateur")
public class UtilisateurApiController {
	@Autowired
	private  GenreRepository RepoGenre;
	private RoleRepository RepoRole;
	private UtilisateurRepository RepoUtilisateur;
	private AdresseRepository repoAdresse;
	
	
	
	
	@GetMapping("findAll")
	public List<Utilisateur> getAll() {
		return RepoUtilisateur.findAll();
	}
	

	

}
