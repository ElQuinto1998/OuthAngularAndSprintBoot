package com.auth0.example.model;

public class Deals {

    private String id;
    private String name;
    private String description;
    private double originalPrice;
    private double salePrice;

    public Deals(String id, String name, String description, double originalPrice, double salePrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.originalPrice = originalPrice;
        this.salePrice = salePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
