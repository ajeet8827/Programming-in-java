package ArgumentPassing;

import java.util.ArrayList;

public class ArgPassDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList =new ArrayList<>();
        myList.add(2);
        myList.add(4);
        System.out.println("Before changing: my List:"+myList);
        change(myList);
        System.out.println("After changing: my List:"+myList);
    }

    public static void change(ArrayList<Integer> myList){
      //  myList = new ArrayList<>();
        myList.add(3);
        myList.add(4);
    }



}
