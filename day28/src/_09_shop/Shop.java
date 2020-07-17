package _09_shop;

import java.util.Scanner;

public class Shop {
	Scanner scan = new Scanner(System.in);
	ItemManager im = new ItemManager();
	UserManager um = new UserManager();

	void mainMenu() {
		boolean run = true;
		while (run) {
			for(int i=0; i<um.userList.size(); i++) {
				System.out.println(um.userList.get(i).id+": "+um.userList.get(i).money);
			}
			System.out.println("[1.����] [2.Ż��] [3.�α���] [4.�α׾ƿ�]" + "\n[100.������] [0.����] ");
			int sel = scan.nextInt();
			if (sel == 1) {
				um.join();
			}else if(sel ==2) {
				um.leave();
			}else if (sel == 3) {
				if (um.logIn()) {
					loginMenu();
				}
			} else if (sel == 4) {
				um.logOut();
			} else if (sel == 100) {
				managerMenu();
			}
		}
	}

	void loginMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.����] [2.��ٱ��ϸ��] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			if (sel == 1) {
				shopMenu();
			} else if (sel == 2) {
				cartMenu();
			} else if (sel == 0) {
				break;
			}
		}
	}

	void cartMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.�� ��ٱ���] [2.����] [3.����] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			if (sel == 1) {
				int t = im.Purchase(um.userList.get(um.userLog));
				System.out.println("�հ�:"+t+"��");
			} else if(sel==2){
				im.deleteItem(um.userList.get(um.userLog));
			}else if(sel ==3) {
				int t = im.Purchase(um.userList.get(um.userLog));
				if(um.userList.get(um.userLog).money -t >=0) {
					um.userList.get(um.userLog).money -= t;
				}else {
					System.out.printf("[����] %d���� �����մϴ�.",t-um.userList.get(um.userLog).money);
					System.out.println();
				}
			}else if (sel == 0) {
				break;
			}
		}
	}

	void shopMenu() {
		boolean run = true;
		while (run) {
			im.printCategory();
			System.out.println("[ī�װ���] ��ȣ�� �Է��ϼ���.[����.-1]");
			int caID = scan.nextInt();
			if (caID == -1)
				break;
			System.out.println("[������] ��ȣ�� �Է��ϼ���. ");
			im.printItemList(caID);
			int itID = scan.nextInt();
			im.addCart(um.userList.get(um.userLog).id, caID, itID);
		}
	}

	void managerMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.�����۰���] [2.ī�װ�������] [3.��ٱ��ϰ���] [4.��������] [0.�ڷΰ���] ");
			int sel = scan.nextInt();
			if (sel == 1) {
				itemMenu();
			} else if (sel == 2) {
				categoryMenu();
			} else if (sel == 3) {
				categoryMenu();
			} else if (sel == 4) {
				userMenu();
			} else if (sel == 0) {
				run = false;
			}
		}
	}

	void categoryMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.��üī�װ���] [2.ī�װ����߰�] [3.ī�װ�������] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			if (sel == 1) {
				im.printCategory();
			} else if (sel == 2) {
				im.addCategory();
			} else if(sel ==3) {
				im.delCategory();
			} else if (sel == 0) {
				run = false;
			}
		}
	}

	void itemMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.��ü������] [2.�������߰�] [3.�����ۻ���] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			if (sel == 1) {
				im.printItemList();
			} else if (sel == 2) {
				im.addItem();
			} else if(sel ==3) {
				im.deleteItem();
			}else if (sel == 0) {
				run = false;
			}
		}
	}
	
	void jangMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.��ü ��ٱ���] [2.��ٱ��� �߰�] [3.��ٱ��� ����] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			if(sel ==1) {
				
			}else if(sel ==2) {
				
			}else if(sel ==3) {
				
			}else if(sel ==0) {
				run = false;
			}
		}
	}

	void userMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.��ü����] [2.�����߰�] [3.��������] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			if (sel == 1) {
				um.printUser();
			}else if(sel ==2) {
				um.addUser();
			}else if(sel ==3) {
				um.delUser();
			}else if (sel == 0) {
				run = false;
			}
		}
	}
}