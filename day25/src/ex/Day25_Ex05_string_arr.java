package ex;
class Student1{
	String name;
	int score;
}
public class Day25_Ex05_string_arr {
	public static void main(String[] args) {
		String data = "3\n";
		data += "김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		

		Student1[] st = new Student1[3];
		
		for(int i=0; i<st.length;i++) {
			st[i] = new Student1();
		}
		
		// data에 있는 내용들을 잘라서 st에 저장후 출력.
		
		String [] temp = data.split("\n");
		
		int k=1;
		
		for(int i=0; i<st.length;i++) {
			String [] info = temp[k].split("/");
			st[i].name = info[0];
			st[i].score = Integer.parseInt(info[1]);
			k+=1;
		}
		
		for(int i=0; i<st.length;i++) {
			System.out.println(st[i].name+":"+st[i].score);
		}
		
		// 꼴등 삭제후 다시 data에 저장
		System.out.println();
		System.out.println();
		
		int min = st[0].score;
		int minIdx = 0;
		
		for(int i=0; i<st.length;i++) {
			if(min > st[i].score) {
				min = st[i].score;
				minIdx = i;
			}
		}
		
		Student1[] temp1 = st;
		
		st = new Student1[2];
		
		st[0] = new Student1();
		st[1] = new Student1();
		int j=0; 
		for(int i=0; i<3;i++) {
			if(i != minIdx) {
				st[j] = temp1[i];
				j+=1;
			}
		}
		
		for(int i=0; i<st.length;i++) {
			System.out.println(st[i].name+":"+st[i].score);
		}
		
		data = st.length+""+"\n";
		data += st[0].name + "/" + st[0].score+"" + "\n";
		data += st[1].name + "/" + st[1].score+"";
		
		System.out.println(data);
		
		
	}
}
