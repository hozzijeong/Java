package test;

import java.util.Random;

class Lotto {
	int[] data = new int[8];

	boolean win = false;

	void print() {
		for (int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}

public class Day25_Ex02_lotto_1set {
	public static void main(String[] args) {
		// 문제) 로또 1셋트
		// 1개는 당첨 4개는 꽝인 랜덤복권 생성

		Random ran = new Random();

		Lotto[] lotto = new Lotto[5];
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = new Lotto();
//		}

		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = new Lotto();
			
			for (int j = 0; j < lotto[i].data.length; j++) {
				if (i == 0) {
					if (j < 3) {
						lotto[i].data[j] = 1;
					} else {
						lotto[i].data[j] = 0;
					}
				} else {
					int r = ran.nextInt(2);
					int cnt = 0;
					int check = -1;
					lotto[i].data[j] = r;
					
					for (int k = 0; k < j; k++) {
						if (lotto[i].data[k] == 1) {
							cnt += 1;
							if (cnt == 3) {
								check = 1;
							}
						} else {
							cnt = 0;
						}
					}
					if (check == 1) {
						i = -1;
						break;
					}
				}
			}

		}

		for (int i = 0; i < 100; i++) {
			int r = ran.nextInt(5);

			Lotto temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}

		for (int i = 0; i < 5; i++) {
			lotto[i].print();
		}

	}
}
