package ex_13072024;

import java.util.Locale;

public class Lab038 {
    public static void main(String[] args) {
        // String Concepts
        /*String can be stored in 2 ways
        * With Keyword new & Without Keyword (Traditional way)
        * With Keyword means String Class/we can say Object creation
        * In JVM there is 3 parts
        * 1. Class Loader --> We no need to understand this. please skip
        * 2. Heap Area
        * 3. SCP (String Constant Pool)
        * The Traditional way of creating string always stores in SCP
        * String created with new keyword(object creation) is always stores value in heap area
        * Duplicate string value will not be allowed in SCP
        * Duplicate String value allowed in heap
        * In SCP-->Two same String values cannot be stored in 2 different variables. It always point the same
        * In SCP--> Two same String values can be stored in 2 different variables. It doesn't point the same because we explicitly saying create a new string with saying new keyword
        * SCP VS Heap. Which is best place to store
        * SCP is simply stores a value in variable. That's all
        * Whereas, Heap is a object creation meaning it's a String Class
        * Since it's a string class, we have multiple default methods that can come with string class*/

        // <------- Traditional way of storing string ------>
        String str = "RomanticCouple";
        String str2 = "AnnoyingGirlfriend";
        String str3 = "WasteFellow";
        System.out.println(str);

        // <------- Traditional way of storing string ------>
        String heap = new String("HappyCouple");
        String heap1 = new String("AnnoyingGirlfriend");
        String heap2 = new String("Mad");
        int size =heap.length(); //.length is one function. similarly we have multiple functions in string class
        System.out.println(size);

        String lc=heap.toLowerCase();
        System.out.println(lc);

        String uc=heap.toUpperCase();
        System.out.println(uc);

        char ch=heap.charAt(5);
        System.out.println(ch);

        int cp=heap.codePointAt(3);
        System.out.println(cp);

        int bool=heap.compareTo(heap1);
        System.out.println(bool);

        int hc=heap.hashCode();
        System.out.println(hc);

        String con=heap.concat("Us");
        System.out.println(con);

        boolean bool2=heap.contains("c");
        System.out.println(bool2);

        boolean bool3=heap.equalsIgnoreCase("happycouple");
        System.out.println(bool3);

        int bool4=heap.compareTo("sachin");
        System.out.println(bool4);

        int ind=heap.indexOf("Animal");
        System.out.println(ind);

        boolean bool5=heap.equals(str);
        System.out.println(bool5);

        boolean bool6=heap.endsWith("e");
        System.out.println(bool6);

        int li=heap.lastIndexOf(6);
        System.out.println(li);

        boolean bool7=heap.matches("Admin@123#");
        System.out.println(bool7);

        String rep=heap.replace("pp","*****");
        System.out.println(rep);

        String rep1=heap.replace("e","yyyy");
        System.out.println(rep1);

        String rep2=heap.replace("C","c");
        System.out.println(rep2);

        boolean bool8=heap.contains("p");
        System.out.println(bool8);

        boolean bool9=heap.contains("ppy");
        System.out.println(bool9);

        String[] spl=heap.split("y");
        System.out.println(spl.length);

    }
}
