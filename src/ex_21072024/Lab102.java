package ex_21072024;

public class Lab102 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=5; j>=i;j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
