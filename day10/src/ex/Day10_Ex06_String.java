package ex;

import java.util.Scanner;

/*
 * # ���ڿ� [�Է¹ޱ�]
 * . ���ڳ� ����ܾ� �Է� �� Ŀ���� �ű� �ʿ䰡 ����.
 * . ��, �ѱ� �Է� �� �ݵ�� Ŀ���� ������ �ű� �� �ۼ��ؾ� �Ѵ�.
 */
/*
 * # ���ڿ� [��]
 * . ���ڿ� �񱳴� equals() �޼��带 ���� Ȯ���� �� �ִ�.
 */




public class Day10_Ex06_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "ȫ�浿";
		
		System.out.print("�̸� �Է�:");
		String myname = scan.next();
		
		if(name == myname) {
			System.out.println("==������ : ��ġ");
		}else {
			System.out.println("== ������: ����ġ");
		}
		
		System.out.println(!true);
		
		if(!name.equals(myname)) {
			System.out.println("equals()�޼���: ��ġ");
		}else {
			System.out.println("equals()�޼���: ����ġ");
		}
	}

}
