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
import exercise_2_1.Hero;
import exercise_2_1.Models.Gunner;
import exercise_2_1.Models.Hunter;
import exercise_2_1.Models.Knight;
import exercise_2_1.Models.Shooter;
import exercise_2_1.WeaponClasses.Bow;
import exercise_2_1.WeaponClasses.Cannon;
import exercise_2_1.WeaponClasses.Gun;
import exercise_2_1.WeaponClasses.Sword;
import exercise_2_2.Advertisement;
import exercise_2_2.AdvertisementLanguages.ChineseLanguage;
import exercise_2_2.AdvertisementLanguages.EnglishLanguage;
import exercise_2_2.AdvertisementLanguages.PolishLanguage;
import exercise_2_2.AdvertisementTypes.EmailAd;
import exercise_2_2.AdvertisementTypes.SMSAd;
import exercise_2_2.AdvertisementTypes.VoiceMessageAd;

public class Main {
    public static void main(String[] args) {
        // ex. 1_3
        Car car1 = new Toyota(new CarInfo("Toyota"),new CarSpeed("255"));
        Car car2 = new Volvo(new CarInfo("Volvo"),new CarSpeed("500"));

        car1.showCarName();
        car1.showMaxSpeedInfo();

        car2.showCarName();
        car2.showMaxSpeedInfo();

        // ex. 1_4
        
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

        // ex. 1_5

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

        // ex. 1_6

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

        // exercise 2_1
        ArrayList<Hero> champions = new ArrayList<Hero>(){
            {
                add(new Hunter("Majkel", 150, new Bow()));
                add(new Knight("Lord Farquaad", 250, new Sword()));
                add(new Gunner("Operator of a 3-pound cannon", 125, new Cannon()));
                add(new Shooter("szczelacz123", 100 , new Gun()));
            }
        };

        for(Hero hero: champions)
        {
            System.out.println(hero.toString());
            hero.getWeaponType();
            System.out.println("------------");
        }

        // exercise 2_2

        Advertisement ad = new Advertisement();
        
        // Client from China, voice message type
        ad.setAdvertisementLanguage(new ChineseLanguage());
        ad.setAdvertisementType(new VoiceMessageAd());

        ad.translateAd();
        ad.showAdType();
        System.out.println();

        // Client from Great Britain, sms type
        ad.setAdvertisementLanguage(new EnglishLanguage());
        ad.setAdvertisementType(new SMSAd());

        ad.translateAd();
        ad.showAdType();
        System.out.println();

        // Client from Poland, email type
        ad.setAdvertisementLanguage(new PolishLanguage());
        ad.setAdvertisementType(new EmailAd());

        ad.translateAd();
        ad.showAdType();
        System.out.println();
    }
}