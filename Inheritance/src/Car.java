public class Car extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;

    public Car() {
        super();
        this.steering = "electro";
        this.musicSystem = "Bose";
        this.airConditioner = "Samsung";
        this.fridge = "Samsung";
        this.entertainmentSystem = "Bose";

    }

    public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,
               String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    @Override
    public String toString() {
        return "Car{getSteering = "+ getSteering() + " , getMusicSystem = " + getMusicSystem() +
                " , getAirConditioner = " + getAirConditioner() +
                " , getFridge = " + getFridge() + " , getEntertainmentSystem = "+ getEntertainmentSystem()+
                " , getEngine = "+ getEngine() +
                " , getWheels = " + getWheels() +
                " , getSeats = " + getSeats() +
                " , getFuelTank = " + getFuelTank() +
                " , getLights = " + getLights() + "}"
                ;
    }
}


