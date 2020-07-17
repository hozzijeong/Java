package _08_atm;

public class User {
	String name = "";
	String pw = "";
	Account acc[] = null;
	int accCount = 0;
	
	void printAccount() {
		System.out.println(name);
		for(int i = 0; i < accCount; i++) {
			System.out.print("["+(i+1)+"]");
			acc[i].print();
		}	
	}
}

//유저 정보를 저장하는 클래스, 유저 정보를 출력하기도 함. 

// Account acc[] 안에는 계좌번호/돈 액수가 들어있음. 

