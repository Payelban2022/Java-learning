public class Demo {
    public static void main(String args[]){
        //Bike bike = new Bike();
        //System.out.println(bike.getHandle());
        //System.out.println(bike.getSeats());
        //Method overriding
        Bike bike = new Bike("long","diesel",2,2,40,"LED");
        //System.out.println(bike.getHandle());
        //System.out.println(bike.getEngine());
        System.out.println(bike);

        Car car = new Car("electro","Bose","Samsung","Samsung",
                "Bose","Petrol",4,5,80,"LED");
        System.out.println(car);

        Truck truck = new Truck("diesel",8,3,100,"LED","power",
                "Samsung","Samsung",2);
        System.out.println(truck);




    }
}
