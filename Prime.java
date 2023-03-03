public class Prime {
    public static void main (String args[]){
        int x = 1005;
        if (x == 0 || x == 1){
            System.out.println("0 and 1 are not prime nos.");
        }else {
            for (int i = 2; i <= x/2; i++){

                if ((x%i) == 0){
                    System.out.println(x +" is not prime.");
                    break;
                }
                else {
                    System.out.println(x + " is prime no.");
                    break;
                }
            }
        }
}}
