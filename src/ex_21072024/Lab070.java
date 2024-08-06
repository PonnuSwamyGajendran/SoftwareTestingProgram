package ex_21072024;

public class Lab070 {
    public static void main(String[] args) {
        for(int i=1; ;i++){     // This has no exit condition so it will be an infinite loop
            System.out.println(i);

            /*This has no exit condition
            * So loop is keep on executing until it reached the fail condition
            * Since there is no condition here
            * so no exit condition and it prints infinite time
            * It will print upto integer length
            * After reaches the maximum, it prints negative value
            * Once it reached max negative value
            * Again it starts print positive value and the cycle continues
            * It is cyclic in nature
            * After run immediately stop execute
            * Otherwise it will eat up memory until its full*/
        }
    }
}
