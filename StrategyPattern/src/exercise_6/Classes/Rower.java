package exercise_6.Classes;

import exercise_6.Interfaces.Dojezdzac;

public class Rower implements Dojezdzac{
    @Override
    public void dojezdzaj(){
        System.out.println("Dojeżdżanie rowerem");
    }

}
