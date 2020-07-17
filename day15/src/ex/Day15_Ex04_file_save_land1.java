package ex;

import java.io.FileWriter;
import java.io.IOException;

public class Day15_Ex04_file_save_land1 {
	public static void main(String[] args) {
		
		String[] names = {"±èÃ¶¼ö", "ÀÌ¸¸¼ö", "ÀÌ¿µÈñ"};
		int[]     ages = {	   20,     30,     40};
		FileWriter fw = null;
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		
		for(int i=0; i<names.length;i++) {
			data+= names[i] + "/" + ages[i];
			if(i != names.length-1) {
				data+=",";
			}
		}
				
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
		
		

	}
}
