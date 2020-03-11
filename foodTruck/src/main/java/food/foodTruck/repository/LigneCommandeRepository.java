package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.LigneCommande;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Integer> {

}
