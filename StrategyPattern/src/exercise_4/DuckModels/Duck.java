package exercise_4.DuckModels;
import exercise_4.BehaviorInterfaces.FlyBehavior;
import exercise_4.BehaviorInterfaces.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior)
    {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performSwim(){
        System.out.println("Duck is Swimming.");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
