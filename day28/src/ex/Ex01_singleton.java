package ex;

/*
 * # �̱���(singleton) ����
 * 
 * 
 */

class FileManager {
	// 1. �������� ���������� private���� �����Ѵ�.
	private FileManager() {}
	
	// 2. Ŭ������ ��ü������ �޸𸮿� �ø���.
	private static FileManager fileManager = new FileManager();
	
	// 3. ��ü������ ������ �޸𸮸� �������� �� �ִ� get�޼��带 �ۼ��Ѵ�.
	public static FileManager getInstance() { return fileManager; }
	
	// Ŭ���� ��ü�� ����� �γ��� ���� 
}

public class Ex01_singleton {
	public static void main(String[] args) {
		
		FileManager f1 = FileManager.getInstance();
		FileManager f2 = FileManager.getInstance();
		FileManager f3 = FileManager.getInstance();
		
		// FileManager.fileManager = new Person();

		//FileManager f1 = new FileManager();
		//FileManager f2 = new FileManager();
		//FileManager f3 = new FileManager();
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
	}
}
