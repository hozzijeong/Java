package ex05_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Repeat_Ex09_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int count = 0;
		int log = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "atm.txt";
		
		FileWriter fw = null;
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		
		while(true) {
			if(log == -1) {
				for(int i=0; i< count; i++) {
					System.out.println(accs[i]+":"+pws[i]+"=>"+moneys[i]);
				}
			}
			else if(log != -1){
				System.out.printf("���� %s�α�����...",accs[log]);
				System.out.println();
			}
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա�");
			System.out.println("[6]���");
			System.out.println("[7]��ü");
			System.out.println("[8]�ܾ���ȸ");
			System.out.println("[9]����");
			System.out.println("[10]�ε�");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log ==-1) {
					if(count == size) {
						System.out.println("[�޼���]���̻� ������ �� �����ϴ�.");
						continue;
					}
					System.out.println("[ȸ������]���̵� �Է�:");
					String id = scan.next();
					System.out.println("[ȸ������]��й�ȣ �Է�:");
					String pw = scan.next();
					
					int check = 1;
					for(int i=0; i<size;i++) {
						if(id.equals(accs[i])) {
							check = -1;
						}
					}
					if(check ==-1) {
						System.out.println("[ȸ������] �ߺ��� ���̵��Դϴ�.");
					}else {
						
						accs[count] = id;
						pws[count] = pw;
						moneys[count] = 1000;
						
						count +=1;
					}
				
				}
				else if(log != -1) {
					System.out.println("[�޼���]�α׾ƿ� �� �̿����ּ���");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					
					accs[log] = "";	
					pws[log] = "";
					moneys[log] = 0;
					
					count -=1;
					for(int i=log; i<count;i++) {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
						moneys[i] = moneys[i+1];
					}
					log = -1;
					
				}else {
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[�α���] ���̵� �Է��ϼ���");
					String id = scan.next();
					System.out.println("[�α���] ��й�ȣ�� �Է��ϼ���:");
					String pw = scan.next();
					
					for(int i=0; i<count ;i++) {
						if(id.equals(accs[i]) && pw.equals(pws[i])) {
							log = i;
						}
					}
					
					if(log ==-1) {
						System.out.println("[�α���] ���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���");
						continue;
					}
					
					System.out.printf("[�޼���] %s�� ȯ���մϴ�",accs[log]);
					System.out.println();
				}else {
					System.out.println("[�޼���]�α׾ƿ� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
					System.out.println("[�޼���] �α׾ƿ� �Ϸ�");
				}else {
					System.out.println("[�޼���] �α��� �� �̿밡��");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("[�Ա�] �ݾ� �Է�:");
					int money = scan.nextInt();
					
					moneys[log] += money;
					System.out.printf("[�޼���] %d�� �Ա� �Ϸ�!",money);
					System.out.println();
				}else {
					System.out.println("[�޼���] �α����� �̿� ����");
				}
			}
			else if(sel == 6) {
				if(log !=-1) {
					System.out.println("[���] �ݾ� �Է�:");
					int money = scan.nextInt();
					
					if(moneys[log] - money >=0) {
						moneys[log] -= money;
						System.out.printf("[�޼���] %d�� ��� �Ϸ�!",money);
						System.out.println();
					}else {
						System.out.println("[�޼���] ��� �ݾ� ����");
						continue;
					}
				}else {
					System.out.println("[�޼���] �α����� �̿밡��");
				}
			}
			else if(sel == 7) {
				if(log != -1) {
					System.out.println("[��ü] ���¹�ȣ �Է�:");
					String acc = scan.next();
					
					int check = -1;
					
					for(int i=0; i<count; i++) {
						if(acc.equals(accs[i])) {
							check = i;
						}
					}
					if(check == -1) {
						System.out.println("[�޼���] ��ü ���¹�ȣ�� Ȯ�����ּ���");
						continue;
					}
					
					System.out.println("[��ü] �ݾ� �Է�:");
					int money = scan.nextInt();
					
					if(moneys[log] - money>=0) {
						moneys[log] -=money;
						moneys[check] += money;
						System.out.printf("[�޼���] %s�Բ� %d�� ��ü �Ϸ�",accs[check],money);
						System.out.println();
					}else {
						System.out.println("[�޼���] ��ü�ݾ� ����");
						continue;
					}
				}else {
					System.out.println("[�޼���] �α����� �̿밡��");
				}
			}
			else if(sel == 8) {
				if(log != -1) {
					System.out.printf("[�ܾ� ��ȸ] %s�� ���� �ܾ� %d��",accs[log],moneys[log]);
					System.out.println();
				}else {
					System.out.println("[�޼���] �α����� �̿밡��");
				}
			}
			else if(sel == 9) {
				try {
					fw = new FileWriter(fileName);
					String data = "";
					
					for(int i=0; i<count ;i++) {
						data+= accs[i]+"/"+pws[i]+"/"+moneys[i]+"\n";
					}
					data = data.substring(0,data.length()-1);
					fw.write(data);
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
				
			}
			else if(sel == 10) {
				if(file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						String data = "";
						while(true) {
							String line = br.readLine();
							if(line == null) {
								break;
							}
							data += line;
							data+="\n";
						}
						data = data.substring(0,data.length()-1);
						
						String[] temp = data.split("\n");
						
						count = temp.length;
						for(int i=0; i<count;i++) {
							String[] info = temp[i].split("/");
							accs[i] = info[0];
							pws[i] = info[1];
							moneys[i] = Integer.parseInt(info[2]); 
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						try {fr.close();} catch (IOException e) {e.printStackTrace();}
						try {br.close();} catch (IOException e) {e.printStackTrace();}
						
					}
				}
			}
			else if(sel == 0) {
				break;
			}
			
		}


	}
}
