package Collection;

import java.util.Objects;

/**
 * @Author:wangrui
 * @Date:2020/3/9 18:03
 */
public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{"+"name="+name+",age="+age+"}";
    }


    @Override
    //按照姓名从大到小进行排序，再按年龄从小到达进行排序
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p=(Person)o;
           // return this.name.compareTo(p.name);
            int compare=-this.name.compareTo(p.name);
            if(compare!=0){
                return compare;
            }else{
                return Integer.compare(this.age,p.age);
            }
        }else{
            throw new RuntimeException("输入类型不匹配");
        }
    }
}
