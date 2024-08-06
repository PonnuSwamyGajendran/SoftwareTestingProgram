package ex_21072024;

public class Lab084 {
    public static void main(String[] args) {
        // Find odd numbers in the range 0 to 100
        for(int i=0; i<=100;i++){
            if(i%2 !=0){
                System.out.println("Odd number ---> "+i);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
