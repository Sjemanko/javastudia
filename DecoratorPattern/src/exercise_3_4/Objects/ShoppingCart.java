package exercise_3_4.Objects;

import exercise_3_4.BaseClasses.Product;

public class ShoppingCart extends Product{
    public ShoppingCart()
    {
        description = "";
    }

    @Override
    public double cost() {
        return 0.0;
    }

}
