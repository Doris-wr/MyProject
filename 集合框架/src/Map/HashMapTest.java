package Map;

import org.junit.Test;

import java.util.*;
/**
 * @Author:wangrui
 * @Date:2020/3/10 22:50
 */
public class HashMapTest {
    @Test
    public void test1(){
        Map map= new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //遍历所有的key集：keySet
        Set set=map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****************************");
        //遍历所有的value
        Collection coll=map.values();
        for(Object obj:coll){
            System.out.println(obj);
        }
        System.out.println("********************************");
        //遍历所有的key-value
        //方式一：entrySet
        Set entrySet=map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object obj=iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
        System.out.println();
        //方式二
        Set keySet=map.entrySet();
       Iterator iterator2= keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value=map.get(key);
            System.out.println(key+"==="+value);
        }
    }
}
