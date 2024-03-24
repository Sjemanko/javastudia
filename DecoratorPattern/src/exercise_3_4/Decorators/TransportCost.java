package exercise_3_4.Decorators;

import exercise_3_4.BaseClasses.Product;
import exercise_3_4.BaseClasses.ProductAddons;

public class TransportCost extends ProductAddons{
    Product product;

    public TransportCost(Product product)
    {
        this.product = product;
    }
    @Override
    public String getDescription() {
        return product.getDescription() + " + Transport (+13 PLN)"; 
    }

    @Override
    public double cost() {
        return product.cost() + 13;
    }
    
}
