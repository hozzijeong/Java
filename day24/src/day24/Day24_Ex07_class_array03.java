package day24;

import java.util.Scanner;

class User{
	String id;
	int money;
}
public class Day24_Ex07_class_array03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		User[] user = new User[max];
		for(int i=0; i<max;i++) {
			user[i] = new User();
		}
		int count = 0;
		int n = 0;
		while(n ==0) {
			System.out.println("1.회원가입");
			System.out.println("2. 탈퇴");
			System.out.println("3. 출력");
			int sel = scan.nextInt();
			if(sel ==1) {
				System.out.print("이름 입력");
				user[count].id = scan.next();
				System.out.print("금액 입력:");
				user[count].money = scan.nextInt();
				count +=1;
			}
			if(sel ==2)	{
				System.out.println("인덱스 입력:");
				int idx = scan.nextInt();
				for(int i=idx; i<count -1; i++) {
					user[i] = user[i+1]; 
				}
				count -=1;
			}
			if(sel ==3) {
				for(int i=0; i<count; i++) {
					System.out.println(user[i].id + ": "+user[i].money);
				}
			}
		}
	}
}
