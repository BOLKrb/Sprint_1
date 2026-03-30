import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.green;
import static model.constants.Colour.red;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, red);
        Apple greenApples = new Apple(8, 60, green);

        Food[] foods = {meat, redApples, greenApples};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println(shoppingCart.getSumFoodsWithoutDiscount());
        System.out.println(shoppingCart.getSumFoodsWithDiscount());
        System.out.println(shoppingCart.getSumIsVegetarianfoods());
    }
}
