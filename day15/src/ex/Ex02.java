package ex;

import java.io.FileWriter;
import java.io.IOException;

class Test{
	static void callYourName() throws IOException {
		System.out.println("�� �ҷ���?");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		
		// Test.callYourName();
		
		// ���Ͼ��� ��, ������Ʈ�� ������ F5(Refresh)�� ������.
		FileWriter fw = null;
		try {
			fw = new FileWriter("0211.txt");
			fw.write("�ڹ� ������ �ް��־��.");
			
		} catch (IOException e) {
			e.printStackTrace();	// ���� ����
		} finally {
			// �����߻� ���ο� �����ϰ� ������ ������ �ڵ�
			if(fw != null) {try {fw.close();} catch (IOException e) {}}
		}
		
		
		
	}
}
