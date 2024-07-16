package ex_13072024;

public class Lab030 {
    public static void main(String[] args){

        /*Arithmetic Operator
        * +, - , *, / */
        int a=200;
        int b=100;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        int x=200;
        int y=400;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);  // This gives warning as it is not the right value and it gives 0 in output because its a float value and we are not represented that its a float value
        // To avoid and get the exact divisible value we did a typecast (Explicit) as below

        int c=100;
        int d=200;
        float e=(float)c/d;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(e); // it always gives quotient as output
    }
}
