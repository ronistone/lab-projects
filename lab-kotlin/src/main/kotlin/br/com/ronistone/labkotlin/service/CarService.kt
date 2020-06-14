package br.com.ronistone.labkotlin.service

import br.com.ronistone.labkotlin.model.Car

interface CarService {
    fun getCarById(id: Long): Car?
    fun getAllCars(): MutableList<Car>?
}
