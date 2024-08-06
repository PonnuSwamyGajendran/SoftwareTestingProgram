package ex_21072024;

public class Lab099 {
    public static void main(String[] args) {
        // FizzBuzz Program
        // Write a program that Prints the number from 1 to 100
        // For multiples of 3, print Fizz instead of number
        // For multiples of 5, print Buzz instead of number
        // For multiples of 3 and 5, print FizzBuzz instead of number
        for(int i=1; i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
