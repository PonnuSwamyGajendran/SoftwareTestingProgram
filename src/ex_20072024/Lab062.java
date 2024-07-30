package ex_20072024;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person Name");
        String str1=sc.next();
        //String str="Arun";
        switch (str1){
            case "Arun":
                System.out.println(str1+" from teaching dept");
                break;
            case "Ponnu":
                System.out.println(str1+" is from technical team");
                break;
            case "Ram":
                System.out.println(str1+" is from chemical analyst team");
                break;
            case "Paapu":
                System.out.println(str1+" is EEE graduate from SVU");
                break;
            default:
                System.out.println(str1+" --> No idea about this person");
        }
        sc.close();
    }
}
