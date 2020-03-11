package food.foodTruck.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.foodTruck.model.Actualite;
import food.foodTruck.repository.ActualiteRepository;

@RestController                   //ApiRest
@RequestMapping("/actus")
public class ActuApiController {
	
	@Autowired
	private  ActualiteRepository repo;
	

//	@GetMapping("all")
//	public List<Actualite>getActualite() {
//		Actualite a= new Actualite();
//		List<Actualite> l= new ArrayList<Actualite>();
//		l.add (a);
//		return l;
//	}
	
	@GetMapping("findAll")
	public List<Actualite>getAll() {
		return repo.findAll();
	}
	
	

}
