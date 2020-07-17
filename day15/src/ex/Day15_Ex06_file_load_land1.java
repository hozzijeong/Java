package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day15_Ex06_file_load_land1 {
	public static void main(String[] args) {
		/* 1. 해당 파일 찾기
		 * 2. 해당  파일을 찾아서... 데이터 값을 
		 * 3. ids pws moneys에 다시 집어 넣기!
		 *
		 */
		
		
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
	
		
	
		String fileName = "fileTest02.txt";
		File file = new File(fileName);
		// 파일의  존재 유무를 확인하는 메서드
		
		FileReader fr = null;
		// 파일의 위치를 찾는 메서드
		BufferedReader br = null;
		// 파일의 데이터를 불러내는 메서드
		
		String[] data = new String[3];
		
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				for(int i=0; i<data.length;i++) {
					data[i] = br.readLine();
				}
				
				ids = new String[data.length];
				pws = new String[data.length];
				moneys = new int[data.length];
				

				for(int i=0; i<data.length;i++) {
					String[] temp = data[i].split("/");
					ids[i] = temp[0];
					pws[i] = temp[1];
					moneys[i] = Integer.parseInt(temp[2]);
				}
				
				for(int i=0; i<data.length;i++) {
					System.out.println(ids[i]+":"+pws[i]+":"+moneys[i]);
				}
								
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
				try {br.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		
	
		
		
		
		
		
	
		
		
		
		

	}
}
