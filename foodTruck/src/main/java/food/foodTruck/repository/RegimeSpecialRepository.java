package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Actualite;
import food.foodTruck.model.RegimeSpecial;

public interface RegimeSpecialRepository extends JpaRepository<RegimeSpecial, Integer> {

}
