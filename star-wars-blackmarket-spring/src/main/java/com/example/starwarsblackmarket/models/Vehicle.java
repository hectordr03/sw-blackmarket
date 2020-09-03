package com.example.starwarsblackmarket.models;

import javax.persistence.*;

@Entity
@Table( name = "vehicles" )
public class Vehicle {

    @Id
    @Column
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private double price;

    public Vehicle () {}

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
