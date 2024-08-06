package ex_21072024;

import java.util.Scanner;

public class Lab090 {
    // Factorial number
    // 5! = 5*4*3*2*1 = 120
    // 3! = 3*2*1
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact = fact * i;
            if(i==num) {
                System.out.println(fact);
            }
        }

    }
}
