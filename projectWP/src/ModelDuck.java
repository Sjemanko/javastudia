import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public class ModelDuck extends Duck{
    public ModelDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
