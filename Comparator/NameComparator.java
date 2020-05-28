package 对象的比较.Comparator;

import java.util.Comparator;

/**
 * @Author:wangrui
 * @Date:2020/5/28 11:21
 */
public class NameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
