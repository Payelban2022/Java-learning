public class hello {
    public static void main(String[] args){
        //laptop lappy = new laptop();
        //System.out.println(lappy);
        //System.out.println(lappy.getProcessor().getBrand());
        //System.out.println(lappy.getGraphicsCard().getBrand());
        //Processor processor = new Processor("intel","7200U",7,4,4,"6MB","2.5Ghz","2.5Ghz","3.1Ghz");
        //GraphicsCard graphicsCard = new GraphicsCard("Nvidia",940,"2GB");
        laptop gaminglaptop = new laptop(15.7f,
                new Processor("intel","7200U",7,4,4,"6MB","2.5Ghz","2.5Ghz","3.1Ghz"),
                "DDR4","2TB",new GraphicsCard("Nvidia",940,"2GB"),"MLT Layer","backlit");
        System.out.println(gaminglaptop);
        gaminglaptop.gamingMode();
        System.out.println(gaminglaptop.getProcessor().getFrequency());

    }
}
