package ex;
/*
 * # 369����[2�ܰ�]
 * 1258~1316(18...��Ǯ��...)
 * 1. 1~50���� �ݺ��� �Ѵ�.
 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
 */


public class Day03_Ex05_369game_land2 {
	public static void main(String[] args) {
		int n = 1;
		while (n<=50) {
			int x = n/10; // n�� 10���� ���������� ��
			int y = n%10; // n�� 10���� ���������� ������
			int cnt = 0;
			
			if (x != 0 && x%3 ==0) { // n>=10 �̸鼭 %3 �������� �������� 0, �� 30�� �ڸ���
				cnt +=1;
			}
			if (y != 0 && y%3 ==0) {// 10�� ����� ������ 1���ڸ��� �� 3�� ����� ���.
				cnt+=1;
			}
			if (cnt ==2) {
				System.out.println("¦¦");
			}else if(cnt == 1) {
				System.out.println("¦");
			}else {
				System.out.println(n);
			}
			n +=1;
		}
	}
}
