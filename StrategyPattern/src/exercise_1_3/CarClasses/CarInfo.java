package exercise_1_3.CarClasses;

import exercise_1_3.Interfaces.CarDetails;

public class CarInfo implements CarDetails {
    private String carName;

    public CarInfo(String carName)
    {
        this.carName = carName;
    }
    @Override
    public void showCarName() {
        System.out.println("Car name: " + this.carName);
    }
}
