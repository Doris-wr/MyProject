package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author:wangrui
 * @Date:2020/3/9 17:58
 */
/*
 * 功能描述:集合元素的遍历,使用迭代器Iterator接口
 * @return
 */
public class IteratorTest {
    @Test
     public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(false);
        Iterator iterator = coll.iterator();
        //判断是否还有下一个元素
        while(iterator.hasNext()){
            //next()：①指针下移 ②将下移以后的集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(false);
        Iterator iterator = coll.iterator();
         //错误方式一
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());//跳着打印
        }
        //错误方式二：
        while(coll.iterator().hasNext()){
            //打印结果是个死循环，因为每调用依次iterator（），都会返回一个新的Iterator对象，指针就会跑到开头，所以每次都在打印第一个元素
            System.out.println(coll.iterator().next());
        }
    }
    @Test
    /*
      * 功能描述:测试Iterator中的remove()
     * 内部定义了remove()，可以在遍历 的时候，删除集合中的元素，此方法不同于集合直接调用remove()
     * 如果还未调用next()或在已经调用了next方法之后已经调用了remove方法，再调用remove就 会报IllegalStateException
     * @return void
     */
    public void test3(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);
        //删除集合中的Tom
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
             Object obj=iterator.next();
             if("Tom".equals(obj)){
                 iterator.remove();
             }
        }
        //遍历集合
        iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    //三种遍历集合的方法
    public void test4(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        //方式一：Iterator迭代器方式
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****************************");
        ///方式二：增强for循环
        for(Object obj:list){
            System.out.println(obj);
        }
        System.out.println("*******************************");
        //方式三：
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}