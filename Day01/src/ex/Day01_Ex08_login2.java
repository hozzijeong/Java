package ex;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 2348~ 2352(4분)
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class Day01_Ex08_login2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		System.out.println("===========회원가입===========");		
		System.out.println("ID:");
		int myId = scan.nextInt();
		System.out.println("PW:");
		int myPw = scan.nextInt();
		dbId = myId;
		dbPw = myPw;
		System.out.println("===========로그인===========");
		System.out.println("ID:");
		int logId = scan.nextInt();
		System.out.println("PW");
		int logPw = scan.nextInt();
		if(dbId == logId && dbPw == logPw) {
			System.out.println("로그인 성공");
		}
		if(dbId != logId || dbPw != logPw) {
			System.out.println("로그인 실패");
		}
	}
}
