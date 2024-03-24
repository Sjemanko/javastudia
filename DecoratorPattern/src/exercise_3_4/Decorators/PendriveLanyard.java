package exercise_3_4.Decorators;

import exercise_3_4.BaseClasses.Product;
import exercise_3_4.BaseClasses.ProductAddons;

public class PendriveLanyard extends ProductAddons
{
    Product products;

    public PendriveLanyard(Product products)
    {
       this.products = products; 
    }

    @Override
    public String getDescription() {
        return this.products.getDescription() + " + Pendrive Lanyard (+1 PLN)";
    }

    @Override
    public double cost() {
        return products.cost() + 1;
    }

}