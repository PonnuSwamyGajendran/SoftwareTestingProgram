package ex_21072024;

public class Lab104 {
    public static void main(String[] args) {
        /*  Functions
        * Block of code which can be re-use
        * Inbuild functions are available
        * User create function is achieved
        * --- 1. Define function ---
        * --- 2. Call the function ---
        * 4 types of functions are present
        * 1. Without parameter without return type
        * 2. Without parameter with return type
        * 3. with parameter with no return type
        * 4. with parameter with return type */
        function_type1();
        System.out.println("1. Without parameter without return type");
        System.out.println("---------------------");

        String result= function_type2();
        System.out.println("2. Without parameter with return type");
        System.out.println(result);

        int result1=function_type2a();
        System.out.println(result1);
        System.out.println("---------------------");


        function_type3("Amit");
        function_type3a(123);
        System.out.println("---------------------");


        int sum=function_type4(4,5);
        System.out.println("sum of a,b is "+sum);

        int value=function_type4a(5);
        System.out.println("value is "+value);

        String s=function_type4b("Paap");
        System.out.println(s);



    }
    // 1. Without parameter without return type
    static void function_type1() {
        System.out.println("1. Without parameter without return type");
    }

    // 2. Without parameter with return type
    static String function_type2() {
        return "Ponsam";
    }

    static int function_type2a(){
        return 5;
    }

    // 3. with parameter with no return type
    static void function_type3(String name){
        System.out.println("3. with parameter with no return type");
        System.out.println("You have shared ---> "+name);
    }

    static void function_type3a(int a){
        System.out.println("you passed an integer --> "+a);
    }

    // 4. with parameter with return type
    static int function_type4(int a, int b){
        System.out.println("4. with parameter with return type");
        return a+b;
    }

    static int function_type4a(int a){
        return a;
    }

    static String function_type4b(String str){
        return str;
    }

}
