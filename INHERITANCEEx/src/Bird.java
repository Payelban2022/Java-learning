public class Bird extends Animal {
    protected boolean feathers;
    protected boolean fly;

    public Bird(){
        heightFeet = 4;
        weightKg = 8;
        animalType = "Aves";
        bloodType = "warm";
        this.feathers = true;
        this.fly = true;
    }

    @Override
    public String ShowInfo() {
        return "Bird{" +
                "feathers=" + feathers +
                ", fly=" + fly +
                ", heightFeet=" + heightFeet +
                ", weightKg=" + weightKg +
                ", animalType=" + animalType +
                ", bloodType=" + bloodType +

                '}';
    }
}
