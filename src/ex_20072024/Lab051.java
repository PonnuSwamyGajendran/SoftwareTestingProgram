package ex_20072024;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Enter num3");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("The largest number is "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The largest number is "+num2);
        }
        else {
            System.out.println("The largest number is "+num3);
        }
    }
}