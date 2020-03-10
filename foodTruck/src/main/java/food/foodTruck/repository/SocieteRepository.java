package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Role;
import food.foodTruck.model.Societe;

public interface SocieteRepository extends JpaRepository<Societe, Integer> {

}
