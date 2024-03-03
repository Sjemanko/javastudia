package exercise_6.Classes;

import exercise_6.Interfaces.SpedzanieWolnegoCzasu;

public class Silownia implements SpedzanieWolnegoCzasu{
    @Override
    public void spedzajWolnyCzas(){
        System.out.println("Chodzenie na siłownię");
    }
}
