package 泛型;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author:wangrui
 * @Date:2020/3/12 14:42
 */
public class GenericTest {
    @Test
    public void test(){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("Tom",87);
        map.put("Jerry",97);
        map.put("Jack",67);
        //泛型的嵌套
        Set<Map.Entry<String,Integer>>entry=map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer>e=iterator.next();
            String key=e.getKey();
            Integer value=e.getValue();
            System.out.println(key+"------"+value);
        }
    }
    @Test
    //关于自定义泛型类的使用
    public void test1(){
        Order order=new Order();
        //如果定义了泛型类，实例化使没有使用，则认为泛型类型是Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型
        order.setOrderT(123);
        order.setOrderT("ABC");
        //建议：实例化时指明类的泛型
        Order<String>order1=new Order<String>("orderAA",1001,"order:Aa");
        order.setOrderT("AA:hello");
    }
    @Test
    public void test2(){
        SubOrder sub1=new SubOrder();
        //由于b子类在计继承带泛型的父类时，指明了泛型类型，则实例化子类对象时，不再需要指明泛型的类型
        sub1.setOrderT(1122);
    }
}
