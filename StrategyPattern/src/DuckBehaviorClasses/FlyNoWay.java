package DuckBehaviorClasses;

import BehaviorInteraces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck does not fly.");
    }
}
