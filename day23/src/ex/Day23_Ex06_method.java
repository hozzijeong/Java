package ex;

import java.util.Scanner;

/*
 * [1]Ŭ������ �������
 * 1. ����
 * 2. �޼���
 * 
 * [2]�޼����� �ʿ伺
 * �ݺ��Ǵ� �ڵ带 �޼��带 ���� ��Ȱ�� �ϱ� ����
 * 
 * [3]�޼����� ����[1�ܰ�]
 * void print(){
 * 		������ ����;
 * } 
 * 1) void			: Ű����
 * 2) print()		: �޼����
 * 3) {}			: �޼��� ����
 * 4) ������ ������ �ִ�.(�ڱ� �ּҸ� �����ϰ� �ִ� ���� : this)
 * 
 * [4]�޼����� ���(ȣ��)
 * print();			: �޼����();
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
		System.out.println("1~5������ ��"+total);
	}
	void test2() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+".���� �Է�:");
			int num = scan.nextInt();
			if(num >= max) {
				max = num;
			}
		}
		System.out.println("�ִ밪:"+max);
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
