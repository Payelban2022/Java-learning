public class Hello {
    public static void main(String args[]){
        Phone phone = new OnePlus5();
        //Phone phone = new Iphone8();
        System.out.println(phone.processor());
        System.out.println(phone.OS());
        System.out.println(phone.spaceInGB());

    }
}
