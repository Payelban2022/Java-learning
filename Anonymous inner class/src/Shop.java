public class Shop {
    public static void main(String args[]){
        Door door = new Door();
        if(door.getLock().isUnlocked(args[0])){
            System.out.println("Welcome!");

        }else{
            System.out.println("We are closed");
        }
    }
}

