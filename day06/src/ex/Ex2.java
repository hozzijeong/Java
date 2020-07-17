package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[심화]
 * 1. 구구단 문제를 랜덤하게 5회 출제한다.
 * 2. 정답을 맞추면 answer 배열에 1을 저장하고, 틀리면 -1을 저장한다.
 * 3. answer 배열의 값이 1이면 해당 위치(index)값을 yes 배열에 저장한다.
 * 4. answer 배열의 값이 -1이면 해당 위치(index)값을 no 배열에 저장한다.
 *-----------------------------------------------------
 * 3 x 2 = 6
 * 4 x 1 = 6
 * 3 x 9 = 6
 * 5 x 2 = 6
 * 8 x 9 = 72
 * 
 * answer = {1, -1, -1, -1, 1}
 * yes	  = {0, 4}
 * no     = {1, 2, 3}
 */

//		int size = answer.length;
//		System.out.println(answer.length);

public class Ex2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] myAnswer = new int[5];
		int[] answer = new int[5];
		int[] yes = null;
		int[] no = null;
		int cnty=0;
		int cntn = 0;
		
		for(int i = 0 ; i<5; i++){
			int r1 = ran.nextInt(8)+2;
			int r2 = ran.nextInt(9)+1;
			System.out.printf("%dx%d= ",r1,r2);
			int my = scan.nextInt();
			myAnswer[i] = my;
			answer[i] = r1*r2;
			
			if(myAnswer[i] == answer[i]) {
				answer[i] = 1;
				cnty+=1;
			}else {
				answer[i] = -1;
				cntn+=1;
			}
			
		}	
		
		yes = new int[cnty];
		no = new int[cntn];
		
		int j = 0;
		int k = 0;
		for(int i=0; i<5; i++) {
			if(answer[i] == 1) {
				yes[j] = i;
				j = j + 1;
			}
			if(answer[i] == -1) {
				no[k] = i;
				k = k + 1;
			}
		}
		
		System.out.print("answer = { ");
		for(int i=0; i<5; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println(" }");
		
		System.out.print("yes = { ");
		for(int i=0; i<cnty; i++) {
			System.out.print(yes[i]+" ");
		}
		System.out.println(" }");
		
		System.out.print("no = { ");
		for(int i=0; i<cntn; i++) {
			System.out.print(no[i]+" ");
		}
		System.out.println(" }");		
	}
}
