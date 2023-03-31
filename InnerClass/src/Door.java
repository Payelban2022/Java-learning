public class Door {
    public Lock getLock() {
        return lock;
    }

    private Lock lock;
    public Door(){
        lock = new Lock(true);

    }
    public void shopStatus() {
        if (lock.isLock()) {
            System.out.println("Shop is closed, please visit later.");
        } else {
            System.out.println("Welcome. We are open!");
        }
    }

    class Lock{
        private boolean lock;

        public Lock(boolean lock) {
           this. lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }

}
