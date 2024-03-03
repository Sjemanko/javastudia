package exercise_4.DuckBehaviorClasses;

import exercise_4.BehaviorInterfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
