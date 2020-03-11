package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
