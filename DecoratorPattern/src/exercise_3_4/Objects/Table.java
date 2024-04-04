package exercise_3_4.Objects;

import exercise_3_4.BaseClasses.Product;

public class Table extends Product{
    Product product;
    public Table(Product product)
    {
        this.product = product;
        description = this.product.getDescription() + "Table, ";
    }

    @Override
    public double cost() {
        return this.product.cost() + 120.99;
    }
    
}
