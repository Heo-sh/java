package ex1_casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
//		Demotion: 큰 자료형을 작은 자료형에 대입
		char c = 'B'; //2byte B의 아스키코드 값은 66
		int n = c + 1; //여기까지는 Promotion 캐스팅 66 + 1 = 67이며,
//		c = n; //c는 2byte, n은 4byte이므로 오류 발생 
		c = (char)n; //67을 아스키코드로 변환하면 C이다.
		
		System.out.println("c의 값 : " + c); //출력: C
		
		float f = 5.5f; //floay의 크기는 4byte이나 소수점까지 포함하면 4보다는 좀 더 크다.
		int n1 = 0;
		
//		n = f; //같은 4byte여도 자료형이 일치하지 않으면 대입 X
		n1 = (int)f; 
//		float에서 int로 캐스팅되면서 소수점 이하 자리를 상실하게 된다.
		System.out.println("n의 값 : " + n1); //출력 : 5
		
		byte b3 = 100;
		byte b4 = 20;
		
		byte b5;
		
		b5 = (byte)(b3 + b4);
		System.out.println(b5);
	}
}
