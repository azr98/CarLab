import parts.Part;

import java.util.ArrayList;

public abstract class Car {

    private String make;
    private String model;
    private int price;
    private String colour;
    private ArrayList<Part> parts;
    private int damage;

    public Car(String make, String model, int price, String colour) {
        this.make = make;
        this.model = make;
        this.price = price;
        this.colour = colour;
        this.parts = new ArrayList<>();
        this.damage = 0;
    }

    public String getMake() {
        return make;
    }

    public void addDamage(int amount){
        this.damage += amount;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price - this.damage;
    }

    public String getColour() {
        return colour;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void addPart(Part part){
        this.parts.add(part);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
