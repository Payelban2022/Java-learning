public class Method2 {
    public static void main(String args[]){
        System.out.println("The area of rectangle "+ area(3.25d,4.25d));
        System.out.println("The area of square  "+ area(5));
        System.out.println("The area of square  "+ area(3.25d));

    }
    public static double area(double length, double width){
        return length*width;
    }
    public static double area(double side){
        return side*side;
    }
    public static int area(int side){
        return side*side;
    }
}
