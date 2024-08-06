package ex_21072024;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab089 {
    public static void main(String[] args) {
        // print numbers that are divisible by 4
        // print numbers that are divisible by 6
        // print numbers that are divisible by both 4 and 6
        // Use Scanner class to get the number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter maximum number");
        int num = sc.nextInt();
        for(int i=1;i<=num; i++){
            if(i%4==0 && i%6==0){
                System.out.println(i+" is divisible by 4 and 6");
            }
            else if(i%4==0){
                System.out.println(i+" is divisible by 4");
            }
            else if(i%6==0){
                System.out.println(i+" is divisible by 6");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
