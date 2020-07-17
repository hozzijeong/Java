package ex;
/*
 * # 메서드의 구조[3단계] : 리턴값이 있는 메서드
 * int getNum(매개변수[parameter]){
 * 		실행할 내용;
 * 		return 10;
 * } 
 *
 * # 메서드의 사용(호출)
 * int num = getNum(인자,인수[argument]);
 */
class Ex30{
	int num;
	
	void setNum(int num) {
		this.num = num;
	}
	
	
	int getNum() {
		return num;
	}
}

public class Day23_Ex08_method03 {
	public static void main(String[] args) {
		Ex30 e = new Ex30();
		
		e.setNum(10);
		
		int result = e.getNum();
		System.out.println(e.getNum());
	}
}
