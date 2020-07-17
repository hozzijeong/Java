package day24;

class Monster{
	
	int count;
	
	void init() {
		System.out.println("몬스터 탄생중..");
		count = count + 1;
	}
	
	void die() {
		System.out.println("몬스터 죽음..");
		count = count - 1;
		
		if(count == 0) {
			System.out.println("마지막 생존자까지 죽었음..");
		}else {
			System.out.println("현재 생존자 수는 " + count +"명 입니다...");
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








