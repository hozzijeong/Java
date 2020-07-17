package ex04_String;

public class Repeat_Ex_string03_examine_id {
	public static void main(String[] args) {
		String jumin = "880101-2012932";
		
		//문제 1) 나이 출력:
		/*
		 * 나이 = 주민번호 앞 자리 2개를 빼서
		 * 그것을 int로 형변환을 시킨다음에
		 * 2020 -1900 + x 를 해버리면 됨.
		 * 
		 */
		
		String stryear = jumin.substring(0,2);
		// 앞에 2자리 88 만을 year에 '문자열'로 저장;
		
		int intyear = Integer.parseInt(stryear);
		// 문자열 year 를 정수형 year로 변경
		
		int age = 2020 - (1900+intyear);
		
		System.out.println( "나이: "+age);
		
		
		
		System.out.println("=====================");
		//문제 2) 성별 출력:
		/*
		 * 성별은  주민번호 앞자리로 알아 볼 수 있음. 
		 * 주민번호 앞자리를 딱 골라서
		 * 그것이 1이면 남자 2이면 여자로 하면 됨.
		 */
		
		char chGender = jumin.charAt(7);
		if(chGender == '1') {
			System.out.println("성별: 남성");
		}else if(chGender == '2') {
			System.out.println("성별: 여성");
		}
		
	}
}
