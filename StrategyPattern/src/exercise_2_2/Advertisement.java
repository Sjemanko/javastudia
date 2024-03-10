package exercise_2_2;

import exercise_2_2.Interfaces.AdvertisementLanguage;
import exercise_2_2.Interfaces.AdvertisementType;

public class Advertisement {
    private AdvertisementLanguage advertisementLanguage;
    private AdvertisementType advertisementType;

    public Advertisement(AdvertisementLanguage advertisementLanguage, AdvertisementType advertisementType)
    {
        this.advertisementLanguage = advertisementLanguage;
        this.advertisementType = advertisementType;
    }

    public Advertisement(){ }

    public void showAdType()
    {
        this.advertisementType.showAdType();
    }

    public void setAdvertisementType(AdvertisementType advertisementType)
    {
        this.advertisementType = advertisementType;
    }

    public void translateAd()
    {
        this.advertisementLanguage.translateAd();
    }

    public void setAdvertisementLanguage(AdvertisementLanguage advertisementLanguage)
    {
        this.advertisementLanguage = advertisementLanguage;
    }
}
