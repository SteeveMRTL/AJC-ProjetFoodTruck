package food.foodTruck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.foodTruck.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>  {

}
