package exercise_3.CarModels;

public class Car {
    private String carName;
    private int maxSpeed;

    public Car(String carName, int maxSpeed){
        this.carName = carName;
        this.maxSpeed = maxSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
