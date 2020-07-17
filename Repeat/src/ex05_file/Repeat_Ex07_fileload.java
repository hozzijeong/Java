package ex05_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Repeat_Ex07_fileload {
	public static void main(String[] args) {
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		String data = "";
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				while(true) {
					String line = br.readLine();
					if(line == null) {
						break;
					}
					data += line;
					data += "\n";
				}
				data = data.substring(0,data.length()-1);
				
				String[] temp = data.split("\n");
				
				ids = new String[temp.length];
				pws = new String[temp.length];
				moneys = new int[temp.length];
				
				for(int i=0; i<temp.length;i++) {
					String[] info = temp[i].split("/");
					ids[i] = info[0];
					pws[i] = info[1];
					moneys[i] += Integer.parseInt(info[2]);
				}
				for(int i=0; i<3;i++) {
					System.out.println(ids[i]+":"+pws[i]+"->"+moneys[i]);
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
