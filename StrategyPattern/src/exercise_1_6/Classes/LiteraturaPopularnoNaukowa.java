package exercise_1_6.Classes;

import exercise_1_6.Interfaces.SpedzanieWolnegoCzasu;

public class LiteraturaPopularnoNaukowa implements SpedzanieWolnegoCzasu {
    @Override
    public void spedzajWolnyCzas(){
        System.out.println("Czytanie literatury popularno-naukowej");
    }
}
