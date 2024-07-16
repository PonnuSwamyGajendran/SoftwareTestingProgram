package ex_13072024;

public class Lab029 {
    public static void main(String[] args){
        /*Logical Operator*/
        /* ||(OR), &&(AND) , !(NOT) or NAND, NOR, XOR(Not used widely) */

        // &&(AND)
        System.out.println("<------Output for && Gate------>");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // ||(OR)
        System.out.println("<------Output for || Gate------>");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // NOT for AND --> NAND
        System.out.println("<------Output for NAND  Gate------>");
        System.out.println(!(true && true));
        System.out.println(!(true && false));
        System.out.println(!(false && true));
        System.out.println(!(false && false));

        // NOT for OR --> NOR
        System.out.println("<------Output for NOR  Gate------>");
        System.out.println(!(true || true));
        System.out.println(!(true || false));
        System.out.println(!(false || true));
        System.out.println(!(false || false));
    }
}
