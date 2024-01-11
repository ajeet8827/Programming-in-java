package Encapsulation;

public class UseStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent(111,"amit",87.9);
        s.showStudent();

        System.out.println("===============================");
        Student p = new Student();
        p.setStudent(101,"ajeet",98.5);
        p.showStudent();
    }
}
