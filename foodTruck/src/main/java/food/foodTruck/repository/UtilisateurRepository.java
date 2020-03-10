package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Utilisateur;

public interface UtilisateurRepository extends  JpaRepository<Utilisateur, Integer>{

}
