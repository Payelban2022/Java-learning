



public class laptop {
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyboard;

    public laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.ram = "DDR4" ;
        this.hardDrive = "27B";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "MLT layer";
        this.keyboard = "backlit";
    }

    public laptop(float screen,
                  Processor processor, String ram, String hardDrive,
                  GraphicsCard graphicsCard, String opticalDrive,String keyboard) {
        super();
        this.screen = screen;
        this.processor = processor;
        this.ram = ram ;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
    public Processor getProcessor(){
        return processor;
    }
    public GraphicsCard getGraphicsCard(){
        return graphicsCard;
    }
    public String gamingMode(){
        processor.setFrequency(processor.getMaxFrequency());
        return "Success";

    }

}
