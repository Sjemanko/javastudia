import java.util.ArrayList;

import exercise_1_3.CarClasses.CarInfo;
import exercise_1_3.CarClasses.CarSpeed;
import exercise_1_3.CarModels.Car;
import exercise_1_3.CarModels.Toyota;
import exercise_1_3.CarModels.Volvo;
import exercise_1_4.BehaviorInterfaces.FlyBehavior;
import exercise_1_4.DuckBehaviorClasses.*;
import exercise_1_4.DuckModels.Duck;
import exercise_1_4.DuckModels.MallardDuck;
import exercise_1_4.DuckModels.ModelDuck;
import exercise_1_4.DuckModels.RubberDuck;
import exercise_1_5.ShopModels.Shop;
import exercise_1_5.TaxRateClasses.GermanyTaxStrategy;
import exercise_1_5.TaxRateClasses.GreatBritainTaxStrategy;
import exercise_1_5.TaxRateClasses.PolandTaxStrategy;
import exercise_1_6.Pracownik;
import exercise_1_6.Classes.Leczenie;
import exercise_1_6.Classes.LiteraturaPopularnoNaukowa;
import exercise_1_6.Classes.NaprawaSamochodow;
import exercise_1_6.Classes.Rower;
import exercise_1_6.Classes.RoznoszenieListow;
import exercise_1_6.Classes.Samochod;
import exercise_1_6.Classes.Silownia;

public class Main {
    public static void main(String[] args) {
        // ex. 3
        Car car1 = new Toyota(new CarInfo("Toyota"),new CarSpeed("255"));
        Car car2 = new Volvo(new CarInfo("Volvo"),new CarSpeed("500"));

        car1.showCarName();
        car1.showMaxSpeedInfo();

        car2.showCarName();
        car2.showMaxSpeedInfo();

        // ex. 4
        
        System.out.println();

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

        System.out.println();
        
        // Polish client
        Shop shop = new Shop(new PolandTaxStrategy());
        shop.showTaxTreshold();

        // German client
        shop.setTax(new GermanyTaxStrategy());
        shop.showTaxTreshold();

        // British client
        shop.setTax(new GreatBritainTaxStrategy());
        shop.showTaxTreshold();

        // ex. 6

        System.out.println();

        ArrayList<Pracownik> EmployeeList = new ArrayList<Pracownik>(){
            {
                add(new Pracownik("Zawód1", new NaprawaSamochodow(), new Silownia(), new Rower()));
                add(new Pracownik("Zawód2", new NaprawaSamochodow(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik("Zawód3", new NaprawaSamochodow(), new Silownia(), new Samochod()));
                add(new Pracownik("Zawód4", new NaprawaSamochodow(), new LiteraturaPopularnoNaukowa(), new Samochod()));
                add(new Pracownik("Zawód5", new Leczenie(), new Silownia(), new Rower()));
                add(new Pracownik("Zawód6", new Leczenie(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik("Zawód7", new Leczenie(), new Silownia(), new Samochod()));
                add(new Pracownik("Zawód8", new Leczenie(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik("Zawód9", new RoznoszenieListow(), new Silownia(), new Rower()));
                add(new Pracownik("Zawód10", new RoznoszenieListow(), new LiteraturaPopularnoNaukowa(), new Rower()));
                add(new Pracownik("Zawód11", new RoznoszenieListow(), new Silownia(), new Samochod()));
                add(new Pracownik("Zawód12", new RoznoszenieListow(), new LiteraturaPopularnoNaukowa(), new Samochod()));
            }
        };

        for(Pracownik pracownik: EmployeeList)
        {
            System.out.println(pracownik.getZawod());
            pracownik.getPraca();
            pracownik.getDojezdzanie();
            pracownik.getSpedzanieWolnegoCzasu();
            System.out.println("------------");
        }
    }
}