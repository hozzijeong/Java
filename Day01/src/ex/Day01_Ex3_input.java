package ex;

import java.util.Scanner;

/*
 * input 즉, 입력함수 받기
 * 1) pakage와 class 사이 즉, 이 부분에 
 * import java.util.Scanner를 입력
 * 2) main함수 안에
 * Scanner 변수명(a) = new Scanner(System.in);을 입력
 * 3) main함수 안에서 사용은 
 * 자료형 변수명 = a.nextInt() => 자료형이 정수인 경우
 * 처럼 사용할 수 있다.
 * 간단하게 작성하는 법은 
 * main 함수 안에 Scanner + ctrl + spacebar를 하면 1)번은 자동으로 완선된다. 
 */
public class Day01_Ex3_input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이 입력:");
		int age = scan.nextInt();
		System.out.println("오 당신의 나이는 "+age+"살 이군요!");
	}
}
