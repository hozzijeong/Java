package ex05_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Repeat_Ex08_vector {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vector = null;
		int count = 0;
		
		String fileName = "vector.txt";
		FileWriter fw = null;
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		while(true){
			
			for(int i=0; i<count;i++) {
				System.out.print(vector[i]+" ");
			}
			System.out.println();
			
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");

			System.out.println("�޴� ����:");
			int sel = scan.nextInt();
			
			if(sel ==1) {
				if(count ==0) {
					vector = new int[count+1];
				}else if(count>0) {
					int[] temp = vector;
					vector = new int[count+1];
					
					for(int i=0; i<count;i++) {
						vector[i] = temp[i];
					}
					
					temp = null;
				}
				
				System.out.println("[�߰�]���� �Է�");
				int num = scan.nextInt();
				
				vector[count] = num;
				count+=1;
					
			}
			else if(sel==2) {
				if(count ==1) {
					vector = null;
				}else if(count >1) {
					System.out.println("[����]�ε��� �Է�:");
					int index = scan.nextInt();
					if(index >count || index<0) {
						System.out.println("�ش���ġ�� ������ �� �����ϴ�.");
						continue;
					}
					
					int[] temp = vector;
					vector = new int[count-1];

					int j=0;
					for(int i=0; i<count;i++) {
						if(i != index) {
							vector[j] = temp[i];
							j+=1;
						}
					}
					temp = null;
					
					count-=1;
					
				}
			}
			else if(sel==3) {
				
				String data = "";

				for(int i=0; i<count;i++) {
					data += vector[i]+"";
					data += "\n";
				}
				data = data.substring(0,data.length()-1);
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
			}
			else if(sel==4) {
				String data = "";
				
				if(file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						while(true) {
							String line = br.readLine();
							if(line == null) {
								break;
							}
							data += line;
							data +="\n";
						}
						data = data.substring(0,data.length()-1);
						
						String[] temp = data.split("\n");
						
						vector = new int[temp.length];
						
						for(int i=0; i<temp.length;i++) {
							vector[i] = Integer.parseInt(temp[i]);
						}
						
						System.out.println();
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						try {fr.close();} catch (IOException e) {e.printStackTrace();}
						try {br.close();} catch (IOException e) {e.printStackTrace();}
						
					}
				}
				
			}
			else if(sel==5) {
				System.out.println("���α׷� ����");
				break;
			}
		
		
		}
	}
}
