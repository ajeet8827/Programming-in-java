package GetterAndSetter;

public class UseProduct1 {
    public static void main(String[] args) {
        Product1 p = new Product1(100,"sanju",55000.0);
        System.out.println("pro id "+p.getId());
        System.out.println("pro name "+p.getName());
        System.out.println("pro price "+p.getPrice());
        p.setName("ajeet");

        System.out.println("==================================");

        System.out.println("pro id "+p.getId());
        System.out.println("pro name "+p.getName());
        System.out.println("pro price "+p.getPrice());

        System.out.println("=====================================");

        p.setName("Lalla");
        p.setPrice(4000.0);

        System.out.println("pro id "+p.getId());
        System.out.println("pro name "+p.getName());
        System.out.println("pro price "+p.getPrice());

    }
}
