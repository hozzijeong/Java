package ex07_method;

import java.util.Scanner;

/*
 * # �л����� ���� ���α׷�[3�ܰ�] : Ŭ���� + �޼���
 * 1. �й��� �Է��ϸ�, �ش� �л��� ������ ��µȴ�.
 * 2. ��, ���� �й� �Է¿� ���� ���ܻ�Ȳ�� �ݵ�� ó���ؾ� �Ѵ�.
 * 3. 1��� �õ� �л��� ������ Ȯ���� �� �ִ�.
 */
class Ex03{
	String name = "";
	
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
	
	void choice1() {
		for(int i=0; i<arHakbun.length;i++) {
			System.out.println("["+(i+1)+"] "+arHakbun[i] + ":" + arScore[i]);
		}
	}
	void choice2() {
		int max = 0;
		for(int i=0; i<arScore.length;i++) {
			if(arScore[i] > max) {
				max = arScore[i] ;
			}
		}
		System.out.println(max);
	}
	void choice3() {
		int min = 101;
		for(int i=0; i<arScore.length;i++) {
			if(arScore[i] < min) {
				min = arScore[i] ;
			}
		}
		System.out.println(min);
	}
	void choice4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է�");
		int idx = scan.nextInt();
		int check = -1;
		for(int i=0; i<arHakbun.length;i++) {
			if(idx == arHakbun[i]) {
				check = i;
			}
		}
		if(check ==-1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(idx+"��("+arScore[check]+")��");
		}
		
	}
}

public class Repeat_Ex03_manageStudent03 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		Ex03 mega = new Ex03();
		
		mega.name = "�ް�IT ����б�";
		while(true) {
			// �޴� ���
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.(�й��� �Է¹޾�)����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			
			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { mega.choice1(); }
			else if(choice == 2) { mega.choice2(); }
			else if(choice == 3) { mega.choice3(); }
			else if(choice == 4) { mega.choice4(); }
			else if(choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}


	}
}
