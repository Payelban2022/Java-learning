public class Fish extends Animal {
    protected boolean waterBone;
    protected boolean gills;

    public Fish(){
        heightFeet = 3;
        weightKg = 10;
        animalType = "Pisces";
        bloodType = "warm";
        this.waterBone = true;
        this.gills = true;
    }


    public String ShowInfo() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightFeet=" + heightFeet +
                ", weightKg=" + weightKg +
                ", animalType=" + animalType +
                ", bloodType=" + bloodType +

                '}';
    }
}
