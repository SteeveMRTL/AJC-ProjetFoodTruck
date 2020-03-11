package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Actualite;
import food.foodTruck.model.FamilleProduit;

public interface FamilleProduitRepository extends JpaRepository<FamilleProduit, Integer> {

}
