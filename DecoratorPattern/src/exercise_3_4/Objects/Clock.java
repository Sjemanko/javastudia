package exercise_3_4.Objects;

import exercise_3_4.BaseClasses.Product;

public class Clock extends Product {

    Product product;
    public Clock(Product product)
    {
        this.product = product;
        description = this.product.getDescription() + "Clock, ";
    }

    @Override
    public double cost() {
        return this.product.cost() + 25.99;
    }
    
}
