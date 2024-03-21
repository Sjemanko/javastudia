package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class DetroitStylePizza extends Meal {

     DetroitStylePizza()
    {
        description = "Detroit-style pizza";
    }

    @Override
    public double cost() {
        return 50.25;
    }
}
