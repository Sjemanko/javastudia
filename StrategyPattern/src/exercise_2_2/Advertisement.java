package exercise_2_2;

import exercise_2_2.Interfaces.AdvertisementType;

public class Advertisement {
    private AdvertisementType advertisementType;

    public Advertisement(){ }

    public void showAdType()
    {
        this.advertisementType.showAdType();
    }

    public void setAdvertisementType(AdvertisementType advertisementType)
    {
        this.advertisementType = advertisementType;
    }

    public void sendTranslatedAd(Client client)
    {
        client.getPrefferedLanguage().translateAd();
    }
}
