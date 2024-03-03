package DuckModels;
import BehaviorInterfaces.FlyBehavior;
import BehaviorInterfaces.QuackBehavior;

public class ModelDuck extends Duck{
    public ModelDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
