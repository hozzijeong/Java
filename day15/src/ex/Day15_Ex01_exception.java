package ex;

import java.util.Scanner;

public class Day15_Ex01_exception {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("[������] ���� 1 �Է�:");
		int num1 = scan.nextInt();
		
		System.out.println("[������] ���� 2 �Է�:");
		int num2 = scan.nextInt();
		
		if(num2 ==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			System.out.println((num1 / num2));
		}
		
		
		
		System.out.println("==========Exception==========");
		
		try {
			System.out.println(num1/num2);
		}catch(Exception e)	{
			System.out.println("0���� ���� �� ����.");
			
		}finally {
			System.out.println("���ܹ߻��� ������� ������ ������ ����");
		}
		
	}
}
