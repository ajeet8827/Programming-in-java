package Composition;

class College{

    private String collName;
    private int estYear;
    private final Department dept;
    public College(String collName,int estYear,String depname,String hodName){
        this.collName=collName;
        this.estYear=estYear;
        dept=new Department(depname,hodName);
    }


    private class Department{
        private String depName;
        private String hodName;

        public Department(String depName,String hodName){
            this.depName=depName;
            this.hodName=hodName;
        }

        public String toString(){

            return "Department Name:"+this.depName+", HOD Name"+this.hodName;

        }

    }

    public void showDetails(){
        System.out.println("College Name:"+this.collName+", Established Year:"+this.estYear);
        System.out.println("Deparment Details:"+dept);
    }

}

public class TestComp {
    public static void main(String[] args) {

        College coll = new College("IIT delhi",1993,"CSE","Mr.Kumar");
        coll.showDetails();

    }
}
