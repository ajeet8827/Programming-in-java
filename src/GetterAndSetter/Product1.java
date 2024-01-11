package GetterAndSetter;
/*
                       Setter and getter
                      =====================
  1. we can achive encapsulation by the use of setter and getter.
  2.we can control our code in a better way by using setter and gettter.
               example-:  we create restriction in class method - just like as
                         public void setId(int i){
                                          --- here we can create any type of restriction in our code for security perpose
                                         if(i<=0){
                                            System.out.println("Id must be positive");
                                            return;
                                         }
                                           id =i;

                                   }

  3.we can set our data member in a immutable type with the help of constructor in below code all the concept there.
  Immutable means -  ek bar ham apne data ko set krna hai bad me use change nahi kr skte is called immutable .
  immutable means jo ek bar create hone ke bad change na ho


 */
public class Product1 {
    private int id ;
    private String name;
    private double price;

    public Product1(int i,String n,double p ){
        id=i;
        name=n;
        price =p;

    }
    public void setPrice(double p){
        price =p;
    }

    public void setName(String s){
        name =s;
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
