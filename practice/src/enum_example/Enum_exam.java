package enum_example;

public enum Enum_exam {
	START("���ӽ���"),
	CONTINUE("�����"),
	EXIT("����");
	
	String user;
	
	Enum_exam(String user) {
		this.user = user;
	}
	
	public String getUser() {
		return user;
	}
}
