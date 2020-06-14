package br.com.ronistone.labkotlin.repository

import br.com.ronistone.labkotlin.model.Car
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface CarRepository: JpaRepository<Car, Long> {

    @Query(value = "SELECT CAR.ID, CAR.DESCRIPTION, CAR.NAME, pg_sleep(60) FROM CAR WHERE CAR.ID = ?1", nativeQuery = true)
    fun findByIdWithSleep(id: Long): Car?

}
