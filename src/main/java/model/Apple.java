package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, int price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED)) {
            return RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}