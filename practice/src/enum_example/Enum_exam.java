package enum_example;

public enum Enum_exam {
	START("게임시작"),
	CONTINUE("재시작"),
	EXIT("종료");
	
	String user;
	
	Enum_exam(String user) {
		this.user = user;
	}
	
	public String getUser() {
		return user;
	}
}
