package br.com.ronistone.labapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity( name = "CAR" )
@Table(name = "CAR")
public class Car {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY, generator = "CAR_SQ" )
    @SequenceGenerator( name = "CAR_SQ", sequenceName = "CAR_SQ", initialValue = 1, allocationSize = 1 )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
