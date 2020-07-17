package ex05_file;

import java.io.FileWriter;
import java.io.IOException;

public class Repeat_Ex05_filesave {
	public static void main(String[] args) {
		String[] names = {"±èÃ¶¼ö","ÀÌ¸¸¼ö","ÀÌ¿µÈñ"};
		
		int [] ages = {20,30,40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		for(int i=0; i<names.length;i++) {
			data+= names[i] + "/"+ ages[i];
			if(i != names.length -1) {
				data+= ",";
			}
		}
		
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			
			fw.write(data);
		}catch(Exception e)	{
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
		
		
		
	}
}
