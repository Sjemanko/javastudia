import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
