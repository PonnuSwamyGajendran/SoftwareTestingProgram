package ex_13072024;

public class Lab014 {
    public static void main(String[] args) {
        int a=300;
        long b=123456789576L;
        long c=a+b; // Datatype is long because int is smaller bucket and long is bigger one. we can put smaller into bigger one
        System.out.println(c);

    }
}
