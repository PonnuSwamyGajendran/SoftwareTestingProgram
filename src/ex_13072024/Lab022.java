package ex_13072024;
import java.lang.String;

public class Lab022 {
    public static void main (String[] args){
        //Boolean

        boolean bool = (10>20);
        System.out.println(bool);

        int age=28;
        boolean bool1 = (age==28);
        System.out.println(bool1);

        String s1="Ram";  // It stores value in SCP (String Constant Pool)
        String str = new String("Ram"); // It stores value in heap
        System.out.println(s1==str);




    }
}
