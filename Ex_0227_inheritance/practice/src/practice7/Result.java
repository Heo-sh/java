package practice7;

public class Result {
    public int solution(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) { 
            if (i % 2 == 0) { //== i % 2 != 1 
                result += i;
            }
        }
        return result;
    }
}
