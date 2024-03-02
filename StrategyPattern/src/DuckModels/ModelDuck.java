package DuckModels;
import BehaviorInteraces.FlyBehavior;
import BehaviorInteraces.QuackBehavior;

public class ModelDuck extends Duck{
    public ModelDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
