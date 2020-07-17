package ex01;
/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

import java.util.Random;
import java.util.Scanner;

public class Repeat_Ex21_guess_sign {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num1 = ran.nextInt(10)+1;
		int num2 = ran.nextInt(10)+1;
		int sign = ran.nextInt(4)+1;
		
		if(sign ==1) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1+num2);
		}else if(sign ==2) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1-num2);
			
		}else if(sign ==3) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1*num2);
			
		}else if (sign ==4) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1/num2);	
		}
		System.out.println("1)+ 2)- 3)x 4) /");
		int answer = scan.nextInt();
		if(answer == sign) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		
	}
}
