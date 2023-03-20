public class Animal {
    protected float heightFeet;
    protected float weightKg;
    protected String animalType;
    protected String bloodType;

    public Animal(){
        this.heightFeet = 0;
        this.weightKg = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }


    public String ShowInfo() {
        return "Animal{" +
                "height=" + heightFeet +
                ", weight=" + weightKg +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }



}
