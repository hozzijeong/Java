package day24;

import java.util.Scanner;

class Subject1{
	String name;
	int score;
}
class Student{
	Subject1[] subjects;
	String name;
}
public class Day24_Ex10_class_array_ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// # �л� �߰� ���� ��Ʈ�ѷ�
		//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
		//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
		//   �̸��� : ����2�� ���� 20 ���� 30 
		//   �̿��� : ����1�� ���� 100
		
		Student[] list = new Student[3];
		int count = 0; //�л���
		
		while(true) {
			System.out.println("[1]�л� �߰��ϱ�"); // �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�"); // �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�"); // �̸��� ���� ������ �Է¹޾� ���		
			
			int choice = scan.nextInt();
			
			if(choice==1) {
				if(count>3) {
					System.out.println("���̻� �л��� �߰��� �� �����ϴ�.");
					continue;
				}
				if(count >0) {
					System.out.print("[�л� �߰�]�̸� �Է�");	
					list[count].name = scan.next();
					count +=1;
					
				}
			}
			else if(choice ==2) {
				System.out.print("[���� �߰�] �л� �̸� �Է�:");
				String name = scan.next();
				int check = -1;
				for(int i=0; i<list.length;i++) {
					if(name.equals(list[i].name)) {
						check = i;
					}
				}
				if(check ==-1) {
					System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
					continue;
				}
				System.out.println("[�����߰�] ���� �Է�:");
				list[check].subjects[check].name = scan.next();
				
			}
			else if(choice ==3) {}
			
		}


	}
}
