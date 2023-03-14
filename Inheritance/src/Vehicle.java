//Parent class

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle(){
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 4;
        this.fuelTank = 40;
        this.lights = "LED";
    }
    public Vehicle(String engine, int wheels,int seats,int fuelTank,String lights){

        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;

    }

    public String getEngine() {
        return engine;
    }

    public String getLights() {
        return lights;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }
}
