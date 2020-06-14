package br.com.ronistone.labapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.ronistone.labapp.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "SELECT CAR.ID, CAR.DESCRIPTION, CAR.NAME, pg_sleep(60) FROM CAR WHERE CAR.ID = ?1", nativeQuery = true)
    Optional<Car> findByIdWithSleep(Long id);


}
