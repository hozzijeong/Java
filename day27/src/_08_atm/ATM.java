package _08_atm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ATM {
	Scanner scan = new Scanner(System.in);
	static UserManager userManager = new UserManager(); // ������ ����, �α��� ,ȸ�� Ż�� ���� �ϴ� Ŭ����
	static FileManager fileManager = new FileManager();
	
	Random ran = new Random();
	int log = -1; // �α��� ����
	
	void menu() {
		boolean run = true;
		while (run) {
			System.out.println("ȸ�� �� = " + userManager.userCount);
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1.�α���]\n[2.�α׾ƿ�]\n[3.ȸ������]\n[4.ȸ��Ż��]\n[5.����]\n[6.�ε�]\n[0.����]");
			int sel = scan.nextInt();
			if (sel == 1) {
				login();
			} else if (sel == 2) {
				logout();
			} else if (sel == 3) {
				join();
			} else if (sel == 4) {
				leave();
			} else if(sel ==5)	{
				fileManager.saveData();
			}else if(sel ==6) {
				fileManager.loadData();
			}else if (sel == 0) {
				run = false;
			}
		}
	}
	void login() {
		log = userManager.logUser(); // �α��� 
		if (log != -1) { 
			loginMenu(); // �Ʒ� ���� �Ʒ� �޼���� �̵�. 
		}else {
			System.out.println("[�޼���] �α��� ����.");
		}
	}
	void join() {	
		userManager.addUser();
	}
	void logout() {
		log = -1;
	}
	void leave() {
		userManager.leave();
	}
	void loginMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.���»���] [2.���»���] [3.�Ա�] [4.��ü] [5.��ȸ] [0.�α׾ƿ�]");
			String name = userManager.user[log].name;
			String filename = name+".txt";
			int sel = scan.nextInt();
			if (sel == 1) {
				int count = userManager.user[log].accCount;
				if(count==0) {
					userManager.user[log].acc = new Account[1];
				}else if(count >0) {
					Account[] temp = userManager.user[log].acc;
					userManager.user[log].acc = new Account[count+1];
					for(int i=0; i<count; i++) {
						userManager.user[log].acc[i] = temp[i];
					}
					
					temp = null;
				}
				String number = ran.nextInt(8999)+1000+"";
				System.out.print("[���»���] ���¹�ȣ: " + number);
				userManager.user[log].acc[count] = new Account(); // ���� �߰��� ���´� �������� �ʾ���. ���� ���� �Ѱ� ����������. 
				userManager.user[log].acc[count].number = number;
				userManager.user[log].acc[count].money += 1000;
				userManager.user[log].accCount +=1;

				System.out.println();
				System.out.println(userManager.user[log].name+"�� ���� ���� �Ϸ�");
			} else if (sel == 2) {
				int count = userManager.user[log].accCount;
				if(count ==1) {
					userManager.user[log].acc = null;
				}else if(count >1) {
					System.out.println("[���� ����] ���¹�ȣ �Է�:");
					String num = scan.next();
					int num_check = -1;
					for(int i=0; i<count; i++) {
						if(num.equals(userManager.user[log].acc[i].number)) {
							num_check = i;
						}
					}
					
					if(num_check == -1) {
						System.out.println("[�޼���] �������� �ʴ� ����");
						continue;
					}
					
					Account [] temp = userManager.user[log].acc;
					userManager.user[log].acc = new Account[count-1]; 
					for(int i=0; i<num_check;i++) {
						userManager.user[log].acc[i] = temp[i];
					}
					for(int i= num_check; i<count -1; i++) {
						userManager.user[log].acc[i] = temp[i+1];
					}
					
					userManager.user[log].accCount -=1;
					System.out.println("[�޼���] ���� ���� �Ϸ�");
					
				}
			} else if (sel == 3) {
				if(userManager.user[log].accCount >0) {
					System.out.println("[�Ա�] ���¸� �����ϼ���.");
					userManager.user[log].printAccount();
					int acc = scan.nextInt();
					acc = acc-1;
					
					System.out.println("[�Ա�] �Ա� �ݾ��� �Է��ϼ���");
					int insert_money = scan.nextInt();
					
					userManager.user[log].acc[acc].money += insert_money;
					
					System.out.println("[�޼���] �Ա� �Ϸ�");
				}else {
					System.out.println("[�޼���] �Ա��� ���°� �������� �ʽ��ϴ�.");
				}
				
			}else if(sel ==4) {
				if(userManager.user[log].accCount >0) {
					System.out.println("[��ü] ��ü ��ų ���¸� �����ϼ���.");
					userManager.user[log].printAccount();
					int myAcc = scan.nextInt();
					myAcc = myAcc-1;
					
					System.out.println("[��ü]��ü�� ���¹�ȣ�� �Է��ϼ���.");
					String acc = scan.next();
					int check_log = -1;
					int check_acc = -1;
					for(int i=0; i<userManager.userCount;i++) {
						for(int j=0; j<userManager.user[i].accCount;j++) {
							if(acc.equals(userManager.user[i].acc[j].number)) {
								check_log = i;
								check_acc = j;
							}
						}
					}
					if(check_acc == -1) {
						System.out.println("[�޼���] �ش� ���´� �������� �ʽ��ϴ�.");
						continue;
					}
					
					System.out.println("[��ü] ��ü �ݾ��� �Է��ϼ���");
					int transfer = scan.nextInt();
					
					if(userManager.user[log].acc[myAcc].money - transfer >0) {
						userManager.user[log].acc[myAcc].money -= transfer;
						userManager.user[check_log].acc[check_acc].money += transfer;
						
						System.out.println("[�޼���]"+userManager.user[check_log].name+"���� ���� "+ userManager.user[check_log].acc[check_acc].number+"�� "+transfer+"�� ��ü �Ϸ�.");
					}else {
						System.out.println("[�޼���] ���¿� �ܾ��� �����մϴ�.");
						continue;
					}
				}else {
					System.out.println("[�޼���] ���� ���°� �������� �ʽ��ϴ�.");
				}
				
				
			}else if(sel ==5) {
				userManager.user[log].printAccount();
				
			}else if (sel == 0) {
				run = false;
			}
		}
	}	
}
