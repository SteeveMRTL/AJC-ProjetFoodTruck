package food.foodTruck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import food.foodTruck.model.Actualite;

public interface ActualiteRepository extends JpaRepository<Actualite, Integer> {


//	List<Actualite> findByNomContaining(String nom);
//
//	List<Actualite> findAllByOrderByNomAsc();
//
//	List<Actualite> findAllByIdGreaterThanOrderByIdDesc(int minId);
//
//	List<Actualite> findAllByNomNotIgnoreCase(String nom);
//
//	
}
