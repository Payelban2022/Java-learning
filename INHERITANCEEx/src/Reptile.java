public class Reptile extends Animal {
    protected String skin;
    protected boolean backbone;
    protected String egg ;

    public Reptile() {
        heightFeet = 5;
        weightKg = 20;
        animalType = "Reptile";
        bloodType = "cold";
        this.skin = "Dry skin";
        this.backbone = true;
        this.egg = "soft shelled";
    }


    public String ShowInfo() {
        return "Reptile{" +
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
