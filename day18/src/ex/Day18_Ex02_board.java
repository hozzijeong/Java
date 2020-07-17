package ex;
/*
 * # �ܼ� �Խ���
 * 1. �� ��ȣ
 * 2. �� ����
 * 3. �� ����
 * ------------------------
 * [1]����
 * [2]����
 * [3]�߰��ϱ�	
 * [4]�����ϱ�
 * [5]����Ȯ��
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day18_Ex02_board {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String fileName = "board.txt";
		
		int count = 0;
		String board[][] = null;
		
		int curPageNum = 1;
		int pageCount = 5;
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		String data = " ";
		
		try {
			if(file.exists()) {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				
				String size = br.readLine(); // �޸��� ���� �տ�, �޸����� ũ��(��, ��������)�� ���������� �������
				count = Integer.parseInt(size);
				
				for(int i=0; i<count; i++) {
					String temp = br.readLine();
					if(temp == null) {
						break;
					}
					data += temp;
					if(i != count -1) {
						data+="\n";
					}
				}
				if(count >0) {
					String[] info =  data.split("\n");
					board = new String [count][2];
					
					for(int i=0; i<info.length;i++) {
						String [] temp = info[i].split("/");
						board[i][0] = temp[0];
						board[i][1] = temp [1];
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fr!=null) {
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
			if(br!=null) {
				try {br.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		
		
		
		while(true) {
			System.out.println("[�Խ���]("+curPageNum+"page)"); 
			// -> ���� ������ ��ȣ
			
			int pageNum = count/pageCount;
			if(count%pageCount >0) {
				pageNum+=1;
			}
			System.out.println("pageNum = "+pageNum);
			// -> ��ü ������ ��� 
			
			// startNum : 0���� �����ϴ� ��ȣ
			// endNum   : �̸� 
			int startNum = (curPageNum -1)*pageCount; // ù��° �Խñ� ��ȣ
			int endNum = curPageNum*pageCount	; // ������ �Խñ� ��ȣ 
			
			if(endNum > count) {
				endNum = count;	
			}
			
			for(int i= startNum; i<endNum; i++) {
				System.out.println("["+(i+1)+"]"+board[i][0]);
			}
			System.out.println();
			
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");

			int sel = scan.nextInt();
			
			if(sel ==1) {
				if(curPageNum ==1) {
					continue;
				}
				curPageNum-=1;
			}else if(sel ==2) {
				if(curPageNum >= pageNum)	{
					continue;
				}
				curPageNum +=1;
			}else if(sel ==3) {
				if(count ==0) {
					board = new String[count+1][2];
				}else {
					String[][]temp = board;
					board = new String [count+1][2];
					
					for(int i=0; i<count; i++) {
						board[i] = temp[i];
					}
					temp = null;
				}
				System.out.println("���� �Է�:");
				String title = scan.next();
				System.out.println("���� �Է�:");
				String content = scan.next();
				
				board[count][0] = title;
				board[count][1] = content;
				
				count +=1;
				
				data = "";
				data += count; // �޸��忡 ������ ��, ���������� �Խñ��� ����� count�� ��������!!!!
				data+="\n";
				
				for(int i=0; i<count ;i++) {
					data+=board[i][0] + "/" + board[i][1] +"\n";
				}
				data = data.substring(0,data.length()-1);
				
				System.out.println(data);

				FileWriter fw = null;
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
				
			
			}else if(sel ==4) {
				System.out.println("[����] �Խñ� ��ȣ �Է�:");
				int delIdx = scan.nextInt();
				delIdx -=1;
				if(endNum<delIdx || delIdx<startNum) {
					System.out.println("�ش� ��ġ�� ���� ������ �� �����ϴ�.");
					continue;
				}
				
				if(count ==1) {
					board = null;
				}else {
					String[][] temp = board;
					board = new String [count-1][2];
					int j=0;

					for(int i=0; i<count ;i++) {
						if(i != delIdx) {
							board[j] = temp[i];
							j+=1;
						}
					}
					temp = null;
					
				}
				count -=1;
				
				data = "";
				data +=count;
				data += "\n";
				
				for(int i=0; i<count;i++) {
					data += board[i][0] + "/" + board[i][1]+"\n";
				}
				data = data.substring(0,data.length()-1);
				
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
			}else if(sel ==5) {
				System.out.print("[Ȯ��]�Խñ� ��ȣ�� �Է��ϼ���:");
				int idx = scan.nextInt();
				idx -=1;
				if(startNum <= idx && idx<= endNum) {
					System.out.println("���� = "+board[idx][1]);
				}
			}

		}
		
		
	}
}
