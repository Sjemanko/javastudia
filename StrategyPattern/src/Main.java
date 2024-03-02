import java.util.ArrayList;

import BehaviorInterfaces.FlyBehavior;
import DuckBehaviorClasses.*;
import DuckModels.Duck;
import DuckModels.MallardDuck;
import DuckModels.ModelDuck;
import DuckModels.RubberDuck;

public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> ducksList = new ArrayList<Duck>();
        ducksList.add(new MallardDuck(new Quack(), new FlyWithWings()));
        ducksList.add(new ModelDuck(new MuteQuack(), new FlyNoWay()));
        ducksList.add(new RubberDuck(new Squeak(), new FlyNoWay()));


        for(Duck duck: ducksList)
        {
            duck.performFly();
            duck.performQuack();
        }

        ducksList.get(2).setFlyBehavior(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("Duck is flying using jetpack.");
            }
        });

        for(Duck duck: ducksList)
        {
            duck.performFly();
            duck.performQuack();
        }
    }
}