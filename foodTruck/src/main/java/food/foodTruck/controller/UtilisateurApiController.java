package food.foodTruck.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.foodTruck.model.Utilisateur;
//import food.foodTruck.repository.AdresseRepository;
import food.foodTruck.repository.GenreRepository;
import food.foodTruck.repository.RoleRepository;
import food.foodTruck.repository.UtilisateurRepository;


@RestController                   //ApiRest
@RequestMapping("/utilisateur")
public class UtilisateurApiController {
	@Autowired
	private  GenreRepository repoGenre;
	@Autowired
	private RoleRepository repoRole;
	@Autowired
	private UtilisateurRepository repoUtilisateur;
//	private AdresseRepository repoAdresse;
	
	
	@GetMapping("findAll")
	public List<Utilisateur> getAll() {
		return repoUtilisateur.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Optional<Utilisateur> findById (@PathVariable(name = "id") Integer id) {
		return repoUtilisateur.findById(id);
	}

}
