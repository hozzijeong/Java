package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day15_Ex03_fileload {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		
		// File 클래스 : 해당 파일의 존재 유무
		File file = new File(fileName);
		// 실제 해당 파일 위치를 찾아감
		FileReader fr = null;
		// 그 메모장을 열어서 실제 텍스트를 긁어옴
		BufferedReader br = null;
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String data = br.readLine(); // 한줄 읽어오기
				System.out.println(data);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		
		
		
		
	}
}
