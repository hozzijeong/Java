package test;

import javax.swing.JOptionPane;

/*
 * # ĸ��ȭ(encapsulation), ���м�(c���)
 * . �������� private
 * . �޼��忡�� public
 * . ���� ��ȿ�� �˻�
 * . ĸ��ȭ�� ������ ���� �����, get,set �޼��带 ����� �ִ� ���� �ϳ��� ������
 */

class Student{
	private int age;		// 10 ~ 15��
	
	// ����Ű : alt + shift + s, r
	public void setAge(int age) {
		if(10 <= age && age <= 15) {
			this.age = age;
		}else {
			// System.out.println("[�޼���]�߸��Է��߾��!!!");
			JOptionPane.showMessageDialog(null, "���� �Է� ����!!!");
		}
	}
	
	public int getAge() {
		return age;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Student hgd = new Student();

		// The field Student.age is not visible
		// hgd.age = 100;
		
		hgd.setAge(12);
		int age = hgd.getAge();
		System.out.println(age);
		
		
	}
}
