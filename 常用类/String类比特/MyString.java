package 常用类.String类比特;

import java.util.ArrayList;
import java.util.List;

public class MyString {
    //利用一个静态属性模拟常量池
    //常量池：1.作用：节省时间  2.保证：常量池中不会出现重复的对象
    private static List<MyString>constPool=new ArrayList<>();
    public static MyString literal(MyString s){
        //1.先找，找到直接返回常量池中对象引用
        //2否则，创建并入池，返回池中对象引用
        int i= constPool.indexOf(s);
        if(i==1){
            constPool.add(s);
            return s;
        }
        return constPool.get(i);
    }
    public MyString intern(){
        int i=constPool.indexOf(this);
        if(i==-1){
            constPool.add(this);
            return this;
        }
        return constPool.get(i);
    }
}
