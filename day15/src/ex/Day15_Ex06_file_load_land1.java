package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day15_Ex06_file_load_land1 {
	public static void main(String[] args) {
		/* 1. �ش� ���� ã��
		 * 2. �ش�  ������ ã�Ƽ�... ������ ���� 
		 * 3. ids pws moneys�� �ٽ� ���� �ֱ�!
		 *
		 */
		
		
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
	
		
	
		String fileName = "fileTest02.txt";
		File file = new File(fileName);
		// ������  ���� ������ Ȯ���ϴ� �޼���
		
		FileReader fr = null;
		// ������ ��ġ�� ã�� �޼���
		BufferedReader br = null;
		// ������ �����͸� �ҷ����� �޼���
		
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
