package test;

/*
 * # 메서드 오버로딩(overloading) vs 메서드 오버라이딩
 * 
 * # 메서드 오버로딩(overloading)
 * . 메서드 이름 절약 기술
 * . 메서드의 이름은 같은것으로 하되,
 * . 조건1) 매개변수(parameter)의 개수를 달리 한다.
 * . 조건2) 매개변수(parameter)의 종류를 달리 한다.
 * . 조건3) 매개변수(parameter)의 순서를 달리 한다.
 * . 대표적으로 System.out.pritln() 메서드가 이에 해당한다.
 */
class ScoreMng{
	// 사탐과목 2, 3, 4개만 선택적 응시
	void total(int s1, String s2) {}
	void total(String s1, int s2) {}
	void total(int s1, int s2) {}
	// void total(int s2, int s1) {}		// 변수명과는 무관함
	void total(int s1, int s2, int s3) {}
	void total(int s1, int s2, int s3, int s4) {}
}

public class Ex01 {
	public static void main(String[] args) {
		
	System.out.println();
		
	}
}
