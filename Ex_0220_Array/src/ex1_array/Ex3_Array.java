package ex1_array;

import java.util.Random;
import java.util.Scanner;

public class Ex3_Array {
	public static void main(String[] args) {
		//�迭 arr�� ����ִ� ��� ���� ���� ����ϼ���
		//��� : 150
		
		int[] arr = {10,20,30,40,50};
		
		int total = 0; //������ ���� ����
		for(int i = 0; i < arr.length; i++) {
			total += arr[i]; //������
		}
		System.out.println("��� : " + total);
		
		//���α׷��� ����Ǹ� �迭�� ���̸� ������ �� ������ �����.
		//������� Ű���忡�� 5�� �Է¹�����
		
		//���
		
		//�迭�� ���̴� ������..? : 5
		//ABCDE
		
		//�迭�� ���̴� ������..? : 3
		//ABC
		
		//���� ���� ����� ������ִ� �ڵ� �ۼ��ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���̴� ������? : ");
		int num = sc.nextInt();
		char[] ch = new char[num];
		
		//char c = 'A';
		
		for(int i = 0; i < ch.length; i++) {
			
			ch[i] = (char)(65+i);
			
			System.out.print(ch[i]);
		}
		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�.
		//�� 3450,2100,60�� ���� 1�� �ڸ��� �ݵ�� 0�� �ǵ��� �Ѵ�.
		
		//�߻��� ���� money�� �������� �ٲٸ� ���� ������ �� ���� �ʿ����� �Ǵ��ϴ� �ڵ� �ۼ��ϱ�
		
		//������ ���� ���� ������ ����ϵ��� �Ѵ�.
		
		
		
		int money = new Random().nextInt(500)+1;
		money *= 10;//�����ڸ��� ������
		
		int [] coin = {500,100,50,10};
		System.out.println("�ݾ� : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			
			int res = money/coin[i];
			
			System.out.println(coin[i]+"�� : " + res);
			
			money %= coin[i];
			
		}
		
		
		//1 ~ 45�� ������ �߻����� �ζǹ�ȣ�� �����ϴ� ���α׷� �����.
		//6���� ���ڰ� ��ġ�� �ʰ� ���� �մϴ�.
		
		int[] lotto = new int[6];
		
		w: for (int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45)+1;
//			�ߺ����� ���ϴ� �ݺ���
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue w;
				}
			}
			System.out.print(lotto[i] + " ");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
