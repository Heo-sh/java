package practice5;

public class Angle {
    public void solution(int angle) {
        if (angle > 0 && angle < 90) {
            System.out.printf("%d도는 예각이다: 1\n", angle);
        } else if (angle == 90) {
            System.out.printf("%d도는 직각이다: 2\n", angle);
        } else if (angle > 90 && angle < 180) {
            System.out.printf("%d도는 둔각이다: 3\n", angle);
        } else if (angle == 180) {
            System.out.printf("%d도는 평각이다: 4\n", angle);
        }
    }
}