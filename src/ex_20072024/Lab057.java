package ex_20072024;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
        // Vowels
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u'){
            System.out.println(ch+" is a vowel");
        }
        else{
            System.out.println(ch+" is not a vowel");
        }
    }
}
