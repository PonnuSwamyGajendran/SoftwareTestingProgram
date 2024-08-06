package ex_21072024;

public class Lab086 {
    public static void main(String[] args) {
        // Print numbers that are multiply by 3
        // Print numbers that are multiply by 5
        // Print numbers that are multiply by both 3 & 5
        for(int i=1;i<=100;i++){
            if (i%3==0 && i%5==0){  // This condition always be at top
                System.out.println(i+ " is divisible by 3 and 5");
            }
            else if(i%3==0){
                System.out.println(i+" is divisible by 3");
            }
            else if(i%5==0){
                System.out.println(i+" is divisible by 5");
            }
            else{
                System.out.println(i);
            }
        }
        // In conditions - Rule
        // Multiple condition statement always comes first
    }
}
