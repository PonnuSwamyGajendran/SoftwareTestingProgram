package ex_21072024;

public class Lab088 {
    public static void main(String[] args) {
        // Continue usage
        for (int i = 0; i < 10; i++) {
            if (i==5){
                continue; // This keyword skips the further line of execution and go back to loop
            }
            else {
                System.out.println(i);
            }
        }
    }
}
