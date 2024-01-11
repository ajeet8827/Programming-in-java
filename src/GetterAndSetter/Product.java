package GetterAndSetter;

public class Product {

    private int id ;
    private String name ;
    private double price;

    public void setId(int i){
        if(i<=0){
            System.out.println("id cannot be neg");
            return;
        }
        id=i;
    }

    public void setName(String s){
        name=s;

    }

    public void setPrice(double p){

        if(p<0.0){
            System.out.println("price must be possitive");
            return;
        }
        price =p;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
