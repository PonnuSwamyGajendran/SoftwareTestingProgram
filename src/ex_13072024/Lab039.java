package ex_13072024;

public class Lab039 {
    public static void main(String[] args) {
        String str ="Happy";
        String str2="Happy";
        System.out.println(str==str2); // This is comparison of 2 strings(to check whether both string pointing to same string)

        System.out.println(str.equals(str2)); // This is checking the String value. It won't check the comparison of 2 strings
//        System.out.println(str);
//        System.out.println(str2);
        // In SCP-->String str & str2 has same value so it won't create duplicate. If value is same then it points 2nd variable is points to 1st variable
    }
}
