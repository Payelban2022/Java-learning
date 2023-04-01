abstract class Lock{
    public abstract boolean isUnlocked(String keyCode);
    public void test(){
        System.out.println("test");
    }

    }



public class Door {
    public Lock getLock() {
        return lock;
    }

    Lock lock = new Lock() {
        public boolean isUnlocked(String keyCode) {
            if (keyCode.equals("qwerty")) {
                return true;
            } else {
                return false;
            }
        }
    };
}




