package models;

public class Juice {
    private int id;
    private String name;
    private String brand;
    private int qty;
    private float price;

    public Juice() {

    }

    public Juice(int id, String name, String brand, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
