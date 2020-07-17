package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day16_Ex01_file_controler_shoppingbag {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		
		String userFile = "user.txt";
		String jangFile = "jang.txt";
		
		
		while(true) {
			
			System.out.println("------------");
			for(int i=0; i<ids.length;i++) {
				System.out.println(ids[i] + ":" + pws[i] + "(");
				for(int j=0; j<count; j++) {
					if(i == jang[j][0]) {
						if(jang[j][1] ==1	) {
							System.out.print("사과");
						}else if(jang[j][1] ==2	) {
							System.out.print("바나나");
						}else if(jang[j][1] ==3) {
							System.out.print("딸기");
						}
						System.out.print("/");
					}
				}
				System.out.println(")");
			}
			
			
			
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log ==-1) {
					System.out.println("[로그인]아이디 입력:");
					String id = scan.next();
					System.out.println("[로그인]비밀번호 입력:");
					String pw = scan.next();
					
					int check = -1;
					for(int i=0; i<ids.length;i++) {
						if(id.equals(ids[i]) && pw.equals(pws[i])) {
							log = i;
							System.out.printf("[로그인]%s님 환영합니다",id);
						}
						System.out.println();
						
					}
					
					if(log == -1) {
						System.out.println("[로그인]아이디 또는 비밀번호를 확인해주세요.");
					}					
				}else {
					System.out.println("로그아웃 후 이용해주세요");
				}
				
				
				
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("[로그아웃] 완료");
					log = -1;
				}else {
					System.out.println("[로그아웃] 로그인 후 이용해주세요.");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
					for(int i=0; i<items.length;i++) {
						System.out.println("["+(i+1)+"]"+items[i]);
					}
					System.out.println("쇼핑할 물건을 장바구니에 담아주세요");
					int choice = scan.nextInt();
					jang[count][0] = log;
					jang[count][1] = choice;
					count+=1;
							
				}else {
					System.out.println("[쇼핑] 로그인 후 이용해주세요");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					System.out.println("["+ids[log]+"]님의 장바구니");
					int j = 0;
					for(int i=0; i<count;i++) {
						System.out.print((j+1)+".");
						if(jang[i][0] == log) {
							if(jang[i][1] == 1) {
								System.out.println("사과");
							}else if(jang[i][1] ==2) {
								System.out.println("바나나");
							}else if(jang[i][1] ==3) {
								System.out.println("딸기");
							}
						}
						j+=1;
					}
				}else {
					System.out.println("[장바구니] 로그인 후 이용 가능합니다.");
				}
				
			}
			else if(sel == 5) {
				String userData = "";
				String jangData = "";
				
				for(int i=0; i<ids.length;i++) {
					userData += ids[i] +"/" + pws[i]+"\n";
				}
				
				userData = userData.substring(0,userData.length()-1);
				
				for(int i=0; i<count;i++) {
					jangData += jang[i][0] +":" + jang[i][1]+"\n";
				}
				
				jangData = jangData.substring(0,jangData.length()-1);
				
				FileWriter userFw  = null;
				FileWriter jangFw = null;
				
				try {
					userFw = new FileWriter(userFile);
					jangFw = new FileWriter(jangFile);
					
					userFw.write(userData);
					jangFw.write(jangData);
					System.out.println("저장을 완료했습니다.");
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {userFw.close();} catch (IOException e) {e.printStackTrace();}
					try {jangFw.close();} catch (IOException e) {e.printStackTrace();}
				}
				
			}
			else if(sel == 6) {
				File file = new File(jangFile);
				if(file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						String jangData = "";
						while(true) {
							String line = br.readLine();
							if(line == null) {
								break;
							}
							jangData+= line;
							jangData+="\n";
						}
						
						jangData = jangData.substring(0,jangData.length()-1);
					}catch(Exception e){
						e.printStackTrace();
					}finally {
						try {fr.close();} catch (IOException e) {e.printStackTrace();}
						try {br.close();} catch (IOException e) {e.printStackTrace();}
						
					}
					
					
				}
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}

	}
}
