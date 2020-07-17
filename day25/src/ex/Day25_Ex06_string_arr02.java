package ex;
class Test{
	int num;
	int size;
	char [] data;
	void print() {
		System.out.println("num = "+num);
		System.out.print("size:" + size +"->");
		for(int i=0; i<size; i++) {
			System.out.print( data[i] + " ");
		}
		System.out.println();
	}
}
public class Day25_Ex06_string_arr02 {
	public static void main(String[] args) {
		String data = "6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	
		
		String [] temp = data.split("\n");
		
		int size = Integer.parseInt(temp[0]);
		 // data의 정보를 클래스배열에 저장.

		Test[] t = new Test[size];
		
		for(int i=0; i<size; i++) {
			t[i] = new Test();
		}
		
		for(int i=0; i<size;i++) {
			String [] info = temp[i+1].split("/");
			t[i].num = Integer.parseInt(info[0]);
			t[i].size = Integer.parseInt(info[1]);
			
			t[i].data = new char [t[i].size];
			
			for(int j=0; j<t[i].size; j++) {
				t[i].data[j] = info[j+2].charAt(0);
			}
		}
		for(int i=0; i<t.length;i++	) {
			t[i].print();
		}
		
		
	}
	
}

