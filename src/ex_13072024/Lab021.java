package ex_13072024;

public class Lab021 {
    public static void main(String[] args) {
        float f= 22.33f;
        double d=27898989;
        //float e=f+d;
        System.out.println(f+d);

        float f1= 22.33f;
        double d1=27898989;
        float e1= (float)(f1+d1); //Explicit type cast
        System.out.println(e1);

        float f2= 22.33f;
        double d2=27898989;
        double e2= (f2+d2); // Implicit type cast
        System.out.println(e2);



    }
}
