package bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {
	private ArrayList<BookVo> bookList = new ArrayList<>();
	
	public ArrayList<BookVo> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVo> bookList) {
		this.bookList = bookList;
	}
	
	
	public String toString() {
		String str = "";
		
		str+="==================================\n";
		str+=" 도서명 저자 출판사 출판일 가격 \n";
		str+="==================================\n";
		
		double total = 0.0;
		for(int i=0; i<bookList.size(); i++) {
			str+= bookList.get(i)+"\n";
			total+= bookList.get(i).getPrice();
		}
		str+="==================================\n";
		DecimalFormat df = new DecimalFormat("#,##0원");
		str+="                     합게:"+df.format(total)+"\n";
		str+="==================================\n";
		
		return str;
		
	}

	public void addBook(BookVo vo) {
		bookList.add(vo);
	}
}
