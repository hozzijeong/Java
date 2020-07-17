package day24;
class Client{
	String name;
	int score;
	void set_data(String n,int s) {
		this.name = n;
		this.score = s;
	}
	void print_data() {
		System.out.println(this.name+":"+this.score);
	}
}
public class Day24_Ex06_class_array02 {
	public static void main(String[] args) {
		Client[] st = new Client[3];
		for(int i=0; i<st.length;i++) {
			st[i] = new Client();
		}
		
		st[0].set_data("±èÃ¶¼ö", 100);
		st[1].set_data("ÀÌ¸¸¼ö", 70);	
		st[2].set_data("¹Ú¿µÈñ", 10);
		
		for(int i=0; i<st.length;i++) {
			st[i].print_data();
		}
	}
}
