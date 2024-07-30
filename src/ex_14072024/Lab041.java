package ex_14072024;

public class Lab041 {
    public static void main(String[] args) {
        /*BODMAS RULE
        * BODMAS --> Bracket, Order, Division, Multiplication, Addition, and Subtraction
        * Which doing math calculator, we should always follow BODMAS rule*/

        int a=10;
        int b=20;
        int c=30;
        int d=(a+b+(b-a)/2-a+c+(a+b+c)/2);
        // Let's do manually by applying BODMAS Rule
        // d= 10+20+(20-10)/2-10+30+(10+20+30)/2
        // d= 10+20+(10)/2-10+30+(60)/2
        // d= 10+20+5-10+30+30
        // d= 85
        System.out.println(d);
    }
}
