public class hello {
    public static void main(String[] args){
        laptop lappy = new laptop();
        System.out.println(lappy);
        System.out.println(lappy.getProcessor().getBrand());
        System.out.println(lappy.getGraphicsCard().getBrand());
    }
}
