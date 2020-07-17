package score;

public class ScoreTest {
	public static void main(String[] args) {
		scoreList scoreList = new scoreList();
		
		scoreList.addScore(new ScoreVo("È«±æµ¿",100,100,99));
		scoreList.addScore(new ScoreVo("±è¹«±è",88,55,79));
		scoreList.addScore(new ScoreVo("½Å¼³µ¿",17,45,99));
		scoreList.addScore(new ScoreVo("Èæ¼º±¸",71,95,55));
		scoreList.addScore(new ScoreVo("¹è¼³Áö",18,00,19));
		
		System.out.println(scoreList);
	}
}
