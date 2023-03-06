public class CalculateDemo {
    public static void main(String args[]){
        Calculate prime = new Calculate();
         if (prime.isPrime(29.5d)){
             System.out.println("Number passed is prime");
         }
         else{
             System.out.println("Number passed is not prime");
         };

    }
}
