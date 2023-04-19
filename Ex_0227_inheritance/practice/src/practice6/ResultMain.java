package practice6;

public class ResultMain {
    public static void main(String[] args) {
        // 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 
        // 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
        Result re = new Result();
        Object result = re.solution(3, 2);
        System.out.println(result);

        // int num1 = 3;
        // int num2 = 2;
        // float num3 = (float)num1 / (float)num2;
        // System.out.println(num3);
    }
}
