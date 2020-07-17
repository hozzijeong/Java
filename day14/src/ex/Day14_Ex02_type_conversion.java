package ex;

public class Day14_Ex02_type_conversion {
	public static void main(String[] args) {
		// 문자 -> 숫자	
		char ch = 'a';
		int anum = (int)ch;
		System.out.println(anum); //아스키 코드 값으로 나타내줌.
		
		ch = (char)(anum+1);
		System.out.println(ch);
	
	
		//문자'열' -> 숫자	
		String strNum ="10";
		int num  = Integer.parseInt(strNum);
		System.out.println((num+1));
	
		// 숫자 -> 문자열
		//1) 방법1
		strNum = num +""; // 어떻게....?
		System.out.println(strNum+1);
	
		//2) 방법2
		strNum = String.valueOf(num);
		System.out.println(strNum+1);
		
		
		System.out.println("==========");
		
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 30세
		
		/*
		 * 1. 앞에 89년도를 슬라이싱 한다. (문자열)
		 * 2. 슬라이싱 한 값을 정수로 변경한다.
		 * 3. 2020 에서 1900+89를 해서 값을 뺀다.
		 * 4. 나이를 출력한다.
		 */
		
		String age = jumin.substring(0,2); // 문자열 나이
		
		int Age = Integer.parseInt(age); // 정수형 나이
		
		
		char gender = jumin.charAt(7); // 문자 성별
		int g = (int)gender; // 정수 성별
		
		int real_age = 0; // 정수 진짜 나이
		
		if(g == 49 || g ==50) {
			real_age = (2020 - (1900+Age));
		}else if(g == 51 || g ==52) {
			real_age = (2020 - (2000+Age));
		}
		
		age = real_age+"";
		System.out.println(age+"세");
		
		
		System.out.println("========================");
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		if(g == 50 || g == 52) {
			System.out.println("여성");
		}else if(g == 49 || g ==51) {
			System.out.println("남성");
		}
	}
}
