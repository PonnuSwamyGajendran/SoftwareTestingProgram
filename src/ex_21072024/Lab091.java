package ex_21072024;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        int fact=1;
/*      Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();*/
        for(int i=1;i<=5;i++){
            fact = fact * i;
            System.out.println(fact);
        }

    }
}
