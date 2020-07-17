package thread;

import java.util.ArrayList;

/*
 * �����ϰ� �ִ� ���α׷��� ���μ���(process)��� �Ѵ�.
 * ���� �� ���� ���μ����� �Ѱ����� ���� ������, �� �����带 �̿��ϸ�
 * �� ���μ��� ������ �ΰ��� �Ǵ� �� �̻��� ���� ���ÿ� �� �� �ְ� �ȴ�. 
 * thread�� runnable�� ����??
 * thread���� start�� run �޼ҵ忡 ����
 */

// public class �� ����� ���ϳ��� ���ο� ������ ���� ������ �ϳ���???
class Ex implements Runnable{
	int seq;
	
	public Ex(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq+"thread start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.seq +"thread end.");
	}
	
}

public class Thread01 {
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
		
		for(int i=0; i<10; i ++) {
			Thread t = new Thread(new Ex(i));
			t.start();
			threads.add(t);
		}
		
		for(int i=0; i<threads.size();i++) {
			Thread t = threads.get(i);
			try {
				// �����尡 ��� ����ǰ� ����Ǳ� ���� main �޼ҵ尡 ���� ����Ǵ� ��찡 ��κ���.
//				join�޼ҵ带 ����ϸ�, �����尡 ��� ����� �Ŀ� main �޼ҵ带 ���� ��ų �� ����
				t.join();
			}catch(Exception e) {
				
			}
		}
		System.out.println("main end.");
	}
}
