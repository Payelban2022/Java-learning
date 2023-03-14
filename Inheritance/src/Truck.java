public class Truck extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;



    public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String steering,
                 String musicSystem,
                 String airConditioner, int container) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public int getContainer() {
        return container;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + getSteering() + '\'' +
                ", musicSystem='" + getMusicSystem()+ '\'' +
                ", airConditioner='" + getAirConditioner() + '\'' +
                ", container=" + getContainer() + '\''+
                ", engine='" + getEngine()+ '\'' +
                ", wheels='" + getWheels()+ '\'' +
                ", seats='" + getSeats()+ '\'' +
                ", FuelTank='" + getFuelTank()+ '\'' +
                ", Lights='" + getLights()+


                '}';
    }
}
