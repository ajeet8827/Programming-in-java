package Polymorphism2;

public class UseLanguage {
    public static void main(String[] args) {

        // Run time polymorphism.......
        Language lng;
        lng = new Hindi();
        lng.greetings();
        lng= new English();
        lng.greetings();
        lng= new French();
        lng.greetings();
    }
}
