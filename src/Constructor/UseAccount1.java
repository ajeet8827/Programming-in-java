package Constructor;

public class UseAccount1 {
    public static void main(String[] args) {
        Account1 obj = new Account1(101,"ajeet",5000.0);
        Account1 obj1 = new Account1(102,"sujeet",9000.0);

        obj.showAccount1();
        obj1.showAccount1();

    }
}
