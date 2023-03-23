public class person {
    public String name = "John";
    public int age = 25;
    public String gender = "Male";

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
}
