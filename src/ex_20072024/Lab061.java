package ex_20072024;

import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch1=sc.next().charAt(0);
        //char ch='o';
        switch (ch1){
            case 'a':
                System.out.println(ch1+ " is a vowel");
                break;
            case 'e':
                System.out.println(ch1+ " is a vowel");
                break;
            case 'i':
                System.out.println(ch1+ " is a vowel");
                break;
            case 'o':
                System.out.println(ch1+ " is a vowel");
                break;
            case 'u':
                System.out.println(ch1+ " is a vowel");
                break;
            default:
                System.out.println(ch1+ " is a consonant");
        }
        sc.close();
    }
}
