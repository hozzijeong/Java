package ex;
/*
 * # Up & Down ����[2�ܰ�]
 * 222204~2211
 * 1. ������ ���߸� ������ ����ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */

import java.util.Random;
import java.util.Scanner;

public class Day02_Ex09_up_down_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int cor = ran.nextInt(100)+1;
		int score = 100;
		int answer = -1;
		int cnt = 0;
		while (answer != cor) {
			System.out.println("���� �Է�:");
			answer = scan.nextInt();
			
			if (answer >cor) {
				System.out.println("Down!");
				score = score -5;
			}else if(answer<cor) {
				System.out.println("UP!");
				score = score -5;
			}else {
				System.out.println("����!");
			}
			if (score == 0) {
				System.out.println("0���Դϴ�");
				answer = cor;
			}
			cnt = cnt+1;
		}
		System.out.printf("���� ����.\n ����:%d\n �� �õ� Ƚ��:%d\n",score,cnt);
	}
}
