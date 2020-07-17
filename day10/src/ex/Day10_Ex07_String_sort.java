package ex;
/*
 * # 문자열[정렬]
 * 1. compareTo() 메서드
 * 2. 2개의 문자열을 비교해 int형 값을 반환하는 메서드
 * 3. A.compareTo(B)
 * 4. 결과
 * 		A와 B가 같으면						0
 *      A가 B보다 사전적으로 순서가 앞이면		음수
 *      A보다 B가 사전적으로 순서가 앞이면		양수
 *      집가서 해보기
 *      꼭해보기
 *      
 */


public class Day10_Ex07_String_sort {
	public static void main(String[] args) {
		
		
		String str1 = "가";			// 876			
		String str2 = "나";			// 877
		String str3 = "가";
		
				// "가".compareTo("나")		"가" - "나"
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		// 김유신 마동석 서동요 자바킹 홍길동 
//		int idx=0;
//		while(idx<names.length) {
//			int max = 0;
//			int maxIdx = 0;
//			for(int i=idx; i<names.length;i++) {
//				int str = names[idx].compareTo(names[i]);
//				if(str>=max) {
//					str = max;
//					maxIdx = i;
//				}
//			}
//			String temp = names[idx];
//			names[idx] = names[maxIdx];
//			names[maxIdx] = temp;
//			
//			
//			idx+=1;
//		}
		
		for(int i=0; i<names.length;i++) {
			String minName = names[i];
			int minIdx = i;
			for (int j = i; j<names.length;j++) {
				if(minName.compareTo(names[j])>0) {
					minName = names[j];
					minIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}
		
		
		
		
		
		
		for(int i=0; i<names.length;i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}
}
