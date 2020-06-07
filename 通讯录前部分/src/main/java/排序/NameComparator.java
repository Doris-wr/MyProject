package 排序;

import dao.Person;

import java.util.Comparator;

/**
 * @Author:wangrui
 * @Date:2020/5/28 15:27
 */
public class NameComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
