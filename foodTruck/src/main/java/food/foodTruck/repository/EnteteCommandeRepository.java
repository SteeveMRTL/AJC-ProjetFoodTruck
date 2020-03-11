package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Actualite;
import food.foodTruck.model.EnteteCommande;

public interface EnteteCommandeRepository extends JpaRepository<EnteteCommande, Integer> {

}
