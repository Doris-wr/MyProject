package 排序;

import dao.Person;

import java.util.Comparator;

/**
 * @Author:wangrui
 * @Date:2020/5/29 10:36
 */
public class AgeComparator  implements Comparator<Person>{
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
