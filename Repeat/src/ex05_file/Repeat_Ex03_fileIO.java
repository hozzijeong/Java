package ex05_file;

import java.io.FileWriter;
import java.io.IOException;

public class Repeat_Ex03_fileIO {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		// ����ó�� ���̴� ������� ���ϰ� �������� �ο��� ����
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("���� �����ϱ� ��������");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}
}
