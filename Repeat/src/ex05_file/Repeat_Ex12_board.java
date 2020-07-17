package ex05_file;

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


public class Repeat_Ex12_board {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String fileName = "board.txt";
		
		int count = 0; // 게시글의 개수
		String [][]board = null; 
		/*
		 *  게시판에 들어갈 정보의 배열
		 * board[i][0] 은 제목 [i][1]은 내용이 들어갈 예정 
		 */
		
		
		int curPageNum = 1; // 현제 페이지 표시
		int pageCount = 5; // 한페이지에 표시될 게시글의 개수 표시
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		String data = "";
		
		try {
			if(file.exists()) {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				
				String size = br.readLine();
				count = Integer.parseInt(size); // 게시글 혹은 순위를 저장할때 항상 위에 전체 게시글의 개수를 먼저 저장함. 
				
				while(true) {
					String line = br.readLine();
					if(line == null) {
						break;
					}
					data+= line;
					data += "\n";
				}
				
				data = data.substring(0,data.length()-1);
				
				if(count >0) {
					String[] temp = data.split("\n");
					board = new String[count][2];
					
					for(int i=0; i<temp.length; i++) {
						String[] info = temp[i].split("/");
						board[i][0] = info[0];
						board[i][1] = info[1];
					}
					
				}
			}
		}catch(Exception e) {
				e.printStackTrace();
		}finally {
			if(fr != null) {
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
			if(br!= null) {
				try {br.close();} catch (IOException e) {e.printStackTrace();}
				
			}
		}
		
		while(true) {
			System.out.println("[게시판]");
			int pageNum = count/pageCount;
			if(count%pageCount >0) {
				pageNum+=1; 
			}
			System.out.println("전체 페이지:"+pageNum);
			System.out.println("현재 페이지 ["+ curPageNum+"]");
			
			int startNum = (curPageNum-1)*pageCount ; // 현재 페이지의 게시글 수를 나타낼 때, 반복문의 시작지점
			int endNum = curPageNum*pageCount; // 반복문에 넣을 마지막 숫자
			
			if(endNum > count) {
				endNum =count; // 마지막 숫자가 게시글 수보다 적거나 많으면 더 적어질때까지 계속 빼서 출력창에 딱 게시글의 숫자만큼만 나오게끔 유도
			}
			for(int i=startNum; i<endNum;i++) {
				System.out.println("["+(i+1)+"]"+board[i][0]);
			}
			System.out.println();
			
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");

			int sel = scan.nextInt();

			if(sel ==1) {
				if(curPageNum ==1) {
					continue;
				}
				curPageNum-=1;
			}
			else if(sel ==2) {
				if(curPageNum >= pageNum) {
					continue;
				}
				count +=1;
			}
			else if(sel ==3) {
				if(count ==0) {
					board = new String[count+1][2];
				}else {
					String[][] temp = board;
					board = new String [count+1][2];
					
					for(int i=0; i<count; i++) {
						board[i][0] = temp [i][0];
						board[i][1] = temp[i][1];
					}
					temp = null;
				}
				System.out.print("[추가]제목 입력:");
				String title = scan.next();
				System.out.println();
				System.out.print("[추가]내용 입력:");
				String content = scan.next();
				System.out.println();
				
				board[count][0] =title;
				board[count][1] = content;
				
				count +=1;
				
				data = "";
				FileWriter fw = null;
				
				data += count;
				data += "\n";
				for(int i=0; i<count; i++) {
					data += board[i][0] + "/" + board[i][1] +"\n";
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
			else if(sel ==4) {
				System.out.print("[삭제] 게시글 번호 입력:");
				int num = scan.nextInt();
				num -=1;
				System.out.println();
				
				if(num <startNum || num > endNum) {
					System.out.println("[메세지] 해당 게시글은 삭제할 수 없습니다.");
					continue;
				}
				
				if(count ==1) {
					board = null;
				}else if(count >1) {
					String [][] temp = board;
					board = new String [count-1][2];
					
					int j=0;
					for(int i=0; i<count;i++) {
						if(i != num) {
							board[j][0] = temp[i][0];
							board[j][1] = temp[i][1];
							j+=1;
						}
					}
					temp = null;
				}
				count -=1;
				
				data = "";
				data += count;
				data += "\n";
				for(int i=0; i<count ;i++) {
					data += board[i][0] + "/" + board[i][1] + "\n";
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
				if(count >0) {
					System.out.println("[내용확인] 게시물 번호 입력:");
					int num = scan.nextInt();
					num-=1;
					if(startNum <= num && num <= endNum) {
						System.out.printf("[%d] : %s",num,board[num][1]);
					}
				}
			}
			
			
			
		}
		
		
	
	}
}
