package ex;

/*
 * [1] ���� : �� �Ѱ� ����
 * [2] �迭 : (���� ������)�� ������ ����
 * [3] Ŭ���� : (���� ������)�� ��� ����
 */

class Member{
	String name;
	int score;
	int hakbun;
}

public class Day22_Ex03_Class03 {
	public static void main(String[] args) {
		
		// �л�����
		String[] names = {"a", "b", "c"};
		int[] hakbuns = {1001, 1002, 1003};
		int[] scores = {11, 32, 54};
		
		
		// ����
		Member hgd = new Member();
		System.out.println(hgd);		// ex.Member@7852e922
		
		hgd.hakbun = 10001;
		hgd.score = 100;
		hgd.name = "ȫ�浿";
		
		
// 		Member[] arr = new Member[4];
	}
}
