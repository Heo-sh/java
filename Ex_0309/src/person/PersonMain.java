package person;

public class PersonMain { //실행을 하기 위한 클래스
	public static void main(String[] args) {
//		고객의 인적사항을 추가, 삭제, 확인을 해보자.
//		이름, 나이, 번호를 갖는 Person클래스를 만든다.
//		PersonManager클래스를 만들어 personMgr()메서드를 만들고
//		아래와 같이 기능 구현
//		실행은 PersonMain에서 하기
		
//		결과:
//			1. 정보추가
//			2. 정보삭제
//			3. 전체정보
//			4. 종료
//			항목선택: 1 <- 정보 추가 항목
//			----정보추가----
//			이름: 1 <- 키보드에서 입력받기
//			나이: 1
//			전화: 1
//			정보 저장 <- ArrayList 추가
//			
//			항목선택: 3 <- 정보 보기 항목
//			----전체정보----
//			등록인원 1명
//			이름: 1
//			나이: 1
//			전화: 1
//		
//			항목선택: 2 <- 정보 삭제
//			----정보 삭제----
//			삭제할 이름: 1
//			1의 정보를 삭제했습니다.
//			살제할 데이터가 없습니다.
//		PersonManager pm = new PersonManager();
//		pm.personMgr();
		
		PersonManager_teacher pmt = new PersonManager_teacher();
		pmt.personMgr();
		
	}
}
