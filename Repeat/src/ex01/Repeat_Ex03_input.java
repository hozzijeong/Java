package ex01;

import java.util.Scanner;

public class Repeat_Ex03_input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.println("숫자 입력:");	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("두 수의 합:"+(num1+num2));
		
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자 입력:");
		int num3 = scan.nextInt();
		System.out.println(num3%2==1);
		
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적 입력:");
		int score = scan.nextInt();
		System.out.println(score>=60 && score <=100);

	}
}
