package ex_13072024;

public class Lab036 {
    public static void main(String[] args) {
        int a=20;
        //System.out.println(a++ + --a  + ++a + a--);
        // 20-->21 , 21-->20, 20-->21, 21-->No change

        System.out.println(a-- + ++a  + a++ + --a + ++a);
        // 20-->19,  19-->20, 20-->21, 21-->20, 20-->21
        System.out.println(a);

        /*Post Increment & Decrement always looks for possible math operation, if it exists it will increase the value by 1 otherwise it simply assign the given value
        * Meaning --> Post 1st assign value and then look for increment/decrement feasibility
        * If further math operation exists after post increment/decrement then only its value gets increment/decremented by 1 */
    }
}
