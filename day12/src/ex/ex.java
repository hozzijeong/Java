package ex;
/*
 * ==========2인용 빙고==========
 *  1. 1인용 빙고와 같은 방식으로 진행
 * 	2. 1턴씩 돌아가면서 빙고를 채택하는 형식
 * 	3. p1이 선택한 숫자가 p2에도 존재한다면, p2의 값도 같이 체크! 
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
