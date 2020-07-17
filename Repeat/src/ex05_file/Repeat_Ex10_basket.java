package ex05_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Repeat_Ex10_basket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
	
		String fileName = "items.txt"; 
		
		FileWriter fw = null;
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		while(true) {
				for(int i=0; i<ids.length;i++	) {
					System.out.println(ids[i]+":"+pws[i]);
					for(int j=0; j<count; j++) {
						if( i == jang[j][0]) {
							if(jang[j][1] ==1) {
								System.out.print("사과");
							}else if(jang[j][1] ==2) {
								System.out.print("바나나");
							}else if(jang[j][1]==3) {
								System.out.print("딸기");
							}
							System.out.println("/");
						}
					}
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
					System.out.println("아이디 입력:");
					String id = scan.next();
					System.out.println("비밀번호 입력:");
					String pw = scan.next();
					
					for(int i=0; i<ids.length;i++){
						if(id.equals(ids[i]) && pw.equals(pws[i])) {
							log = i;
						}
					}
					if(log == -1) {
						System.out.println("아이디 또는 비밀번호를 확인해주세요");
						continue;
					}
					System.out.printf("[로그인] %s님 환영합니다.",ids[log]);
					System.out.println();
				}else {
					System.out.println("[메세지] 로그아웃후 이용가능합니다.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("[메세지] 로그아웃 완료");
				}else {
					System.out.println("[메세지] 로그인 후 이용가능");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
						for(int i=0; i<items.length;i++) {
							System.out.println("["+(i+1)+"]"+items[i]);
						}
						System.out.println("[쇼핑] 번호 선택");
						int choice = scan.nextInt();
						
						
						jang[count][0] = log;
						jang[count][1] = choice;
						count +=1;
				}else {
					System.out.println("[메세지] 로그인후 이용가능");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					System.out.println("["+ids[log]+"]님의 장바구니");
					int j=0;
					for(int i=0; i<count ;i++) {
						System.out.print((j+1) +".");
						if(jang[i][0] ==log) {
							if(jang[i][1] == 1) {
								System.out.println("사과");
							}else if(jang[i][1] ==2) {
								System.out.println("바나나");
							}else if(jang[i][2] ==3) {
								System.out.println("딸기");
							}
							j+=1;
						}
					}
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
			}
			else if(sel == 5) {
				String data = "";
				
				for(int i=0; i<count;i++) {
					data+= jang[i][0] + ":"+jang[i][1];
					data+="\n";
				}
				try {
					fw = new FileWriter(fileName);
					
					data = data.substring(0,data.length()-1);
					
					fw.write(data);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
			}
			else if(sel == 6) {
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
							data+= line;
							data+= "\n";
						}
						data = data.substring(0,data.length()-1);
						
						String [] temp = data.split("\n");
						count = temp.length;
						for(int i=0; i<count;i++) {
							String info[] = temp[i].split(":");
							jang[i][0] = Integer.parseInt(info[0]);
							jang[i][1] = Integer.parseInt(info[1]);
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
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		


	}
}
