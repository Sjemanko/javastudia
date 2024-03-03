package exercise_4.DuckModels;
import exercise_4.BehaviorInterfaces.FlyBehavior;
import exercise_4.BehaviorInterfaces.QuackBehavior;

public class ModelDuck extends Duck{
    public ModelDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
