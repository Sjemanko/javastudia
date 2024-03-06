package exercise_6;

import exercise_6.Interfaces.Dojezdzac;
import exercise_6.Interfaces.Pracowac;
import exercise_6.Interfaces.SpedzanieWolnegoCzasu;

public class Pracownik {

    private Pracowac praca;
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private Dojezdzac dojezdzanie;
    private String zawod;

    public Pracownik(String zawod, Pracowac praca, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu, Dojezdzac dojezdzanie)
    {
        this.zawod = zawod;
        this.praca = praca;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
        this.dojezdzanie = dojezdzanie;
    }
    
    public void getPraca(){
        praca.pracuj();
    }

    public void setPraca(Pracowac praca){
        this.praca = praca;
    }

    public void getSpedzanieWolnegoCzasu(){
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

    public void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu spedzanieWolnegoCzasu){
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }

    public void getDojezdzanie(){
        dojezdzanie.dojezdzaj();
    }
    
    public void setDojezdzanie(Dojezdzac dojezdzanie){
        this.dojezdzanie = dojezdzanie;
    }
    
    public String getZawod()
    {
        return zawod;
    }
}
