package ex01;

import java.util.Random;
import java.util.Scanner;

public class boadr01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("���� 3���� �Է��ϼ���");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}
		
		if(max < num3) {
			max = num3;
		}
		
		System.out.println("�ִ밪 : "+ max);
		
		
	}
}
