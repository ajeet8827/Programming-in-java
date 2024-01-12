package FinalKeywordAtMethod;

public  class Bike {// class ko final kr skte hai
    public  void topSpeed(){// method ko final kr skte hai jisse ye overriding nahi ho skti hai

        System.out.println("Bike running at top speed of 120 kmph");
    }
}


/*
                     1. final data: Not allows reassignment
                     2. final methods: Not allow overriding
                     3. final class: Not allows inheritance

                     Some popular predefined classes in java are final :
                     1. String
                     2.Math
                     3.All Wrapper class: Integer,Character.....
 */
