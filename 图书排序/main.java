package ͼ������;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<Book>books=new ArrayList<>();
		books.add(new Book("4343535","��Զ��","��Դ",1600,400,26));
		books.add(new Book("1323434","��������","³Ѹ",1002,344,13));
		books.add(new Book("3433353","ʱ���ʷ","����",3333,455,56));
		books.add(new Book("2343553","����","̩���",1234,449,45));
		List<Book>copy;
		//����Ȼ˳��ISBN������
		System.out.println("��ISBN����");
		copy=new ArrayList<>(books);
		Sort.sort(copy);
		System.out.println(copy);
		//����������
		 System.out.println("����������");
		 copy=new ArrayList<>(books);
		 Sort.sort2(copy,new TitleComparator());
		 System.out.println(copy);
		 //���۸��С��������
		 System.out.println("���۸��С��������");
		 copy=new ArrayList<>(books); 
		 Sort.sort2(copy,new PriceComparator(true));
		 System.out.println(copy);
		 //���۸�Ӵ�С����
		 System.out.println("���۸�Ӵ��С����");
		 copy=new ArrayList<>(books);
		 Sort.sort2(copy,new PriceComparator(false));
		 System.out.println(copy);
	}
}
