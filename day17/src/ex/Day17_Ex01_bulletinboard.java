package ex;
/*
 * # �ܼ� �Խ���
 * 1. �� ��ȣ
 * 2. �� ����
 * 3. �� ���� 
 * ------------------------
 * [1]���� -> ������ ����
 * [2]���� -> ������ ���� 
 * [3]�߰��ϱ�	-> ����� ������ �Է¹޾Ƽ� ��� 
 * [4]�����ϱ� -> �Խñ� ��ȣ�� ������ ����
 * [5]����Ȯ�� -> �Խñ� ��ȣ�� ������ ���� ���
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day17_Ex01_bulletinboard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String fileName = "board.txt";
		int count = 0;
		int page_count = 1; //�� �������� ����
		int page[][] = new int[page_count][6];
		/*
		 *  �������� ������ �迭
		 *  page[0][0] = 1 ; ������ number
		 *  page[1][0] = 2 ;
		 *  page[2][0] = 3 ;
		 *  page[3][0] = 4 ;
		 *  page[4][0] = 5 ;
		 *  �Ͱ��� �������� ǥ���� ����. 
		 *  �׸��� �� ������ [0][1] [0][2] ----> ������ ������ ä�� ����
		 *   
		 */
		if(count>0) {
			if(count%5 ==0) {
				page_count = count/5;
			}else {
				page_count = count/5+1;
			}
		}
		// page_count�� page�� ����
		
		int p = 0;
		int q = 0;
		
		while(p<page_count) {
			if(q+1<=count) {
				page[p][0] = page_count;
				page[p][q%5+1] = q;
				q+=1;
				if(q>5 && q%5 ==0) {
					p+=1;
				}
			}
		}
		// => [][] page�� ä��� ����.

		int idx = page_count;
		// �������� �̵��Ҷ� ����� ���� idx;
		
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		String[][] data = new String[count][2];
		
		
		/*
		 *  �� ��ȣ�� Ȯ���Ҷ��� data�� ��ġ�� Ȯ���Ұ�. 
		 *  data[][0] : �� ����
		 *  data[][1] : �� ����
		 *  
		 */
		
		while(true) {
				
			try {
				fw = new FileWriter(fileName);
				fw.write(data[count][0] + data[count][1]);
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {fw.close();} catch (IOException e) {e.printStackTrace();}
			}
			System.out.println("��ü �Խñ� ��:"+count);
			System.out.println("��ü �������� :"+page.length);
			System.out.println("���������� �Խù� ��: "+ 5);
			System.out.println("���� ������ ��ȣ:"+ page[idx][0]);
			System.out.println("���� �������� �� :");
			for(int i=1; i< page[idx].length-1; i++) {
				System.out.println(page[idx][i]);
			}
			
			
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");
			System.out.println("�޴� ����");
			int sel = scan.nextInt();
			
			
			if(sel ==1) {
				if(page_count ==1) {
					System.out.println("ù��° ������ �Դϴ�.");
				}else {
					idx-=1;
				}
				
			}
			else if(sel ==2) {
				if(idx+1 > page_count) {
					System.out.println("������ �������Դϴ�.");
				}else {
					idx+=1;
				}
				
			}
			else if(sel ==3) {
					if(count == 0) {
						data = new String[count+1][2];
						System.out.print("���� �Է�:");
						String title = scan.next();
						
						System.out.print("���� �Է�:");
						String contents = scan.next();
						
						
						data[count][0] = title;
						data[count][1] = contents;
						System.out.println();
						
						count+=1;
					}else if(count>0) {
						
						String[][]temp = data;
						data = new String[count+1][2];
						
						for(int i=0; i<count; i++) {
							data[i][0] = temp[i][0];
							data[i][1] = temp[i][1];
						}
						
						temp = null;
						
						System.out.print("���� �Է�:");
						String title = scan.next();
						
						System.out.print("���� �Է�:");
						String contents = scan.next();
						
						
						data[count-1][0] = title;
						data[count-1][1] = contents;
						
						System.out.println();
						
						count+=1;
					}
			}
			else if(sel ==4) {
					if(count ==1) {
						data = null;
						count-=1;
					}else if(count >1) {
						System.out.print("������ ��ȣ �Է�:");
						int delIdx = scan.nextInt();
						
						if(delIdx -1<count && delIdx <0) {
							System.out.println("�ش� ��ȣ�� ���� ������ �� �����ϴ�.");
							break;
						}
						
						String [][] temp =data;
						data = new String[count-1][2];
						
						for(int i=0; i<delIdx;i++) {
							data[i][0] = temp[i][0];
							data[i][1] = temp[i][1];
						}
						for(int i = delIdx; i<count-1;i++) {
							data[i][0] = temp[i+1][0];
							data[i][1] = temp[i+1][1];
						}
						
						count -=1;
					}
			}
			else if(sel ==5) {
				if(file.exists()) {
					System.out.println("�Խñ� ��ȣ �Է�:");
					int board_idx = scan.nextInt();
					
					if(board_idx <0 && board_idx>count) {
						System.out.println("�ش� �Խñ��� �������� �ʽ��ϴ�.");
						break;
					}
					String line = "";
					
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						for(int i=0; i<count; i++) {
							if(i == board_idx) {
								line += data[i][0] +"\n";
								line += data[i][1];
							}
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						try {fr.close();} catch (IOException e) {e.printStackTrace();}
						try {br.close();} catch (IOException e) {e.printStackTrace();}
					}
					
					System.out.printf("%d��: %s",board_idx,line);
					
					
				}
				
			}
			
		}
		
		
		
		
	}
}
