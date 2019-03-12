package com.hust.spring.beans.spel;

public class Car {
    private String brand;
    private String crop;

    private int price;
    //轮胎周长
    private double tyrePerieter;

    public Car(){
        System.out.println("Car's Constructor...");
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTyrePerieter() {
        return tyrePerieter;
    }

    public void setTyrePerieter(double tyrePerieter) {
        this.tyrePerieter = tyrePerieter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", crop='" + crop + '\'' +
                ", price=" + price +
                ", tyrePerieter=" + tyrePerieter +
                '}';
    }
}
