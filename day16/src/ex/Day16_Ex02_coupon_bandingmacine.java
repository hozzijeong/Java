package ex;

//�ı� ���Ǳ� ���α׷� 		
//1) ������   2) ����� 
//������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
//����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
//      2)�ڷΰ���
//���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7����� 
//ȭ�� 
//�ı� ���� : 3200�� 
//�ı� 	  : ??��  (������ ����) 
//50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
//1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 

import java.util.Scanner;

public class Day16_Ex02_coupon_bandingmacine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] money  = {50000, 10000, 5000, 1000, 500, 100};
		int[] charge = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		
		
		
		
		
		while(true) {
			System.out.println("[1]������");
			System.out.println("[2]�����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if(sel == 1) {
				while(true) {
					System.out.println("�ı� ����:" + price+"��");
					System.out.println("�ı�:" + tickets+"��");
					for(int i=0; i<money.length;i++) {
						System.out.print(money[i]+"�� :"+charge[i]+"��\t");
						if(i ==2) {
							System.out.println("");
						}
					}
					int total = 0;
					for(int i=0; i<money.length;i++) {
						total+=(money[i] * charge[i]);
					}
					System.out.println();
					System.out.println("�� �ݾ�:"+total+"��");
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("������ �ı� ������ �Է��ϼ���:");
						int count = scan.nextInt();
						tickets += count;
						System.out.printf("�ı� %d�� �����Ǿ����ϴ�.",count);
						System.out.println();
					}
					else if(choice == 2) {
						
						System.out.println("�����ݾ��� �Է��ϼ���");
						int plus = scan.nextInt();
						int sum = 0;
						
						while(true) {
							System.out.print("���� ����");
							System.out.println();
							for(int i=0; i<money.length;i++) {
								System.out.println("["+(i+1)+"]"+money[i]);
							}
							
							int bill = scan.nextInt();
							System.out.print("���� ����:");
							int per = scan.nextInt();
							
							if(money[bill-1]*per > plus) {
								System.out.println("�����ݾ��� �ʰ��߽��ϴ�");
								break;
							}
							System.out.println();

							if(bill == 1) {
								charge[bill-1] +=per;
							}else if(bill ==2) {
								charge[bill-1] +=per;								
							}else if(bill ==3) {
								charge[bill-1] +=per;
							}else if(bill ==4) {
								charge[bill-1] +=per;
							}else if(bill ==5) {
								charge[bill-1] +=per;
							}else if(bill ==6) {
								charge[bill-1] +=per;
							}
							
							sum += (money[bill-1] * per);
							
							if(sum == plus) {
								System.out.printf("%d�� ���� �Ϸ�",plus);
								System.out.println();
								break;
							}
							
						}
					}
					else if(choice == 3) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("�ı� ����:" + price+"��");
					System.out.println("�ı�:" + tickets+"��");
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("���� �ż� �Է�:");
						int buyticket = scan.nextInt();
						System.out.println("�Ա� �ݾ� �Է�:");
						int inputMoney = scan.nextInt();
						
						
						int change = inputMoney -(buyticket*3200);
						 // �Ž����� change!
						
						if(change>=0 && tickets - buyticket>=0) {
						 
							int temp = change;
							int idx=0;
							int check = -1;
							int [] check_charge = new int[charge.length];
							/*
						  *  �Ա� �ݾ��� �������� �ʰ�, �ı� ������ ����� ��,
						  *  
						  *  1. �Ž����� Ȯ��
						  *  2. �Ž����� ����
						  *  	2-1 �Ž����������� ��, charge�� ���� ���� Ȯ��
						  *  		2-1-1 ���� ������ �����ϴٸ� �� ���� ���� ���󰳼� Ȯ��
						  *  
						  *  ��, ������ ���� ���Ѵ�
						  *  	=> ��ŭ�� ���� �ִ��� Ȯ���Ѵ�.
						  *  	[1] �ִ�. [2] ����.
						  *  1. ��ŭ�� ���� charge ���� ����, �������� �Ȱ��� �Ѵ�.
						  *  
						  *  2. �ִ� ���� ��ŭ�̶� ���� ���� �� �������� ����� �Ѿ��
						  *  
						  *  �ٽ� ������ => ���� ���Ѵ� => ��ŭ�� ���� �ִ��� Ȯ���Ѵ�.
						  *  => ������ �����µ� ���� �ȸ´´� => �ܵ� ���� ���  
						  * 
						  */
							
							
							for(int i=0; i<money.length;i++) {
								if(temp/money[i]>0) {
									idx = i;					
									break;
								}
							}
							
							while(idx<money.length) {
								if(charge[idx] >= temp/money[idx]) {
									charge[idx] -= temp/money[idx];
									check_charge[idx] += temp/money[idx];
									temp = temp%money[idx];
								}else if(charge[idx] < temp/money[idx]) {
									int a = charge[idx]*money[idx];
									check_charge[idx] += charge[idx];
									charge[idx] = 0;
									temp -= a;
								}
								idx+=1;
								if(temp == 0) {
									check = 1;
									break;
								}
							}
							if (check ==1) {
								tickets -= buyticket;
								System.out.printf("�Ž����� %d��,�ı� ���� �Ϸ�!",change);
								System.out.println();
							}else {
								System.out.println("�ܵ� ����...");
							}
						}else {
							if(change<0) {
								System.out.println("�Ա� �ݾ��� �����մϴ�");
								continue;
							}else if(tickets - buyticket<0) {
								System.out.println("�ı��� �����մϴ�");
								continue;
							}
						}
					}else if(choice == 2) {
						break;
					}
				}
			}
		}


		
	}
}
