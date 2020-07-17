package ex;

public class Ex {
	public static void main(String[] args) {
		
		/*
		 * 1  2 3 4 5
		 * 10 9 8 7 6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25
		 */
		
		for(int i=1; i<=5;i++) {
			if(i%2==0) {
				for(int j = 5; j>=1; j--) {
					System.out.print((j+(5*(i-1))) + "\t");
				}
			}
			else {
				for(int j = 1; j<=5; j++) {
					System.out.print(j+(5*(i-1))+"\t");
				}
		}
			System.out.println();
		}
		
	}
}
