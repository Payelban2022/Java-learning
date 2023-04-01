import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("What is your name?");
        System.out.println("Age??");
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("Welcome "+ name +"!");
        System.out.println(name + "'s age is "+ age);
        sc.close();
    }
}
