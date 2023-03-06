public class Prime {
    public static void main (String args[]){
        int num = 97;
        if (num <2){
            System.out.println("0 and 1 are not prime nos.");
        } else{
        int temp;
        boolean isPrime = true;

        for (int i = 2; i <= num/2;i++){
            temp = num % i;
            System.out.println(temp);
            if (temp == 0){
                    isPrime = false;
                    break;
                }
            }

        if (isPrime){
            System.out.println(num + " is a prime no.");
        }else {
            System.out.println(num + " is not a prime no.");

}}}}
