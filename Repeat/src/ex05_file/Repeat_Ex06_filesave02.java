package ex05_file;

import java.io.FileWriter;
import java.io.IOException;

public class Repeat_Ex06_filesave02 {
	public static void main(String[] args) {
		String[] names = {"momk","megait","github"};
		String[] pws = {"1111","2222","3333"};
		int [] moneys = {20000,30000,40000};
		
		String fileName = "fileTest02.txt";
		
		String data = ""; 
		
		for(int i=0; i<names.length;i++	) {
			data+= names[i] + "/" + pws[i] + "/" +moneys[i];
			if(i != names.length-1) {
				data+= "\n";
			}
		}
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}

}
