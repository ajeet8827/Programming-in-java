package GetterAndSetter;

public class UseProduct {
    public static void main(String[] args) {
        Product p = new Product();
        p.setId(-101);
        p.setName("ajeet");
        p.setPrice(-90000.0);
        System.out.println("product id = "+p.getId());
        System.out.println("product name = "+p.getName());
        System.out.println("product price = "+p.getPrice());
    }

}
