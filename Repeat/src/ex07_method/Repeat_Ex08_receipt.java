package ex07_method;

import java.util.Scanner;

class Buger{
	Scanner scan = new Scanner(System.in);
	
	String name = "";
	int[] arPrice = {2500,3800,1500,1000};
	String[] arMenu = {"ġ�����","�Ұ�� ����","����Ƣ��","�ݶ�"};
	int[] arCount = new int [4];
	int total = 0;
	
	void showmenu() {
		System.out.println("==="+name+"===");
	for(int i=0; i<arMenu.length;i++) {
		System.out.println("["+(i+1)+"]."+arMenu[i]+"\t:"+arPrice[i]+"��");
		
	}
	System.out.println("[5].����");
	}
	
	void select1() {arCount[0] +=1;}
	void select2() {arCount[1] +=1;}
	void select3() {arCount[2] +=1;}
	void select4() {arCount[3] +=1;}
	
	
	void getreceipt() {
		System.out.println("===������===");
		for(int i=0; i<arMenu.length;i++) {
			System.out.println("["+(i+1)+"]."+arMenu[i]+"\t:"+arCount[i]+"��");
			total += arPrice[i] *arCount[i];
		}
		System.out.println("�� �ݾ�:"+total+"��");
	}
	
	void run() {
		while(true) {
			showmenu();
			
			System.out.println("�޴� ����");
			int choice = scan.nextInt();
			
			if(choice ==1) {select1();}
			else if(choice ==2) {select2();}
			else if(choice ==3) {select3();}
			else if(choice ==4) {select4();}
			else if(choice ==5) {
				getreceipt();
				break;
			}
		}
	}
}
public class Repeat_Ex08_receipt {
	public static void main(String[] args) {
		Buger bg = new Buger();
		bg.name = "����";
		bg.run();
	}
}
