package 排序;

import dao.Person;

import java.util.Comparator;

/**
 * @Author:wangrui
 * @Date:2020/5/29 10:37
 */
public class TelComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getTel()-o2.getTel();
    }
}
