package practice4;

public class Age {
    public void solution(int age) {
        int year = 2023 - age;
        System.out.printf("2022년 기준 %d살이므로 %d년생입니다.\n", age, year);
    }

    public void solution2(int bornyear) {
        int age = 2023 - bornyear;
        System.out.printf("2022년 기준 %d년생이므로 %d살입니다.\n", bornyear, age);
    }
}
