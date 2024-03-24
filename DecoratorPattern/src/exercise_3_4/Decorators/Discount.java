package exercise_3_4.Decorators;

import exercise_3_4.BaseClasses.Product;
import exercise_3_4.BaseClasses.ProductAddons;

public class Discount extends ProductAddons{

    Product products;
    
    public Discount(Product products)
    {
        this.products = products;
    }
    
    @Override
    public String getDescription() {
        return products.getDescription() + " + Discount (-10PLN)";
    }

    @Override
    public double cost() {
        double costAfterDiscount = products.cost() - 10;
        return Math.max(0, costAfterDiscount);
    }
    
}
