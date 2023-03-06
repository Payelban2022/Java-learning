public class sumdigit {
    public static void main(String args[]){

        int num = 1234;
        int sum = 0;
        while (true){
            sum = sum + num%10;

            num = num/10;
            if (num < 10){
                break;
            }
        }
        sum = sum + num;
        System.out.println("The sum of digits is "+ sum);

    }
}
