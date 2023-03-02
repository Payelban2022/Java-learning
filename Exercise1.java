public class Exercise1 {
    public static void main(String args[]){
        int a = 2 ;
        float b = 2.5f;
        double value = a*a + 2*a*b + b*b;
        System.out.println("Result = "+value);
        int castedvalue = (int)value;
        System.out.println("Casted result = "+castedvalue);

    }
}
