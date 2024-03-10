package exercise_1_4.DuckBehaviorClasses;

import exercise_1_4.BehaviorInterfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck does not fly.");
    }
}
