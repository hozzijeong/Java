package score;

public class ScoreTest {
	public static void main(String[] args) {
		scoreList scoreList = new scoreList();
		
		scoreList.addScore(new ScoreVo("ȫ�浿",100,100,99));
		scoreList.addScore(new ScoreVo("�蹫��",88,55,79));
		scoreList.addScore(new ScoreVo("�ż���",17,45,99));
		scoreList.addScore(new ScoreVo("�漺��",71,95,55));
		scoreList.addScore(new ScoreVo("�輳��",18,00,19));
		
		System.out.println(scoreList);
	}
}
