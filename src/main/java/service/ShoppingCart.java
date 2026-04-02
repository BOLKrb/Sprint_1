package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getSumIsVegetarianfoods() {
        double sum = 0;
        for (int i = 0; foods.length > i; i++) {
            if (foods[i].isVegetarian() == true) {
                sum = sum + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sum;
    }

    public double getSumFoodsWithDiscount() {
        double sum = 0;
        for (int i = 0; foods.length > i; i++) {
            double discount = ((100 - foods[i].getDiscount()) / 100.0);
            sum = sum + (foods[i].getAmount() * (foods[i].getPrice() * discount));
        }
        return sum;
    }

    public double getSumFoodsWithoutDiscount() {
        double sum = 0;
        for (int i = 0; foods.length > i; i++) {
            sum = sum + foods[i].getAmount() * foods[i].getPrice();
        }
        return sum;
    }
}
