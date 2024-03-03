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
import exercise_6.Pracownik;
import exercise_6.Classes.Leczenie;
import exercise_6.Classes.LiteraturaPopularnoNaukowa;
import exercise_6.Classes.NaprawaSamochodow;
import exercise_6.Classes.Rower;
import exercise_6.Classes.RoznoszenieListow;
import exercise_6.Classes.Samochod;
import exercise_6.Classes.Silownia;

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

        ArrayList<Pracownik> EmployeeList = new ArrayList<Pracownik>(){
            {
                add(new Pracownik(new NaprawaSamochodow(), new Silownia(), new Rower()));
                add(new Pracownik(new NaprawaSamochodow(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik(new NaprawaSamochodow(), new Silownia(), new Samochod()));
                add(new Pracownik(new NaprawaSamochodow(), new LiteraturaPopularnoNaukowa(), new Samochod()));
                add(new Pracownik(new Leczenie(), new Silownia(), new Rower()));
                add(new Pracownik(new Leczenie(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik(new Leczenie(), new Silownia(), new Samochod()));
                add(new Pracownik(new Leczenie(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik(new RoznoszenieListow(), new Silownia(), new Rower()));
                add(new Pracownik(new RoznoszenieListow(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik(new RoznoszenieListow(), new Silownia(), new Samochod()));
                add(new Pracownik(new RoznoszenieListow(), new LiteraturaPopularnoNaukowa(), new Samochod()));
            }
        };

        for(Pracownik pracownik: EmployeeList)
        {
            pracownik.getPraca();
            pracownik.getDojezdzanie();
            pracownik.getSpedzanieWolnegoCzasu();
            System.out.println("------------");
        }
    }
}