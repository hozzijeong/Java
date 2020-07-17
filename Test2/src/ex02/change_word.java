package ex02;
import java.util.Scanner;

public class change_word {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short";
		System.out.println(text);
		
		System.out.println("변경하고 싶은 단어 입력:");
		String change_word = scan.next();
		
		char[] arr = new char[text.length()];
		for(int i=0; i<arr.length; i++	) {
			arr[i] = text.charAt(i);
		}
		
		int size = change_word.length();
		
		int check = -1;
		int start_idx = -1;
		for(int i=0; i<arr.length-size+1; i++) {
			int count = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j] == change_word.charAt(j)) {
					count++;
				}
			}
			
			if(count == size) {
				start_idx = i;
				check =1;
			}
		}
		
		
		if(check == 1) {
			System.out.println("바꿀 단어 입력:"	);
			String word = scan.next();
			
			String temp1 = text.substring(0,start_idx);
			String temp2 = text.substring(start_idx+size);
			
			text = temp1+word+temp2;
			System.out.println(text);
			
		}else {
			System.out.println("해당 단어는 존재하지 않습니다.");
		}

	}

}
