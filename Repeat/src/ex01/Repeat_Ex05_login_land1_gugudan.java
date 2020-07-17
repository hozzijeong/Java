package ex01;
/*
 * # 로그인[1단계]
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */


/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */

/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


import java.util.Scanner;

public class Repeat_Ex05_login_land1_gugudan {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		System.out.println("ID:");
		int myId = scan.nextInt();
		System.out.println("Pw:");
		int myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("로그인 성공");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("로그인 실패");
		}
		
		
		System.out.println("회원가입 ID:");
		dbId = scan.nextInt();
		System.out.println("회원가입 Pw:");
		dbPw = scan.nextInt();
		
		System.out.println("ID:");
		myId = scan.nextInt();
		System.out.println("Pw:");
		myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("로그인 성공");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("로그인 실패");
		}
		
		System.out.println("숫자 2개 입력:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1+"x"+num2+"=");
		int answer = scan.nextInt();
		
		if(answer == num1*num2) {
			System.out.println("정답");
		}
		if(answer != num1*num2) {
			System.out.println("땡");
		}
		
		
	}
}
