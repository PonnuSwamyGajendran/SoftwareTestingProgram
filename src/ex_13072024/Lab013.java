package ex_13072024;

public class Lab013 {
    public static void main(String[] args) {
        byte a=10;
        int b=a++;
        System.out.println(b);

        byte c=20;
        int d=++c;
        System.out.println(d);

        // byte can store in int but int can't be stored in byte
        // Consider datatype as a bucket
        // Smaller bucket can fit in bigger bucket but bigger can't fit in smaller bucket
        // Similarly short can fit in int and long can't fit in int
    }
}
