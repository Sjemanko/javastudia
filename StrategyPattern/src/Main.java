import java.util.ArrayList;

import exercise_3.CarModels.Car;
import exercise_3.CarSpeed.CarSpeed;
import exercise_4.BehaviorInterfaces.FlyBehavior;
import exercise_4.DuckBehaviorClasses.*;
import exercise_4.DuckModels.Duck;
import exercise_4.DuckModels.MallardDuck;
import exercise_4.DuckModels.ModelDuck;
import exercise_4.DuckModels.RubberDuck;
import exercise_5.ShopModels.BritishShop;
import exercise_5.ShopModels.GermanShop;
import exercise_5.ShopModels.PolishShop;
import exercise_5.ShopModels.Shop;
import exercise_5.TaxRateClasses.GermanyTaxStrategy;
import exercise_5.TaxRateClasses.GreatBritainTaxStrategy;
import exercise_5.TaxRateClasses.PolandTaxStrategy;

public class Main {
    public static void main(String[] args) {
        // ex. 3
        CarSpeed carSpeed = new CarSpeed(new Car("Volvo", 255));

        System.out.println(carSpeed.getMaxSpeed());
        carSpeed.showCarName();

        // ex. 4
        ArrayList<Duck> ducksList = new ArrayList<Duck>();
        ducksList.add(new MallardDuck(new Quack(), new FlyWithWings()));
        ducksList.add(new ModelDuck(new MuteQuack(), new FlyNoWay()));
        ducksList.add(new RubberDuck(new Squeak(), new FlyNoWay()));


        for(Duck duck: ducksList)
        {
            duck.performFly();
            duck.performQuack();
        }

        ducksList.get(2).setFlyBehavior(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("Duck is flying using jetpack.");
            }
        });

        for(Duck duck: ducksList)
        {
            duck.performFly();
            duck.performQuack();
        }

        // ex. 5

        ArrayList<Shop> shopList = new ArrayList<Shop>(){
            {
                add(new PolishShop(new PolandTaxStrategy()));
                add(new GermanShop(new GermanyTaxStrategy()));
                add(new BritishShop(new GreatBritainTaxStrategy()));
            }
        };

        for(Shop shop: shopList)
        {
            shop.showTaxTreshold();
        }

        // ex. 6


    }
}