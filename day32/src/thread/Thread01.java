package thread;

import java.util.ArrayList;

/*
 * 동작하고 있는 프로그램을 프로세스(process)라고 한다.
 * 보통 한 개의 프로세스는 한가지의 일을 하지만, 이 쓰레드를 이용하면
 * 한 프로세스 내에서 두가지 또는 그 이상의 일을 동시에 할 수 있게 된다. 
 * thread와 runnable의 관계??
 * thread에서 start와 run 메소드에 대해
 */

// public class 를 만들면 파일내에 새로운 파일을 따로 만들어야 하나여???
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
				// 쓰레드가 모두 수행되고 종료되기 전에 main 메소드가 먼저 종료되는 경우가 대부분임.
//				join메소드를 사용하면, 쓰레드가 모두 종료된 후에 main 메소드를 종료 시킬 수 있음
				t.join();
			}catch(Exception e) {
				
			}
		}
		System.out.println("main end.");
	}
}
