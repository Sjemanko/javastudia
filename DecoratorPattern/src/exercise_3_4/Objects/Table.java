package exercise_3_4.Objects;

import exercise_3_4.BaseClasses.Product;

public class Table extends Product{
    public Table()
    {
        description = "Table";
    }

    @Override
    public double cost() {
        return 120.99;
    }
    
}
