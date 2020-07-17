package ex;

import java.util.ArrayList;

class Member{
	private int custno;
	private String custname;
	private String phone;
	private String adress;
	private String joindata;
	private String grade;
	private String city;
	public Member() {};
	public Member(int custno,String custname,String phone, String adress, String joindate, String grade, String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.adress = adress;
		this.joindata = joindate;
		this.grade = grade;
		this.city = city;
	}
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
}

class Money{
	int custno;
	int saleno;
	int pcost;
	int amount;
	int price;
	String pcode;
	String sdata;
	public Money() {}
	
	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdata = sdate;
	}
}
	
class Price {
	int custno;
	String custname;
	int total;
	
	public Price(int custno,String custname,int total) {
		this.custno = custno;
		this.custname = custname;
		this .total = total;
	}
}
class Manager{
	ArrayList<Member>memberList = new ArrayList<>();
	ArrayList<Money>moneyList = new ArrayList<>();
	ArrayList<Price>priceList = new ArrayList<>();
	
	void init() {
		
		memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));
		
		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));
	}
}

public class Day27_Ex02_Test01 {
	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.init();
		
		for(int i=0; i<mg.memberList.size();i++) {
			int check = -1;
			for(int j=0 ; j<mg.moneyList.size();j++) {
				if(mg.memberList.get(i).getCustno() == mg.moneyList.get(j).custno) {
					if(check ==-1) {
						mg.priceList.add(new Price(mg.memberList.get(i).getCustno(),mg.memberList.get(i).getCustname(),mg.moneyList.get(j).price));
						check = i;
					}else {
						mg.priceList.get(i).total += mg.moneyList.get(j).price;
					}
				}
			}
		}
		//값이 큰 순서대로 정렬!
		
		int size = mg.priceList.size();
		for(int i=0; i<size;i++) {
			Price p1 = mg.priceList.get(i);
			for(int j=0; j<size; j++) {
				Price p2 = mg.priceList.get(j);
				if(p1.total > p2.total) {
					Price temp = mg.priceList.get(i);
					mg.priceList.set(i,mg.priceList.get(j));
					mg.priceList.set(j, temp);
				}
			}
		}
		
		for(int i=0; i<mg.priceList.size();i++) {
			System.out.println(mg.priceList.get(i).custno+" "+mg.priceList.get(i).custname + " "+mg.priceList.get(i).total);
			System.out.println("----------------");
		}
//		for(Price i:mg.priceList) {
//			System.out.println(i.custname+" "+ );
//			System.out.println("---------------");
//		}
	}
}
