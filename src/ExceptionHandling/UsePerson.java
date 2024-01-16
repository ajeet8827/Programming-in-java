package ExceptionHandling;


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
public class UsePerson {
    public static void main(String[] args) {
        Person p = new Person("Sanju",87);
        System.out.println(p);
    }
}
