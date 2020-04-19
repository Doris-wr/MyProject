package 图书排序;

import java.util.Comparator;
import java.util.List;

public class Sort {
	public static void sort(List<Book>books) {
		for(int i=1;i<books.size();i++) {
			Book book=books.get(i);
			int j=i-1;
			for(;j>=0&&books.get(j).compareTo(book)>0;j--) {
				 books.set(j+1,books.get(j));
			}
			books.set(j+1,book);
		}
	}
	//方式二：直接传一个比较器
	public static void sort2(List<Book>books,Comparator<Book>comparator) {
		for(int i=1;i<books.size();i++) {
			Book book=books.get(i);
			int j=i-1;
			for(;j>=0&&comparator.compare(books.get(j),book)>0;j--) {
				books.set(j+1,books.get(j));       
			}
			books.set(j+1,book);
		}
	}
}
