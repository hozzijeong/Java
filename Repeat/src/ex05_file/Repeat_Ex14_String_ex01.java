package ex05_file;
/*
 * 100001/이만수/600
 * 100003/유재석/7000
 * 100001/이만수/100
 * 100002/이영희/400
 * 100001/이만수/600
 * 100004/박명수/900
 * 100001/이만수/130
 * 100003/유재석/200
 * 100002/이영희/700
 * 100002/이영희/900
 * 100004/박명수/800
 */

public class Repeat_Ex14_String_ex01 {
	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		// 문제) moneyData 와 nameData 를 조합해서 아래와같이 만들어보세요
		String userData = "";
		
		String [] temp = nameData.split("\n");
		String [][] name_board = new String [temp.length][2];
		
		for(int i=0; i<temp.length;i++) {
			String[] info = temp[i].split("/");
			name_board[i][0] = info[0];
			name_board[i][1] = info[1];
		}
		
		temp = moneyData.split("\n");
		String [][] money_board = new String[temp.length][2];
		for(int i=0; i<temp.length;i++) {
			String []info = temp[i].split("/");
			money_board[i][0] = info[0];
			money_board[i][1] = info[1];
		}
		
		for(int i=0; i<money_board.length;i++) {
			for(int j=0; j<name_board.length;j++) {
				if(money_board[i][0].equals(name_board[j][0])) {
					userData += money_board[i][0] + "/" + name_board[j][1] + "/" + money_board[i][1] + "\n";
				}
			}
		}
		
		userData = userData.substring(0,userData.length()-1);
		
		System.out.println(userData);

	}
}
