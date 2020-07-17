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

		// ���� ����!
		int count = 0; // count�� ��Ȯ�� ������ ��� �Ǵ°�,..>?
		String[][] board = null;

		int curPageNum = 1; // current page num(���� ������ ��ȣ)
		int pageCount = 3; // �� �������� ������ �Խñ� ��

		File file = new File(fileName); // ���� ����
		FileReader fr = null; // ���� ��� ã��
		BufferedReader br = null; // ���� ���� �б�
		String data = ""; // ���� �ȿ� �ִ� ����

		try {
			if (file.exists()) {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				String size = br.readLine(); // ���� �� ������ ���ڿ� size�� ����. 
				count = Integer.parseInt(size); // ���ڿ��� ������ size�� count�� ����..? ���ʿ� size�� � �������� ���� �� �˰�...?

				for (int i = 0; i < count; i++) {
					String temp = br.readLine();
					if (temp == null) {
						break;
					}
					data += temp;
					if (i != count - 1) {
						data += "\n"; // i�� ���� ������ ���� �ƴϸ� enter�� ���� ����
					}
				}
				if (count > 0) {
					String[] info = data.split("\n"); // �����͸� ���ͼ����� info�� ����. 
					board = new String[count][2]; // count ��, �������� ���̰� 0���� ũ�� = �����Ͱ� �����ϸ� ���ο� �迭 ����. 

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

	
			System.out.println("[�Խ���](" + curPageNum + "page)");

			int pageNum = count / pageCount;
			if (count % pageCount > 0) {
				pageNum += 1;
			}
			System.out.println("pageNum = " + pageNum);

			int startNum = (curPageNum - 1) * pageCount; // ù��° �Խñ� ��ȣ
			int endNum = curPageNum * pageCount - 1; // ������ �Խñ� ��ȣ

			if (endNum >= count) {
				endNum = count - 1;
			}

			for (int i = startNum; i <= endNum; i++) {
				System.out.println("[" + (i + 1) + "]" + board[i][0]);
			}
			System.out.println();

			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");

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

				System.out.print("[�߰�]������ �ۼ��ϼ��� : ");
				String title = scan.next();

				System.out.print("[�߰�]������ �ۼ��ϼ��� : ");
				String content = scan.next();

				board[count][0] = title;
				board[count][1] = content;

				count += 1;

				// ���� �����ϱ�
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
				System.out.print("[����]�Խñ� ��ȣ�� �Է��ϼ��� : ");
				int num = scan.nextInt();
				num -= 1;
				if (endNum < num || num < startNum) {
					System.out.println("�ش� ��ġ�� ���� ������ �� �����ϴ�.");
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

				// ���� �����ϱ�
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
				System.out.print("[Ȯ��]�Խñ� ��ȣ�� �Է��ϼ��� : ");
				int num = scan.nextInt();
				num -= 1;

				if (startNum <= num && num <= endNum) {
					System.out.println("���� = " + board[num][1]);
				}
			}

		}


	}
}
