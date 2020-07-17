package ex;
/*
 * # 로그인[1단계]
 * 2341~2346
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */


import java.util.Scanner;

public class Day01_Ex07_login {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		System.out.println("ID");
		int meId = scan.nextInt();
		System.out.println("PW:");
		int mePw = scan.nextInt();
		
		if (dbId == meId && dbPw == mePw ) {
			System.out.println("로그인 성공");
		}
		
		if (dbId == meId && dbPw != mePw ) {
			System.out.println("잘못된 비밀번호");
		}
		
		if (dbId != meId) {
			System.out.println("아이디가 존재하지 않습니다");
		}
		
	}
}
