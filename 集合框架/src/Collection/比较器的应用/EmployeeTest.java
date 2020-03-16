package Collection.比较器的应用;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author:wangrui
 * 题目要求：
 * 使Employee实现Comparable接口，并按照name排序
 * 创建TreeSet时传入Comparator对象，按生日日期的先后日期排序
 * @Date:2020/3/10 16:26
 */
public class EmployeeTest {
    @Test
    //问题一：使用自然排序
    public void test1(){
        TreeSet set=new TreeSet();
        Employee e1=new Employee("liudehua",55,new MyDate(1965,5,4));
        Employee e2=new Employee("zhangxueyou",43,new MyDate(1987,8,4));
        Employee e3=new Employee("gufucheng",444,new MyDate(1956,9,5));
        Employee e4=new Employee("liming",51,new MyDate(1978,12,8));
        Employee e5=new Employee("liangchaowei",21,new MyDate(1988,4,12));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    //按照生日的先后顺序排序
    public void test2(){
        TreeSet set=new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee&&o2 instanceof Employee){
                    Employee e1=(Employee)o1;
                    Employee e2=(Employee)o2;
                    MyDate b1=e1.getBirthday();
                    MyDate b2=e2.getBirthday();
                    //方式一
                    /*//比较年
                    int minusYear=b1.getYear()-b2.getYear();
                    if(minusYear!=0){
                        return minusYear;
                    }
                    //比较月
                    int minusMonth=b1.getMonth()-b2.getMonth();
                    if(minusMonth!=0){
                        return minusMonth;
                    }
                    //比较日
                    return b1.getDay()-b2.getDay();*/
                    //方式二:直接将排序的方法放在MyDate类中，然后直接调用
                    return b1.compareTo(b2);
                }
                throw new RuntimeException("传入的数据类型不一致");
            }
        });
        Employee e1=new Employee("liudehua",55,new MyDate(1965,5,4));
        Employee e2=new Employee("zhangxueyou",43,new MyDate(1987,8,4));
        Employee e3=new Employee("gufucheng",444,new MyDate(1956,9,5));
        Employee e4=new Employee("liming",51,new MyDate(1978,12,8));
        Employee e5=new Employee("liangchaowei",21,new MyDate(1988,4,12));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
