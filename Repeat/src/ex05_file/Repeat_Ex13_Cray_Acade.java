package ex05_file;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
public class Repeat_Ex13_Cray_Acade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = "board1.txt";
		int count = 0; // ������ ���� üũ�ϴ� ���� count
		int curPageNum = 1; // ���� �������� ��Ÿ���� ���� 
		int pageCount = 5; // �� ������ �ȿ� ��Ÿ�� �Խñ��� ��
		
		String [][] board = null; // board[count][0] �� ���� [1] �� ������ ���� ������
		
		String data = ""; // ���� ������� �ϸ鼭 �� �ȿ� �ִ� ������ data�� ���� ����. 
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			if(file.exists()) {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				
				String size = br.readLine();
				count = Integer.parseInt(size); // �Խ��� ������ ������ �޸��� ���� ���ʿ�, ��ü �Խ����� �Խñۼ��� ��������� ����.

				while(true) {
					String line = br.readLine();
					if(line == null) {
						break;
					}
					data += line + "\n";
				}
				data = data.substring(0,data.length()); // �޸��忡 �ִ� ������� data�� ���� �Ű� �����. 
				if(count > 0) {
					board = new String [count][2];
					String [] temp = data.split("\n");
					
					for(int i=0; i<temp.length ;i++) {
						String[] info = temp[i].split("/");
						board[i][0] = info[0];
						board[i][1] = info [1]; 
					}
				}
				// �Խñ� ���� 1�� �̻��϶�, [][]board �ȿ� ���� / ���� ������ �����͸� ����. 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fr!= null) {try {fr.close();} catch (IOException e) {e.printStackTrace();}}
			if(br!= null) {try {br.close();} catch (IOException e) {e.printStackTrace();}}
		}
		
		while(true) {
			System.out.println("[�Խ���] ("+curPageNum+"page)");
			int pageNum = count / pageCount;
			if(count% pageCount >0) {
				pageNum +=1;
			}
			System.out.println("��ü ������:"+pageNum);
			
			int startNum = (curPageNum -1)*pageCount;
			int endNum = curPageNum*pageCount;
			if(endNum > count) {
				endNum = count;
			}
			for(int i=startNum; i<endNum; i++) {
				System.out.println("["+i+1+"]"+board[i][0]);
			}
			
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰�");
			System.out.println("[4]����");
			System.out.println("[5]����Ȯ��");
			
			int sel = scan.nextInt();
			
			if(sel ==1) {
				if(curPageNum ==1) {
					continue;
				}
				curPageNum -=1;
			}
			else if(sel ==2) {
				if(curPageNum == pageNum) {
					continue;
				}
				curPageNum +=1;
			}
			else if(sel ==3) {
				if(count ==0) {
					board = new String [count+1][2];
				}else if(count >0) {
					String [][]temp = board;
					board = new String [count +1][2];
					for (int i=0; i<count; i++) {
						board[i] = temp[i];
					}
					temp = null;
				}
				System.out.print("[�߰�]���� �Է�:");
				String title = scan.next();
				System.out.print("[�߰�]���� �Է�:");
				String content = scan.next();
				
				board[count][0] = title;
				board[count][1] = content;
				count +=1;
				
				data = "";
				data += count;
				data += "\n";
				for (int i=0; i<count; i++) {
					data += board[i][0] + "/" + board[i][1] +"\n";
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
				
			}
			else if(sel ==4) {
				System.out.println("[����] �Խñ� ��ȣ �Է�:");
				int num = scan.nextInt();
				num -=1;
				if( num <startNum || num > endNum) {
					System.out.println("[�޼���] �ش� �Խñ��� ������ �� �����ϴ�.");
					continue;
				}
				if(count ==1) {
					board = null;
				}else if(count >1) {
					String [][] temp = board;
					board = new String[count-1][2];
					
					int j=0;
					for(int i=0; i<count; i++) {
						if( i!= num) {
							board[j] = temp[i];
							j+=1;
						}
					}
					temp = null;
				}
				count -=1;
				
				data = "";
				data += count;
				data += "\n";
				for (int i=0; i<count; i++) {
					data += board[i][0] + "/" + board[i][1] +"\n";
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
			}
			else if(sel ==5) {
				System.out.println("[����Ȯ��] �Խñ� ��ȣ �Է�:");
				int num = scan.nextInt();
				num-=1;
				if(startNum <= num && num <=endNum) {
					System.out.println("[����Ȯ��]" + board[num][1]);
				}
			}
			
			
		}
		
	}
}
