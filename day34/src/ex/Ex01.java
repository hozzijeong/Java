package ex;

class ThreadEx2 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				sleep(1000);
				System.out.println("Thread가 실행되었습니다.");
			}
		}catch(Exception e) {
			
		}
	}
}

class runnAbleEx implements Runnable{
	private boolean stop = false;
	
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("쓰레드 실행중"+stop);
			try {
				System.out.println("실행중..."+Thread.activeCount());	
				Thread.sleep(1000);
			}catch(Exception e) {
				stop();
			}
			
			stop();
		}
	}
	
	public void stop() {
		System.out.println(Thread.currentThread().getName()+"가 종료되었습니다.");
		stop = true;
	}
}


public class Ex01 {
	public static void main(String[] args) {
		ThreadEx2 t1 = new ThreadEx2();
		t1.start();
		
		Runnable r = new runnAbleEx();
		Thread t = new Thread(r);
		
		t.start();
	}
}
