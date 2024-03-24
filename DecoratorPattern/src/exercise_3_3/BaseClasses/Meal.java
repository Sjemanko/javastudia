package exercise_3_3.BaseClasses;

public abstract class Meal {
    protected String description = "Unknown meal";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
