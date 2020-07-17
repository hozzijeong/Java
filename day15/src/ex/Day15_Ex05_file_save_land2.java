package ex;

import java.io.FileWriter;
import java.io.IOException;

public class Day15_Ex05_file_save_land2 {
	public static void main(String[] args) {
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		
		String data = "";
		
		FileWriter fw = null;
		
		for(int i=0; i<names.length;i++) {
			data += names[i] +"/" + pws[i] +"/"+moneys[i];
			if(i!= names.length-1) {
				data+="\n";
			}
		}
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
		
		
	}
}
