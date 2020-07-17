package ex;

import java.io.FileWriter;
import java.io.IOException;

class Test{
	static void callYourName() throws IOException {
		System.out.println("나 불렀어?");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		
		// Test.callYourName();
		
		// 파일쓰기 후, 프로젝트를 선택해 F5(Refresh)를 누른다.
		FileWriter fw = null;
		try {
			fw = new FileWriter("0211.txt");
			fw.write("자바 수업을 받고있어요.");
			
		} catch (IOException e) {
			e.printStackTrace();	// 에러 설명서
		} finally {
			// 에러발생 여부와 무관하게 무조건 실행할 코드
			if(fw != null) {try {fw.close();} catch (IOException e) {}}
		}
		
		
		
	}
}
