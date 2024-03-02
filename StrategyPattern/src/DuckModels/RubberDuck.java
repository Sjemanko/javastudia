package DuckModels;
import BehaviorInteraces.FlyBehavior;
import BehaviorInteraces.QuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
