package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */
class Ex09{
	int[] front = {1,1,2,2,3,3,4,4,5,5};
	int[] back = new int[10];
	
	int cnt=0;
}

public class Day22_Ex10_remember {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex09 e = new Ex09();
		for(int i=0; i<100; i++	) {
			int r = ran.nextInt(e.front.length);
			
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		
		
		while(true) {
			for(int i=0; i<e.back.length;i++) {
				System.out.print(e.front[i] +" ");
			}
			System.out.println();
			for(int i=0; i<e.back.length;i++) {
				System.out.print(e.back[i] +" ");
			}
			System.out.println();
			System.out.println("[선택1]입력(0~9):");
			int idx1 = scan.nextInt();
			System.out.println("[선택2]입력(0~9):");
			int idx2 = scan.nextInt();
			
			if(idx1<0 || idx1 >9 || idx2 <0 || idx2 >9 || idx1 == idx2) continue;
			
			if(e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx2];
				e.cnt +=1;
			}
			if(e.cnt ==5) {
				break;
			}
			
			
		}
	}
}
