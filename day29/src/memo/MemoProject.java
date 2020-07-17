package memo;

import java.util.Scanner;

public class MemoProject {
	static MemoList memoList = new MemoList();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu!= 7) {
			do {
				System.out.println("==========================================================");
				System.out.println("1.입력 2.목록 3.수정 4.삭제 5.파일로 저장 6.파일에서 읽기 7.종료");
				System.out.println("==========================================================");
				System.out.println("원하는 메뉴 선택:");
				menu = sc.nextInt();
			}while(menu<1 || menu>7);
			
			switch(menu) {
				case 1 : insert(); break;
				case 2 : select(); break;
				case 3 : update(); break;
				case 4 : delete(); break;
				case 5 : fileWrite(); break;
				case 6 : fileRead(); break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void fileRead() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("읽어올 파일 이름 입력:");
		
		String fileName = scan.nextLine().trim();
		memoList.fileReadMemo(fileName);
	}
	
	private static void fileWrite() {
		Scanner scan = new Scanner(System.in);
		System.out.println("저장할 파일 이름 입력:");
		String fileName = scan.nextLine().trim();
		
		memoList.fileWriteMemo(fileName);
		System.out.println("파일 쓰기 완료");
	}
	
	private static void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 글 번호 입력:");
		int no = scan.nextInt();
		
		MemoVo vo = memoList.selectMemo(no);
		if(vo != null) {
			System.out.println(vo);
			scan.nextLine();
			System.out.println("수정할 글의 비밀번호 입력:");
			String password = scan.nextLine().trim();
			System.out.println("수정할 글의 내용 입력:");
			String memo = scan.nextLine().trim();
			
			if(password.equals(vo.getPassword())) {
				memoList.updateMemo(no, memo);
				System.out.println(no+"번 글 수정 완료");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println(no+"번 글이 존재하지 않습니다.");
		}
	}
	
	private static void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 글 번호 입력:");
		int no = scan.nextInt();
		
		MemoVo vo = memoList.selectMemo(no);
		
		if(vo != null) {
			System.out.println(vo);
			scan.nextLine();
			System.out.println("삭제할 글의 비밀번호 입력:");
			String password = scan.nextLine().trim();
			
			if(password.equals(vo.getPassword())) {
				memoList.deleteMem0(no);
				System.out.println(no+"번 글 삭제 완료");
			}else {
				System.out.println("비밀번호 일치하지 않음.");
			}
		}else {
			System.out.println(no+"번 글이 존재하지 않음");
		}
	}
	
	private static void select() {
		memoList.viewMemo();
	}
	
	private static void insert() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름, 비밀번호,메모 입력:");
		System.out.println("이름:");
		String name = scan.nextLine();
		System.out.println("비밀번호:");
		String password = scan.nextLine();
		System.out.println("메모:");
		String memo = scan.nextLine();
		
		MemoVo vo = new MemoVo(name, password, memo);
		
		memoList.addMemo(vo);
		
		System.out.println("저장 완료");
	}
}
