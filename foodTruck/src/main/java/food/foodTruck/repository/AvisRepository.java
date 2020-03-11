package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Avis;

public interface AvisRepository extends JpaRepository<Avis, Integer> {

}
