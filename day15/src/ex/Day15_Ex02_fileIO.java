package ex;

import java.io.FileWriter;
import java.io.IOException;

public class Day15_Ex02_fileIO {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		
		FileWriter fw = null;
		// 파일을 생성
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
