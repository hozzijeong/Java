package ex;

import java.util.Scanner;

/*
 * # ������ ����ϱ� : Ŭ���� + ����
 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
 * 
 * 	������ġ
 *----------------------
 *ITEM	QTY	AMT
 *ġ�����	1	2500
 *�Ұ�����	1	3800
 *����Ƣ��	1	1500
 *��      ��	1	1000
 *----------------------
 *�հ�ݾ�		8800
 *�����ݾ�		10000
 *----------------------
 *��       ��		1200
 */
class Ex10{
	String name = "";
	
	int[] arPrice = {2500, 3800, 1500, 1000};
	String[] arMenu = {"ġ�����","�Ұ�� ����","����Ƣ��","�ݶ�"};
	
	int[] arCount = new int [4];
	
	int  total = 0;
}

public class Day22_Ex11_Recept {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex10 e = new Ex10();
		
		while(true) {
			System.out.println("�١ڡ١ڡ١ڡ١ڸ�����ġ�١ڡ١ڡ١ڡ١�");
			for(int i=0; i<e.arCount.length;i++) {
				System.out.println(e.arMenu+ ":" +e.arPrice[i]);
			}
		
		
		}
		
	}
}
