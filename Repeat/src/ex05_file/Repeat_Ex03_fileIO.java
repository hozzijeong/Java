package ex05_file;

import java.io.FileWriter;
import java.io.IOException;

public class Repeat_Ex03_fileIO {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		// 예외처리 없이는 사용하지 못하게 강제성을 부여해 놓음
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("파일 저장하기 연습문제");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}
}
