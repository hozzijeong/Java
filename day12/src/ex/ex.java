package ex;
/*
 * ==========2�ο� ����==========
 *  1. 1�ο� ����� ���� ������� ����
 * 	2. 1�Ͼ� ���ư��鼭 ���� ä���ϴ� ����
 * 	3. p1�� ������ ���ڰ� p2���� �����Ѵٸ�, p2�� ���� ���� üũ! 
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int Max = 5;
		
		int [][] bingo = new int[Max][Max];
		int [][] mark = new int[Max][Max];
		
		int [] temp = new int[Max*Max];
		
		for(int i=0; i<temp.length;i++) {
			int r = ran.nextInt(50)+1;
			temp[i] = r;
			int j=0;
			int check = 1;
			while(j<i) {
				if(temp[j] == temp[i]) {
					check = -1;
				}
				j+=1;
			}
			if(check ==-1) {
				i-=1;
			}
		}
		int k = 0;
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo.length;j++) {
				bingo[i][j] = temp[k];
				k+=1;
			}
		}
		
		
		

	}
}
