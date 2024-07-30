package ex_14072024;

public class Lab040 {
    public static void main(String[] args) {
        String str = new String("Happy");
        String str2 = new String("Happy");

        System.out.println(str==str2); // This is comparison of 2 strings(to check whether both string pointing to same string)

        System.out.println(str.equals(str2)); // This is checking the String value. It won't check the comparison of 2 strings
    }
}
