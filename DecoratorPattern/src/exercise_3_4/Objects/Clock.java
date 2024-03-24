package exercise_3_4.Objects;

import exercise_3_4.BaseClasses.Product;

public class Clock extends Product {
    public Clock()
    {
        description = "Clock";
    }

    @Override
    public double cost() {
        return 25.99;
    }
    
}
