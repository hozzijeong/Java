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
				System.out.printf("현재 %s로그인중...",accs[log]);
				System.out.println();
			}
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log ==-1) {
					if(count == size) {
						System.out.println("[메세지]더이상 가입할 수 없습니다.");
						continue;
					}
					System.out.println("[회원가입]아이디 입력:");
					String id = scan.next();
					System.out.println("[회원가입]비밀번호 입력:");
					String pw = scan.next();
					
					int check = 1;
					for(int i=0; i<size;i++) {
						if(id.equals(accs[i])) {
							check = -1;
						}
					}
					if(check ==-1) {
						System.out.println("[회원가입] 중복된 아이디입니다.");
					}else {
						
						accs[count] = id;
						pws[count] = pw;
						moneys[count] = 1000;
						
						count +=1;
					}
				
				}
				else if(log != -1) {
					System.out.println("[메세지]로그아웃 후 이용해주세요");
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
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[로그인] 아이디를 입력하세요");
					String id = scan.next();
					System.out.println("[로그인] 비밀번호를 입력하세요:");
					String pw = scan.next();
					
					for(int i=0; i<count ;i++) {
						if(id.equals(accs[i]) && pw.equals(pws[i])) {
							log = i;
						}
					}
					
					if(log ==-1) {
						System.out.println("[로그인] 아이디 또는 비밀번호를 확인해주세요");
						continue;
					}
					
					System.out.printf("[메세지] %s님 환영합니다",accs[log]);
					System.out.println();
				}else {
					System.out.println("[메세지]로그아웃 후 이용 가능합니다.");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
					System.out.println("[메세지] 로그아웃 완료");
				}else {
					System.out.println("[메세지] 로그인 후 이용가능");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("[입금] 금액 입력:");
					int money = scan.nextInt();
					
					moneys[log] += money;
					System.out.printf("[메세지] %d원 입금 완료!",money);
					System.out.println();
				}else {
					System.out.println("[메세지] 로그인후 이용 가능");
				}
			}
			else if(sel == 6) {
				if(log !=-1) {
					System.out.println("[출금] 금액 입력:");
					int money = scan.nextInt();
					
					if(moneys[log] - money >=0) {
						moneys[log] -= money;
						System.out.printf("[메세지] %d원 출금 완료!",money);
						System.out.println();
					}else {
						System.out.println("[메세지] 출금 금액 부족");
						continue;
					}
				}else {
					System.out.println("[메세지] 로그인후 이용가능");
				}
			}
			else if(sel == 7) {
				if(log != -1) {
					System.out.println("[이체] 계좌번호 입력:");
					String acc = scan.next();
					
					int check = -1;
					
					for(int i=0; i<count; i++) {
						if(acc.equals(accs[i])) {
							check = i;
						}
					}
					if(check == -1) {
						System.out.println("[메세지] 이체 계좌번호를 확인해주세요");
						continue;
					}
					
					System.out.println("[이체] 금액 입력:");
					int money = scan.nextInt();
					
					if(moneys[log] - money>=0) {
						moneys[log] -=money;
						moneys[check] += money;
						System.out.printf("[메세지] %s님께 %d원 이체 완료",accs[check],money);
						System.out.println();
					}else {
						System.out.println("[메세지] 이체금액 부족");
						continue;
					}
				}else {
					System.out.println("[메세지] 로그인후 이용가능");
				}
			}
			else if(sel == 8) {
				if(log != -1) {
					System.out.printf("[잔액 조회] %s님 현재 잔액 %d원",accs[log],moneys[log]);
					System.out.println();
				}else {
					System.out.println("[메세지] 로그인후 이용가능");
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
