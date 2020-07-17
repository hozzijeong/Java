package ex02;

public class MainGame {
	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		boolean run = true;
	
		while(true) {
			run = gameManager.changeStage();
			if(run == false) {
				break;
			}
		}
		System.out.println("게임 오버");
	}
}
