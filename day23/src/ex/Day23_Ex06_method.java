package ex;

import java.util.Scanner;

/*
 * [1]클래스의 구성요소
 * 1. 변수
 * 2. 메서드
 * 
 * [2]메서드의 필요성
 * 반복되는 코드를 메서드를 통해 재활용 하기 위함
 * 
 * [3]메서드의 구조[1단계]
 * void print(){
 * 		실행할 내용;
 * } 
 * 1) void			: 키워드
 * 2) print()		: 메서드명
 * 3) {}			: 메서드 영역
 * 4) 숨겨진 변수가 있다.(자기 주소를 저장하고 있는 변수 : this)
 * 
 * [4]메서드의 사용(호출)
 * print();			: 메서드명();
 */

class Ex01{
	int num;
	
	void setNum() {
		System.out.println(this);
		this.num = 10;
	}
	
	void test1() {
		int total = 0;
		for(int i=1; i<6;i++) {
			total += i;
		}
		System.out.println("1~5까지의 합"+total);
	}
	void test2() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+".정수 입력:");
			int num = scan.nextInt();
			if(num >= max) {
				max = num;
			}
		}
		System.out.println("최대값:"+max);
		scan.close();
	}
}
public class Day23_Ex06_method {
	public static void main(String[] args) {
		
		Ex01 e = new Ex01();
		System.out.println(e);
		
		e.num = 20;
		
		System.out.println(e.num);
		
		e.setNum();
		System.out.println(e.num);
		
		e.test1();
		
		e.test2();
		
	}
}
