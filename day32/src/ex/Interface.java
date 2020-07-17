package ex;
// 표시 인터페이스, 수리가 가능한 인터페이스 여기에 추가
interface Repairble{
	
}
// 치료가 가능한 인터페이스 여기 추가
interface Cureable{
	
}

class Unit {
	final int MAX_HP;
	int hp;
	final int MAX_MP;
	int mp;
	
	
	public Unit(int hp){
		MAX_HP = hp;
		MAX_MP = 0;
	}
	public Unit(int hp, int mp) {
		MAX_HP = hp;
		MAX_MP = mp;
	}
}

class GroundUnit extends Unit{
	public GroundUnit(int hp) {
		super(hp);
	}
	
	public GroundUnit(int hp, int mp) {
		super(hp,mp);
	}
}

class AirUnit extends Unit{
	public AirUnit (int hp) {
		super(hp);
	}
	public AirUnit (int hp,int mp) {
		super(hp,mp);
	}
}

class Tank extends GroundUnit implements Repairble{
	public Tank() {
		super(150);
		hp = MAX_HP;
		System.out.println("Tank의 현재 체력은 "+hp+"입니다.");
	}
	
	@Override
	public String toString() {
		return "Tank [hp ="+hp+"]";
	}
}

class Marine extends GroundUnit implements Cureable{
	public Marine() {
		super(75);
		hp = MAX_HP;
		System.out.println("Marine의 현재 체력은"+hp+"입니다.");
	}
	
	@Override
	public String toString() {
		return "Marine [hp ="+hp+"]";
	}
}

class SCV extends GroundUnit implements Repairble{
	public SCV() {
		super(100);
		hp = MAX_HP;
		System.out.println("SCV의 현재체력은 "+hp+"입니다.");
	}
	
	public void repair(Repairble repairble) {
		Unit unit = (Unit) repairble;
		while(unit.hp != MAX_HP) {
			unit.hp ++;
		}
		System.out.println(unit+"수리 완료");
		
	}
	
	@Override
	public String toString() {
		return "SCV [hp"+hp+"]";
	}
}

class Medic extends GroundUnit implements Cureable{
	public Medic(){
		super(100,50);
		mp = MAX_MP;
		hp = MAX_HP;
		
		
		System.out.println("Medic의 현재 체력/마나는 "+hp+"/"+mp+"입니다.");
	}
	
	public void cure (Cureable cureable, Medic medic) {
		Unit unit = (Unit) cureable;
		while(medic.mp != 0	) {
			if(unit.hp == MAX_HP) {
				break;
			}
			medic.mp --;
			unit.hp ++;
		}
		
		System.out.println(unit.hp+" 치료 완료/"+medic.mp+" 남음");
	}
	@Override
	public String toString() {
		return "Medic의 [hp/mp"+hp+"/"+mp+"]" ;
	}
}

class DropShip extends AirUnit implements Repairble{
	public DropShip() {
		super(200);
		hp = MAX_HP;
		
		System.out.println("DropShip의 현재 체력은"+hp+"입니다.");
	}
	
	public String toString() {
		return "DropShip의 [hp"+hp+"]";
	}
}

public class Interface {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		Medic medic = new Medic();
		SCV scv = new SCV();
		DropShip dropship = new DropShip();
		
		scv.repair(dropship);
		
		marine.hp = 1;
		medic.cure(marine, medic);
		
	}
}
