package ex_21072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        // Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year: YYYY");
        int year=sc.nextInt();
        while(year%4==0){
            System.out.println(year+" is a leap year");
        }
        System.out.println(year+" is not a leap year");
    }
}
