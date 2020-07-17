package score;

import java.util.ArrayList;

public class scoreList {
	private ArrayList<ScoreVo> scoreList = new ArrayList<>();

	public ArrayList<ScoreVo> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<ScoreVo> scoreList) {
		this.scoreList = scoreList;
	}
	
	public String toString() {
		String str = "";
		str += "======================================== \n";
		str += "¹øÈ£ ÀÌ¸§  java jsp sptring ÃÑÁ¡ Æò±Õ ¼®Â÷  \n";
		str += "======================================== \n";
		
		for(int i=0; i<scoreList.size(); i++) {
			for(int j= i+1; j<scoreList.size(); j++) {
				if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
					scoreList.get(j).setRank(scoreList.get(j).getRank()+1);
				}
				if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
					scoreList.get(i).setRank(scoreList.get(i).getRank()+1);
				}
			}
		}
		for(ScoreVo vo:scoreList) {
			str+= vo+"\n";
		}
		str += "======================================== \n";
		
		return str;
	}
	
	public void addScore(ScoreVo vo) {
		scoreList.add(vo);
	}
	
}
