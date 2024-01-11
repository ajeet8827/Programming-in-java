package StaticKeyword;
class Emp{
  private int age;
  private String name;
  //private String company=new String("Amazon");
    private static String company="Amazon";

  public Emp(int a,String n){
      age=a;
      name =n;

  }

  public void display(){
      System.out.println("age="+age+", name="+name+", company="+company);
  }


}

public class StaticDemo2 {
    public static void main(String[] args) {
        Emp e = new Emp(21,"Deepak");
        Emp f = new Emp(22,"Ajeet");
        Emp g = new Emp(23,"sujeet");
        e.display();
        f.display();
        g.display();



    }
}