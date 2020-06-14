package br.com.ronistone.labkotlin.model

import javax.persistence.*

@Entity(name = "CAR")
@Table(name = "CAR")
class Car(
        @javax.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "CAR_SQ")
        @SequenceGenerator(name = "CAR_SQ", sequenceName = "CAR_SQ", initialValue = 1, allocationSize = 1)
        @Column(name = "ID")
        private var id: Long,

        @Column(name = "NAME")
        private var name: String,

        @Column(name = "DESCRIPTION")
        private var description: String
)
