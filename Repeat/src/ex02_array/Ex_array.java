package ex02_array;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[��ȭ]
 * 1. ������ ������ �����ϰ� 5ȸ �����Ѵ�.
 * 2. ������ ���߸� answer �迭�� 1�� �����ϰ�, Ʋ���� -1�� �����Ѵ�.
 * 3. answer �迭�� ���� 1�̸� �ش� ��ġ(index)���� yes �迭�� �����Ѵ�.
 * 4. answer �迭�� ���� -1�̸� �ش� ��ġ(index)���� no �迭�� �����Ѵ�.
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
public class Ex_array {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] myAnswer = new int[5];
		int[] answer = new int[5];
		int[] yes = null;
		int[] no = null;
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i=0; i<5; i++) {
			int ridx1 = ran.nextInt(8)+2;
			int ridx2 = ran.nextInt(9)+1;
			System.out.printf("%d x %d = ",ridx1,ridx2);
			myAnswer[i] = scan.nextInt();
			if(myAnswer[i] == ridx1*ridx2) {
				answer[i] = 1;
				cnt1 +=1;
			}else {
				answer[i] = -1;
				cnt2 +=1;
			}
						
		}
		yes = new int[cnt1];
		no = new int[cnt2];
		
		int k=0;
		int j =0;
		System.out.print("answer = { ") ;
		for(int i=0; i<5; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println("}");
		
		for(int i=0; i<cnt1; i++	) {
		}
		
	}

}
