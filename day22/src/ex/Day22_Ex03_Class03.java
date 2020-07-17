package ex;

/*
 * [1] 변수 : 값 한개 저장
 * [2] 배열 : (같은 종류의)값 여러개 저장
 * [3] 클래스 : (여러 종류의)값 어러개 저장
 */

class Member{
	String name;
	int score;
	int hakbun;
}

public class Day22_Ex03_Class03 {
	public static void main(String[] args) {
		
		// 학생관리
		String[] names = {"a", "b", "c"};
		int[] hakbuns = {1001, 1002, 1003};
		int[] scores = {11, 32, 54};
		
		
		// 사용법
		Member hgd = new Member();
		System.out.println(hgd);		// ex.Member@7852e922
		
		hgd.hakbun = 10001;
		hgd.score = 100;
		hgd.name = "홍길동";
		
		
// 		Member[] arr = new Member[4];
	}
}
