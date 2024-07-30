package ex_20072024;

public class Lab044 {
    public static void main(String[] args) {
        // Even or Odd Number

        /*Logic Building
        * 1. Any number that is divisible by 2 is even number
        * 2. Any number that is exactly divisible by 2 has remaining value 0
        * 3. Even number --> Remainder value should be zero
        * 4. Odd number --> Remainder value is 1
        * Ex: 100/2
        * (D)2|100|50 (Quotient)
        *      100
        *    -------
        *       0 (Remainder)
        *    -------*/
        int num=78;
        if (num%2==0){
            System.out.println(num +" is an even number");
        }
        else {
            System.out.println(num +" is not an even number");
        }

    }
}
