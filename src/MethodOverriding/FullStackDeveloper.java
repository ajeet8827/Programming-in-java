package MethodOverriding;

public class FullStackDeveloper extends FrontEndDeveloper {

    public void mySkills(){
        System.out.println("I am a full stack developer");
        super.mySkills();
        System.out.println("I know backend part Sring and spring boot");
    }
}
