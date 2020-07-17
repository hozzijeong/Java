package ex;

public class Day07_Ex07_draw_triangle {
	public static void main(String[] args) {
		/*
		 * 巩力 1)
		 * #
		 * ##
		 * ###
		 */
		
//		for(int i=0;i<3;i++) {
//			for(int j=0; j<3;j++) {
//				if(i>=j) {
//				System.out.print("#");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println("=========巩力=========");	
		/*
		 * 巩力 2)
		 * ###
		 * ##
		 * #
		 */
		
//		for(int i=0;i<3;i++) {
//			for(int j=0; j<3;j++) {
//				if(i<=j) {
//					System.out.print("#");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<3; i++) {
			for(int j = 2; j>=i;j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		System.out.println("=========巩力=========");	
		/*
		 * 巩力 3)
		 * @##
		 * @@#
		 * @@@
		 */
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				if(i>=j) {
//					System.out.print("@");
//				}else {
//					System.out.print("#");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}
			for(int k=2; k>i;k--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		

		System.out.println("=========巩力=========");	
		/*
		 * 巩力 4)
		 *   #
		 *  ###
		 * #####
		 */
//		int k = 2;
//		for(int i=0; i<3;i++) {
//			if(k>1) {
//				System.out.print("  ");
//				k-=1;
//			}
//			else if(k>0) {
//				System.out.print(" ");
//				k-=1;
//			}
//			for(int j=0;j<5;j++) {
//					if(i*2>=j) {
//						System.out.print("#");				
//					}
//					
//			}
//			System.out.println();
//		}
		int k = 0;
		for(int i=0; i<3; i++) {
			for(int j=2;j>i;j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<=k; j++	) {
				System.out.print("#");
			}
			System.out.println();
			k +=2;
		}
		

	}
}
