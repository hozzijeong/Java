package thread;
class Watch extends Thread{
	public String timeText;
	long time = 0l;
	long preTime = 0l;
	boolean play = true;
	// thread 클래스 안에 있는 메소드
	@Override
	public void run() {
		preTime = System.currentTimeMillis();
		while(play) {
			try {
				sleep(10);
				time = System.currentTimeMillis() - preTime;
				int m = (int)(time/1000.0/60.0);
				int s = (int)(time%(1000.0*60)/1000.0);
				int ms = (int)(time%1000/10.0);
				System.out.println(m+":"+s+" " +ms);
				
				if(s==1) {
					play = false;
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class stopWatch {
	public static void main(String[] args) {
		Watch st = new Watch();
		
		st.start();
	}
}
