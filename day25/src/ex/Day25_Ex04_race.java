package ex;

import java.util.Random;

class Horse{
	String name = "";
	int pos = 0;
	int rank = 0;
	boolean win = false;
}
class Racing{
	Random ran = new Random();
	int size = 4;
	Horse[] horse = new Horse[size];
	int line = 20;
	int[][] track = new int [size][line];
	
	Racing() {
		for(int i=0; i<size; i++) {
			horse[i] = new Horse();
		}
		horse[0].name = "a";
		horse[1].name = "b";
		horse[2].name = "c";
		horse[3].name = "d";
		Play();
		PrintHorse();
	}
	void PrintHorse() {
		System.out.println();
		for(int i=0; i<size; i++) {
			for(int j=0; j<line; j++) {
				if(horse[i].pos == j	) {
					System.out.print("["+horse[i].name+"]");
				}else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}
	void Play() {
		boolean loop = true;
		int cnt = 0;
		while(loop) {
			PrintHorse();
			for(int i=0; i<size; i++) {
				if(horse[i].win == true) {
					continue;
				}
				int r = ran.nextInt(4)+1;
				horse[i].pos +=r;
				if(horse[i].pos >= 19) {
					horse[i].pos = 19;
					horse[i].rank = cnt+1;
					horse[i].win = true;
					cnt+=1;
					if(cnt >= size) {
						loop = false;
						break;
					}
				}
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
public class Day25_Ex04_race {
	public static void main(String[] args) {
		
		new Racing();
		
		
	}
}
