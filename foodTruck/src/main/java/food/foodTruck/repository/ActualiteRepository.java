package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Actualite;

public interface ActualiteRepository extends JpaRepository<Actualite, Integer> {

}
