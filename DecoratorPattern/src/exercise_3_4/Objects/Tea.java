package exercise_3_4.Objects;

import exercise_3_4.BaseClasses.Product;

public class Tea extends Product {
    Product product;

    public Tea(Product product)
    {
        this.product = product;
        description = this.product.getDescription() + "Tea, ";
    }

    @Override
    public double cost() {
        return this.product.cost() + 2.8;
    }

}
