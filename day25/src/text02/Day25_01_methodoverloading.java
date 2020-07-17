package text02;
class Mobile{
	String name;
	int price;
	String maker;
	void init() {
		name = ""; price = 0; maker = "";
	}
	void init(String na,int pr) {
		name = na; price = pr; maker = "";
	}
	void init(String na,int pr,String ma	) {
		name = na; price = pr; maker = ma;
	}
	void init(String na, String ma) {
		name = na; maker = ma; price = 0;
	}
	void init(int pr, String na) {
		name = na; price = pr; maker = "";
	}
}
public class Day25_01_methodoverloading {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		
		m.init();
		m.init("¾ÆÀÌÆù", 1350000, "apple");
		m.init(10000, "»ï¼º");
	}
}
