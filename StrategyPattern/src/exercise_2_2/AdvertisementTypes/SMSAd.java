package exercise_2_2.AdvertisementTypes;

import exercise_2_2.Interfaces.AdvertisementType;

public class SMSAd implements AdvertisementType{
    public void showAdType()
    {
        System.out.println("Advertisement type: SMS");
    }
}
