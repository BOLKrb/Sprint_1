package model;

import static model.constants.Discount.redApplesDiscount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, int price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public int getDiscount() {
        if (colour == "red") {
            return redApplesDiscount;
        }
        return 0;
    }
}