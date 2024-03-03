import java.util.ArrayList;

import BehaviorInterfaces.FlyBehavior;
import CarModels.Car;
import CarSpeed.CarSpeed;
import DuckBehaviorClasses.*;
import DuckModels.Duck;
import DuckModels.MallardDuck;
import DuckModels.ModelDuck;
import DuckModels.RubberDuck;
import ShopModels.BritishShop;
import ShopModels.GermanShop;
import ShopModels.PolishShop;
import ShopModels.Shop;
import TaxRateClasses.GermanyTaxStrategy;
import TaxRateClasses.GreatBritainTaxStrategy;
import TaxRateClasses.PolandTaxStrategy;

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

    }
}