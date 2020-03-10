package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
