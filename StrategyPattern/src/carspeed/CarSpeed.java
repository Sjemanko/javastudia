package carspeed;

public class CarSpeed {
    public CarSpeed(Car car)
    {
        this.car = car;
    }

    public int getMaxSpeed()
    {
        return car.getMaxSpeed();
    }

    public void showCarName()
    {
        System.out.println(car.getCarName());
    }

    private Car car;
}

