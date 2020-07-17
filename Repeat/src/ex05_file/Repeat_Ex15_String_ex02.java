package ex05_file;

public class Repeat_Ex15_String_ex02 {
	public static void main(String[] args) {
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0 , data.length()-1); // 마지막 글삭제 
		System.out.println(data);
		System.out.println("=====================");
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");
		
		// 문제1) 위 데이터 는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
		//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
		/*
		  =====================
			10001 김철수 2670
			10002 이영희 1950
			10003 유재석 4080
			10004 박명수 7130
		   =====================		  
		 */
		
		int []num = new int [totalSize];
		String []name = new String [totalSize];
		int count = 0;
	for(int i=0; i<totalSize; i++) {
		int check = 0;
		for(int j=0; j<i; j++) {
			if(num[j] == numList[i]) {
				check = 1;
			}
		}
		if(check ==0	) {
			num[count] = numList[i];
			name[count] = nameList[i];
			count +=1;
		}
	}
	
	int [] price = new int [totalSize];
	for(int i=0; i<totalSize; i++) {
		for(int j=0; j<count; j++) {
			if(num[j] == numList[i]) {
				price[j] += priceList[i];
			}
		}
	}
	
	for(int i=0; i<count; i++) {
		System.out.println(num[i]+"/"+name[i]+"/"+price[i]);
	}
		
	}
}
