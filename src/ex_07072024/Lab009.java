package ex_07072024;

public class Lab009 {
    public static void main(String[] args) {
        System.out.println("Executed from 1st main");
    }

    public static void main (String args){
            System.out.println("Executed from 2nd main");
    }

    public static void main (int[] args){
        System.out.println("Executed from 2nd main");
    }

    public static void main (int[] args[]){
        System.out.println("Executed from 2nd main");
    }

    /*Multiple main methods were created but Java always executes the code starts from main method i.e 1st main method
    * Also we can pass the parameter in different ways as you can in different main methods*/
}
