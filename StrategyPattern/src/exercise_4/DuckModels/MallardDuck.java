package DuckModels;
import BehaviorInterfaces.FlyBehavior;
import BehaviorInterfaces.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
