package exercise_1_4.DuckModels;
import exercise_1_4.BehaviorInterfaces.FlyBehavior;
import exercise_1_4.BehaviorInterfaces.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
