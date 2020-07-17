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
                System.out.println("상태 : 로그아웃");
            }else {
                System.out.println("상태 : " + accs[log] + "님, 로그인");
            }
            System.out.println("------------");
            
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
				if(count <5) {
					System.out.println("[회원가입] 아이디를 입력해주세요:");
					String id = scan.next();
					System.out.println("[회원가입] 비밀번호를 입력해주세요:");
					String pw = scan.next();
	
					int check = 1;
					for(int i=0; i<count;i++) {
						if(id.equals(accs[i])) {
							check = -1;
						}
					}
					if(check ==-1) {
						System.out.println("중복된 아이디가 있습니다.");
						continue;
					}
					
					accs[count] = id;
					pws[count] = pw;
					moneys[count] =1000;
					
					
					System.out.printf("[회원가입] %s님 가입을 축하합니다!!",accs[count]);
					System.out.println();
					count+=1;
				}else {
					System.out.println("[회원가입] 더이상 가입할 수 없습니다.");
				}
				
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("[회원탈퇴]정말로 탈퇴하시겠습니까? [1]예 [2]아니오");
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
						System.out.println("[회원탈퇴] 탈퇴가 완료되었습니다.");
						
					}
				}else {
					System.out.println("[회원탈퇴] 로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[로그인]아이디를 입력해주세요:");
					String id = scan.next();
					System.out.println("[로그인]비밀번호를 입력해주세요:");
					String pw = scan.next();
					
					for(int i=0; i<count ;i++) {
						if(id.equals(accs[i]) && pw.equals(pws[i])) {
							log = i;
						}
					}
					
					if(log ==-1) {
						System.out.println("아이디 또는 비밀번호를 확인해주세요.");
						continue;
					}
					
					System.out.printf("%s님 환영합니다.",accs[log]);
					System.out.println();
					
					
				}else {
					System.out.println("[로그인] 로그아웃 후 이용가능합니다.");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
					System.out.println("[로그아웃] 로그아웃 완료");
	
				}else {
					System.out.println("[로그아웃] 로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 5) {
				if (log != -1) {
					System.out.println("[입금]입금할 금액을 입력하세요:");
					int money = scan.nextInt();
					moneys[log] += money;
					System.out.printf("[입금] %d원 입금 완료",money);
					System.out.println();
				}else {
					System.out.println("[입금] 로그인 후 이용 가능합니다.");
				}
				
			}
			else if(sel == 6) {
				if(log != -1) {
					System.out.println("[출금] 출금할 금액을 입력하세요:");
					int withdraw = scan.nextInt();
					if(moneys[log] - withdraw >=0) {
						moneys[log] -= withdraw;
						System.out.printf("[출금] %d원 출금 완료",withdraw);
						System.out.println();
					}else {
						System.out.println("[출금] 출금 잔액이 부족합니다.");
					}
				}else {
					System.out.println("[출금] 로그인 후 이용가능합니다.");
				}
			}
			else if(sel == 7) {
				if(log != -1) {
					System.out.println("[이체] 이체할 계좌번호를 입력하세요:");
					String transid = scan.next();
					int check = -1;
					for(int i=0; i<count; i++) {
						if(transid.equals(accs[i])) {
							check = i;
						}
					}
					
					if(check != -1) {
						System.out.println("[이체] 이체할 금액을 입력하세요:");
						int transfer = scan.nextInt();
						if(moneys[log] - transfer >=0) {
							moneys[log] -= transfer;
							moneys[check] += transfer;
							System.out.printf("%s님께 %d원 이체완료",accs[check],transfer);
							System.out.println();
						}else {
							System.out.println("[이체] 잔액이 부족합니다.");
						}
						
					}else {
						System.out.println("[이체] 로그인 후 이용 가능합니다.");
					}
				}
			}
			else if(sel == 8) {
				if(log!= -1) {
					System.out.printf("%s님의 잔액은 %d원 입니다.",accs[log],moneys[log]);
				}else {
					System.out.println("[잔액조회] 로그인 후 이용 가능합니다.");
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
