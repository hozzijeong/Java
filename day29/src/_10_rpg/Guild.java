package _10_rpg;

import java.util.ArrayList;

public class Guild {
	final int PARTY_SIZE = 4;
	// 싱글턴 패턴을 arrayList에도 적용이 가능한가? -> 클래스에만 적용 가능한것,,, 
	// 
	ArrayList<Unit> guildList = new ArrayList<>();
	Unit [] partyList; // arrayList를 설정하지 않은 이유는, 최대 인원수가 4명이기 때문
	public void setGuild() {
		Unit temp = new Unit("호랑이", 1, 100, 10, 5, 0);
		guildList.add(temp);
		temp = new Unit("강아지", 1, 80, 7, 3, 0);
		guildList.add(temp);
		temp = new Unit("사슴", 1, 50, 3, 1, 0);
		guildList.add(temp);
		temp = new Unit("두더지", 1, 70, 5, 2, 0);
		guildList.add(temp);
		temp = new Unit("돼지", 1, 200, 4, 8, 0);
		guildList.add(temp);
		temp = new Unit("사자", 1, 120, 11, 7, 0);
		guildList.add(temp);
		for (int i = 0; i < 4; i++) {
			guildList.get(i).party = true;
		} // 첫번째 부터 4번째 까지 파티 가입. 
		partyList = new Unit[PARTY_SIZE]; // 클래스 배열 따로 만듦. 
		int n = 0;
		for(int i = 0; i < guildList.size(); i++) {
			if(guildList.get(i).party == true) {
				partyList[n] = guildList.get(i);
				n += 1; // 파티 여부가 true이면, partyList에 추가 .
			}
		}	
	}
	public Unit getGuildUnit(int num) {
		return guildList.get(num); // num번째 길드원의 Unit정보를 보여줌
	}
	public void printAllUnitStaus() {
		System.out.println("======================================");
		System.out.println("[골드 : " + Player.money + "]");
		System.out.println("============= [길드원] =================");
		for (int i = 0; i < guildList.size(); i++) {
			System.out.print("[" + (i + 1) + "번]");
			System.out.print(" [이름 : " + guildList.get(i).name + "]");
			System.out.print(" [레벨 : " + guildList.get(i).level + "]");
			System.out.print(" [체력 : " + guildList.get(i).hp);
			System.out.println(" / " + guildList.get(i).maxHp + "]");
			System.out.print("[공격력 : " + guildList.get(i).att + "]");
			System.out.print(" [방어력 : " + guildList.get(i).def + "]");
			System.out.println(" [파티중 : " + guildList.get(i).party + "]");
			System.out.println("");
		}
		System.out.println("=================================");
	} // 길드원 스탯 보여줌 
	public void printUnitStaus(int num) {
		guildList.get(num).printStatus(); // num번째 길드원 스탯 print
	}
	public void printUnitItem(int num) {
		guildList.get(num).printEquitedItem(); // num번째 길드원 아이템 print
	}
	public void buyUnit() {
		if (Player.money < 5000)
			return;
		String[] n1 = { "박", "이", "김", "최", "유", "지", "오"};
		String[] n2 = { "명", "기", "종", "민", "재", "석", "광"};
		String[] n3 = { "수", "자", "민", "수", "석", "민", "철"};

		String name = n1[MainGame.ran.nextInt(n1.length)];
		name += n2[MainGame.ran.nextInt(n1.length)];
		name += n3[MainGame.ran.nextInt(n1.length)];
		int ran = MainGame.ran.nextInt(8) + 2;
		int hp = ran * 11;
		int att = ran + 1;
		int def = ran / 2 + 1;
		Unit temp = new Unit(name, 1, hp, att, def, 0);

		System.out.println("=====================================");
		System.out.print("[이름 : " + name + "]");
		System.out.print(" [레벨 : " + 1 + "]");
		System.out.print(" [체력 : " + hp);
		System.out.println(" / " + hp + "]");
		System.out.print("[공격력 : " + att + "]");
		System.out.println(" [방어력 : " + def + "]");
		System.out.println("길드원을 추가합니다.");
		System.out.println("=====================================");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		guildList.add(temp);
		Player.money -= 5000;
	}

	public void removeUnit() {
		printAllUnitStaus();
		System.out.println("삭제할 번호를 입력하세요 ");
		int sel = MainGame.scan.nextInt();
		if (guildList.get(sel - 1).party) {
			System.out.println("파티중인 멤버는 삭제할수 없습니다.");
		} else {
			System.out.println("=================================");
			System.out.print("[이름 : " + guildList.get(sel - 1).name + "]");
			System.out.println("길드원을 삭제합니다.");
			System.out.println("=================================");
			guildList.remove(sel - 1);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	public void printParty() {
		System.out.println("================ [파티원] ===============");
		for(int i = 0; i < PARTY_SIZE; i++) {
			System.out.print("[" + (i + 1) + "번]");
			System.out.print(" [이름 : " + partyList[i].name + "]");
			System.out.print(" [레벨 : " + partyList[i].level + "]");
			System.out.print(" [체력 : " + partyList[i].hp);
			System.out.println(" / " + partyList[i].maxHp + "]");
			System.out.print("[공격력 : " + partyList[i].att + "]");
			System.out.print(" [방어력 : " + partyList[i].def + "]");
			System.out.println(" [파티중 : " + guildList.get(i).party + "]");
			System.out.println("");	
		}
		System.out.println("=====================================");
	}
	
	public void partyChange() {
		
		printParty();
		System.out.println("교체할 번호를 입력하세요 ");
		int partyNum = MainGame.scan.nextInt();//4
		printAllUnitStaus(); 
		System.out.println("참가할 번호를 입력하세요 ");
		int guildNum = MainGame.scan.nextInt();//8
		
		partyList[partyNum - 1].party = false; // 3번째 = false
		guildList.get(guildNum - 1).party = true; // 7번째 = true
		
		System.out.println("====================================");
		System.out.print("[이름 : " + partyList[partyNum - 1].name + "]");
		System.out.print("에서 ");
		System.out.print("[이름 : " + guildList.get(guildNum - 1).name + "]");
		System.out.println("으로 교체 합니다. ");
		System.out.println("====================================");
		
		int n = 0;
		for(int i = 0; i < guildList.size(); i++) { // size = 8
			if(guildList.get(i).party) {
				System.out.println(guildList.get(i).name);
				partyList[n] = guildList.get(i); 
				n += 1;
			} // 다시한번 파티원 초기화 
		}		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public void sortUnit() {
		for(int i=0; i<guildList.size(); i++) {
			Unit s1 = guildList.get(i);
			for(int j=0; j<guildList.size();j++) {
				Unit s2 = guildList.get(j);
				if(s1.name.compareTo(s2.name)<0) {
					Unit temp = guildList.get(i);
					guildList.set(i, guildList.get(j));
					guildList.set(j,temp);
				}
			}
		}
	}
	
	public void guildMenu() {
		while (true) {
			System.out.println("=============== [길드관리] ================");
			System.out.println("[1.길드목록] [2.길드원추가] [3.길드원삭제]\n"
					+ "[4.파티원교체] [5.정렬]  [0.뒤로가기]");
			int sel = MainGame.scan.nextInt();
			if (sel == 1) {
				printAllUnitStaus();
			} else if (sel == 2) {
				buyUnit();
			} else if (sel == 3) {
				removeUnit();
			} 
			else if (sel == 4) {
				partyChange();
			}else if(sel ==5) {
				sortUnit();
			}
			else if(sel == 0){
				break;
			}
		}
	}

}
