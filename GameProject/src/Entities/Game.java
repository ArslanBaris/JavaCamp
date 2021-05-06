package Entities;

import Abstract.Entity;

public class Game implements Entity {
    private  int id;
    private String name;
    private String detail;
    private double unitPrice;

    public Game(int id, String name, String detail, double unitPrice) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }



}
