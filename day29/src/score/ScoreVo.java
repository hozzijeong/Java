package score;

public class ScoreVo {
	public static int count; // 객체가 생성될 때  마다 자동으로 1씩 증가	
	private int no; // 번호, 자동 증가
	private String name; //이름
	private int java; // 점수
	private int jsp; // 점수
	private int spring; // 점수
	private int total;
	private double average;
	private int rank = 1; // 석차, 석차를 계산할 기억 장소의 초기치는 무조건 1로 설정한다.

	public ScoreVo() {}
	public ScoreVo(String name, int java, int jsp, int spring) {
		no = ++count;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		
		total = java+jsp+spring;
		average = (double)total/3;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return String.format("%d %s %3d %3d %3d %3d %6.2f %d",no,name,java,jsp,spring, total, average,rank);
	}

}
