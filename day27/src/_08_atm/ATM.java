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
	static UserManager userManager = new UserManager(); // 유저의 가입, 로그인 ,회원 탈퇴 관리 하는 클래스
	static FileManager fileManager = new FileManager();
	
	Random ran = new Random();
	int log = -1; // 로그인 상태
	
	void menu() {
		boolean run = true;
		while (run) {
			System.out.println("회원 수 = " + userManager.userCount);
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1.로그인]\n[2.로그아웃]\n[3.회원가입]\n[4.회원탈퇴]\n[5.저장]\n[6.로드]\n[0.종료]");
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
		log = userManager.logUser(); // 로그인 
		if (log != -1) { 
			loginMenu(); // 아래 따로 아래 메서드로 이동. 
		}else {
			System.out.println("[메세지] 로그인 실패.");
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
			System.out.println("[1.계좌생성] [2.계좌삭제] [3.입금] [4.이체] [5.조회] [0.로그아웃]");
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
				System.out.print("[계좌생성] 계좌번호: " + number);
				userManager.user[log].acc[count] = new Account(); // 새로 추가된 계좌는 존재하지 않았음. 따라서 새로 한개 만들어줘야함. 
				userManager.user[log].acc[count].number = number;
				userManager.user[log].acc[count].money += 1000;
				userManager.user[log].accCount +=1;

				System.out.println();
				System.out.println(userManager.user[log].name+"님 계좌 생성 완료");
			} else if (sel == 2) {
				int count = userManager.user[log].accCount;
				if(count ==1) {
					userManager.user[log].acc = null;
				}else if(count >1) {
					System.out.println("[계좌 삭제] 계좌번호 입력:");
					String num = scan.next();
					int num_check = -1;
					for(int i=0; i<count; i++) {
						if(num.equals(userManager.user[log].acc[i].number)) {
							num_check = i;
						}
					}
					
					if(num_check == -1) {
						System.out.println("[메세지] 존재하지 않는 계좌");
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
					System.out.println("[메세지] 계좌 삭제 완료");
					
				}
			} else if (sel == 3) {
				if(userManager.user[log].accCount >0) {
					System.out.println("[입금] 계좌를 선택하세요.");
					userManager.user[log].printAccount();
					int acc = scan.nextInt();
					acc = acc-1;
					
					System.out.println("[입금] 입금 금액을 입력하세요");
					int insert_money = scan.nextInt();
					
					userManager.user[log].acc[acc].money += insert_money;
					
					System.out.println("[메세지] 입금 완료");
				}else {
					System.out.println("[메세지] 입금할 계좌가 존재하지 않습니다.");
				}
				
			}else if(sel ==4) {
				if(userManager.user[log].accCount >0) {
					System.out.println("[이체] 이체 시킬 계좌를 선택하세요.");
					userManager.user[log].printAccount();
					int myAcc = scan.nextInt();
					myAcc = myAcc-1;
					
					System.out.println("[이체]이체할 계좌번호를 입력하세요.");
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
						System.out.println("[메세지] 해당 계좌는 존재하지 않습니다.");
						continue;
					}
					
					System.out.println("[이체] 이체 금액을 입력하세요");
					int transfer = scan.nextInt();
					
					if(userManager.user[log].acc[myAcc].money - transfer >0) {
						userManager.user[log].acc[myAcc].money -= transfer;
						userManager.user[check_log].acc[check_acc].money += transfer;
						
						System.out.println("[메세지]"+userManager.user[check_log].name+"님의 계좌 "+ userManager.user[check_log].acc[check_acc].number+"로 "+transfer+"원 이체 완료.");
					}else {
						System.out.println("[메세지] 계좌에 잔액이 부족합니다.");
						continue;
					}
				}else {
					System.out.println("[메세지] 본인 계좌가 존재하지 않습니다.");
				}
				
				
			}else if(sel ==5) {
				userManager.user[log].printAccount();
				
			}else if (sel == 0) {
				run = false;
			}
		}
	}	
}
