package exercise_4.DuckModels;
import exercise_4.BehaviorInterfaces.FlyBehavior;
import exercise_4.BehaviorInterfaces.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
