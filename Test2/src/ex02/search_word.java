package ex02;

import java.util.Scanner;



public class search_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too Short";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요: ");
		String word = scan.next();
		
		char[] arr = new char[text.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = text.charAt(i);
		}
		
		int check = -1;
		int size = word.length();
		for(int i=0; i<arr.length - size+1; i++ ) {
			int count = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count++;
				}
			}
			
			if(count == 1) {
				check = 1;
			}
		}
		
		if(check == -1) {
			System.out.println("거짓");
		}else {
			System.out.println("참");
		}
		
	
	}

}
