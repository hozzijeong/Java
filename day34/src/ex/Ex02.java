package ex;

import java.util.ArrayList;
import java.util.Random;

class Test01 implements Runnable{
	private int index = 0;
	
	@Override
	public void run() {
		Random r = new Random(System.currentTimeMillis());
		long s = r.nextInt(3000);
		
		try {
			Thread.sleep(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
		addIdx();
	}
	synchronized void addIdx() {
		index++;
		System.out.println("current index value:"+index);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Start main method");
		
		Runnable r = new Test01();
		ArrayList<Thread> thread = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			Thread t = new Thread(r);
			t.start();
			thread.add(t);
		}
		
//		for(Thread test : thread) {
//			test.join();
//		}
		
		System.out.println("End main method");
	}
}
