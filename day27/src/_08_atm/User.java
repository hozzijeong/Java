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

//���� ������ �����ϴ� Ŭ����, ���� ������ ����ϱ⵵ ��. 

// Account acc[] �ȿ��� ���¹�ȣ/�� �׼��� �������. 

