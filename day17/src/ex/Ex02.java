package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = "board.txt";

		// 벡터 적용!
		int count = 0; // count의 정확한 쓰임은 어떻게 되는가,..>?
		String[][] board = null;

		int curPageNum = 1; // current page num(현재 페이지 번호)
		int pageCount = 3; // 한 페이지에 보여줄 게시글 수

		File file = new File(fileName); // 파일 생성
		FileReader fr = null; // 파일 경로 찾기
		BufferedReader br = null; // 파일 내용 읽기
		String data = ""; // 파일 안에 있는 정보

		try {
			if (file.exists()) {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				String size = br.readLine(); // 파일 의 정보를 문자열 size에 저장. 
				count = Integer.parseInt(size); // 문자열로 형성된 size를 count에 저장..? 애초에 size가 어떤 형식으로 나올 줄 알고...?

				for (int i = 0; i < count; i++) {
					String temp = br.readLine();
					if (temp == null) {
						break;
					}
					data += temp;
					if (i != count - 1) {
						data += "\n"; // i의 값이 마지막 값만 아니면 enter로 정보 구분
					}
				}
				if (count > 0) {
					String[] info = data.split("\n"); // 데이터를 엔터순으로 info에 저장. 
					board = new String[count][2]; // count 즉, 데이터의 길이가 0보다 크면 = 데이터가 존재하면 새로운 배열 생성. 

					for (int i = 0; i < info.length; i++) {
						String[] temp = info[i].split("/");
						board[i][0] = temp[0];
						board[i][1] = temp[1];
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		while (true) {

	
			System.out.println("[게시판](" + curPageNum + "page)");

			int pageNum = count / pageCount;
			if (count % pageCount > 0) {
				pageNum += 1;
			}
			System.out.println("pageNum = " + pageNum);

			int startNum = (curPageNum - 1) * pageCount; // 첫번째 게시글 번호
			int endNum = curPageNum * pageCount - 1; // 마지막 게시글 번호

			if (endNum >= count) {
				endNum = count - 1;
			}

			for (int i = startNum; i <= endNum; i++) {
				System.out.println("[" + (i + 1) + "]" + board[i][0]);
			}
			System.out.println();

			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");

			int sel = scan.nextInt();

			if (sel == 1) {
				if (curPageNum == 1) {
					continue;
				}
				curPageNum -= 1;
			} else if (sel == 2) {
				if (curPageNum >= pageNum) {
					continue;
				}
				curPageNum += 1;
			} else if (sel == 3) {

				if (count == 0) {
					board = new String[count + 1][2];
				} else {
					String[][] temp = board;

					board = new String[count + 1][2];
					for (int i = 0; i < count; i++) {
						board[i] = temp[i];
					}
					temp = null;
				}

				System.out.print("[추가]제목을 작성하세요 : ");
				String title = scan.next();

				System.out.print("[추가]내용을 작성하세요 : ");
				String content = scan.next();

				board[count][0] = title;
				board[count][1] = content;

				count += 1;

				// 파일 저장하기
				data = "";
				data += count;
				data += "\n";
				for (int i = 0; i < count; i++) {
					data += board[i][0];
					data += "/";
					data += board[i][1];
					if (i != count - 1) {
						data += "\n";
					}
				}

				System.out.println(data);

				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (fw != null) {
						try {
							fw.close();
						} catch (IOException e) {
						}
					}
				}
			} else if (sel == 4) {
				System.out.print("[삭제]게시글 번호를 입력하세요 : ");
				int num = scan.nextInt();
				num -= 1;
				if (endNum < num || num < startNum) {
					System.out.println("해당 위치의 글은 삭제할 수 없습니다.");
					continue;
				}

				if (count == 1) {
					board = null;
				} else if (count > 1) {
					String[][] temp = board;

					board = new String[count - 1][2];
					int j = 0;
					for (int i = 0; i < count; i++) {
						if (i != num) {
							board[j] = temp[i];
							j += 1;
						}
					}
					temp = null;
				}
				count -= 1;

				// 파일 저장하기
				data = "";
				data += count;
				data += "\n";

				for (int i = 0; i < count; i++) {
					data += board[i][0];
					data += "/";
					data += board[i][1];
					if (i != count - 1) {
						data += "\n";
					}
				}

				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (fw != null) {
						try {
							fw.close();
						} catch (IOException e) {
						}
					}
				}
			} else if (sel == 5) {
				System.out.print("[확인]게시글 번호를 입력하세요 : ");
				int num = scan.nextInt();
				num -= 1;

				if (startNum <= num && num <= endNum) {
					System.out.println("내용 = " + board[num][1]);
				}
			}

		}


	}
}
