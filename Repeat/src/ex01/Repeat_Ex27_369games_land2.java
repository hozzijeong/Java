package ex01;
/*
 * # 369����[2�ܰ�]
 * 1. 1~50���� �ݺ��� �Ѵ�.
 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
 */


public class Repeat_Ex27_369games_land2 {
	public static void main(String[] args) {
		int i = 1;
		
	
		while(i<=50) {
			int cnt = 0;
			int num1 = i/10;
			int num2 = i%10;
			if(num1 == 3) {
				cnt+=1;
			}
			if(num2 == 3 || num2 ==6 || num2 ==9) {
				cnt+=1;
			}
			
			if(cnt ==2) {
				System.out.print("¦¦ ");
			}else if(cnt ==1) {
				System.out.print("¦ ");
			}else {
				System.out.print(i+" ");
			}
			i+=1;
		}
	}
}
