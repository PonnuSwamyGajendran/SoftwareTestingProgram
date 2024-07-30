package ex_20072024;

public class Lab063 {
    public static void main(String[] args){
        // Circumference or Perimeter of Circle
        final double pi =3.14;
        int radius = 3;
        // Final is final we can't change its value
        // In real time, we don't to change some constant values. So to say that its a constant we are using keying final
        // so that other person can understand about it and they won't change its value
        System.out.println(pi);
       double circumference_of_circle= 2*(pi)*(radius);
        System.out.println("circumference of circle = "+circumference_of_circle);
    }
}
