package ex08_class_Array;

import java.util.Scanner;

class Subject{
	String name;
	int score;
}
class Student{
	Subject[] subjects;
	String name;
}
// # �л� �߰� ���� ��Ʈ�ѷ�
//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
//   �̸��� : ����2�� ���� 20 ���� 30 
//   �̿��� : ����1�� ���� 100


public class Repeat_Ex01_class_Array01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] list = new Student[3];
		
		int count = 0; // ���� ��ϵ� �л� ��.
		
		
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.print(list[i].name + ":");
				if(list[i].subjects != null) {
					for(int j=0; j<list[i].subjects.length;i++) {
						System.out.print(list[i].subjects[j].name + "=" + list[i].subjects[j].score);
					}
				}
				System.out.println();
			}
			System.out.println("[1] �л� �߰�");
			System.out.println("[2] ���� �߰�");
			System.out.println("[3] ���� �߰�");
		
			int choice = scan.nextInt();
			
			if(choice ==1) {
				if(count>list.length) {
					System.out.println("[�޼���] ���̻� �߰��� �� �����ϴ�.");
					continue;
				}else {
					System.out.print("[�л��߰�] �̸� �Է�:");
					String name = scan.next();
					
					list[count] = new Student();
					list[count].name = name;
					
					count +=1;
					
				}
			}else if(choice ==2) {
				if(count ==0) {
					System.out.println("[�޼���] ��ϵ� �л��� �����ϴ�.");
					continue;
				}else if(count >0) {
					for(int i=0; i<count; i++) {
						System.out.println("["+(i+1)+"]"+list[i].name);
					}
					System.out.println("[�����߰�] �л� ����");
					int stu_sel = scan.nextInt();
					stu_sel -=1;
					
					System.out.println("[�����߰�] ����� �ۼ�");
					String sub_name = scan.next();
					if(list[stu_sel].subjects == null) {
						list[stu_sel].subjects = new Subject[1];
						
						list[stu_sel].subjects[0] = new Subject();
						list[stu_sel].subjects[0].name = sub_name;
					}else {
						
						int size = list[stu_sel].subjects.length;
						
						
						Subject[] temp = list[stu_sel].subjects;
						
						list[stu_sel].subjects = new Subject[size+1];
						
						for(int i=0; i<size;i++) {
							list[stu_sel].subjects[i] = temp[i];
						}
						list[stu_sel].subjects[size] = new Subject();
						list[stu_sel].subjects[size].name = sub_name;
						
						temp = null;
					}
				}
			}else if(choice ==3) {
				for(int i=0; i<count ;i++) {
					System.out.println("["+(i+1)+"]" +list[i].name);
					
				}
				System.out.println("[���� �߰�] �л� ����" );
				int sel = scan.nextInt();
				sel -=1;
				
				if(list[sel].subjects != null) {
					for(int i=0; i<list[sel].subjects.length;i++) {
						System.out.println("["+(i+1)+"]"+list[sel].subjects[i].name);
					}
				}
				System.out.println("[���� �߰�] ���� ����");
				int num = scan.nextInt();
				num -=1;
				
				System.out.println("[�����߰�] ���� �Է�:");
				int score = scan.nextInt();
				
				
				list[sel].subjects[num].score = score;
			
			
			}
		
		}
		
	
	}
}
