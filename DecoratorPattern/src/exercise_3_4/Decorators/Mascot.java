package exercise_3_4.Decorators;

import exercise_3_4.BaseClasses.Product;
import exercise_3_4.BaseClasses.ProductAddons;

public class Mascot extends ProductAddons{
    Product products;

    public Mascot(Product products)
    {
       this.products= products;
    }

    @Override
    public String getDescription() {
        return this.products.getDescription() + " + Mascot"; 
    }

    @Override
    public double cost() {
        return this.products.cost();
    }   
}