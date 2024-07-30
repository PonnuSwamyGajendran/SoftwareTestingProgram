package ex_14072024;

public class Lab032 {
    public static void main(String[] args) {
        // Increment & Decrement
        /* 1. Pre Increment
        *  2. Post Increment
        *  3. Pre Decrement
        *  4. Post Decrement*/

        // ----- Post-Increment -----
        System.out.println("----- Post-Increment -----");
        int a=20;
        System.out.println(a++); // It assign value to a and that's all and it will not increment now. It will increment by 1 in the next time
        System.out.println("Now value assigned to 'a' is " + a); // Printing 'a' value again to check the value
    }
}
