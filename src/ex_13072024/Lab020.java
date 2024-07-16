package ex_13072024;

public class Lab020 {
    public static void main(String[] args) {
        /*------Type Casting-------
        * Two Types
        * Implicit Typecast
        * Explicit Typecast
        * Implicit typecast--> putting the smaller bucket into larger one(JVM will do by its own)
        * Explicit typecast--> putting larger bucket into smaller one and the excess is a loss which is collected by Garbage collector
        * In Explicit --> There will be always a loss of data*/

        //Below example for implicit:
        int a=200;
        float b=700.22f;
        float c=a+b; // Implicit typecast and JVM won't give exception because we are putting smaller one into larger one which is correct as per rule
        System.out.println(c);

        //Below is the example for explicit
        int d=200;
        float e=700.22f;
       // int f=(d+e); --> Incorrect as we are putting larger into smaller one
        // In this case it throws exception
        // To avoid this we can do a typecast i.e explicit typecast
        // Below is the line on how to do explicit typecast
        int g=(int)(d+e);
        System.out.println(g);

        // As you can see output, there is a loss of data in the 2nd program compare to 1st program
    }
}
