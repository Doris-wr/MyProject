package 图书排序;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		// TODO 自动生成的方法存根
		return o1.title.compareTo(o2.title);
	}	
}
