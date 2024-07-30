package ex_14072024;

public class Lab037 {
    public static void main(String[] args) {
        int a=20;
        System.out.println(a);
        System.out.println(--a + ++a + a++ + a-- + --a + ++a + a++ + --a + --a + --a);
        // 20->19, 19->20, 20->21, 21->20, 20->19, 19>20, 20->21, 21->20, 20->19, 19->18
        System.out.println(a);
    }
}
