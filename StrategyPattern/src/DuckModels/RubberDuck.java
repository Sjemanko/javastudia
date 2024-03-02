package DuckModels;
import BehaviorInterfaces.FlyBehavior;
import BehaviorInterfaces.QuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
