package exercise_1_3.CarClasses;

import exercise_1_3.Interfaces.CarFactors;

public class CarSpeed implements CarFactors {
    private String maxSpeed;

    public CarSpeed(String maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void getMaxSpeed() {
        System.out.println("Max speed: " + this.maxSpeed);
    }
}
