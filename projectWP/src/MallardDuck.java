import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
