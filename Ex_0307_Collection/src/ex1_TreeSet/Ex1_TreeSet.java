package ex1_TreeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
//		TreeSet<Integer> ts = new TreeSet<Integer>(set1);
//		- set1이 가진 모든 값을 TreeSet으로 생성
		
//		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(1, 2, 3));
//		- 초기값을 갖고 TreeSet을 생성
		
//		TreeSet 요소 추가
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		
//		TreeSet 값 삭제
		ts.remove(1); //값 1 제거
		
//		TreeSet 모든 값 삭제
		ts.clear();
		
//		초기값 지정 후 TreeSet 생성
		TreeSet<Integer> ts2 = new TreeSet<Integer>(Arrays.asList(7, 4, 9, 1, 5));
		
//		TreeSet 크기 구하기
		int n = ts2.size();
		System.out.println("treeSet의 크기: " + n);
		
//		TreeSet 값 출력
		System.out.println(ts2); //정렬된 상태로 출력
		
		System.out.println("최소값 출력: " + ts2.first());
		System.out.println("최대값 출력: " + ts2.last());
		
//		조건에 충족하는 값이 없다면 null값을 반환
		System.out.println("입력값보다 큰 데이터 중 최소값 출력: " + ts2.higher(10));
		System.out.println("입력값보다 큰 데이터 중 최소값 출력: " + ts2.higher(3));
		System.out.println("입력값보다 작은 데이터 중 최대값 출력: " + ts2.lower(7));
		System.out.println("입력값보다 작은 데이터 중 최대값 출력: " + ts2.lower(0));
		
//		Example01
//		HashSet을 이용하여 5 * 5의 랜덤 빙고판 만들기
		HashSet<Integer> hs = new HashSet<Integer>();
		int [][] board = new int [5][5];
		
		while (true) {
			hs.add(new Random().nextInt(50)+1);
			
			if (hs.size() == 25) {
				break;
			}
		}
		
//		Set구조는 특정 인덱스로 접근할 수 없기에 내용을 순차적으로 얻어오기 위해서는
//		iterator라는 반복자를 이용해야 한다.
//		단점: 컬렉션을 처음부터 끝까지 돌기에 추가나 중간에 들어 있는 값을 가져오기에 쉽지 않다.
//		           대량의 데이터에서는 시간이 많이 소요가 된다.
				
//		Iterator<Integer> 이터레이터명 = 컬렉션객체.iterator();
		Iterator<Integer> it = hs.iterator();
		
//		it.hasNext();
//		- iterator 안에 다음 값이 들어 있는지 확인하여
//		    있으면 true, 없으면 false를 반환
		
//		it.next();
//		- iterator의 다음 값 반환
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
