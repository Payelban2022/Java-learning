public class person {
    private String name ;
    private int age ;
    private String gender ;

    //public person() {
       // this.name = "John Doe";
       // this.age = 25;
       // this.gender = "Male";
    //}

    public person(String name, int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean setAge(int age) {
        if(age >0 && age<= 100){
        this.age = age;
        return true;}
        return false;
    }
}
