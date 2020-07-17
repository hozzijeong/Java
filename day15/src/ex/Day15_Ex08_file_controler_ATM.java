package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day15_Ex08_file_controler_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int count = 0;
		int log = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "atm.txt";
		
		while(true) {
			System.out.println("------------");
            for(int i=0; i<count; i++) {
                System.out.println(accs[i] + ":" + pws[i] + ":" + moneys[i]);
            }
            System.out.println("------------");
            if(log == -1) {
                System.out.println("���� : �α׾ƿ�");
            }else {
                System.out.println("���� : " + accs[log] + "��, �α���");
            }
            System.out.println("------------");
            
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
				if(count <5) {
					System.out.println("[ȸ������] ���̵� �Է����ּ���:");
					String id = scan.next();
					System.out.println("[ȸ������] ��й�ȣ�� �Է����ּ���:");
					String pw = scan.next();
	
					int check = 1;
					for(int i=0; i<count;i++) {
						if(id.equals(accs[i])) {
							check = -1;
						}
					}
					if(check ==-1) {
						System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
						continue;
					}
					
					accs[count] = id;
					pws[count] = pw;
					moneys[count] =1000;
					
					
					System.out.printf("[ȸ������] %s�� ������ �����մϴ�!!",accs[count]);
					System.out.println();
					count+=1;
				}else {
					System.out.println("[ȸ������] ���̻� ������ �� �����ϴ�.");
				}
				
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("[ȸ��Ż��]������ Ż���Ͻðڽ��ϱ�? [1]�� [2]�ƴϿ�");
					int choice = scan.nextInt();
					if(choice ==2) {
						continue;
					}else {
						String[] atemp = accs;
						String[] ptemp = pws;
						int [] mtemp = moneys;
						
						int j=0;
						for(int i=0; i<count; i++) {
							if(i!= log) {
								accs[j] = atemp[i];
								pws[j] = ptemp[i];
								moneys[j] = mtemp[i];
								j+=1;
										
							}
						}
						count -=1;						
						log = -1;
						System.out.println("[ȸ��Ż��] Ż�� �Ϸ�Ǿ����ϴ�.");
						
					}
				}else {
					System.out.println("[ȸ��Ż��] �α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[�α���]���̵� �Է����ּ���:");
					String id = scan.next();
					System.out.println("[�α���]��й�ȣ�� �Է����ּ���:");
					String pw = scan.next();
					
					for(int i=0; i<count ;i++) {
						if(id.equals(accs[i]) && pw.equals(pws[i])) {
							log = i;
						}
					}
					
					if(log ==-1) {
						System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���.");
						continue;
					}
					
					System.out.printf("%s�� ȯ���մϴ�.",accs[log]);
					System.out.println();
					
					
				}else {
					System.out.println("[�α���] �α׾ƿ� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
					System.out.println("[�α׾ƿ�] �α׾ƿ� �Ϸ�");
	
				}else {
					System.out.println("[�α׾ƿ�] �α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 5) {
				if (log != -1) {
					System.out.println("[�Ա�]�Ա��� �ݾ��� �Է��ϼ���:");
					int money = scan.nextInt();
					moneys[log] += money;
					System.out.printf("[�Ա�] %d�� �Ա� �Ϸ�",money);
					System.out.println();
				}else {
					System.out.println("[�Ա�] �α��� �� �̿� �����մϴ�.");
				}
				
			}
			else if(sel == 6) {
				if(log != -1) {
					System.out.println("[���] ����� �ݾ��� �Է��ϼ���:");
					int withdraw = scan.nextInt();
					if(moneys[log] - withdraw >=0) {
						moneys[log] -= withdraw;
						System.out.printf("[���] %d�� ��� �Ϸ�",withdraw);
						System.out.println();
					}else {
						System.out.println("[���] ��� �ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("[���] �α��� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 7) {
				if(log != -1) {
					System.out.println("[��ü] ��ü�� ���¹�ȣ�� �Է��ϼ���:");
					String transid = scan.next();
					int check = -1;
					for(int i=0; i<count; i++) {
						if(transid.equals(accs[i])) {
							check = i;
						}
					}
					
					if(check != -1) {
						System.out.println("[��ü] ��ü�� �ݾ��� �Է��ϼ���:");
						int transfer = scan.nextInt();
						if(moneys[log] - transfer >=0) {
							moneys[log] -= transfer;
							moneys[check] += transfer;
							System.out.printf("%s�Բ� %d�� ��ü�Ϸ�",accs[check],transfer);
							System.out.println();
						}else {
							System.out.println("[��ü] �ܾ��� �����մϴ�.");
						}
						
					}else {
						System.out.println("[��ü] �α��� �� �̿� �����մϴ�.");
					}
				}
			}
			else if(sel == 8) {
				if(log!= -1) {
					System.out.printf("%s���� �ܾ��� %d�� �Դϴ�.",accs[log],moneys[log]);
				}else {
					System.out.println("[�ܾ���ȸ] �α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 9) {
				FileWriter fw = null;
				
				String data = "";
				
				for(int i=0; i<count; i++) {
					data +="["+(i+1)+"]"+ accs[i]+"/" + pws[i] +"/"+moneys[i];
					if( i != count-1) {
						data+="\n";
					}
				}
				
				data = data.substring(0,data.length()-1);
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
				
				
			}
			else if(sel == 10) {
				String data = "";
				File file = new File(fileName);
				if(file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
												
						while(true) {
							String line = br.readLine();
							if(line ==null) {
								break;
							}
							data +=line;
							data +="\n";
						}
						
						data = data.substring(0,data.length()-1);
						
						String[] temp = data.split("\n");
						
						for(int i=0; i<temp.length; i++) {
							System.out.println(temp[i]);
						}
						
						
					}catch(Exception e){
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
