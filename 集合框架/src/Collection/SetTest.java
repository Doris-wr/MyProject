package Collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:wangrui
 * @Date:2020/3/9 22:17
 */
//hashSet:存数据是无序的
public class SetTest {
    @Test
    public void test1(){
        Set set=new HashSet();
        set.add("456");
        set.add("123");
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",22));
        set.add(129);
        System.out.println(set);
    }
}
