package model;

public class Meat extends Food {
    public Meat(int amount, int price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
}
