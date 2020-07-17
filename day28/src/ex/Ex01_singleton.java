package ex;

/*
 * # 싱글톤(singleton) 패턴
 * 
 * 
 */

class FileManager {
	// 1. 생성자의 접근제어자 private으로 변경한다.
	private FileManager() {}
	
	// 2. 클래스를 자체적으로 메모리에 올린다.
	private static FileManager fileManager = new FileManager();
	
	// 3. 자체적으로 생산한 메모리를 돌려받을 수 있는 get메서드를 작성한다.
	public static FileManager getInstance() { return fileManager; }
	
	// 클래스 자체를 겹겹이 싸놓는 느낌 
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
