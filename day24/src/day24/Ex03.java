package day24;

class Monster{
	
	int count;
	
	void init() {
		System.out.println("���� ź����..");
		count = count + 1;
	}
	
	void die() {
		System.out.println("���� ����..");
		count = count - 1;
		
		if(count == 0) {
			System.out.println("������ �����ڱ��� �׾���..");
		}else {
			System.out.println("���� ������ ���� " + count +"�� �Դϴ�...");
		}
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		
		Monster m1 = new Monster();
		m1.init();
		Monster m2 = new Monster();
		m2.init();
		Monster m3 = new Monster();
		m3.init();
		
		m1.die();
		
	}
}








