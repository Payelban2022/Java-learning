public class Shop {
    public static void main(String args[]){
        Door door = new Door();
        //System.out.println(door.isLocked("qwerty"));
        if(door.isLocked(args[0])){
            System.out.println("Shop has closed,visit later");
        }else{
            System.out.println("Welcome! We are open.");

        }
    }
}
