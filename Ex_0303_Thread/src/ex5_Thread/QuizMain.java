package ex5_Thread;

public class QuizMain {
	public static void main(String[] args) {
//		QuizThread Ŭ������ ����� �����带 ��ӹ޴´�.
//		startGame()�޼��带 ����� �� �ȿ��� 1~100 ������
//		���� 2���� ���ϴ� ������ ����
		
//		Ű���忡�� ���� �Է��Ͽ� 5������ ����ó�� �� ������ ������ �ݺ��Ѵ�.
//		������ ������ �� �Ŀ� ��� ������ �����µ� �� �ʰ� �ɷȴ����� ȭ�鿡 ����ϸ�
//		���α׷� ����
		
//		QuizMain Ŭ����������
//		QuizThread qt = new QuizThread();
//		qt.start(); //������ ����
//		qt.startGame(); //����Ǯ�� �Լ�
		
//		�� ���� �ܿ��� �ٸ� �ڵ�� �߰� X
		QuizThread qt = new QuizThread();
		// qt.start();
		qt.startGame();
	}
}
