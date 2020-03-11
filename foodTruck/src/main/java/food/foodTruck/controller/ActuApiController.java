package food.foodTruck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.foodTruck.model.Actualite;
import food.foodTruck.model.Avis;
import food.foodTruck.repository.ActualiteRepository;
import food.foodTruck.repository.AvisRepository;

@RestController                   //ApiRest
@RequestMapping("/actus")
public class ActuApiController {
	
	@Autowired
	private  ActualiteRepository repoactus;
	private AvisRepository repoavis;
	
	@GetMapping("findAll")
	public List<Actualite>getAll() {
		return repoactus.findAll();
	}
	
	@GetMapping("")
	public List<Avis>getAvis() {
		return repoavis.findAll();
	}
	
	
	
	

}
