public class Method {
    public static void main(String args[]){
        loop1();
        System.out.println("**************");
        loop2();
    }
    public static void loop1() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;

        }

    }
    public static void loop2(){
        for (int j =21; j <= 40; j++){
            System.out.println(j);
        }

    }
}
