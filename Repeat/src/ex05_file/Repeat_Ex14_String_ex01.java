package ex05_file;
/*
 * 100001/�̸���/600
 * 100003/���缮/7000
 * 100001/�̸���/100
 * 100002/�̿���/400
 * 100001/�̸���/600
 * 100004/�ڸ��/900
 * 100001/�̸���/130
 * 100003/���缮/200
 * 100002/�̿���/700
 * 100002/�̿���/900
 * 100004/�ڸ��/800
 */

public class Repeat_Ex14_String_ex01 {
	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		
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
		
		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
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
