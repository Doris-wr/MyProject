package 对象的比较.Comparator;

import java.util.Comparator;

/**
 * @Author:wangrui
 * @Date:2020/5/28 11:20
 */
public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        //从小到大排序
        /*return o1.getPrice()-o2.getPrice();*/
        //从大到小排序
        return o2.getPrice()-o1.getPrice();
    }
}
