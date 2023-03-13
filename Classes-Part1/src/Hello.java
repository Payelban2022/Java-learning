

public class Hello {
    public static void main(String args[]){
        Car car = new Car();
        car.setSpeed(40);
        //System.out.println(car.getSpeed());
        car.setDoors("Closed");
       // System.out.println(car.getDoors());
        car.setEngine("On");
        car.setDriver("Seated");
        System.out.println(car.run());
    }
}
