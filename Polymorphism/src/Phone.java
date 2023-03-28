import scala.reflect.internal.Mode;

public class Phone {
    private String Model;

    public Phone(String model){
        Model = model;

    }

    public void features() {
        System.out.println("Feature phone");

    }

    public String getModel() {
        return Model;
    }
}
