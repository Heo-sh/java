package ramda_practice;

public class MyCalculatorTest {
    public static void main(String[] args) {
        MyCalculator cal = (x, y) -> x + y;
        int result = cal.plus(20, 30);

        System.out.println(result);

    }
    
    
}