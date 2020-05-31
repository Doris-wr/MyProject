package 对象的比较.Comparator;

import java.util.Arrays;

/**
 * @Author:wangrui
 * @Date:2020/5/28 11:23
 */
public class Test {
    public static void main(String[] args) {
        Book book1=new Book("老人与海",78,"海明威");
        Book book2=new Book("百年孤独",88,"马尔克斯");
        Book book3=new Book("百草园",95,"鲁迅");
        //讲图书根据价格排序
        Book[] books=new Book[]{book1,book2,book3};
        PriceComparator priceComparator=new PriceComparator();
        Arrays.sort(books,priceComparator);
        System.out.println(Arrays.toString(books));
        //将图书根据书名排序
       /*NameComparator nameComparator=new NameComparator();
       Arrays.sort(books,nameComparator);
       System.out.println(Arrays.toString(books));*/
    }
}
