package ex1_computer;

public class Computer {
//	Class에 들어갈 수 있는 요소: 변수, 함수
	
//	변수
	
	float cpu = 4.8f;
	int ram = 64;
	int ssd = 1024;
	String color = "white";
	
//	메서드는 메서드 안에서 정의할 수 없다. -> main도 메서드이기에 main 안에서 함수를 구현할 수 없다.
	
//	컴퓨터의 정보를 반환할 메서드
//	반복적으로 사용되는 코드를 줄이기 위해서 반드시 필요한 개념
//	자주 사용되는 내용의 코드를 메서드로 작성해두고 필요할 때마다 호출만 하면 된다.
	
//	함수 구현
	
	public void getInfo() { //구현부
		System.out.println("cpu: " +cpu);
		System.out.println("ram: " + ram);
		System.out.println("ssd: " + ssd);
		System.out.println("color: " + color);
		
		System.out.println("----------------------------------");
	}
	
//	함수 기본형
//	- 접근제한자 반환형 함수명(파라미터) { //파라미터로 받을 수 있는 값: 변수, 배열, 객체 -> 생략가능
//		명령 1;
//		명령 2;
//		return 리턴값; -> 리턴해줄 게 없다면 생략가능
//	}
	
//	접근제한자
//	- public, protected, default, private가 있다.
//	- 변수에도 사용이 가능하다. 기본적으로 default가 되어 있다.
//	1. public: 모든 접근을 허용, 같은 프로젝트 내의 모든 객체들이 사용할 수 있도록 허용 -> 자주 사용
//	2. private: 현재 클래스 내에서만 사용을 허가 -> 자주사용
//	3. protected: 상속관계의 객체들에만 사용을 허가
//	4. default: 같은 패키지 내의 객체에만 사용을 허가(아무 것도 쓰지 않으면 default로 통일 사용됨.)
	
//	반환형
//	- 메서드가 처음부터 끝까지 수행을 마친 후 반환해야할 값이 있는 경우 기입
//	- int, float, double, char, boolean 등 기본 자료형 뿐만 아니라 String or 사용자가 만든
//	    객체로도 반환이 가능, 아무 것도 반환치 않을 때는 void
//	- 반환해주는 값의 자료형과 일치해야한다.
	
//	파라미터
//	- 매개변수, 인자, argument라고도 불린다.
//	- 외부에서 해당 메서드를 통해 특정 값을 전달하고자 할 때,
//	    그 특정 값을 받아서 함수 안에서 처리할 수 있도록 하는 역할
	
//	메서드명(함수명)
//	- 메서드의 이름(첫글자는 소문자로 시작)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
