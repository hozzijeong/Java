package ex;
/*
 * # 콘솔 게시판
 * 1. 글 번호
 * 2. 글 제목
 * 3. 글 내용 
 * ------------------------
 * [1]이전 -> 페이지 이전
 * [2]이후 -> 페이지 이후 
 * [3]추가하기	-> 제목과 내용을 입력받아서 출력 
 * [4]삭제하기 -> 게시글 번호를 눌러서 삭제
 * [5]내용확인 -> 게시글 번호를 눌러서 내용 출력
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
		int page_count = 1; //총 페이지의 개수
		int page[][] = new int[page_count][6];
		/*
		 *  페이지를 저장할 배열
		 *  page[0][0] = 1 ; 페이지 number
		 *  page[1][0] = 2 ;
		 *  page[2][0] = 3 ;
		 *  page[3][0] = 4 ;
		 *  page[4][0] = 5 ;
		 *  와같이 페이지를 표시할 예정. 
		 *  그리고 그 이후의 [0][1] [0][2] ----> 페이지 개수를 채울 예정
		 *   
		 */
		if(count>0) {
			if(count%5 ==0) {
				page_count = count/5;
			}else {
				page_count = count/5+1;
			}
		}
		// page_count와 page의 관계
		
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
		// => [][] page를 채우는 공식.

		int idx = page_count;
		// 페이지를 이동할때 사용할 변수 idx;
		
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		String[][] data = new String[count][2];
		
		
		/*
		 *  글 번호를 확인할때는 data의 위치로 확인할것. 
		 *  data[][0] : 글 제목
		 *  data[][1] : 글 내용
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
			System.out.println("전체 게시글 수:"+count);
			System.out.println("전체 페이지수 :"+page.length);
			System.out.println("한페이지의 게시물 수: "+ 5);
			System.out.println("현재 페이지 번호:"+ page[idx][0]);
			System.out.println("현재 페이지의 글 :");
			for(int i=1; i< page[idx].length-1; i++) {
				System.out.println(page[idx][i]);
			}
			
			
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");
			System.out.println("메뉴 선택");
			int sel = scan.nextInt();
			
			
			if(sel ==1) {
				if(page_count ==1) {
					System.out.println("첫번째 페이지 입니다.");
				}else {
					idx-=1;
				}
				
			}
			else if(sel ==2) {
				if(idx+1 > page_count) {
					System.out.println("마지막 페이지입니다.");
				}else {
					idx+=1;
				}
				
			}
			else if(sel ==3) {
					if(count == 0) {
						data = new String[count+1][2];
						System.out.print("제목 입력:");
						String title = scan.next();
						
						System.out.print("내용 입력:");
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
						
						System.out.print("제목 입력:");
						String title = scan.next();
						
						System.out.print("내용 입력:");
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
						System.out.print("삭제할 번호 입력:");
						int delIdx = scan.nextInt();
						
						if(delIdx -1<count && delIdx <0) {
							System.out.println("해당 번호의 글은 삭제할 수 없습니다.");
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
					System.out.println("게시글 번호 입력:");
					int board_idx = scan.nextInt();
					
					if(board_idx <0 && board_idx>count) {
						System.out.println("해당 게시글은 존재하지 않습니다.");
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
					
					System.out.printf("%d번: %s",board_idx,line);
					
					
				}
				
			}
			
		}
		
		
		
		
	}
}
