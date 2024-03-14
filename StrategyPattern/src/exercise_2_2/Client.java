package exercise_2_2;

import exercise_2_2.Interfaces.AdvertisementLanguage;

public class Client {
    private AdvertisementLanguage prefferedLanguage;

    public Client(AdvertisementLanguage prefferedLanguage)
    {
        this.prefferedLanguage = prefferedLanguage;
    }

    public void setPrefferedLanguage(AdvertisementLanguage prefferedLanguage){
        this.prefferedLanguage = prefferedLanguage;
    }

    public AdvertisementLanguage getPrefferedLanguage(){
        return this.prefferedLanguage;
    }
}
