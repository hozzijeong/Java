package ex03_array_hard;

import java.util.Scanner;

public class Repeat_Ex_array_hard16_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String myname = "ȫ�浿";
		
		System.out.print("�̸� �Է�:");
		String name = scan.next();
		

		if(name != myname) {
			System.out.println("!= ������: ����ġ");
		}else {
			System.out.println("!=������ :��ġ");
		}
		if(!name.equals(myname)) {
			System.out.println("!equals()�޼���: ����ġ");
		}else {
			System.out.println("!equals()�޼���: ��ġ");
		}
	
	}
}
