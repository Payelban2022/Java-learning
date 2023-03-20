public class Eel extends Fish {
    private String special;
    public Eel() {
        super();
        this.special = "Releases electric shock";

    }

    @Override
    public String ShowInfo() {
        return "Eel{" +
                "special='" + special + '\'' +
                "waterBone='" + waterBone + '\'' +
                "gills='" + gills + '\'' +
                "heightFeet='" + heightFeet + '\'' +
                "weightKg='" + weightKg + '\'' +
                "animalType='" + animalType + '\'' +
                "bloodType='" + bloodType + '\'' +


                '}';
    }
}
