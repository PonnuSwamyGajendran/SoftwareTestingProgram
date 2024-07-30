package ex_20072024;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Enter num3");
        int num3=sc.nextInt();
        if(num1>num2 || num1>num3) {  //Understand the logic, output may vary depeds on input because its OR gate so expect the incorrect outputs as well since the condition we provided
            System.out.println(num1+" is greater");
        }
        else if(num2>num3) {
            System.out.println(num2+" is greater");
        }
        else {
            System.out.println(num3+" is greater");
        }
    }
}
