package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day15_Ex03_fileload {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		
		// File Ŭ���� : �ش� ������ ���� ����
		File file = new File(fileName);
		// ���� �ش� ���� ��ġ�� ã�ư�
		FileReader fr = null;
		// �� �޸����� ��� ���� �ؽ�Ʈ�� �ܾ��
		BufferedReader br = null;
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String data = br.readLine(); // ���� �о����
				System.out.println(data);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		
		
		
		
	}
}
