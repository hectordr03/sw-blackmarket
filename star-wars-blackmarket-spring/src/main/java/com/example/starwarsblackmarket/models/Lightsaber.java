package com.example.starwarsblackmarket.models;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Entity
@Table(name = "lightsabers")
public class Lightsaber {

    @Id
    @Column
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String type;

    @Column
    private String color;

    @Column
    private double price;

    public Lightsaber () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
