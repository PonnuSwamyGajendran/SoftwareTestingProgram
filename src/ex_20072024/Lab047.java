package ex_20072024;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        if(a>b){
            System.out.println(a + "is greater number");
        } else if (b>c) {
            System.out.println(b +" is greater number");
        }
        else {
            System.out.println(c+" is greater number");
        }
    }
}
