package exercise_3.CarModels;

import exercise_3.Interfaces.CarDetails;
import exercise_3.Interfaces.CarFactors;

public abstract class Car {
    private CarDetails carDetails;
    private CarFactors carFactors;

    public Car(CarDetails carDetails, CarFactors carFactors){
        this.carDetails = carDetails;
        this.carFactors = carFactors;
    }

    public void setCarDetails(CarDetails carDetails) {
        this.carDetails = carDetails;
    }

    public void setCarFactors(CarFactors carFactors)
    {
        this.carFactors = carFactors;
    }

    public void showMaxSpeedInfo()
    {
        carFactors.getMaxSpeed();
    }

    public void showCarName()
    {
        carDetails.showCarName();
    }

}
