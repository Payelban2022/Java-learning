public class Method1 {
    public static void main(String args[]){
        loop(1,10);
        System.out.println("******");
        loop(11,20);
        System.out.println("******");
        loop(21,40);

    }
    public static void loop(int step, int finalvalue){
        while(step <= finalvalue){
            System.out.println(step);
            step++;

        }
    }
}
