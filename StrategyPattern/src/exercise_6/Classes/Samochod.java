package exercise_6.Classes;

import exercise_6.Interfaces.Dojezdzac;

public class Samochod implements Dojezdzac{
    @Override
    public void dojezdzaj(){
        System.out.println("Dojeżdzanie samochodem");
    }

}
