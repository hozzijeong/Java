package memo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MemoList {
	private ArrayList<MemoVo> memoList = new ArrayList<>();

	public ArrayList<MemoVo> getMemoList() {
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVo> memoList) {
		this.memoList = memoList;
	}
	
	public String toString() {
		//�������� �Էµ� �� ���� ����ϱ� ���� arrayList�� ����� ������ �ۺ��� ���
		String str = "";
		for(int i=memoList.size()-1; i>=0; i--	) {
			str+= memoList.get(i)+"\n";
		}
		return str;
	}
	
	public void addMemo(MemoVo vo) {
		memoList.add(vo);
		// �� ���� �� �� ��ȣ�� �ٽ� �ο��ϴ� �޼��� ����
		reNumber();
	}
	// �� ��ȣ �ο��ϴ� �޼���
	private void reNumber() {
		for(int i=0; i<memoList.size();i++) {
			memoList.get(i).setNo(i+1);
		}
	}
	
	// ArrayList�� ����� ������ ����ϴ� �޼���
	public void viewMemo() {
		if(memoList.size() != 0) {
			for(int i=memoList.size()-1; i>=0; i--) {
				System.out.println(memoList.get(i));
			}
		}else {
			System.out.println("����� �޸� �����ϴ�.");
		}
	}
	
	public MemoVo selectMemo(int no) {
		try {
			return memoList.get(no-1);
		}catch(Exception e) {
			return null;
		}
	}
	
	public void deleteMem0(int no) {
		memoList.remove(no-1);
		
		reNumber();
	}
	
	public void updateMemo(int no, String memo) {
		memoList.get(no-1).setMemo(memo);
	}
	
	public void fileWriteMemo(String fileName) {
		PrintWriter pw = null;
		try {
			String path = String.format("./src/memo/%s/txt", fileName);
			
			pw = new PrintWriter(path);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
			for(MemoVo vo :memoList) {
				String str = String.format("%s %s %s %s %s", vo.getNo(),vo.getName(),vo.getPassword(),vo.getMemo().replace(" ", "_"),sdf.format(vo.getWriteDate()));
				pw.write(str+"\r\n");
			}
		}catch (Exception e) {
			System.out.println("������ �����ϴ�.");
		}finally {
			if(pw!= null) {pw.close();}
		}
	}
	
	public void fileReadMemo(String fileName) {
		Scanner sc = null;
		
		try {
			String path = "./scr/memo/"+ fileName+".txt";
			sc = new Scanner(new File(path));
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine().trim();
				Scanner scan = new Scanner(str);
				while(scan.hasNext()) {
					int no = scan.nextInt();
					String name = scan.next();
					String password = scan.next();
					String memo = scan.next();
					String writeDate = scan.next();
					
					MemoVo vo = new MemoVo(no, name, password, memo, writeDate);
					
					memoList.add(vo);
				}
			}
			
			System.out.println("���Ͽ��� �б� �Ϸ�");
		}catch(FileNotFoundException e	) {
			System.out.println("������ �����ϴ�.");
		}finally {
			if(sc!=null) {sc.close();}
		}
	}
}
