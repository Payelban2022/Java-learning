public class Crocodile extends Reptile {

    public Crocodile() {
        super();
        egg = "Hard shelled";

    }


    public String ShowInfo() {
        return "Crocodile{" +
                "skin='" + skin + '\'' +
                ", backbone=" + backbone +
                ", egg='" + egg + '\'' +
                ", heightFeet='" + heightFeet + '\'' +
                ", weightKg='" + weightKg + '\'' +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +

                '}';
    }
}
