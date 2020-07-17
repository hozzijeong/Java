package ex05_file;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * # 콘솔 게시판
 * 1. 글 번호
 * 2. 글 제목
 * 3. 글 내용
 * ------------------------
 * [1]이전
 * [2]이후
 * [3]추가하기	
 * [4]삭제하기
 * [5]내용확인
 */
public class Repeat_Ex13_Cray_Acade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = "board1.txt";
		int count = 0; // 페이지 수를 체크하는 변수 count
		int curPageNum = 1; // 현재 페이지를 나타내는 변수 
		int pageCount = 5; // 한 페이지 안에 나타낼 게시글의 수
		
		String [][] board = null; // board[count][0] 은 제목 [1] 은 내용을 담을 예정임
		
		String data = ""; // 파일 입출력을 하면서 그 안에 있는 정보를 data에 담을 것임. 
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			if(file.exists()) {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				
				String size = br.readLine();
				count = Integer.parseInt(size); // 게시판 정보를 저장한 메모장 가장 위쪽에, 전체 게시판의 게시글수를 통상적으로 저장.

				while(true) {
					String line = br.readLine();
					if(line == null) {
						break;
					}
					data += line + "\n";
				}
				data = data.substring(0,data.length()); // 메모장에 있는 내용들을 data에 전부 옮겨 닮았음. 
				if(count > 0) {
					board = new String [count][2];
					String [] temp = data.split("\n");
					
					for(int i=0; i<temp.length ;i++) {
						String[] info = temp[i].split("/");
						board[i][0] = info[0];
						board[i][1] = info [1]; 
					}
				}
				// 게시글 수가 1개 이상일때, [][]board 안에 제목 / 내용 수서로 데이터를 저장. 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fr!= null) {try {fr.close();} catch (IOException e) {e.printStackTrace();}}
			if(br!= null) {try {br.close();} catch (IOException e) {e.printStackTrace();}}
		}
		
		while(true) {
			System.out.println("[게시판] ("+curPageNum+"page)");
			int pageNum = count / pageCount;
			if(count% pageCount >0) {
				pageNum +=1;
			}
			System.out.println("전체 페이지:"+pageNum);
			
			int startNum = (curPageNum -1)*pageCount;
			int endNum = curPageNum*pageCount;
			if(endNum > count) {
				endNum = count;
			}
			for(int i=startNum; i<endNum; i++) {
				System.out.println("["+i+1+"]"+board[i][0]);
			}
			
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가");
			System.out.println("[4]삭제");
			System.out.println("[5]내용확인");
			
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
				System.out.print("[추가]제목 입력:");
				String title = scan.next();
				System.out.print("[추가]내용 입력:");
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
				System.out.println("[삭제] 게시글 번호 입력:");
				int num = scan.nextInt();
				num -=1;
				if( num <startNum || num > endNum) {
					System.out.println("[메세지] 해당 게시글은 삭제할 수 없습니다.");
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
				System.out.println("[내용확인] 게시글 번호 입력:");
				int num = scan.nextInt();
				num-=1;
				if(startNum <= num && num <=endNum) {
					System.out.println("[내용확인]" + board[num][1]);
				}
			}
			
			
		}
		
	}
}
