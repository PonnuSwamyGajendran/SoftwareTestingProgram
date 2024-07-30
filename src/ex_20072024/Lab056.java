package ex_20072024;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args){
        // Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year % 4 ==0 ){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
