package 图书排序;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<Book>books=new ArrayList<>();
		books.add(new Book("4343535","在远方","江源",1600,400,26));
		books.add(new Book("1323434","少年闰土","鲁迅",1002,344,13));
		books.add(new Book("3433353","时间简史","霍金",3333,455,56));
		books.add(new Book("2343553","飞鸟集","泰戈尔",1234,449,45));
		List<Book>copy;
		//按自然顺序（ISBN）排序
		System.out.println("按ISBN排序：");
		copy=new ArrayList<>(books);
		Sort.sort(copy);
		System.out.println(copy);
		//按书名排序
		 System.out.println("按书名排序：");
		 copy=new ArrayList<>(books);
		 Sort.sort2(copy,new TitleComparator());
		 System.out.println(copy);
		 //按价格从小到大排序
		 System.out.println("按价格从小到大排序：");
		 copy=new ArrayList<>(books); 
		 Sort.sort2(copy,new PriceComparator(true));
		 System.out.println(copy);
		 //按价格从大到小排序
		 System.out.println("按价格从大大小排序：");
		 copy=new ArrayList<>(books);
		 Sort.sort2(copy,new PriceComparator(false));
		 System.out.println(copy);
	}
}
