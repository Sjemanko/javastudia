package DuckBehaviorClasses;

import BehaviorInterfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is flying with wings");
    }
}
