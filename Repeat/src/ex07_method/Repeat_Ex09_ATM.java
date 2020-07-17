package ex07_method;

import java.util.Scanner;

class Bank{
	Scanner scan = new Scanner(System.in);
	
	String name = "";
	
	String[] arAcc = {"1111","2222","3333","",""};
	String[] arPw = {"1234","2345","3456","",""};
	int[] arMoney = {87000,340000,-110010,0,0};
	
	int count = 3;
	
	int log = 2;
	
	void showmember() {
		for(int i=0; i<count; i++) {
			System.out.println(arAcc[i] +":"+arPw[i]+":"+arMoney[i]+"��");
		}
	}
	
	void showmenu() {
		System.out.println("#�α��� ����:");
		if(log ==-1) {
			System.out.println("�α׾ƿ�");
		}else {
			System.out.println(arAcc[log]+"�� �α�����");
			
		}
		
		System.out.println("==="+name+"===");
		System.out.println("1.����");
		System.out.println("2.Ż��");
		System.out.println("3.�α���");
		System.out.println("4.�α� �ƿ�");
		System.out.println("5.�Ա�");
		System.out.println("6.��ü");
	}
	
	int checkAcc(String myAcc) {
		int check = 1;
		for(int i=0; i<count; i++) {
			if(arAcc[i].equals(myAcc)) {
				check = -1;
			}
		}
		return check;
	}
	int checkPw(int accCheck) {
		System.out.println("��й�ȣ �Է�:");
		String myPw = scan.next();
		
		int pwcheck = -1;
		if(arPw[accCheck].equals(myPw)) {
			pwcheck = 1;
		}
		return pwcheck;
	}
	int checkAcc() {
		System.out.println("Ż���� ���¹�ȣ �Է�:");
		String myAcc = scan.next();
		
		int accCheck = -1;
		for(int i=0; i<count; i++) {
			if(arAcc[i].equals(myAcc)) {
				accCheck = i;
			}
		}
		return accCheck;
	}
	
	void delmember() {
		if(count ==0) {
			System.out.println("ȸ������ x");
			return;
		}
		
		int accCheck = checkAcc();
		
		if(accCheck != -1) {
			int pwCheck = checkPw(accCheck);
			if(pwCheck ==-1) {
				System.out.println("��й�ȣ �߸� �Է�");
			}else {
				for(int i=accCheck; i<count-1; i++) {
					arAcc[i] = arAcc[i+1];
					arPw[i] = arPw[i+1];
					arMoney[i] = arMoney[i+1];
				}
				count -=1;
				System.out.println("Ż�� �Ϸ�");
			}
		}else {
			System.out.println("���� ����");
		}
	}
	
	void joinmember() {
		if(count ==5) {
			System.out.println("���̻� ���� �Ұ�");
			return;
		}
		
		System.out.println("���� �Է�:");
		String myAcc = scan.next();
		int check  = checkAcc(myAcc);
		if(check == -1) {
			System.out.println("�ߺ�");
		}else {
			System.out.println("����Է�");
			String myPw = scan.next();
			
			arAcc[count]= myAcc;
			arPw[count] = myPw;
			arMoney[count] = 1000;
			
			count +=1;
			System.out.println("��");
			
		}
	}
	
	void login() {
		if(log != -1) {
			System.out.println("�α׾ƿ� �� ����");
			return;
			
		}
		
		System.out.println("���� �Է�:");
		String id = scan.next();
		
		System.out.println("��� �Է�:");
		String pw = scan.next();
		
		for(int i=0; i<count; i++) {
			if(id.equals(arAcc[i])&& pw.equals(arPw[i])) {
				log = i;
			}
		}
		
		if(log == -1) {
			System.out.println("���̵� / ��� Ȯ��");
		}else {
			System.out.println("�α��� ����");
		}
		
	}
	void logout() {
		if(log ==-1) {
			System.out.println("�α���");
		}else {
			log = -1;
			System.out.println("�α׾ƿ� �Ϸ�");
		}
	}
	
	void income() {
		System.out.println("�Ա� �ݾ� �Է�:");
		int money = scan.nextInt();
		arMoney[log] += money;
		System.out.println("�Ա� �Ϸ�");

	}
	void trans() {
		System.out.println("���� �Է�:");
		String transAcc = scan.next();
		
		int check = -1;
		for(int i=0; i<count; i++) {
			if(arAcc[i] .equals(transAcc)) {
				check =i;
			}
		}
		if(check ==-1) {
			System.out.println("���¹�ȣ Ȯ��");
			return;
		}else {
			System.out.println("��ü �ݾ� �Է�");
			int transmoney = scan.nextInt();
			
			if(arMoney[log]>=transmoney) {
				arMoney[log] -= transmoney;
				arMoney[check] += transmoney;
				System.out.println("��ü �Ϸ�");
			}else {
				System.out.println("�ܰ� ����");
			}
		}
	}
	
	void run() {
		while (true) {
			showmember();
			showmenu();
			
			System.out.println("�޴� ����");
			int choice = scan.nextInt();
			
			if(choice ==1) {joinmember();}
			else if(choice ==2) {delmember();}
			else if(choice ==3) {login();}
			else if(choice ==4) {logout();}
			else if(choice ==5) {income();}
			else if(choice ==6) {trans();}
		}
	}
	
	
}

public class Repeat_Ex09_ATM {
	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.name = "����";
		
		b.run();
	}
}
