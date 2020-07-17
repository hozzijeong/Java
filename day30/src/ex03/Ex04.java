package ex03;

// 추상클래스는 new를 할 수 없다.

/*
 * # 접근제어자의 넓은 표현범위 순으로 나열하시오.
 * 
 * public > protected > default > private
 * . public : 전체 프로젝트 내에서
 * . protected : 1) 같은 패키지		2) (다른 패키지이지만)상속관계
 * . default(아무것도 안 붙이는 것) : 같은 패키지
 * . private : 본인 클래스 안에서만
 */

// static
// final

abstract class Ex {
	
	void print() {}			// 일반메서드
	abstract void say();				// 추상메서드의 특징:구현부X, 바디{}가 X
}

class Test extends Ex{

	@Override
	void say() {
		
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		// Ex e = new Ex();
	}
}
