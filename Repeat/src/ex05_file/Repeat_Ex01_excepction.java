package ex05_file;

public class Repeat_Ex01_excepction {
	public static void main(String[] args) {
		int num = 10;
		try {
			System.out.println(num/0);
			// try안에 있는 식에 오류가 날 경우 catch로 넘어감
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			// try에서 오류가 났을 경우 catch를 실행해줌. 
		}
		
		System.out.println("프로그램 종료");
	}
}
