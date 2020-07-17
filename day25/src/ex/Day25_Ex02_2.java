package ex;

import java.util.Random;

class Lotto{
	int [] data = new int [8];
	
	
	boolean win = false;
	
	
	void print() {
		for(int i=0; i<8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}
public class Day25_Ex02_2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Lotto[] lotto = new Lotto[5];
		boolean check = false;
		
		int n=0;
		
		while(n<5)	{
			lotto[n] = new Lotto();
			for(int i=0; i<8; i++	) {
				int r = ran.nextInt(2);
				if(r ==0) {
					lotto[n].data[i] = 0;
				}else {
					lotto[n].data[i] = 3;
				}
			}
			int cnt = 0;
			for(int i=0; i<8; i++) {
				if(lotto[n].data[i] == 3) {
					cnt +=1;
					if(cnt ==3) {
						lotto[n].win = true;
						break;
					}else {
						cnt = 0;
					}
				}
			}
			if(check == false && lotto[n].win == true) {
				check = true;
				lotto[n].print();
				n+=1; // 만약 당첨이 된것이 있다면 그것 하나만 계속해서 print해줌
			}else if(check == true && lotto[n].win ==false) {
				lotto[n].print();
				n+=1; // 앞선 수에서 당첨된 것이 나온다면 당첨 되지 않은 로또만 계속해서 보여줌
			}
			
		}
	}
}
