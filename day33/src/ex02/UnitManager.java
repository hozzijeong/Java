package ex02;

import java.util.ArrayList;
import java.util.Random;

public class UnitManager  {
	ArrayList<Player> player_list = new ArrayList<>();
	ArrayList<Unit> mon_list= new ArrayList<>();
	String path = "ex02.";
	String mons[] = {"UnitWolf","UnitOrc","UnitBat"};
	Random ran = new Random();
	
	public UnitManager() {
		player_list.add(new Player("����",1000,45));
		player_list.add(new Player("������",700,60));
		player_list.add(new Player("����",800,52));
	}

	void monster_rand_set(int size) {
		for(int i=0; i<size; i++) {
			int num = ran.nextInt(mons.length);
			try {
				//------------------------
				Class<?> clazz = Class.forName(path+mons[num]); // class ��η� �̵��ؼ�
				Object obj = clazz.newInstance(); // �� Ŭ������ ���ο� ��ü�� ������ ��, �װ��� obj�� �����Ѵ�.
				//-------------------------
				Unit temp = (Unit) obj; // �׷��� ������ object�� Unit���� ����ȯ �� ��,
				int hp = ran.nextInt(100)+100;
				int pw = ran.nextInt(10)+10;
				temp.init(hp, pw); // ü�°� �Ŀ��� �����ϰ�, monsterList�� �߰��Ѵ�. 
				mon_list.add(temp);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}


}
