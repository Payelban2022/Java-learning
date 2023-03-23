public class hello {
    public static void main(String[] args){
        person john = new person();
        System.out.println(john);
        person pooja =new person("Pooja",26,"Female");
        System.out.println(pooja);
        pooja.setAge(36);
        System.out.println(pooja);


    }
}
