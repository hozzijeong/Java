package ex02;

public class StageLobby extends Stage {
	@Override
	public boolean update() {
		System.out.println("======[LOBBY]======");
		System.out.println("[1.����] [2.����]");
		int sel = GameManager.scan.nextInt();
		
		if(sel ==1) {
			GameManager.nextStage = "BATTLE";
		}else if(sel ==2) {
			GameManager.nextStage = "";
		}else {
			GameManager.nextStage = "";
		}
		return false;
	}
	
	@Override
	public void init() {}
}
