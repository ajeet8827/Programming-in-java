package ThisKeyword;

public class Box {

    private int length,breadth,height;
    public Box(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;

    }
    public Box(int side){
//        length=side;
//        breadth=side;
//        height=side;
        this(side,side,side);
    }
    public Box(){
//        length=0;
//        breadth=0;
//        height=0;
        this(0,0,0);
    }

    public void show(){
        System.out.println("Length="+length+", breadth="+ breadth+", height="+height);
    }
}
