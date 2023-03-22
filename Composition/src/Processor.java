public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String MinFrequency;
    private String MaxFrequency;

    public Processor() {
        this.brand = "intel";
        this.series = "7200u";
        this.generation= 7;
        this.cores = 2;
        this.threads = 4;
        this.cacheMemory = "3MB";
        this.frequency = "3.5Ghz";
        this.MinFrequency = "3 Ghz";
        this.MaxFrequency = "4.5 GHz";
    }

    public Processor(String brand,String series, int generation, int cores, int threads,
                     String cacheMemory, String frequency, String MinFrequency,
                     String MaxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation= generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.MinFrequency = MinFrequency;
        this.MaxFrequency = MaxFrequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", cores=" + cores +
                ", threads=" + threads +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", MinFrequency='" + MinFrequency + '\'' +
                ", MaxFrequency='" + MaxFrequency + '\'' +
                '}';
    }


    public String getBrand() {
        return brand;
    }



    public String getCacheMemory() {
        return cacheMemory;
    }



    public String getFrequency() {
        return frequency;
    }



    public int getCores() {
        return cores;
    }



    public int getGeneration() {
        return generation;
    }



    public String getMaxFrequency() {
        return MaxFrequency;
    }


    public String getMinFrequency() {
        return MinFrequency;
    }



    public String getSeries() {
        return series;
    }



    public int getThreads() {
        return threads;
    }
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }




}
