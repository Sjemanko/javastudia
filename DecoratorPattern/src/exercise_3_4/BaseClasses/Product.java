package exercise_3_4.BaseClasses;

public abstract class Product {
    protected String description;

    public String getDescription()
    {
        return description;
    }
    
    public abstract double cost();
}

