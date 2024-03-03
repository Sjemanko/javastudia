package exercise_4.DuckBehaviorClasses;

import exercise_4.BehaviorInterfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
