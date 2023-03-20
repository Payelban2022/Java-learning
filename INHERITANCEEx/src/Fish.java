public class Fish extends Animal {
    protected boolean waterBone;
    protected boolean gills;

    public Fish(){
        heightFeet = 5;
        weightKg = 20;
        animalType = "Reptile";
        bloodType = "cold";
        this.waterBone = true;
        this.gills = true;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                '}';
    }
}
