package com.hust.spring.beans.init;

public class Car {
    private String brand;
    private String crop;
    private Double price;
    private Integer maxspeed;


    public Car(String brand, String crop, Double price) {
        super();
        this.brand = brand;
        this.crop = crop;
        this.price = price;
    }

    public Car(String brand, String crop, Integer maxspeed) {
        super();
        this.brand = brand;
        this.crop = crop;
        this.maxspeed = maxspeed;
    }

    public Car() {
        System.out.println("Car's Constructor...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", crop='" + crop + '\'' +
                ", price=" + price +
                ", maxspeed=" + maxspeed +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(Integer maxspeed) {
        this.maxspeed = maxspeed;
    }
}
