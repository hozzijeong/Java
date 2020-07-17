package ex;


class FileManager{
	private FileManager() {}
	
	private static FileManager filemanager = new FileManager();
	
	public static FileManager getInstance() {return filemanager;}
}

public class Ex01 {
	public static void main(String[] args) {
		FileManager f1 = FileManager.getInstance();
		FileManager f2 = FileManager.getInstance();
		FileManager f3 = FileManager.getInstance();
			
		
		
	}
}
